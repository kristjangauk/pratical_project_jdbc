package menu;

import model.Issue;
import persistence.RepositoryIssue;
import util.DBUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class MenuAdmin {

    RepositoryIssue repositoryIssue = new RepositoryIssue();

    private int adminOptions(Scanner input) {
        System.out.println("\n/***************************************************/");
        System.out.println("Select the submenu option: ");
        System.out.println("-------------------------");
        System.out.println("1: List all issues");
        System.out.println("2: List new issues");
        System.out.println("3: List claimed issues");
        System.out.println("4: Claim issue");
        System.out.println("5: Finish issue");
//        System.out.println("4: List total active and not active customers");
//        System.out.println("5: Update customers phone number by customer id");
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
                    adminMenuListWorkingIssues(input);
                    break;
                case 4:
                    adminMenuClaimIssue(input);
                    break;
                case 5:
                    adminMenuFinishIssue(input);
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
                System.out.println(issue.toString());
            }
        } else {
            System.out.println("\nNo Issues registered");
            adminOptions(input);
        }
    }

    private void adminMenuListWorkingIssues(Scanner input) {
        List<Issue> listIssue = repositoryIssue.listAllIssues();

        if (listIssue.size() > 0) {
            System.out.println("\nList of Issues: ");
            for (Issue issue : listIssue) {
                if (issue.getIssueStatusId() == 3)
                System.out.println(issue.toString());
            }
        } else {
            System.out.println("\nNo Issues registered");
            adminOptions(input);
        }
    }

    private void adminMenuClaimIssue(Scanner input) {
        System.out.println("Insert issue id:");
        int id = input.nextInt();
        String sql = "UPDATE issue SET date_started = now(), admin_id = 1, issue_status_id = 3 WHERE issue_id = " + id;

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
        String sql = "UPDATE issue SET date_finished = now(), comment = '" + comment +"', issue_status_id = 4 WHERE issue_id = " + id;

        try {
            PreparedStatement pstmt = DBUtil.getDBConnection().prepareStatement(sql);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
