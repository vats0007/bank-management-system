package bank.management.system;

//it imports classes of swing
import javax.swing.*;
//here we are using JFrame from swing
//it imports classes of awt
import java.awt.*;
import java.awt.event.*;


//Our login class is extending JFrame class and implements ActionListener to give onclick actions to buttons
public class Login extends JFrame implements ActionListener{
    
    //Globle declaration for buttons,textfields,passwordfield
    JButton login,signUp,clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    
    //this is a login constructor
    Login(){
        
        //default layout has been set to null
        setLayout(null);
        
        //image fetched in form of imageicon in i1
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        //Image is scaled using Image object i2 from imageicon object i1
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        //Image object i2 is converted in to imageicon i3
        //we can not pass image object into JLabel directly
        ImageIcon i3 = new ImageIcon(i2);
        //Converting .jpg/.png file in to label that can be added to tab
        //Imageicon i3 is given to JLable
        JLabel label = new JLabel(i3);
        
        //70 from right 10 from top is location for image
        //100x100 is image size. Image can be cropped by this dimensions
        label.setBounds(70, 10, 100, 100);
        
        //add() is used to add components on tab
        add(label);
        
        //Heading
        //JLable class is used to make labels
        JLabel text = new JLabel("Welcome to ATM");
        //text object of JLabal uses setBounds() to place the content on the tab
        text.setBounds(300, 40, 400, 40);
        //setFonts is used for fonts
        text.setFont(new Font("Osward",Font.BOLD,38));
        add(text);
        
        //Label Card No
        JLabel cardNo = new JLabel("Card No. :");
        cardNo.setBounds(120, 150, 200, 30);
        cardNo.setFont(new Font("Arial",Font.BOLD,28));
        add(cardNo);
        
        //Input section for card no 
        cardTextField = new JTextField();
        cardTextField.setBounds(300,150,230,30);
        cardTextField.setFont(new Font("Raleway",Font.BOLD,14));
        add(cardTextField);
        
        //Label Pin
        JLabel pin = new JLabel("PIN :");
        pin.setBounds(120, 220, 400, 30);
        pin.setFont(new Font("Arial",Font.BOLD,28));
        add(pin);
        
        //Input section for PIN
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300,220,230,30);
        pinTextField.setFont(new Font("Raleway",Font.BOLD,14));
        add(pinTextField);
        
        //JButton's object for login button
        login = new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        //in mac setOpaque give background color to button
        login.setOpaque(true);
        //Border of the button will be erased
        login.setBorderPainted(false);
        //background color of button will be BLACK and font color white
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        //ActionListener is added to login button
        login.addActionListener(this);
       
        add(login);
        
        //JButton's object for clear button
        clear = new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setOpaque(true);
        clear.setBorderPainted(false);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
        //SignUp Button
        signUp = new JButton("SIGN UP");
        signUp.setBounds(300,350,230,30);
        signUp.setOpaque(true);
        signUp.setBorderPainted(false);
        signUp.setBackground(Color.BLACK);
        signUp.setForeground(Color.WHITE);
        signUp.addActionListener(this);
        add(signUp);
        
        //BackgroundColor of tab
        getContentPane().setBackground(Color.WHITE);
        
        //ImageIcon class should always be above setSize()
        setSize(800,480);//Tab Dimensions
        setVisible(true);//Tab visibility (By Default - False)
        setTitle("Automated Teller Machine");//Tab Title
        setLocation(350,200);//Tab Position on Screen (350 from left and 200 from top)
        
    }
    
    //ActionListener is an abstruct class so method inside it should be override as done below
    public void actionPerformed(ActionEvent ae){
        //ActionEvent detects clicks and stores info in ae
        //ae gets access to buttons using getSource()
        //by if else which button is pressed
        if(ae.getSource() == clear){
            //clearing textfield values using setValues
            cardTextField.setText("");
            pinTextField.setText("");
        }
        else if(ae.getSource() == signUp){
            
        }
        else if(ae.getSource() == login){
            
        }
    }
    
    public static void main(String args[]) {
        
        //here Login object is created
        new Login();
    }
}