import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestPrintWriter  {

	public static void main(String[] args) throws IOException {
		try
		  {
		    String readString = null;
		    PrintWriter pw = null;
		    BufferedReader br = null;
		    br = new BufferedReader ( new FileReader ( "C:\\Documents and Settings\\user\\Desktop\\TestOldFile.txt" )  ) ;
		    pw = new PrintWriter ( new BufferedWriter ( new FileWriter ( "C:\\Documents and Settings\\user\\Desktop\\TestNewFile.txt", false )  )  ) ;

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
