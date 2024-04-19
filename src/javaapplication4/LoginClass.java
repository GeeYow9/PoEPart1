/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class LoginClass {
    private    String firstName ;
    private    String lastName ;
    private    String userName ;
    private    String passWord ;
    
//Creating default contructor    
    public LoginClass(){
        this.firstName = "" ;
        this.lastName = "" ;
        this.passWord = "" ;
        this.userName = "" ;
    }
    
//Creating the setters
    public void setFirstName(String firstName){
        this.firstName = firstName ;
    }
    public void setLastName(String lastName){
        this.lastName = lastName ;
    }
    public void setUserName(String userName){
        this.userName = userName ;
    }
    public void setPassWord(String passWord){
        this.passWord = passWord ;
    }
    
//Creating the getters 
    public String getFirstName(){
        return this.firstName ;
    }
    public String getLastName(){
        return this.lastName ; 
    }
    public String getUserName(){
        return this.userName ;
    }
    public String getPassWord(){
        return this.passWord ;
    }
    


    public static boolean isValidPassword(String passWord) {
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

        // Valid Passwword
        return true;
    

       
    }
    public static boolean isValidUsername(String userName) {
    if (!userName.contains("_")) {
        // If username does not contain an underscore
        return false;
    } else if (userName.length() >= 5) {
        // If username is longer than 5 characters
        return false;
    } else {
        // If username contains an underscore and has no more than 5 characters
        return true;
    }
}   
    
}



    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
