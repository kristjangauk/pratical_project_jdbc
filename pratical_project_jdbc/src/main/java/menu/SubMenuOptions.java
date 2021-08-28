package menu;

import util.DBUtil;

import java.util.Scanner;

public class SubMenuOptions {

    private MenuCustomer menuCustomer;
    private MenuAdmin menuAdmin;

    public SubMenuOptions() {
        this.menuCustomer = new MenuCustomer();
        this.menuAdmin = new MenuAdmin();
    }

    private int menuOptions(Scanner input) {
        System.out.println("\n/***************************************************/");
        System.out.println("Select the menu option: ");
        System.out.println("-------------------------");
        System.out.println("1: Sub Menu - Customer");
        System.out.println("2: Sub Menu - Admin");
        System.out.println("100 - Quit");
        System.out.println("\n/***************************************************/");

        return input.nextInt();
    }

    public void menuChoice(Scanner input) {

        int userChoice;
        do {
            userChoice = menuOptions(input);
            switch (userChoice) {
                case 1:
                    this.menuCustomer.menuChoice(input);
                    break;
                case 2:
                    this.menuAdmin.adminMenuChoice(input);
                    break;

                case 100:
                    input.close();
                    break;
                default:
                    System.out.println("\nSorry, please enter valid Option");
//                    menuOptions(input);
                    break;
            }// End of switch statement
        } while (userChoice != 100);
        System.out.println("Closing system...");
        System.out.println("Thank you. Good Bye.");
    }




}
