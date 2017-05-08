package example.codeclan.com.shoppingcart;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 05/05/2017.
 */

public class CustomerTest {




        Customer customer;
        Card paymentDetails;
        Item purchasedItems;
        Card preferredCardDetails;


        @Before
        public void before() {
            preferredCardDetails = new Card("DebitCard", 4444, 200.00);
            customer = new Customer("Rajini", preferredCardDetails);
            this.purchasedItems = purchasedItems;

        }

        @Test
        public void getCustomerNameTest() {
            assertEquals("Rajini", customer.getCustomerName());

        }


        @Test
        public void getCustomerCardTotalTest() {
            assertEquals(3, customer.getTotalNumberOfPaymentDetails());
        }


        @Test
        public void getTotalMoneyInCardTest() {
            assertEquals(200.00, customer.getTotalMoneyInCard());

        }

        @Test
        public void selectPrefferedCardDetailsTest() {
            customer.selectPrefferedCardDetails("CreditCard");
            assertEquals(100.0, customer.getTotalMoneyInCard(), 0.01);
            // assertEquals(200.00, customer.getTotalMoneyInCard(), 0.01);
        }

        @Test
        public void buyItemTest() {
            customer.selectPrefferedCardDetails("CreditCard");
            customer.buyItem(10.00, 2);
            double total = customer.getTotalMoneyInCard();
            assertEquals(80,total,0.01) ;
//        assertEquals(180.0, total, 0.01);
//
//        assertEquals(30.0,total,0.01) ;
        }

        @Test
        public void getTotalPurchasedItems(){
            assertEquals(1,customer.getPurchasedItem(new Item(2,"Bread", 5.00, 4, false)));
        }

        @Test
        public void refundItemTest() {
            customer.selectPrefferedCardDetails("VisaCard");
            assertEquals(70.00, customer.refundItem(10.00, 2));

        }


    }


