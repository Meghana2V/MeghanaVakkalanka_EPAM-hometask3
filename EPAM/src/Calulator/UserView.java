package Calulator;

import java.util.Scanner;

import static java.lang.System.exit;

public class UserView {
    int a,b;
    Scanner sc1 = new Scanner(System.in);
    public void read(){
        System.out.println("Enter two integer values : ");
        a = sc1.nextInt();
        b = sc1.nextInt();
    }

    public static void main(String[] args) {
        int ch;
        char c;
        BackgroundProcess bg = new BackgroundProcess();
        UserView us = new UserView();
        Scanner sc = new Scanner(System.in);
        do {
            bg.displayChoice();
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("You have chosen : Addition");
                    us.read();
                    System.out.println("Your result is : " + bg.add(us.a,us.b));
                    break;
                case 2:
                    System.out.println("You have chosen : Subtraction");
                    us.read();
                    System.out.println("Your result is : " + bg.sub(us.a,us.b));
                    break;
                case 3:
                    System.out.println("You have chosen : Multiplication");
                    us.read();
                    System.out.println("Your result is : " + bg.mul(us.a,us.b));
                    break;
                case 4:
                    System.out.println("You have chosen : Division");
                    us.read();
                    System.out.println("Your result is : " + bg.division(us.a,us.b));
                    break;
                case 5:
                    System.out.println("You have chosen : Modular division");
                    us.read();
                    System.out.println("Your result is : " + bg.moddiv(us.a,us.b));
                    break;
                case 6: exit(0);
                default:
                    System.out.println("Please enter a value among the given 1-6 cases!!");
            }
            System.out.println("If you want to continue press 'Y' or 'y'!!");
            c = sc.next().charAt(0);
        } while (c == 'Y' || c == 'y');
    }
}
