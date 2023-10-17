package bank.management.system;

//it imports classes of swing
import javax.swing.*;
//here we are using JFrame from swing


//Our login class is extending JFrame class
public class Login extends JFrame{
    
    //this is a login constructor
    Login(){
        setSize(800,480);//Tab Dimensions
        setVisible(true);//Tab visibility (By Default - False)
        setLocation(350,200);//Tab Position on Screen (350 from left and 200 from top)
        setTitle("Automated Teller Machine");//Tab Title
    }
    
    public static void main(String args[]) {
        
        //here Login object is created
        new Login();
    }
}
