package Controller.Banking;
import Model.Accounts;
import Model.Customer;
import Model.Server;
import Controller.Verification.DataValidation;
import Controller.Verification.Validation;

import java.util.Scanner;
public class CustomerDetails {
    DataValidation validating=new Validation();
    public Customer getDetails()
    {Scanner input=new Scanner(System.in);
        Server server=Server.getServer();
        System.out.println("Enter customer Name");
        String name=input.nextLine();
        long phoneNumber=validating.validation("Phone number");
        System.out.println("Enter password");
        String password=input.nextLine();
        for(Accounts account:server.getAccountList())
        {
            if(account.getCustomer().getName().equals(name)&&account.getCustomer().getPhoneNumber()==phoneNumber&&account.getCustomer().getPassword().equals(password))
            {
                return account.getCustomer();
            }
        }
        return null;
    }
}
