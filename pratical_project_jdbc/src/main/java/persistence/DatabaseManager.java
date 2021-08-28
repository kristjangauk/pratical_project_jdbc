package persistence;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import util.DBUtil;

public class DatabaseManager {

    private Connection connection;

    public DatabaseManager() {
        DBUtil.createDatabase();
        connection = DBUtil.getDBConnection();
    }

    private void createTableIssue() {
        String sql = "CREATE TABLE IF NOT EXISTS issue (  " +
                "issue_id int PRIMARY KEY AUTO_INCREMENT,     " +
                "user_id int,     date_entered TIMESTAMP,     " +
                "date_started TIMESTAMP,     " +
                "date_finished TIMESTAMP,     " +
                "issue_name VARCHAR(100),     " +
                "issue_details LONGTEXT,     " +
                "comment LONGTEXT,     " +
                "project_id int,     " +
                "admin_id int,     " +
                "issue_status_id int,     " +
                "FOREIGN KEY (user_id) REFERENCES user(user_id),     " +
                "FOREIGN KEY (project_id) REFERENCES project(project_id),     " +
                "FOREIGN KEY (admin_id) REFERENCES admin(admin_id),     " +
                "FOREIGN KEY (issue_status_id) REFERENCES issue_status(issue_status_id)     )";

        try {
             Statement stmt = connection.createStatement();
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private void createTableProject() {
        String sql = "CREATE TABLE IF NOT EXISTS project (" +
                "project_id int PRIMARY KEY AUTO_INCREMENT, " +
                "project_name VARCHAR(100), " +
                "admin_id int, " +
                "FOREIGN KEY (admin_id) REFERENCES admin(admin_id)     )";

        try {
            Statement stmt = connection.createStatement();
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private void createTableAdmin() {
        String sql = "CREATE TABLE IF NOT EXISTS admin (  " +
                "admin_id int PRIMARY KEY AUTO_INCREMENT,     " +
                "user_id int,     " +
                "CONSTRAINT user_id_fk FOREIGN KEY (user_id) REFERENCES user(user_id)     )";

        try {
            Statement stmt = connection.createStatement();
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private void createTableUser() {
        String sql = "CREATE TABLE IF NOT EXISTS user (  " +
                "user_id int PRIMARY KEY AUTO_INCREMENT,     " +
                "first_name VARCHAR(50),     " +
                "last_name VARCHAR(50),     " +
                "phone VARCHAR(50),     " +
                "email VARCHAR(50)     )";

        try {
            Statement stmt = connection.createStatement();
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private void createTableIssueStatus() {
        String sql = "CREATE TABLE IF NOT EXISTS issue_status (  " +
                "issue_status_id int PRIMARY KEY AUTO_INCREMENT,     " +
                "issue_status VARCHAR(50)     )";

        try {
            Statement stmt = connection.createStatement();
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void initTables() {

        createTableProject();
        createTableAdmin();
        createTableUser();
        createTableIssueStatus();
        createTableIssue();
    }
}
