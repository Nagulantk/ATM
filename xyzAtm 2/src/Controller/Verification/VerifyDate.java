package Controller.Verification;

import java.time.LocalDate;
import java.util.Scanner;

public class VerifyDate implements DateVerification {
    public LocalDate verifyDate()
    {
        Scanner input=new Scanner(System.in);

        try {
            System.out.println("Enter DOB:YYYY-MM-DD");
            String dateOfBirth=input.nextLine();
            LocalDate birthDate=LocalDate.parse(dateOfBirth);
            return birthDate;
        }
        catch (Exception e)
        {
             System.out.println("Enter date based on the given format");
            return verifyDate();
        }
    }
}
