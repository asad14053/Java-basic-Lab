
import java.io.*;
import java.io.IOException;
import java.util.Scanner;

class FileInput {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
//                String input = new String();
//                System.out.println("Enter some text: ");
//                input = sc.nextLine();
//                File f = new File("asad.txt");
//                FileWriter fw = new FileWriter(f);
//                fw.write(input);
//                fw.close();
                FileInputStream f=new FileInputStream("x.txt");
                FileOutputStream f2=new FileOutputStream("t.txt");
                int c;
                while((c=f.read())!=-1)
                {
                    f2.write(c);
                }
           //     f.close();
            //    f2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

