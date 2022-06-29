package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        NumbersOfBrackets test = new NumbersOfBrackets();//create a new object of class NumbersOfBrackets
        Scanner sk = new Scanner(System.in); //create a new object of class Scanner
        System.out.println("Enter the number");
        int s = sk.nextInt(); //read the numbers entered from the keyboard
        //outputting the result to the console
        System.out.println("Number of correct bracket expressions = " + test.determineTheNumber(s));
        }}
