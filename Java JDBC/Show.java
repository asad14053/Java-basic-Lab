
package javafxlabfinal;
import java.sql.*;

import java.sql.Connection;
 import javafx.application.Application;
 import javafx.geometry.HPos;
 import javafx.geometry.Insets;
 import javafx.geometry.Pos;
 import javafx.scene.Scene;
 import javafx.scene.control.Button;
 import javafx.scene.control.Label;
 import javafx.scene.control.TextField;
 import javafx.scene.layout.GridPane;
 import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
public class Show extends Application {

    private Parent pane;

    @Override
    public void start(Stage primaryStage) {
          // Create a pane and set its properties

          TextField tname = new TextField();
           TextField temail = new TextField();
         GridPane pane = new GridPane();
         pane.setAlignment(Pos.CENTER);
         pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
         pane.setHgap(5.5);
         pane.setVgap(5.5);

         // Place nodes in the pane
         pane.add(new Label("Name:"), 0, 0);
         pane.add(tname, 1, 0);
         pane.add(new Label("Email"), 0, 1);
         pane.add(temail, 1, 1);

         String name=tname.getText();
         String email =temail.getText();

         Button btAdd = new Button("Add");
         Button btView = new Button("VIEW");
         pane.add(btAdd, 1, 2);
         pane.add(btView, 1, 3);

         GridPane.setHalignment(btAdd, HPos.RIGHT);
         GridPane.setHalignment(btView, HPos.RIGHT);


         btAdd.setOnAction(new EventHandler<ActionEvent>() {
          @Override // Override the handle method
               public void handle(ActionEvent e) {
             try {
            //step1 load the driver class
            Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "1234");
                //step3 create the statement object
                Statement stmt = con.createStatement();
                //step4 execute query
                ResultSet rs = stmt.executeQuery("select * from T");
                while (rs.next()) {
                   // Insert into JDBC values ('asad','IT-14053','21');
                    System.out.println(rs.getString(1) + "  " + rs.getString(2));
                }

                con.close();

        }
             catch (Exception ex) {
            System.out.println(ex);
        }
        }
 });





        Scene scene = new Scene(pane, 300, 250);

        primaryStage.setTitle("JavaFXLab");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
