import java.awt.*;
import java.awt.event.*;
class AWTaction extends Frame implements ActionListener
{
    AWTaction()
    {
        TextField tf=new TextField();
        tf.setBounds(60,50,170,20);
        Button b=new Button("click me");
        b.setBounds(50,120,80,30);

        b.addActionListener(new ActionListener()
        {
           public void actionPerformed()
            {
                tf.setText("hello");
            }
        });
        add(b);
        add(tf);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
        f.setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
    }
    public static void main(String args[])
    {
        new AWTaction();
    }
}
