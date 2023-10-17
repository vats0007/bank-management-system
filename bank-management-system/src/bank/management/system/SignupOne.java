package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
 
public class SignupOne extends JFrame{
    
    SignupOne(){
        
        //setLayout should be null to use setBound
        setLayout(null);
        
        //generating random numbers
        Random ran = new Random();
        Long random = Math.abs((ran.nextLong() % 9000L)+1000L);
        
        //Form No: Lable
        JLabel formno = new JLabel("APPLICATION FORM NO : " + random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        //Personal details label
        JLabel personalDetails = new JLabel("Page 1 : Personal Details");
        personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personalDetails.setBounds(290,80,400,30);
        add(personalDetails);
        
        //Name Label
        JLabel name = new JLabel("Name : ");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
        //name text field
        JTextField nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
        
        //fName Label
        JLabel fname = new JLabel("Father's Name : ");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        //fname text field
        JTextField fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);
        
        //dob Label
        JLabel dob = new JLabel("Date Of Birth : ");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        //Dob calender
        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        add(dateChooser);
        
        //gender Label
        JLabel gender = new JLabel("Gender : ");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
        //gender Radio button
        //male
        JRadioButton male = new JRadioButton("Male");
        male.setBounds(300,290,120,30);
//        male.setBackground(Color.WHITE);
        add(male);
        
        //female
        JRadioButton female = new JRadioButton("Female");
        female.setBounds(450,290,120,30);
//        female.setBackground(Color.WHITE);
        add(female);
        
        //ButtonGroup for radio button - Gender
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        
        
        
        //email Label
        JLabel email = new JLabel("Email : ");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);
        
        //email text field
        JTextField emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);
        
        //marital Label
        JLabel marital = new JLabel("Marital Status : ");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);
        
        //marital Radio button
        //married
        JRadioButton married = new JRadioButton("Married");
        married.setBounds(300,390,100,30);
//        married.setBackground(Color.WHITE);
        add(married);
        
        //unmarried
        JRadioButton unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450,390,100,30);
//        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        //other
        JRadioButton other = new JRadioButton("Other");
        other.setBounds(630,390,100,30);
//        other.setBackground(Color.WHITE);
        add(other);
        
        //ButtonGroup for radio button - maritalStatus
        ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(married);
        maritalGroup.add(unmarried);
        maritalGroup.add(other);
        
        //Address Label
        JLabel address = new JLabel("Address : ");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address); 
        
        //address text field
        JTextField addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.BOLD,14));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);
        
        //City Label
        JLabel city = new JLabel("City : ");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city); 
        
        //city text field
        JTextField cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);
        
        //State Label
        JLabel state = new JLabel("State : ");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);
        
        //State text field
        JTextField stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);
        
        //Pincode Label
        JLabel pincode = new JLabel("Pin Code : ");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
        //pincode text field
        JTextField pinTextField = new JTextField();
        pinTextField.setFont(new Font("Raleway",Font.BOLD,14));
        pinTextField.setBounds(300,590,400,30);
        add(pinTextField);
        
        JButton next = new JButton("Next>>");
        next.setBounds(620,660,100,30);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setOpaque(true);
        next.setBorderPainted(false);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        add(next);
        
        
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }

    public static void main(String args[]) {
        new SignupOne();
    }
}
