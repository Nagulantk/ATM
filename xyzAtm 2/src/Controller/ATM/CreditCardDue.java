package Controller.ATM;

import Model.Accounts;
import Model.Card;
import Model.CreditCard;
import Controller.Verification.DataVerification;
import Controller.Verification.Verification;
import Model.Server;

public class CreditCardDue implements CreditCardDueBalance {

    DataVerification verify = new Verification();
    Server server = Server.getServer();

    public CreditCard creditCardDueBalance()
    {
        long cardNumber = verify.verification(Card.CardType.CREDITCARD);
        if (cardNumber != 0)
        {
            for (Accounts list : server.getAccountList())
            {
                if (list.getCreditCard().getCardNumber() == cardNumber)
                {
                    return list.getCreditCard();
                }
            }
        }
        else {
            System.out.println("Enter valid details");
        }
        return null;
    }
}
