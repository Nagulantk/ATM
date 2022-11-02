package View;

public class ATMDisplayMenu implements DisplayMenu{
    public void displayMenu()
    {
        System.out.println("Enter the action to be performed:");
        System.out.println("Deposit");
        System.out.println("Withdraw");
        System.out.println("Get balance");
        System.out.println("Credit card due ");
    }
}
