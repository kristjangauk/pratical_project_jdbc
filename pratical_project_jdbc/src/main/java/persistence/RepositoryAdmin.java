package persistence;

import model.Admin;
import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RepositoryAdmin {

    private Connection connection;

    public RepositoryAdmin() {
        connection = DBUtil.getDBConnection();
    }

    public List<Admin> listAllAdmins() {

        List<Admin> adminList = new ArrayList<>();
        String sql = "SELECT admin.admin_id, user.user_id, user.first_name, user.last_name, user.phone, user.email " +
                "FROM admin JOIN user ON admin.user_id = user.user_id";

        try {
            PreparedStatement preparedStatement = DBUtil.getDBConnection().prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Admin admin = new Admin();
                admin.setAdminId(resultSet.getInt("admin_id"));
                admin.setUserId(resultSet.getInt("user_id"));
                admin.setFirstName(resultSet.getString("first_name"));
                admin.setLastName(resultSet.getString("last_name"));
                admin.setPhone(resultSet.getString("phone"));
                admin.setEmail(resultSet.getString("email"));
                adminList.add(admin);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return adminList;

    }

}
