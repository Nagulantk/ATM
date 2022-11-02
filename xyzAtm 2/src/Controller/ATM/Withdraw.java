package Controller.ATM;

import Model.Accounts;
import Model.Card;
import Model.Server;
import Controller.Verification.DataValidation;
import Controller.Verification.DataVerification;
import Controller.Verification.Validation;
import Controller.Verification.Verification;

public class Withdraw implements AmountWithdraw {

    DataVerification verify=new Verification();
    DataValidation validating =new Validation();
    Accounts account;
    Server server=Server.getServer();
    public Accounts withdraw()
    {
        float tax;
        long accountNumber= verify.verification(Card.CardType.DEBITCARD );
        if(accountNumber!=0)
        {

            long amount=validating.validation("Amount");
            for(Accounts list:server.getAccountList()) {
                if (list.getAccountNumber() == accountNumber) {
                    account = list;
                }
            }
            if(amount%5==0&&amount<= account.getBalance())
            {
                if(amount<=100)
                {
                    tax=0.02f;
                }
                else {
                    tax=0.04f;
                }
               account.setBalance(account.getBalance()-amount-(long)(amount*tax));
                System.out.println("Amount is withdrawn successfully");
                return account;
            }
            else
            {
                System.out.println("Insufficient balance or Enter amount divisible by 5");
                return account;
            }
        }

        return null;
    }
}
