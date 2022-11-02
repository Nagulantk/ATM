package Controller.Swiping;

import Model.Card;
import Model.Accounts;
import Model.CreditCard;
import Model.Server;
import Controller.Verification.DataValidation;
import Controller.Verification.DataVerification;
import Controller.Verification.Validation;
import Controller.Verification.Verification;

public class CreditCardSwipe {
    DataVerification verify=new Verification();
    DataValidation validating=new Validation();
    Server server= Server.getServer();

    public CreditCard creditCardSwiping()
    {
        long cardNumber= verify.verification(Card.CardType.CREDITCARD);
        if(cardNumber!=0) {
            System.out.println("Enter the purchase amount(limit -100000):");
            long amount = validating.validation("Amount");

            for(Accounts list:server.getAccountList())
            {
                if(list.getCreditCard().getCardNumber()==cardNumber)
                {
                 list.getCreditCard().setCreditCardDue(list.getCreditCard().getCreditCardDue()+amount-(int)(amount*0.01));
                    System.out.println("purchase is successfully");
                    System.out.println("Cashback:"+amount*0.01);
                    return list.getCreditCard();
                }
            }

        }
       return null;

    }
}
