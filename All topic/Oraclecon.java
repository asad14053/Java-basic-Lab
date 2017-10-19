///CREATE TABLE T (REG NUMBER(5),ID VARCHAR2(20),NAME VARCHAR2(20));
import java.sql.*;
class Oraclecon
{
    public static void main(String args[])
    {
        try
        {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");

            Statement stmt=con.createStatement();
             ResultSet rs1=stmt.executeQuery("INSERT INTO T VALUES(04,'IT-14026','Foyz')");

             ResultSet rs2=stmt.executeQuery("UPDATE T SET SERIAL=3 WHERE ID='IT-14053'");
              ResultSet rs3=stmt.executeQuery("delete from T where ID='IT-14053'");
             ResultSet rs=stmt.executeQuery("select * from T");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));

            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
