package example.codeclan.com.shoppingcart;

/**
 * Created by user on 05/05/2017.
 */
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

public class ItemTest {



        Item item;

        @Before
        public void before() {
            item = new Item(2,"Bread", 5.00, 1, true);

        }

        @Test
        public void getIdTest(){
            assertEquals(2,item.getId());
        }
        @Test
        public void getNameTest() {
            assertEquals("Bread", item.getName());
        }
        @Test
        public void getPriceTest(){
            assertEquals(5.00,item.getPrice(),0.01);
        }
        @Test
        public void getBuyOneGetOneDiscountTrueTest(){
           boolean result = item.checkBuyOneGetOneDiscount();
            assertEquals(true, result);
        }
         @Test
        public void getBuyOneGetOneDiscountFalseTest(){
             item = new Item(2,"Bread", 5.00, 1, false );

            boolean result = item.checkBuyOneGetOneDiscount();
             assertEquals(false,result);

        }
         @Test
         public void getQuantityTest(){
             assertEquals(1, item.getQuantity());
         }


        @Test
        public void setPriceTest(){
            item.setPrice(2.00);
            assertEquals(2.00,item.getPrice(),0.01);
        }




    }
