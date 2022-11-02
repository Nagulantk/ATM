package View;

import Model.Accounts;

public class DisplayBalance implements BalanceDisplay{
public void balanceDisplay(Accounts account)
{
    if(account!=null)
    {
        System.out.println("Balance:"+account.getBalance());
        }
    else
    {
        System.out.println("Enter valid details");
    }
}
}
