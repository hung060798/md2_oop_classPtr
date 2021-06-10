package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("nhap a");
        double a = input.nextDouble();
        System.out.println("nhap b");
        double b = input.nextDouble();
        System.out.println("nhap c");
        double c = input.nextDouble();

        quadraticEquation giaiPtr = new quadraticEquation(a,b,c);
        giaiPtr.getDiscriminant();
    }
}
