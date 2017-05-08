package example.codeclan.com.shoppingcart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by user on 05/05/2017.
 */

public class Shop {

    private ArrayList<Item> items;
    private ArrayList<Item> purchasedItems;
    private int sales;
    private int refunds;
    private double totalIncome;
    private int orderItemQuantity;

    public Shop(Integer sales, Integer refunds, Double totalIncome,int orderItemQuantity) {

        this.items = new ArrayList<Item>();
        this.sales = sales;
        this.refunds = refunds;
        this.totalIncome = totalIncome;
        this.purchasedItems = new ArrayList<Item>();
        this.orderItemQuantity = orderItemQuantity;
    }

    public int getShopSales() {
        return sales;
    }

    public void setShopSales(int shopSales) {
        this.sales = shopSales;
    }

    public int getShopRefunds() {
        return refunds;
    }

    public void setShopRefunds(int shopRefunds) {
        this.refunds = shopRefunds;
    }

    public double getShopTotalIncome() {
        return totalIncome;
    }

    public int getOrderItemQuantity() {
        return orderItemQuantity;
    }
    public void  setShopTotalIncome(double shopTotalIncome) {
        this.totalIncome = shopTotalIncome;
    }


    public void addItem(Item item) {
        items.add(item);
    }


    public void makeaSaleToCustomer(Item item, Customer customer, int orderItemQuantity) {

        if (items.contains(item)) {
            if (item.getQuantity() > 0) {
//               double discount = orderItemQuantity > 2 ? 1.00 : 0.00;
                customer.buyItem(item.getPrice(),orderItemQuantity);
                purchasedItems.add(item);
                sales = sales + 1;
                setShopSales(sales);
                int newQuanty = item.getQuantity() - orderItemQuantity ;
                item.setQuantity(newQuanty);
            }

            if (item.getQuantity() == 0) {
                items.remove(item);
            }
        }
    }
    public void  giveARefundToCustomer(Item item, Customer customer,int orderItemQuantity) {

        if (purchasedItems.contains(item)) {
            customer.refundItem(item.getPrice(), orderItemQuantity);
            items.add(item);
            purchasedItems.remove(item);
            refunds = refunds + 1;

            setShopRefunds(refunds);
            int newQuanty = item.getQuantity() + orderItemQuantity;
            item.setQuantity(newQuanty);

        }
    }

    public void reportTotalIncomeTest() {
        totalIncome = sales - refunds;
        setShopTotalIncome(totalIncome);

    }

    public void sortItems(){
        Collections.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item item2, Item item1)
            {return item1.getName().compareTo(item2.getName());
            }


        });
    }

    public  String searchaName(String name){
        for (Item item : items) {
            if(item.getName().equals(name)){
//               System.out.println(item.getName());
                return item.getName();
            }
        }
        return null;
    }


}



