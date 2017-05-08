package example.codeclan.com.shoppingcart;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 05/05/2017.
 */

public class ShopTest {
    Shop shop;
    Item item;
    Customer customer;
    Item  purchasedItems;

    @Before
    public void before() {

        shop = new Shop(10, 5, 0.00, 2);
        item = new Item(1,"Chocalate", 5.00, 10,true);

        customer = new Customer("Rajini", new Card("Master", 44, 500.0));
        shop.addItem(item);
        shop.addItem(new Item(2,"Butter", 5.00, 10, false));

    }
    @Test
    public void getShopSalesTest() {
        assertEquals(10, shop.getShopSales());
    }

    @Test
    public void addItemTest(){
        shop.addItem(item);

    }
    @Test
    public void getOrderItemQuantityTest(){
        assertEquals(2, shop.getOrderItemQuantity());

    }

    @Test
    public void setShopSalesTest() {
        shop.setShopSales(20);
        assertEquals(20, shop.getShopSales());
    }

    @Test
    public void getShopRefundsTest() {
        assertEquals(5, shop.getShopRefunds());
    }

    @Test
    public void setShopRefundsTest() {
        shop.setShopRefunds(10);
        assertEquals(10, shop.getShopRefunds());
    }

    @Test
    public void getShopTotalIncomeTest() {
        assertEquals(0.00, shop.getShopTotalIncome());

    }

    @Test
    public void setShopTotalIncomeTest() {
        shop.setShopTotalIncome(200.00);
        assertEquals(200.00, shop.getShopTotalIncome());
    }


    @Test
    public void makeaSaleToCustomerTest(){

        shop.makeaSaleToCustomer(item, customer,shop.getOrderItemQuantity());
        assertEquals(490.0, customer.getTotalMoneyInCard());
        assertEquals(8,item.getQuantity());
        assertEquals(11,shop.getShopSales());

    }

    @Test
    public void giveARefundToCustomerTest(){
        shop.makeaSaleToCustomer(item, customer,shop.getOrderItemQuantity());

        shop.giveARefundToCustomer(item, customer,shop.getOrderItemQuantity());
        assertEquals(500.0,customer.getTotalMoneyInCard());
        assertEquals(10,item.getQuantity());
        assertEquals(6,shop.getShopRefunds());

    }

    @Test
    public void reportTotalIncomeTest(){
        shop.makeaSaleToCustomer(item, customer,shop.getOrderItemQuantity());
        shop.giveARefundToCustomer(item, customer,shop.getOrderItemQuantity() );
        shop.reportTotalIncomeTest();
        assertEquals(5.0,shop.getShopTotalIncome());
    }
    @Test
    public void sortItemTest(){
        shop.sortItems();

    }

    @Test
    public void SearchaNameTest(){
        assertEquals("Chocalate", shop.searchaName("Chocalate")); ;
    }


}



