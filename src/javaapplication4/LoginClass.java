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

    private static boolean loginUsername(String userName, String passWord) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
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
    


    public static boolean checkPasswordComplexity(String passWord) {
        // Checking password length
        if (passWord == null || passWord.length() < 8) {
            JOptionPane.showMessageDialog(null, "Password too short!");
            return false;
        }

        // Checking for capital letters, numbers, and special characters using regex
        boolean hasCapital = Pattern.compile("[A-Z]").matcher(passWord).find();
        boolean hasNumber = Pattern.compile("[0-9]").matcher(passWord).find();
        boolean hasSpecialCharacter = Pattern.compile("[^a-zA-Z0-9]").matcher(passWord).find();

        if (!hasCapital) {
            JOptionPane.showMessageDialog(null, "Password must contain at least one capital letter!");
            return false;
        }

        if (!hasNumber) {
            JOptionPane.showMessageDialog(null, "Password must contain at least one number!");
            return false;
        }

        if (!hasSpecialCharacter) {
            JOptionPane.showMessageDialog(null, "Password must contain at least one special character!");
            return false;
        }

        // Valid Passwword
        return true;
    

       
    }
    public static boolean checkUsername(String userName) {
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
    public static String registerUser(String userName, String passWord, String firstName, String lastName){
    if(!checkUsername(userName)) {
        return"Username is not correctly formatted, please ensure that username contains an underscore and is no more than 5 characeters." ;
    }

    if(!checkPasswordComplexity(passWord)){
        return"Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number amd a special character." ;
    }
    
    //store user information database or file
    return "Acount successfully registered!" ;
    }
    public static boolean LoginUser(String userName, String UserName) {
        if(UserName.equals(userName)){
            JOptionPane.showMessageDialog(null, "Username is correct");
        }else{
            JOptionPane.showMessageDialog(null, "Username is incorrect");
        }
        return true;
        
    }
    
    public static boolean LoginPassword(String passWord, String Password){
        if(!Password.equals(passWord)){
            JOptionPane.showMessageDialog(null, "Password is correct");
        }else{
            JOptionPane.showMessageDialog(null, "Password is incorrect");
        }
        return true; 
    
    }
    
    public String returnLoginStatus(String userName, String passWord){
        if(LoginUser(userName, passWord)){
            return "Welcome " + getFirstName() + "" + getLastName() + ", it is great to see you again." ;
        }else{
        return "Username or Password incorrect, please try again." ;     
        }
           
        }
   
    
}





    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
