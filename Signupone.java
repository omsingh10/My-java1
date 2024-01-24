import javax.swing.*; //for using Jframe we use jframe to create a box or window
import java.awt.*;  // for giving color we have to use awt
import java.util.*;

public class Signupone extends JFrame { //extend jframe is important to avoid error

    JTextField nameTx;

    Signupone(){
        setLayout(null); // to set location or tu use setbounds we have to null layout (coz its default at center);
        Random ran = new Random();
        long random = Math.abs(ran.nextLong()%9000L + 1000L);//math.abs is used bcz we need +tiv number //nextlong is used to create long number and %9L+10L for genterating 4 digit number

        JLabel formno = new JLabel("Application no :" + random ); //for text in lable
        formno.setFont(new Font("raleway", Font.BOLD , 38)); //for size of text and font of text
        formno.setBounds(230 , 10 , 600, 40 ); //to adjust location
        add(formno);   //to make lable visble

        //lable for personl detail in window page
        JLabel pd = new JLabel("Page no 1: Personal details"); //for text in lable
        pd.setFont(new Font("raleway", Font.BOLD , 20)); //for size of text and font of text
        pd.setBounds(280 , 60 , 400, 40 ); //to adjust location
        add(pd);   //to make lable visble

        JLabel namelb = new JLabel("Name:"); //for text in lable
        namelb.setFont(new Font("raleway", Font.BOLD , 25)); //for size of text and font of text
        namelb.setBounds(200 , 120 , 400, 40 ); //to adjust location
        add(namelb);

        // for creating box
         nameTx = new JTextField();
        nameTx.setBounds(400 , 130 , 250 , 30);
        nameTx.setFont(new Font("Arial" , Font.BOLD , 14 ));
        add(nameTx);




        getContentPane().setBackground(Color.white); //for giving color to window
        setSize(850 , 800);   //to determine size of window and create window extend jframe is imp fr this
        setLocation(350 ,  10);     // to determine where window will appear
        setVisible(true);              //true should be in small and SV is use to make window visble
    }


    public static void main(String[] args) {
        new Signupone();

    }
}
