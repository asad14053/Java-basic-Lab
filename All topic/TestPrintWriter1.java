import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestPrintWriter1  {

	public static void main(String[] args) throws IOException {
		try
		  {
		    String readString = null;
		    PrintWriter pw = null;
		    BufferedReader br = null;
		    br = new BufferedReader ( new FileReader ( "t.txt" )  ) ;
		    pw = new PrintWriter ( new BufferedWriter ( new FileWriter ( "x.txt", true )  )  ) ;

		    while  (( readString = br.readLine ())  != null)   {
		         pw.println ( readString ) ;
		     }
 		    br.close (  ) ;
		    pw.close (  ) ;

		  }catch  ( Exception ex )   {
			  ex.printStackTrace() ;
		  }
	}
}
