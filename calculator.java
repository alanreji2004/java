import javax.swing.*;
import java.awt.event.*;

public class calculator extends JFrame implements ActionListener{
    JLabel l1,l2,l3;
    JTextField t1,t2,t3,t4;
    JButton b1,b2,b3,b4;
    public calculator(){
        l1 = new JLabel("First Number");

        l2 = new JLabel("Second Number");

        l3 = new JLabel("Result");

        t1 = new JTextField(10);

        t2 = new JTextField(10);

        t3 = new JTextField(10);

        b1 = new JButton("Add");

        b2 = new JButton("Subtract");

        b3 = new JButton("Multiply");

        b4 = new JButton("Divide");

        setSize(600,400);
        setVisible(true);
        setLocation(300,100);
        l1.setBounds(50,50,100,20);
        t1.setBounds(150,50,100,20);

        l2.setBounds(50,100,100,20);
        t2.setBounds(150,100,100,20);

        l3.setBounds(50,150,100,20);
        t3.setBounds(150,150,100,20);

        b1.setBounds(40,200,100,20);
        b2.setBounds(160,200,100,20);
        b3.setBounds(280,200,100,20);
        b4.setBounds(400,200,100,20);



        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);

        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);        
    }
    public void actionPerformed(ActionEvent ae){
        int a,b,c;
        a = Integer.parseInt(t1.getText());
        b = Integer.parseInt(t2.getText());
        if(ae.getSource() == b1){
            c = a+b;
            t3.setText(String.valueOf(c));
        }
        else if(ae.getSource() == b2){
            c = a-b;
            t3.setText(String.valueOf(c));
        }
        else if(ae.getSource() == b3){
            c = a*b;
            t3.setText(String.valueOf(c));
        }
        else if(ae.getSource() == b4){
            c = a/b;
            t3.setText(String.valueOf(c));
        }
    }
    public static void main(String args[]){
        new calculator();
    }
}
