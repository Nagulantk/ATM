package Model;
import java.time.LocalDate;
public class DebitCard extends Card {
     public DebitCard(int cardNumber, int pin, int ccv,LocalDate expiryDate,String cardType)
    {
        super( cardNumber, pin, ccv,expiryDate,cardType);
    }
}
