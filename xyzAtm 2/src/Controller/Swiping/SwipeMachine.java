package Controller.Swiping;
import Model.Accounts;
import View.*;
import Model.Card;
import Model.CreditCard;
import View.Process;

public class SwipeMachine {
    DebitCardSwipe debitCardSwipe=new DebitCardSwipe();
   CreditCardSwipe creditCardSwipe=new CreditCardSwipe();
   Process process=new InputProcess();
   public void swipeMachineWork()
   {
       Card.CardType cardType;
       System.out.println("Swipe using Debit card or Credit card:");
       cardType= (Card.CardType) process.getProcess("CardType");
       switch (cardType) {
           case DEBITCARD:
              Accounts accounts=debitCardSwipe.swipe();
               BalanceDisplay displayBalance=new DisplayBalance();
               displayBalance.balanceDisplay(accounts);
               break;
           case CREDITCARD:
              CreditCard creditCard=creditCardSwipe.creditCardSwiping();
               CreditCardDueDisplay creditCardDueDisplay=new CreditCardDueDisplay();
               creditCardDueDisplay.displayCreditCardDue(creditCard);
               break;
       }
   }
}
