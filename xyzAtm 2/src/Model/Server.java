package Model;

import java.util.ArrayList;
public class Server {

    private  ArrayList<Accounts> accountList=new java.util.ArrayList<>();

    public  ArrayList<Accounts> getAccountList() {
        return accountList;
    }

    public  void setAccountList(Accounts account) {
     accountList.add(account);
    }
    private  static Server server=new Server();

private Server()
{}
public  static Server getServer()
{
    return server;
}



}
