package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Authenticate{
    public static void main(String[] args) {
        Display();
    }
    public static void Display()
    {
        Authenticate authenticate = new Authenticate();
        authenticate.setCorrectLogin();
    }
}