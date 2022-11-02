package View;

import Model.Accounts;
public class AccountDetails {
    public void printDetails(Accounts accounts)
    {
        System.out.println("Account Details");
        System.out.println("Account number:"+accounts.getAccountNumber());
        System.out.println("Balance:"+accounts.getBalance());
        System.out.println("Debit card number:"+accounts.getDebitCard().getCardNumber());
        System.out.println("Debit card pin:"+accounts.getDebitCard().getPin());
        System.out.println("Debit card CCV:"+accounts.getDebitCard().getCcv());
        System.out.println("Debit  card Type:"+accounts.getDebitCard().getCardType());
        System.out.println("Debit card Expiry date:"+accounts.getDebitCard().getExpiryDate());

    }
}
