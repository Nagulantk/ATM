package Model;


import java.time.LocalDate;

public class CreditCard extends Card {

    private long creditCardDue = 0;

   public CreditCard(int cardNumber, int pin, int ccv, LocalDate expiryDate,String cardType) {
        super(cardNumber, pin, ccv,expiryDate,cardType);
    }

    public void setCreditCardDue(long creditCardDue) {
        this.creditCardDue = creditCardDue;
    }

    public long getCreditCardDue() {
        return creditCardDue;
    }
}
