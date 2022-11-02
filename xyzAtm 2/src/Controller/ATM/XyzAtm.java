package Controller.ATM;


import View.*;
import Model.Accounts;
import Model.Card;
import Model.CreditCard;
import  View.Process;
public class XyzAtm {
    public enum AtmActions
    {
        DEPOSIT,
        WITHDRAW,
        GETBALANCE,
        CREDITCARDDUE
    }

   AmountWithdraw withdraw=new Withdraw();
   AmountDeposit deposit=new Deposit();
    CreditCardDueBalance due=new CreditCardDue();
   Balance balance=new AccountBalance();
   CreditCardAmountWithdraw creditCardWithdraw=new CreditCardWithdraw();
  Process process=new InputProcess();
   public void AtmWorking()
   {

       AtmActions action;
       DisplayMenu displayMenu=new ATMDisplayMenu();
       displayMenu.displayMenu();
       action= (AtmActions) process.getProcess("ATMMenu");

       switch(action)
       {
           case DEPOSIT:
               deposit.deposit();
               break;
           case WITHDRAW:
               System.out.println("Withdraw using Debit card or Credit card:");
              Card.CardType cardType;
               cardType= (Card.CardType) process.getProcess("CardType");
               switch (cardType) {
                   case DEBITCARD:
                     Accounts account=withdraw.withdraw();
                     BalanceDisplay displayBalance=new DisplayBalance();
                       displayBalance.balanceDisplay(account);
                       break;
                   case CREDITCARD:
                     CreditCard creditCard=creditCardWithdraw.creditCardWithdraw();
                       if(creditCard!=null)
                       {
                           CreditCardDueDisplay creditCardDueDisplay=new CreditCardDueDisplay();
                           creditCardDueDisplay.displayCreditCardDue(creditCard);
                       }
                       break;
               }
               break;
           case GETBALANCE:
               Accounts account= balance.getBalance();
             BalanceDisplay displayBalance=new DisplayBalance();
               displayBalance.balanceDisplay(account);

               break;
           case CREDITCARDDUE:
             CreditCard creditCard=due.creditCardDueBalance();

             CreditCardDueDisplay creditCardDueDisplay=new CreditCardDueDisplay();
                 creditCardDueDisplay.displayCreditCardDue(creditCard);

               break;
       }

   }


}
