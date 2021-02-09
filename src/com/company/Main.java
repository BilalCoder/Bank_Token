package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the service type for first customer:");
        String service = sc.next();
        Token token = new Token(service);
        System.out.println("Your Token number is:"+ Token.getTokenNumber() +" and Counter number is:"+ token.getCounterNumber());

        System.out.println("Enter the service type for next customer:");
        String serv = sc.next();
        Token token1 = new Token(serv);
        System.out.println("Your Token number is:"+ Token.getTokenNumber() +" and Counter number is:"+ token1.getCounterNumber());

    }
}
