package bank.management.system;

import java.sql.*;

//this class Conn will be used as object in other classes
public class Conn {
    
    //We are going to use JDBC for database connecter
    //5 steps for JDBC
    //1.Register the drivers
    //2.Create Connection
    public Conn(){
        try{
            
            Class.forName(com.mysql.cj.jdbc.Driver);
        } catch(Exception e){
            System.out.println(e);
        }
    }
    
    
    
    //3.Create Statement
    //4.Execute Query
    //5.Close Connection
    
    
    
}
