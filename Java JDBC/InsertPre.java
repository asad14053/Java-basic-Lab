import java.sql.*;
import java.util.*;
class InsertPre
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        try
        {
            int reg,i;
            String id,name;
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");
            PreparedStatement stmt;

             System.out.println("enter value:");
            /// insert
            stmt=con.prepareStatement("insert into T values(?,?,?)");
            reg=sc.nextInt();
            id=sc.next();
            name=sc.next();
            stmt.setInt(1,reg);//1 specifies the first parameter in the query
            stmt.setString(2,id);
            stmt.setString(3,name);
            i=stmt.executeUpdate();
            System.out.println(i+" records inserted");
            /// update

            System.out.println("enter value:");
             stmt=con.prepareStatement("update T set NAME=? where REG=?");
              reg=sc.nextInt();
              name=sc.next();
            stmt.setString(1,name);//1 specifies the first parameter in the query i.e. name
            stmt.setInt(2,reg);
             i=stmt.executeUpdate();
            System.out.println(i+" records updated");

            ///delete
            System.out.println("enter value:");
            stmt=con.prepareStatement("delete from T where REG=?");
            reg=sc.nextInt();
            stmt.setInt(1,reg);
            i=stmt.executeUpdate();
            System.out.println(i+" records deleted");

            ///retrieve

            stmt=con.prepareStatement("select * from T");
            ResultSet rs=stmt.executeQuery();
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }


            con.close();

        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}

/*

103 10000 aahah
102 hjhjj
102
*/
