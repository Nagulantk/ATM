package Controller.Banking;

import Controller.GeneratingNumbers;
import Model.Accounts;
import Model.CreditCard;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class CreditCardGeneration {
        GeneratingNumbers generatingNumbers=GeneratingNumbers.getGenerateNumbers();
    public CreditCard creditCardGeneration(Accounts accounts) {

            Date date1=new Date();
            SimpleDateFormat dateForm=new SimpleDateFormat("yyyy-MM-dd");
            String d=dateForm.format(date1);
            LocalDate dateOf=LocalDate.parse(d);
            LocalDate expiryDate=dateOf.plusYears(5);
            String cardType;
            cardType = accounts.getDebitCard().getCardType();
            CreditCard card = new CreditCard(generatingNumbers.getGeneratingCreditCardNumber(), generatingNumbers.getGeneratingPin(),generatingNumbers.getGeneratingCcv(), expiryDate,cardType);

            return  card;

    }
}
