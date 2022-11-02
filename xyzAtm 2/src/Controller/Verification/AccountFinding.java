package Controller.Verification;


import Model.Accounts;
import Model.Server;

public class AccountFinding {

    DataValidation validating=new Validation();
    Server server=Server.getServer();
    public Accounts findingAccount() {

        long accountNumber = validating.validation("Account number");
        if (accountNumber != 0) {
            for (Accounts list : server.getAccountList()) {
                if (list.getAccountNumber() == accountNumber) {
                    return list;
                }
            }
        }
        System.out.println("No account found");

        return null;
    }
}
