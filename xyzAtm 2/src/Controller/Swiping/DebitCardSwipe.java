package Controller.Swiping;


import Model.Accounts;
import Model.Card;
import Model.Server;
import Controller.Verification.DataValidation;
import Controller.Verification.DataVerification;
import Controller.Verification.Validation;
import Controller.Verification.Verification;

public class DebitCardSwipe {
    DataVerification verify = new Verification();
   DataValidation validating = new Validation();

    Accounts account;
    Server server=Server.getServer();

    public Accounts swipe() {
        long accountNumber = verify.verification(Card.CardType.DEBITCARD);
        if (accountNumber != 0) {

            long amount = validating.validation("Purchase Amount");
            for(Accounts list:server.getAccountList()) {
                if (list.getAccountNumber() == accountNumber) {
                    account = list;
                }
            }
            if (amount <= account.getBalance()) {
                account.setBalance(account.getBalance()-amount+(long)(amount*0.01));
                System.out.println("purchase is successfully");
                System.out.println("Cashback:" + amount * 0.01);
               return  account;
            } else {
                System.out.println("Insufficient balance");
            }
        }
        return null;
    }
}
