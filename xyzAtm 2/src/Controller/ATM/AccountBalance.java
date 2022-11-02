package Controller.ATM;

import Model.Accounts;
import Model.Card;
import Model.Server;
import Controller.Verification.DataVerification;
import Controller.Verification.Verification;

public class AccountBalance implements Balance {
    DataVerification verify = new Verification();
    Accounts account;
    Server server = Server.getServer();

    public Accounts getBalance() {
        long accountNumber = verify.verification(Card.CardType.DEBITCARD);
        if (accountNumber != 0) {
            for (Accounts list : server.getAccountList()) {
                if (list.getAccountNumber() == accountNumber) {
                    account = list;
                }
            }

        }
        return account;
    }
}
