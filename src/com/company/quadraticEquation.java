package com.company;

import java.util.Scanner;

public class quadraticEquation {
    private double a,b,c;
    double delta;
    Scanner input = new Scanner(System.in);
    public quadraticEquation(double a, double b, double c) {
        this.a =a;
        this.b =b;
        this.c =c;
    }
    public double detA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double getC(){
        return  this.c;
    }
    public void getDiscriminant() {
        delta = (this.b * this.b) - 4 * this.a * this.c;
        if ( delta>0){
            System.out.println(((-this.b + Math.sqrt(delta)) / (2 * this.a)) + " and " + ((-this.b - Math.sqrt(delta)) / (2 * this.a)));
        }else if (delta==0){
            System.out.println((-this.b) / (2 * this.a));
        }else
            System.out.println("ptr vo nghiem");
    }
}
