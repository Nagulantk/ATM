package View;

import Model.Customer;

public class CustomerDetailsDisplay {
    public void displayDetails(Customer customer)
    {
        if(customer!=null) {
        System.out.println("Name:" + customer.getName());
        System.out.println("Phone Number" + customer.getPhoneNumber());
        System.out.println("Pannumber:" + customer.getPanNumber());
        System.out.println("Date of birth:" + customer.getDateOfBirth());
    }
    else{
        System.out.println("Enter valid details");
    }
    }
}
