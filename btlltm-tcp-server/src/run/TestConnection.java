
package run;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestConnection {
    public static void main(String[] args) {
        // Thông tin kết nối cơ sở dữ liệu
        String url = "jdbc:mysql://localhost:3306/btl_ltm";
        String username = "nhanadmin";
        String password = "nhandeptrai191";

        try {
            // Tải trình điều khiển JDBC của MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Thiết lập kết nối
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Kết nối cơ sở dữ liệu thành công!");

            connection.close();

        } catch (ClassNotFoundException e) {
            System.out.println("Không tìm thấy trình điều khiển JDBC của MySQL: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Lỗi kết nối cơ sở dữ liệu: " + e.getMessage());
        }
    }
}