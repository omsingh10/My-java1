import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

    JButton login,clear,su;
    JPasswordField eunuTextField;
    JTextField cardTextField;


    Login(){

        setTitle("ATM");
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage() .getScaledInstance(100 , 100 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70 , 10 , 100 , 100  );
        add(label);

        JLabel text = new JLabel("WELCOME TO US ");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200 , 40 ,  500 , 40 );
        add(text);

        JLabel Cardno = new JLabel("ID NO: ");
        Cardno.setFont(new Font("Raleway", Font.BOLD, 28));
        Cardno.setBounds(120 , 140 ,  150 , 40 );
        add(Cardno);

       cardTextField = new JTextField();
        cardTextField.setBounds(450 , 140 , 250 , 30);
        cardTextField.setFont(new Font("Arial" , Font.BOLD , 14 ));
        add(cardTextField);

        JLabel eunum = new JLabel("password: ");
        eunum.setFont(new Font("Osward", Font.BOLD, 28));
        eunum.setBounds(120 , 200 ,  400 , 40 );
        add(eunum);

       eunuTextField = new JPasswordField();
        eunuTextField.setBounds(450 , 200 , 250 , 30);
        eunuTextField.setFont(new Font("Arial" , Font.BOLD , 14 ));
        add(eunuTextField);

         login = new JButton("sign in");
        login.setBounds(300 , 280 , 100 , 30 );
        login.setBackground(Color.black);
        login.setForeground(Color.red);
        login.addActionListener(this);
        add(login);

        clear = new JButton("clear");
        clear.setBounds(430 , 280 , 100 , 30 );
        clear.setBackground(Color.black);
        clear.setForeground(Color.red);
        clear.addActionListener(this);
        add(clear);

        su = new JButton("sign up");
        su.setBounds(360 , 330 , 100 , 30 );
        su.setBackground(Color.black);
        su.setForeground(Color.red);
        su.addActionListener(this);
        add(su);


        getContentPane().setBackground(Color.BLUE);

          setSize( 800 , 400 );
          setVisible(true);
          setLocation(350 , 200);
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == clear){
            cardTextField.setText("");
            eunuTextField.setText("");

        } else if(ae.getSource() == login)  {

        } else if (ae.getSource() == su){

        }
    }


        public static void main(String[] args) {

        new Login();




    }
}
