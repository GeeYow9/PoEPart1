/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package javaapplication4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class LoginClassTest {
    
    public LoginClassTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of setFirstName method, of class LoginClass.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "";
        LoginClass instance = new LoginClass();
        instance.setFirstName(firstName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastName method, of class LoginClass.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        LoginClass instance = new LoginClass();
        instance.setLastName(lastName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserName method, of class LoginClass.
     */
    @Test
    public void testSetUserName() {
        System.out.println("setUserName");
        String userName = "";
        LoginClass instance = new LoginClass();
        instance.setUserName(userName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassWord method, of class LoginClass.
     */
    @Test
    public void testSetPassWord() {
        System.out.println("setPassWord");
        String passWord = "";
        LoginClass instance = new LoginClass();
        instance.setPassWord(passWord);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstName method, of class LoginClass.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        LoginClass instance = new LoginClass();
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class LoginClass.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        LoginClass instance = new LoginClass();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserName method, of class LoginClass.
     */
    @Test
    public void testGetUserName() {
        System.out.println("getUserName");
        LoginClass instance = new LoginClass();
        String expResult = "";
        String result = instance.getUserName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassWord method, of class LoginClass.
     */
    @Test
    public void testGetPassWord() {
        System.out.println("getPassWord");
        LoginClass instance = new LoginClass();
        String expResult = "";
        String result = instance.getPassWord();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkPasswordComplexity method, of class LoginClass.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String passWord = "";
        boolean expResult = false;
        boolean result = LoginClass.checkPasswordComplexity(passWord);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkUsername method, of class LoginClass.
     */
    @Test
    public void testCheckUsername() {
        System.out.println("checkUsername");
        String userName = "";
        boolean expResult = false;
        boolean result = LoginClass.checkUsername(userName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class LoginClass.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String userName = "";
        String passWord = "";
        String firstName = "";
        String lastName = "";
        String expResult = "";
        String result = LoginClass.registerUser(userName, passWord, firstName, lastName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of LoginUser method, of class LoginClass.
     */
    @Test
    public void testLoginUser() {
        System.out.println("LoginUser");
        String userName = "";
        String UserName = "";
        boolean expResult = false;
        boolean result = LoginClass.LoginUser(userName, UserName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of LoginPassword method, of class LoginClass.
     */
    @Test
    public void testLoginPassword() {
        System.out.println("LoginPassword");
        String passWord = "";
        String Password = "";
        boolean expResult = false;
        boolean result = LoginClass.LoginPassword(passWord, Password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnLoginStatus method, of class LoginClass.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        String userName = "";
        String passWord = "";
        LoginClass instance = new LoginClass();
        String expResult = "";
        String result = instance.returnLoginStatus(userName, passWord);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
