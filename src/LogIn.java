/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
public class LogIn {
    
    private String firstname;
    private String lastname ;
    private String username;
    private String password;
    
    
    public LogIn(){
        this.firstname="";
        this.lastname = "";
        this.username = "";
        this.password ="";
        
    }
    
    public String getfirstname(){
        return this.firstname;
    }
    public String getlastname(){
        return this.lastname;
    }
    public String getusername(){
        return this.username;
    }
    public String getpassword(){
        return this.password;
    }
    
    //the setters 
    public void setfirstname(String firstname){
        this.firstname = firstname ;
    }
    public void setlastname(String lastname){
        this.lastname = lastname ;
    }
    public void setusername(String username){
        this.username = username ;
    }
    public void setpassword(String password){
        this.password = password ;
    }
    
    // checkusername and the password methd
    
    //and then register User
    // (in main) the results of the checks, set them to a variable respectively
    // registerUser will loook like registerUser(boolean uName, boolean pWord)
    // use ifs for and follow the question guidline
    // if uName is false return "blah blah blah" and for the true
// if

// login User comes after the previous steps. meaning the user has to log in now, so far we have been registering
// so for this the username the enter now, has to match the username saved during registration
//     
}
