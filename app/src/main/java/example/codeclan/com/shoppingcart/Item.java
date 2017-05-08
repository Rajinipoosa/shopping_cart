package example.codeclan.com.shoppingcart;

/**
 * Created by user on 05/05/2017.
 */

public class Item {

        private int id;
        private String name ;
        private double price;
        private Integer quantity;
         private Boolean buyOneGetOneDiscount;


      public  Item(Integer id, String name,double price, Integer quantity, Boolean buyOneGetOneDiscount ){
            this.id = id;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
             this.buyOneGetOneDiscount = buyOneGetOneDiscount;



        }


        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }




        public void setName(String name) {
            this.name = name;
        }

        public void setPrice(double price) {
            this.price = price ;
        }

        public int getId() {
            return id;
        }

        public int getQuantity(){
            return quantity;

        }
        public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

         public  boolean  checkBuyOneGetOneDiscount(){


            if(buyOneGetOneDiscount == true) {
                return true;
            }
            else
                return false;
        }

        @Override
        public boolean equals(Object otherItem) {
            Item other = (Item) otherItem;

            return this.id == other.getId();
        }



}


