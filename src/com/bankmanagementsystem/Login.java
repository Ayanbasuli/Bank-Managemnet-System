package com.bankmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{   //i use actionlistener for add function to button i implementd action listener in Jframe
    JButton E1,E2,E3;  // define globle variable to use outside of constructer in action listener
    JTextField cardtextfield;
    JPasswordField pintextfield; //Jpassword feild help to hide number to screen like actucall password is type

    Login(){
        setTitle("Automated Teller Machine"); //set title se text add hota hai brushhhh

        setLayout(null); //this help to use custom layout

        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icon/logo.png")); // classloader help to add system resource
        Image i2 = icon.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT); //swing pakage didnot have image awt have i2 contain icon image
        ImageIcon i3 = new ImageIcon(i2); //i3 contain i2 which can i call in jlabel i1
        JLabel i1 = new JLabel(i3); // i cannot put i2 in jlabel i dont know why lets google it


        /* there are somelayout which help to place different compounds in different location in frame in java
        there are so maney type of layout flowlayout by default frame have boarder layout hota hai agar ham layout
        ko null kar de to custom layout*/
        i1.setBounds(70,10,100,100); //compount by default center he hota hai solution h boarder ko brmove ke do

        add(i1);

        JLabel text = new JLabel("Welcome To ATM");
        text.setFont(new Font("Oaward",Font.BOLD,36)); //setfont use to change font
        text.setBounds(200,40,400,40);
        add(text);

        JLabel cardnumber = new JLabel("Card No:");
        cardnumber.setFont(new Font("Oaward",Font.BOLD,26)); //setfont use to change font
        cardnumber.setBounds(120,150,150,30);
        add(cardnumber);

         cardtextfield = new JTextField(); //textfield make a box like field where we can use to type and i do jtextfeild becz swing
        cardtextfield.setBounds(300,150,250,30);
        add(cardtextfield);

        JLabel pin = new JLabel("P I N");
        pin.setFont(new Font("Oaward",Font.BOLD,26)); //setfont use to change font
        pin.setBounds(120,250,150,30);
        add(pin);


         pintextfield = new JPasswordField();
        pintextfield.setBounds(300,250,250,30);
        add(pintextfield);

         E1 = new JButton("Enter");
        E1.setBounds(300,300,100,30);
        E1.setBackground(Color.PINK);  //for button colour
            E1.addActionListener(this);
        add(E1);



         E2 = new JButton("CLEAR");
        E2.setBounds(450,300,100,30);
        E2.setBackground(Color.PINK);  //for button colour
        E2.addActionListener(this);
        add(E2);

        E3 = new JButton("Create An Account");
        E3.setBounds(340,350,180,30);
        E3.setBackground(Color.PINK);  //for button colour
        E3.addActionListener(this);
        add(E3);

        getContentPane().setBackground(Color.WHITE); //for pick whole frame only this function can call whole frame


        setSize(800,400); //this is use for make a frame pur show nhi hoga keuki visible nhi keya
        setVisible(true); //after this frame  can show becz i set visible true in java frame by default false hota hai
        setLocation(350,200); // setlocation se origin change hota hai or i set orign point center now as f


    }
    public void actionPerformed(ActionEvent ae){ //action event help to find which button click and ae is object
        if (ae.getSource() == E1){             //getsource is come from ae class


        } else if (ae.getSource() == E2){
            cardtextfield.setText(""); //settext is a function which help to set text in any field if we didnot set any text inside settext is empty the field
            pintextfield.setText("");

        } else if (ae.getSource() == E3) {

        }


    }
    public static void main (String[] args){
        new Login();
    }
}
