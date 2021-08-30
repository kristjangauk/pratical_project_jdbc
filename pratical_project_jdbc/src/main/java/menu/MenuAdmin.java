package menu;

import model.Issue;
import model.User;
import persistence.RepositoryIssue;
import persistence.RepositoryUser;
import util.DBUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MenuAdmin {

    RepositoryIssue repositoryIssue = new RepositoryIssue();
    RepositoryUser repositoryUser = new RepositoryUser();

    private int adminOptions(Scanner input) {
        System.out.println("\n/***************************************************/");
        System.out.println("Select the submenu option: ");
        System.out.println("-------------------------");
        System.out.println("1: List all issues");
        System.out.println("2: List new issues");
        System.out.println("3: List claimed issues");
        System.out.println("4: Claim issue");
        System.out.println("5: Finish issue");
        System.out.println("6: List all users");
        System.out.println("7: Add users");
        System.out.println("100 - Return to Main Menu");
        System.out.println("\n/***************************************************/");
        return input.nextInt();
    }

    protected void adminMenuChoice(Scanner input) {

        int adminChoice;
        do {
            adminChoice = adminOptions(input);
            switch (adminChoice) {
                case 1:
                    adminMenuListAllIssues(input);
                    break;
                case 2:
                    adminMenuListNewIssues(input);
                    break;
                case 3:
                    adminMenuListClaimedIssues(input);
                    break;
                case 4:
                    adminMenuClaimIssue(input);
                    break;
                case 5:
                    adminMenuFinishIssue(input);
                    break;
                case 6:
                    menuListAllUsers(input);
                    break;
                case 7:
                    menuAddUser(input);
                    break;
                case 100:
//                    MainMenu.getMainMenu();
                    break;
                default:
                    System.out.println("\nSorry, please enter valid Option");
//                    adminOptions(input);
                    break;
            }

        } while (adminChoice != 100);
    }

    private void adminMenuListAllIssues(Scanner input) {
        List<Issue> listIssue = repositoryIssue.listAllIssues();

        if (listIssue.size() > 0) {
            System.out.println("\nList of Issues: ");
            for (Issue issue : listIssue) {
                System.out.println(issue.toString());
            }
        } else {
            System.out.println("\nNo Issues registered");
            adminOptions(input);
        }
    }

    private void adminMenuListNewIssues(Scanner input) {
        List<Issue> listIssue = repositoryIssue.listAllIssues();

        if (listIssue.size() > 0) {
            System.out.println("\nList of Issues: ");
            for (Issue issue : listIssue) {
                if (issue.getIssueStatusId() == 1)
                System.out.println(issue);
            }
        } else {
            System.out.println("\nNo Issues registered");
            adminOptions(input);
        }
    }

    private void adminMenuListClaimedIssues(Scanner input) {
        List<Issue> listIssue = repositoryIssue.listAllIssues();

        if (listIssue.size() > 0) {
            System.out.println("\nList of Issues: ");
            for (Issue issue : listIssue) {
                if (issue.getIssueStatusId() == 2)
                System.out.println(issue);
            }
        } else {
            System.out.println("\nNo Issues registered");
            adminOptions(input);
        }
    }

    private void adminMenuClaimIssue(Scanner input) {
        System.out.println("Insert issue id:");
        int id = input.nextInt();
        String sql = "UPDATE issue SET date_started = now(), admin_id = 1, issue_status_id = 2 WHERE issue_id = " + id;

        try {
            PreparedStatement pstmt = DBUtil.getDBConnection().prepareStatement(sql);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void adminMenuFinishIssue(Scanner input) {
        System.out.println("Insert issue id:");
        int id = input.nextInt();
        System.out.println("Insert comment:");
        input.nextLine();
        String comment = input.nextLine();
        String sql = "UPDATE issue SET date_finished = now(), comment = '" + comment +"', issue_status_id = 3 WHERE issue_id = " + id;

        try {
            PreparedStatement pstmt = DBUtil.getDBConnection().prepareStatement(sql);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void menuListAllUsers(Scanner input) {
        List<User> listUser = repositoryUser.listAllUsers();

        if (listUser.size() > 0) {
            System.out.println("\nList of Users:");
            for (User user : listUser) {
                System.out.println(user.toString());
            }
        } else {
            System.out.println("\nNo users listed\n");
            adminOptions(input);
        }
    }

    private void menuAddUser(Scanner input) {

        String firstName;
        while (true) {
            System.out.println("Insert first name: ");
            firstName = input.next();
            Pattern p = Pattern.compile("^[a-zA-Z\\s]+");
            Matcher m = p.matcher(firstName);
            if(m.find()) {
                break;
            } else {
                System.out.println("Enter a valid name");
            }
        }

        String lastName;
        while (true) {
            System.out.println("Insert last name: ");
            lastName = input.next();
            Pattern p = Pattern.compile("^[a-zA-Z\\s]+");
            Matcher m = p.matcher(lastName);
            if(m.find()) {
                break;
            } else {
                System.out.println("Enter a valid name");
            }
        }


        String phone;
        while (true) {
            System.out.println("Insert phone number: ");
            phone = input.next();
            String exp ="^[-+]?[\\d+([,]\\d+)]*\\.?[0-9]+$";
            if(!phone.matches(exp)) {
                System.out.println("Enter a valid number");
            } else {
                break;
            }
        }

        String email;
        while (true) {
            System.out.println("Insert email: ");
            email = input.next();
            Pattern p = Pattern.compile("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$");
            Matcher m = p.matcher(email);
            if(m.find()) {
                break;
            } else {
                System.out.println("Enter a valid email");
            }
        }

        String sql = "INSERT INTO user (first_name, last_name, phone, email) " +
                "VALUES ('" + firstName + "', '" + lastName + "', '" + phone + "', '" + email + "')";

        try {
            PreparedStatement preparedStatement = DBUtil.getDBConnection().prepareStatement(sql);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
