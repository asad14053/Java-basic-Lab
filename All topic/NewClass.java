import java.io.File;
 import java.io.FileNotFoundException;
 import java.io.PrintWriter;

  public class NewClass {

     void n() throws FileNotFoundException {
             File Fileright = new File("t.txt");

             PrintWriter pw = new PrintWriter(Fileright);

             for (int i = 0; i <= 3; i++) {
                pw.println(i);
               // System.out.println(i);

             }

             pw.close();
      }

      public static void main(String[] args) throws FileNotFoundException
      {

             new NewClass().n();
      }

}
