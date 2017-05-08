package example.codeclan.com.shoppingcart;


import java.util.ArrayList;
import java.util.Random;

public class ShoppingBasket {
    private int itemCount;

    private double totalAmount;
    private ArrayList<Item> cart;
    private ArrayList<Item> items;


    public ShoppingBasket(Double totalAmount, int itemCount) {
        this.totalAmount = 0.0;
        itemCount = 0;

        this.cart = new ArrayList<Item>();
        this.items = new ArrayList<Item>();
    }


    public int addItemToCart(Item item) {
        cart.add(item);

        totalAmount += item.getPrice() * item.getQuantity();
        return cart.size();
//        if(item.checkBuyOneGetOneDiscount() == true )
//        {
//            if()

//            System.out.println(totalAmount);
//        }

    }

    public int removeItemsFromCart() {

        cart.remove(0);
        return cart.size();
    }

    public int clearItemsFromCart() {
        itemCount = cart.size();
//        System.out.println(cart.size());
        cart.clear();
        return cart.size();
    }


    public double getTotalAmount() {
        for(Item itm : cart) {
//            System.out.println(itm);
            if(itm.checkBuyOneGetOneDiscount() == true && itm.getQuantity() >= 2){
              double value =  itm.getQuantity()/2;
                System.out.println(value);
                totalAmount += itm.getPrice() * value;

            }
            else

            totalAmount += itm.getPrice() * itm.getQuantity();

        }


        return totalAmount;
    }
}