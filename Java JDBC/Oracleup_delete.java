import java.sql.*;
class Oracleup_delete
{
    public static void main(String args[])
    {
        try
        {
            int result;
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");
            Statement stmt=con.createStatement();


            result=stmt.executeUpdate("insert into T values(123,'IT-14052','FOYJ')");
            result=stmt.executeUpdate("update T set NAME='JUWEL',ID='IT-14052' where REG=123");
            result=stmt.executeUpdate("delete from T where REG=125");

            System.out.println(result+" records affected");

            ///
            ResultSet rs=stmt.executeQuery("select * from T");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            ///
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
