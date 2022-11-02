package Model;

import java.time.LocalDate;

abstract public class Card {
    public enum CardType{
        DEBITCARD,
        CREDITCARD
    }
    private int cardNumber;
    private  int ccv;
    private long pin;
   private LocalDate expiryDate;
   private String cardType;
   public Card(int cardNumber, int pin, int ccv, LocalDate expiryDate, String cardType)
    {
        this.ccv=ccv;
        this.cardNumber=cardNumber;
        this.pin=pin;
        this.expiryDate=expiryDate;
        this.cardType=cardType;
    }
    public int getCcv() {
        return ccv;
    }

    public LocalDate getExpiryDate()
    {
        return expiryDate;
    }
    public String getCardType()
    {
        return cardType;
    }
    public long getPin()
    {

        return pin;
    }
    public int getCardNumber() {
        return cardNumber;
    }


}
