package Controller;

public class GeneratingNumbers {
    private GeneratingNumbers(){}
    private int generatingAccountNumber=1000000;
   private int generatingDebitCardNumber=10000;

   private int generatingCreditCardNumber=22334455;
    private int generatingCcv=300;
   private int generatingPin=1000;
    static GeneratingNumbers generateNumbers=new GeneratingNumbers();
    public int getGeneratingAccountNumber() {
        generatingAccountNumber++;
        return generatingAccountNumber;
    }

    public int getGeneratingDebitCardNumber() {
        generatingDebitCardNumber++;
        return generatingDebitCardNumber;
    }

    public int getGeneratingCreditCardNumber() {
        generatingCreditCardNumber++;
        return generatingCreditCardNumber;
    }

    public int getGeneratingCcv() {
        generatingCcv++;
        return generatingCcv;
    }

    public int getGeneratingPin() {
        generatingPin++;
        return generatingPin;
    }

    public static GeneratingNumbers getGenerateNumbers() {

        return generateNumbers;
    }



}
