package Model;

import View.AccountGeneration;
import Controller.Banking.CreditCardGeneration;
import Controller.Banking.DebitCardGeneration;
import View.AccountGeneration;

public class Accounts {
    private final long accountNumber;
    private long balance;
    private Card debitCard;
    private CreditCard creditCard;
    private Customer customer;

   public Accounts(long balance, long accountNumber, Customer customer)
    {

        this.balance=balance;
        this.accountNumber=accountNumber;
        DebitCardGeneration cardGeneration=new DebitCardGeneration();
       this.debitCard= cardGeneration.generation(balance);
       this.customer=customer;


    }
    public long getAccountNumber()
    {
        return accountNumber;
    }
    public long getBalance()
    {
        return balance;
    }
    public void setBalance(long balance)
    {
   this.balance=balance;
    }
    public Card getDebitCard() {
        return debitCard;
    }

    public Customer getCustomer() {
        return customer;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public CreditCard setCreditCard(Accounts accounts)
    {
        CreditCardGeneration cardGeneration=new CreditCardGeneration();
        this.creditCard=cardGeneration.creditCardGeneration(accounts);
        return creditCard;
    }



}




