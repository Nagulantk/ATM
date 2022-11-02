package Controller.Verification;

import java.util.Scanner;
public class Validation implements DataValidation {
    Scanner input=new Scanner(System.in);
    public long validation(String name) {
        long value=0;
        boolean number=true;
        do
        {System.out.println("Enter the "+name);
            if(input.hasNextLong())
            {
               value=input.nextLong();
                number=false;
            }
            else
            {
                System.out.println("Enter the valid "+name);
                input.next();
            }
        }while(number);
        return value;
    }
}
