package Controller.Banking
        ;


import Model.Accounts;
import Model.Card;
import Model.Server;
import Controller.Verification.DataVerification;
import Controller.Verification.Verification;

public class CreditCardBill {
    DataVerification verify=new Verification();
    Server server= Server.getServer();
    public Accounts billPayment() {
        long cardNumber = verify.verification(Card.CardType.CREDITCARD);
        if (cardNumber != 0) {
            for (Accounts list : server.getAccountList()) {
                if (list.getCreditCard().getCardNumber() == cardNumber) {
                    if (list.getCreditCard().getCreditCardDue() <= list.getBalance()) {
                        list.setBalance(list.getBalance() - list.getCreditCard().getCardNumber());
                        list.getCreditCard().setCreditCardDue(0);
                        System.out.println("Bill payment is SuccessFull");

                    } else {
                        System.out.println("Insufficient balance in the account");
                    }
                    return list;
                }
            }
        }
        return null;
    }
}
