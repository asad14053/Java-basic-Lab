import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Bufferedw {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("t.txt"));
        bw.write("Test Me");
        //bw.close();
       // System.exit(0);
    }

}
