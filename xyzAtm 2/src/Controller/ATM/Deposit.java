package Controller.ATM;


import Model.Accounts;
import Model.Card;
import Model.Server;
import Controller.Verification.DataValidation;
import Controller.Verification.DataVerification;
import Controller.Verification.Validation;
import Controller.Verification.Verification;

public class Deposit implements AmountDeposit {

    DataVerification verify=new Verification();
    DataValidation validating=new Validation();
Accounts account;
Server server=Server.getServer();
    public void deposit()
    {long accountNumber=  verify.verification(Card.CardType.DEBITCARD);
        if(accountNumber!=0)
        {
            for(Accounts list:server.getAccountList()) {
            if (list.getAccountNumber() == accountNumber) {
                account = list;
            }
          }
            long amount=validating.validation("Amount");
          account.setBalance(account.getBalance()+amount);
            System.out.println("Amount is deposited successfully");
            System.out.println("Balance:"+ account.getBalance());
        }
        else
        {
            System.out.println("Invalid details");
        }
    }

}
