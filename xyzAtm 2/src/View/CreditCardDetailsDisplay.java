package View;

import Model.CreditCard;

public class CreditCardDetailsDisplay implements CreditCardDetails{
    public void displayDetails(CreditCard card)
    {
        System.out.println("Credit card Details");
        System.out.println("Credit card number:"+card.getCardNumber());
        System.out.println("Credit card pin:"+card.getPin());
        System.out.println("Credit card CCV:"+card.getCcv());
        System.out.println("Credit  card Type:"+card.getCardType());
        System.out.println("Credit card Expiry date:"+card.getExpiryDate());
    }
}
