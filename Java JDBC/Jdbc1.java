
import java.sql.*;

class Jdbc1 {

    public static void main(String args[]) {
        try {
            //step1 load the driver class  
            Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "123");
                //step3 create the statement object
                Statement stmt = con.createStatement();
                //step4 execute query
                ResultSet rs = stmt.executeQuery("select * from JDBC");
                while (rs.next()) {
                    System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
                }
                con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
