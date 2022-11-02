package Controller.Verification;

import Model.Accounts;
import Model.Card;
import Model.Server;

public class Verification implements DataVerification {
    DataValidation validating=new Validation();
    Server server=Server.getServer();
    public long verification(Card.CardType cardType)
    {
        long cardNumber=validating.validation("Card Number");

        long pin=validating.validation("Pin");
        if(cardType== Card.CardType.DEBITCARD) {
            for (Accounts list : server.getAccountList()) {
                if (list.getDebitCard().getCardNumber() == cardNumber && list.getDebitCard().getPin() == pin) {
                    return list.getAccountNumber();
                }
            }

        }
        else{
            for (Accounts list : server.getAccountList()) {
                try {
                    if (list.getCreditCard().getCardNumber() == cardNumber && list.getCreditCard().getPin() == pin) {
                        return list.getCreditCard().getCardNumber();
                    }
                } catch (NullPointerException e) {
                    System.out.println("No credit card available for you");
                    return 0;
                }
            }
        }
        return 0;

    }
}
