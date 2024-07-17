package org.example;
import java.io.IOException;
import java.util.Scanner;

public class Authenticate extends ComputeValues{
    String username = "cchua@gmail.com";
    String password = "password";
    boolean correctLogin = false;
    ComputeValues computeValues = new ComputeValues();


    Scanner scan = new Scanner(System.in);
    void setCorrectLogin(){

        System.out.print("Enter Username : ");
        String login_User = scan.nextLine().toLowerCase();
        System.out.print("Enter Password : ");
        String login_Password = scan.nextLine().toLowerCase();
        if(login_User.equals(username)&& login_Password.equals(password))
        {

            System.out.println("Logged In!");
            ComputeValues.main();
        }
        else
        {
            System.out.print("Incorrect Credentials");
            setCorrectLogin();
        }
    }
}
