package View;

import Model.CreditCard;

public class CreditCardDueDisplay {
    public void displayCreditCardDue(CreditCard creditCard)
    {if(creditCard!=null) {
        System.out.println("Credit card due:" + creditCard.getCreditCardDue());
    }
    else
    {
        System.out.println("Invalid details");
    }
    }
}
