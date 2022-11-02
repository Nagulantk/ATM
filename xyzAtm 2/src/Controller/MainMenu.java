package Controller;

import Controller.ATM.XyzAtm;
import Controller.Banking.NetBanking;
import Controller.Swiping.SwipeMachine;
import View.DisplayMenu;
import View.MainDisplayMenu;
import View.InputProcess;
import  View.Process;

public class MainMenu {
    public  enum Action {
        BANKING,
        ATM,
        SWIPE,
        EXIT
    }
    public void mainWorking() {
        boolean condition = true;
        SwipeMachine machine = new SwipeMachine();
        Action action;
        while (condition) {
            DisplayMenu displayMenu=new MainDisplayMenu();
            displayMenu.displayMenu();
           Process process=new InputProcess();
            action= (Action) process.getProcess("MainMenu");

            switch (action) {

                case ATM:
                    XyzAtm atm = new XyzAtm();
                    atm.AtmWorking();
                    break;
                case BANKING:
                    NetBanking bank = NetBanking.getBank();
                    bank.bankWorking();
                    break;
                case SWIPE:
                    machine.swipeMachineWork();
                    break;
                case EXIT:
                    condition = false;
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("Enter a valid request");
                    break;
            }
        }
    }
}
