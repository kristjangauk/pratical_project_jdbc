package menu;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import model.Issue;
import persistence.RepositoryIssue;
import util.DBUtil;

public class MenuCustomer {
    RepositoryIssue repositoryIssue = new RepositoryIssue();

    private int menuOptions(Scanner input) {
        System.out.println("\n/***************************************************/");
        System.out.println("Select the submenu option: ");
        System.out.println("-------------------------");
        System.out.println("1: List all issues");
        System.out.println("2: Create new issue");
//        System.out.println("3: List total active customers");
//        System.out.println("4: List total active and not active customers");
//        System.out.println("5: Update customers phone number by customer id");
        System.out.println("100 - Return to Main Menu");
        System.out.println("\n/***************************************************/");
        return input.nextInt();
    }

    protected void menuChoice(Scanner input) {

        int userChoice;
        do {
            userChoice = menuOptions(input);
            switch (userChoice) {
                case 1:
                    menuListAllIssues(input);
                    break;
                case 2:
                    customerCreateNewIssue(input);
                    break;
//                case 3:
//                    menuListActiveCustomers();
//                    break;
//                case 4:
//                    menuListActiveAndNotActiveCustomers();
//                    break;
//                case 5:
//                    menuUpdatePhoneNumberByCustomerId(input);
//                    break;
                case 100:
//                    MainMenu.getMainMenu();
                    break;
                default:
                    System.out.println("\nSorry, please enter valid Option");
                    menuOptions(input);
                    break;
            }// End of switch statement
        } while (userChoice != 100);
    }



    private void menuListAllIssues(Scanner input) {
        List<Issue> listIssue = repositoryIssue.listAllIssues();

        if (listIssue.size() > 0) {
            System.out.println("\nList of issues:");
            for (Issue issue : listIssue) {
                System.out.println(issue.toString());

            }
        } else {
            System.out.println("\nNo issues registered\n");
            menuOptions(input);
        }
    }

    private void customerCreateNewIssue(Scanner input) {
        input.nextLine();
        System.out.println("Insert issue name:");
        String issueName = input.nextLine();
        System.out.println("Insert issue description:");
        String issueDescription = input.nextLine();
        String sql = "INSERT INTO issue (user_id, date_entered, issue_name, issue_details, project_id, issue_status_id)  VALUES (1, now(), '" + issueName + "', '" + issueDescription + "', 1, 1)";

        try {
            PreparedStatement pstmt = DBUtil.getDBConnection().prepareStatement(sql);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//    private void menuUpdateAccountStatus(Scanner input) {
//        System.out.println("Type the customer ID");
//        int id = input.nextInt();
//        Customer result = repositoryCustomer.findCustomerById(id);
//        if (result == null) {
//            System.out.println("\nCustomer not found\n");
//            menuOptions(input);
//        } else {
//            System.out.println("Type the new stock value");
//            int stock = input.nextInt();
//            repositoryCustomer.updateStockProduct(id, stock);
//        }
//    }
//
//    private void menuListActiveCustomers() {
//         System.out.println("Total: " + repositoryCustomer.getTotalCustomerActives());
//    }
//
//    private void menuListActiveAndNotActiveCustomers() {
//        List<Object[]> obj = repositoryCustomer.getTotalCustomerActivesAndNotActives();
//        Object result[] = obj.get(0);
//            System.out.println("Total customers active: " + result[0] +" "+ result[1]);
//            //System.out.println("Total customers not active: " + obj[1]);
//    }
//
//    private void menuUpdatePhoneNumberByCustomerId(Scanner scanner) {
//        System.out.println("User id: ");
//        int id = scanner.nextInt();
//        Customer result = repositoryCustomer.findCustomerById(id);
//
//        if (result != null) {
//            System.out.println("New phone number: ");
//            String phoneNumber = scanner.next();
//            repositoryCustomer.updatePhoneNumberByCustomerId(id, phoneNumber);
//
//        } else {
//            System.out.println("User not found");
//            menuOptions(scanner);
//        }
//    }
}
