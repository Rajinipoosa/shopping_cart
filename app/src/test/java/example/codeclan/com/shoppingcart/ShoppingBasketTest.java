package example.codeclan.com.shoppingcart;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 05/05/2017.
 */

public class ShoppingBasketTest {
   ShoppingBasket shoppingbasket;
    Item cart;
    Item item;


    @Before
    public void before(){
        shoppingbasket = new ShoppingBasket(0.0, 0);
        item = new Item(1,"Chocalate", 5.00, 10 , false);
         cart =  new Item(1,"Chocalate", 5.00, 10 , false);

    }



   @Test
    public void addItemToCartTest(){

       assertEquals(1,shoppingbasket.addItemToCart(item));

   }
    @Test
    public void RemoveItemsFromCartTest(){
        shoppingbasket.addItemToCart(item);

        assertEquals(0,shoppingbasket.removeItemsFromCart());

    }
    @Test
    public void clearItemsFromCartTest(){
        shoppingbasket.addItemToCart(item);
       assertEquals(0, shoppingbasket.clearItemsFromCart());

    }
    @Test
    public void getTotalAmountTest(){
        shoppingbasket.addItemToCart(item);
        shoppingbasket.addItemToCart( new Item(1,"bread", 5.00, 10 , true));
        shoppingbasket.getTotalAmount();
    }
}
