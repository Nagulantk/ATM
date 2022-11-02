package Controller.Banking;
import Model.Accounts;
import Model.Customer;
import Model.CreditCard;
import  View.Process;
import Controller.Verification.AccountFinding;
import View.*;


public class NetBanking {
   public enum BankAction
    {
        ACCOUNTGENERATION,
        CREDITCARDGENERATION,
        CREDITCARDPAYMENT,
        GETCUSTOMERDETAILS,


    }
BankAccountGeneration accountGeneration=new AccountGeneration();
    private NetBanking(){}
    private static NetBanking bank=new NetBanking();
    public void bankWorking()
    {
      BankAction bankAction;
       Process process=new InputProcess();
        DisplayMenu displayMenu=new BankDisplayMenu();
        displayMenu.displayMenu();
        bankAction= (BankAction) process.getProcess("BankMenu");
        switch (bankAction) {
            case ACCOUNTGENERATION:
                Accounts accounts=accountGeneration.accountGeneration();
                AccountDetails accountDetails=new AccountDetails();
                accountDetails.printDetails(accounts);
                break;
            case CREDITCARDGENERATION:
                AccountFinding finding = new AccountFinding();
                Accounts account = finding.findingAccount();
                if(account!=null) {
                    CreditCard creditCard = account.setCreditCard(account);
                    CreditCardDetails creditCardDetailsDisplay = new CreditCardDetailsDisplay();
                    creditCardDetailsDisplay.displayDetails(creditCard);
                }
                break;
            case CREDITCARDPAYMENT:
                CreditCardBill bill = new CreditCardBill();
                Accounts accounts1=bill.billPayment();
                BalanceDisplay displayBalance=new DisplayBalance();
                displayBalance.balanceDisplay(accounts1);
                break;
            case GETCUSTOMERDETAILS:
                CustomerDetails customerDetails=new CustomerDetails();
                Customer customer=customerDetails.getDetails();
                CustomerDetailsDisplay customerDetailsDisplay=new CustomerDetailsDisplay();
                customerDetailsDisplay.displayDetails(customer);


        }
    }
    public static NetBanking getBank()
    {
        return bank;
    }

}
