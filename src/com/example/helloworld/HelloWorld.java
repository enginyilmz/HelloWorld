package com.example.helloworld;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Engin!");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println(name);
    }
}
