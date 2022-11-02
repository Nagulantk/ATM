package View;

public class BankDisplayMenu implements DisplayMenu{
    public void displayMenu()
    {
        System.out.println("Enter the action to be performed:");
        System.out.println("AccountGeneration");
        System.out.println("CreditCardGeneration");
        System.out.println("CreditCardPayment");
        System.out.println("GetCustomerDetails");
    }
}
