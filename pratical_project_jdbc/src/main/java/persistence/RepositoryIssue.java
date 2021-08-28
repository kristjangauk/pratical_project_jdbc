package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Issue;
import util.DBUtil;

public class RepositoryIssue {

    private Connection connection;

    public RepositoryIssue() {
        connection = DBUtil.getDBConnection();
    }

    public List<Issue> listAllIssues() {

        List<Issue> issueList = new ArrayList<Issue>();
        String sql = "SELECT * FROM issue";
        try {
            PreparedStatement pstmt = DBUtil.getDBConnection().prepareStatement(sql);

            ResultSet resultSet = pstmt.executeQuery();

            while(resultSet.next()) {
                Issue issue = new Issue();
                issue.setIssueId(resultSet.getInt("issue_id"));
                issue.setUserId(resultSet.getInt("user_id"));
                issue.setDateEntered(resultSet.getTimestamp("date_entered"));
                issue.setDateStarted(resultSet.getTimestamp("date_started"));
                issue.setDateFinished(resultSet.getTimestamp("date_finished"));
                issue.setIssueName(resultSet.getString("issue_name"));
                issue.setIssueDetails(resultSet.getString("issue_details"));
                issue.setComment(resultSet.getString("comment"));
                issue.setProjectId(resultSet.getInt("project_id"));
                issue.setAdminId(resultSet.getInt("admin_id"));
                issue.setIssueStatusId(resultSet.getInt("issue_status_id"));
                issueList.add(issue);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return issueList;
    }

//    public void updateStockProduct(int customerId, int newStatus) {
//        connection.getTransaction().begin();
//        int result = connection.createQuery("UPDATE Customer p SET p.accountStatus = :newValue WHERE p.id = :id")
//                .setParameter("newValue", newStatus)
//                .setParameter("id", customerId)
//                .executeUpdate();
//        connection.getTransaction().commit();
//        if (result > 0) {
//            System.out.println("\nCustomer status updated with success.");
//        }
//    }
//
//    public Customer findCustomerById(int id) {
//        return connection.find(Customer.class, id);
//    }
//
//    //READ
//    //https://www.baeldung.com/hibernate-aggregate-functions
//    public long getTotalCustomerActives() {
//        return (long) connection.createQuery("SELECT count(c) from Customer c WHERE c.accountStatus = 1")
//                .getSingleResult();
//    }
//
//    public List<Object[]> getTotalCustomerActivesAndNotActives() {
//        String sql = "SELECT c.accountStatus, count(c) from Customer c GROUP BY c.accountStatus";
//        return connection.createQuery(sql).getResultList();
//    }
//
//    public void updatePhoneNumberByCustomerId(int customerId, String phoneNumber) {
//        connection.getTransaction().begin();
//        int result = connection.createQuery("UPDATE Customer c SET c.phoneNumber = :newValue WHERE c.id = :id")
//                .setParameter("newValue", phoneNumber)
//                .setParameter("id", customerId)
//                .executeUpdate();
//        connection.getTransaction().commit();
//        if (result > 0) {
//            System.out.println("\n Customer phone number successfully updated!");
//        }
//
//    }
}
