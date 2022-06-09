import java.sql.*;

class MysqlCon {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/atm", "root", "maveric2022");
            // here sonoo is database name, root is username and password
            Statement stmt = con.createStatement();
            String query1 = "INSERT INTO customer_login " + "VALUES (5345,3453)";
            stmt.executeUpdate(query1);
            ResultSet rs = stmt.executeQuery("select * from customer_login");
            while (rs.next())
                System.out.println(rs.getInt(1) + " " + rs.getInt(2));
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}