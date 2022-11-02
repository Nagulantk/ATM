package View;
import Controller.GeneratingNumbers;
import Controller.Verification.DataValidation;
import Controller.Verification.DateVerification;
import Controller.Verification.Validation;
import Controller.Verification.VerifyDate;
import Model.Accounts;
import Model.Customer;
import Model.Server;

import java.time.*;
import java.util.*;
public class AccountGeneration implements BankAccountGeneration {
    Scanner input=new Scanner(System.in);
    DataValidation validating=new Validation();
    DateVerification dateVerification=new VerifyDate();
    Accounts accounts;
    Customer customer;
    Server server= Server.getServer();
    GeneratingNumbers generatingNumbers=GeneratingNumbers.getGenerateNumbers();
    public Accounts accountGeneration()
    {   System.out.println("Enter Name:");
        String name=input.nextLine();
        long phoneNumber=validating.validation("Phone number");
        LocalDate dateOfBirth=dateVerification.verifyDate();

        System.out.println(dateOfBirth);

        long panNumber=validating.validation("Pan card Number");
        long balance=validating.validation("Balance");

       String newPassword;
       String password;
        do {
            System.out.println("Enter password");
            password = input.nextLine();
            System.out.println("ReEnter password");
           newPassword = input.nextLine();
            if(!password.equals(newPassword))
            {
                System.out.println("Reentered password is not same as password");
            }
        }while(!password.equals(newPassword));

        customer=new Customer(name,panNumber,dateOfBirth,phoneNumber,password);
        accounts=new Accounts(balance,generatingNumbers.getGeneratingAccountNumber(),customer);

       server.setAccountList(accounts);
       return  accounts;
    }
}


