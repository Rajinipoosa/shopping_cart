package example.codeclan.com.shoppingcart;


import java.util.ArrayList;

public class ShoppingBasket {
    private int itemCount;

    private double totalAmount;
    private ArrayList<Item> cart;
    private ArrayList<Item> items;


  public ShoppingBasket(Double totalAmount,int itemCount  ) {
      this.totalAmount = 0.0;
      itemCount = 0;

      this.cart = new ArrayList<Item>();
      this.items =  new ArrayList<Item>();
  }



    public int addItemToCart(Item item) {
        cart.add(item);

        if(item.checkBuyOneGetOneDiscount()==true)
        {
            totalAmount += item.getPrice() * item.getQuantity();
        }

        return cart.size();


    }

    public int removeItemsFromCart() {

        cart.remove(0);
        return cart.size();
    }
    public int  clearItemsFromCart(){
             itemCount = cart.size();
//        System.out.println(cart.size());
      cart.clear();
       return cart.size();
    }
}