package Controller.ATM;


import Model.Accounts;
import Model.Card;
import Model.CreditCard;
import Controller.Verification.DataValidation;
import Controller.Verification.DataVerification;
import Controller.Verification.Validation;
import Controller.Verification.Verification;
import Model.Server;

public class CreditCardWithdraw implements CreditCardAmountWithdraw {
 DataVerification verify=new Verification();
 DataValidation validating=new Validation();
 Server server= Server.getServer();
public CreditCard creditCardWithdraw()
    {
        long cardNumber= verify.verification(Card.CardType.CREDITCARD);
        if(cardNumber!=0) {
            System.out.println("Enter the withdraw amount(limit -100000):");

            long amount=validating.validation("Amount");
            if(amount<=100000) {
                for (Accounts list: server.getAccountList()) {
                    if (list.getCreditCard().getCardNumber() == cardNumber) {
                        if(amount<=100) {
                           list.getCreditCard().setCreditCardDue(list.getCreditCard().getCreditCardDue() +amount + (int) (amount * 0.02));
                            System.out.println("Amount is withdrawn");
                            System.out.println("Tax:" + amount * 0.02);
                        }
                        else {
                            list.getCreditCard().setCreditCardDue(list.getCreditCard().getCreditCardDue() +amount + (int) (amount * 0.04));
                            System.out.println("Amount is withdrawn");
                            System.out.println("Tax:" + amount * 0.04);
                        }
                        return  list.getCreditCard();

                    }
                }
            }

        }
        else
        {
            System.out.println("Invalid details");
        }
        return null;
    }


}
