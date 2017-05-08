package example.codeclan.com.shoppingcart;

/**
 * Created by user on 05/05/2017.
 */

public class Card {

        private String cardType;
        private int cardNumber;
        private double cardAmount;
        public Card(String cardType, int cardNumber, double cardAmount){
            this.cardType = cardType;
            this.cardNumber= cardNumber;
            this.cardAmount = cardAmount;

        }

        public String getCardType() {
            return cardType;
        }

        public int getCardNumber() {
            return cardNumber;
        }

        public double getCardAmount() {
            return cardAmount;
        }


        public void setCardAmount(double Amount) {
            this.cardAmount = Amount;
        }

        public void setCardNumber(int cardNumber) {
            this.cardNumber = cardNumber;
        }

        public void setCardType(String cardType) {
            this.cardType = cardType;
        }
    }

