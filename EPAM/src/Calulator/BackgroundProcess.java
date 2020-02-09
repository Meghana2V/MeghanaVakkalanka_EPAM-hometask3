package Calulator;

import java.util.Scanner;

public class BackgroundProcess {

    Scanner sc = new Scanner(System.in);

    public void displayChoice() {
        System.out.println("*** The Calculator ***");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Modular Division");
        System.out.println("6.Exit");
        System.out.println("Please Enter your choice: ");
    }


    public int add(int a, int b) {
        return a+b;
    }

    public int sub(int a, int b) {
        return a-b;
    }

    public int mul(int a, int b) {
        return a*b;
    }

    public float division(float a, float b) {
        return a/b;
    }

    public int moddiv(int a, int b) {
        return a%b;
    }
}
