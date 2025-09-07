package com.mycompany.javacode;
import java.util.*;

public class JavaCode {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello World");
        System.out.println("Enter your Name");
        String Name = input.nextLine();
        System.out.println("Hello " +Name+"!");
        System.out.println("Enter a numder");
        int x = input.nextInt();
        if(x%2==0){
           System.out.println("Even"); 
        }
        else {
            System.out.println("Odd");
        }
        System.out.println("Enter three numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
        if(a>b && a>c){
            System.out.println("The largest number is "+a);
        }
        else if(b>a && b>c){
            System.out.println("The largest number is "+b);
        }
        else{
            System.out.println("The largest number is "+c);
        }
    }
}

