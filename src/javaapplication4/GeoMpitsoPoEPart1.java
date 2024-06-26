package javaapplication4;


import javax.swing.JOptionPane;
import java.util.regex.Pattern;

public class GeoMpitsoPoEPart1 {

    public static void main(String[] args) {
        LoginClass login = new LoginClass() ;
    //   Registration registration = new Registration() ;

        // Prompt user to enter registration details
        String firstName ;
        String lastName ;
        String userName ;
        String passWord ;
       
        firstName= JOptionPane.showInputDialog("Enter Your Firstname") ;
        lastName = JOptionPane.showInputDialog("Enter Your Lastname") ;
      
        
        
        do { 
            userName = JOptionPane.showInputDialog(null, "Enter valid username") ; 
        } while (!checkUsername(userName));{
               JOptionPane.showMessageDialog(null,"Username successfully captured.") ;
    }

        do {
            passWord = JOptionPane.showInputDialog(null, "Please enter a password that meets the following requirements:\n1. At least 8 characters long\n2. Contain a capital letter\n3. Contain a number\n4. Contain a special character") ;
        } while (!checkPasswordComplexity(passWord));{
        JOptionPane.showMessageDialog(null,"Password successfully captured.") ;
    }
    
        
        
        JOptionPane.showMessageDialog(null,"Do you want to login?") ;
        
        String Username ;
        String Password ;
        
        
        Username = JOptionPane.showInputDialog(null,"Enter valid username") ;
        Password = JOptionPane.showInputDialog(null,"Enter valid password") ; 
        
         if (Username.equals(userName) && Password.equals(passWord)){
           JOptionPane.showMessageDialog(null, "Login Successful! Welcome," + firstName + lastName + " it is great to see you again!");
        }else{
        JOptionPane.showMessageDialog(null, "Username or Password is incorrect. Please try again.");
         do { 
            userName = JOptionPane.showInputDialog(null, "Please enter valid username") ; 
        } while (!checkUsername(userName));{
               JOptionPane.showMessageDialog(null,"Username successfully captured.") ;
    }
         do {
            passWord = JOptionPane.showInputDialog(null, "Please enter valid password") ;
        } while (!checkPasswordComplexity(passWord));{
        JOptionPane.showMessageDialog(null,"Password successfully captured.") ;
        JOptionPane.showMessageDialog(null, "Login Successful! Welcome," + firstName + "," + lastName + " it is great to see you again!");
        
    }
        
      }
       
    }
    
     
    

    public static boolean checkPasswordComplexity(String passWord) {
        // Checking password length
        if (passWord == null || passWord.length() < 8) {
            JOptionPane.showMessageDialog(null, "Password too short!");
            return false;
        }

        // Checking for capital letters, numbers, and special characters using regex
        boolean hasCapital = Pattern.compile("[A-Z]").matcher(passWord).find();
        boolean hasNumber = Pattern.compile("[0-9]").matcher(passWord).find();
        boolean hasSpecialChar = Pattern.compile("[^a-zA-Z0-9]").matcher(passWord).find();

        if (!hasCapital) {
            JOptionPane.showMessageDialog(null, "Password must contain at least one capital letter!");
            return false;
        }

        if (!hasNumber) {
            JOptionPane.showMessageDialog(null, "Password must contain at least one number!");
            return false;
        }

        if (!hasSpecialChar) {
            JOptionPane.showMessageDialog(null, "Password must contain at least one special character!");
            return false;
        }

        // Valid Password
        return true;
    

       
    }
    public static boolean checkUsername(String userName) {
        boolean hasCapital = Pattern.compile("[A-Z]").matcher(userName).find();
         if (!hasCapital) {
            JOptionPane.showMessageDialog(null, "Username must contain at least one capital letter!");
            return false;
        }
    if (!userName.contains("_")) {
        // If username does not contain an underscore
        return false;
    } else if (userName.length() >=5) {
        // If username is longer than 5 characters
        return false;
    } else {
        // If username contains an underscore and has no more than 5 characters
        return true;
    }
}
    }
    
    
    
   
   
 
        
            
                
                
         
 

    

          

            
    
