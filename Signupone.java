
import javax.swing.*; //for using Jframe we use jframe to create a box or window
import java.awt.*;  // for giving color we have to use awt
import java.util.*;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

public class Signupone extends JFrame { //extend jframe is important to avoid error

    JLabel namelb, fatherlb ,j3lb  ,j5lb ,j6lb, j7lb ,j8lb ,j9lb ,j10lb;
    JTextField nameTx , ftTx , j5Tx , j7Tx , j8Tx , j9Tx , j10Tx ;

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

        namelb = new JLabel("Name:"); //for text in lable
        namelb.setFont(new Font("raleway", Font.BOLD , 25)); //for size of text and font of text
        namelb.setBounds(100 , 110 , 400, 20 ); //to adjust location
        add(namelb);

        fatherlb = new JLabel("father's name:"); //for text in lable
        fatherlb.setFont(new Font("raleway", Font.BOLD , 25)); //for size of text and font of text
        fatherlb.setBounds(100 , 160 , 400, 20 ); //to adjust location
        add(fatherlb);
          //3
         j3lb = new JLabel("Date of birth:"); //for text in lable
        j3lb.setFont(new Font("raleway", Font.BOLD , 25)); //for size of text and font of text
       j3lb.setBounds(100 , 210 , 400, 20 ); //to adjust location
        add(j3lb);

        JDateChooser jdate = new JDateChooser();
        jdate.setBounds(400 , 210 , 400 , 30);
        add(jdate);

        //4
        JLabel j4lb = new JLabel("Gender:"); //for text in lable
        j4lb.setFont(new Font("raleway", Font.BOLD , 25)); //for size of text and font of text
        j4lb.setBounds(100 , 260 , 400, 20 ); //to adjust location
        add(j4lb);


       JRadioButton male = new JRadioButton("male");
      male.setBounds(400 , 260 , 100 , 30);
       male.setBackground(Color.PINK);
        add(male);

        JRadioButton Fmale = new JRadioButton("Female");
        Fmale.setBounds(510 , 260 , 200 , 30);
        Fmale.setBackground(Color.PINK);
        add(Fmale);

        ButtonGroup gengroup = new ButtonGroup();
        gengroup.add(male);
        gengroup.add(Fmale);


        //5
         j5lb = new JLabel("Email address:"); //for text in lable
        j5lb.setFont(new Font("raleway", Font.BOLD , 25)); //for size of text and font of text
        j5lb.setBounds(100 , 310 , 400, 20 ); //to adjust location
        add(j5lb);



        //6
        j6lb = new JLabel("Marital status:"); //for text in lable
        j6lb.setFont(new Font("raleway", Font.BOLD , 25)); //for size of text and font of text
        j6lb.setBounds(100 , 360 , 400, 30 ); //to adjust location
        add(j6lb);
        JRadioButton mar = new JRadioButton("male");
        mar.setBounds(400 , 360 , 100 , 30);
        mar.setBackground(Color.PINK);
        add(mar);

        JRadioButton unmar = new JRadioButton("Female");
        unmar.setBounds(510 , 360 , 100 , 30);
        unmar.setBackground(Color.PINK);
        add(unmar);

        JRadioButton otr = new JRadioButton("umarried");
        otr.setBounds(610 , 360 , 100 , 30);
        otr.setBackground(Color.PINK);
        add(otr);


        ButtonGroup gen1group = new ButtonGroup();
        gen1group.add(mar);
        gen1group.add(unmar);
        gen1group.add(otr);



        //7

        j7lb = new JLabel("Address:"); //for text in lable
      j7lb.setFont(new Font("raleway", Font.BOLD , 25)); //for size of text and font of text
       j7lb.setBounds(100 , 410 , 400, 20 ); //to adjust location
        add(j7lb);

        //8
        j8lb = new JLabel("city :"); //for text in lable
        j8lb.setFont(new Font("raleway", Font.BOLD , 25)); //for size of text and font of text
        j8lb.setBounds(100 , 460 , 400, 30 ); //to adjust location
        add(j8lb);

        //9
        j9lb = new JLabel("State:"); //for text in lable
        j9lb.setFont(new Font("raleway", Font.BOLD , 25)); //for size of text and font of text
        j9lb.setBounds(100 , 510, 400, 20 ); //to adjust location
        add(j9lb);
        //10
         j10lb = new JLabel("Pincode:"); //for text in lable
        j10lb.setFont(new Font("raleway", Font.BOLD , 25)); //for size of text and font of text
        j10lb.setBounds(100 , 560 , 400, 20 ); //to adjust location
        add(j10lb);








        // for creating box
         nameTx = new JTextField();
        nameTx.setBounds(400 , 110 , 380 , 30);
        nameTx.setFont(new Font("Arial" , Font.BOLD , 14 ));
        add(nameTx);

        ftTx = new JTextField();
        ftTx.setBounds(400 , 160 , 380 , 30);
        ftTx.setFont(new Font("Arial" , Font.BOLD , 14 ));
        add(ftTx);

        j5Tx = new JTextField();
        j5Tx.setBounds(400 , 310 , 380 , 30);
        j5Tx.setFont(new Font("Arial" , Font.BOLD , 14 ));
        add(j5Tx);

        j7Tx = new JTextField();
        j7Tx.setBounds(400 , 410 , 380 , 30);
        j7Tx.setFont(new Font("Arial" , Font.BOLD , 14 ));
        add(j7Tx);

        j8Tx = new JTextField();
        j8Tx.setBounds(400 , 460 , 380 , 30);
        j8Tx.setFont(new Font("Arial" , Font.BOLD , 14 ));
        add(j8Tx);

        j9Tx = new JTextField();
        j9Tx.setBounds(400 , 510 , 380 , 30);
        j9Tx.setFont(new Font("Arial" , Font.BOLD , 14 ));
        add(j9Tx);

        j10Tx = new JTextField();
        j10Tx.setBounds(400 , 560 , 380 , 30);
        j10Tx.setFont(new Font("Arial" , Font.BOLD , 14 ));
        add(j10Tx);

//Adding button for next
        JButton next = new JButton("NEXT");
        next.setBackground(Color.black);
        next.setForeground(Color.red);
        next.setBounds(620 , 660 , 100 , 25);
        add(next);



        getContentPane().setBackground(Color.PINK); //for giving color to window
        setSize(850 , 800);   //to determine size of window and create window extend jframe is imp fr this
        setLocation(350 ,  10);     // to determine where window will appear
        setVisible(true);              //true should be in small and SV is use to make window visble
    }


    public static void main(String[] args) {
        new Signupone();

    }
}
