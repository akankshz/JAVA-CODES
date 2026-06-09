/*Create a program that determines the greatest of the three
numbers*/

import java.util.Scanner;

public class greatestnumber {
    static void main(String[] args) {
        System.out.print("please enter value of a: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.print("please enter value of b: ");
        int b = input.nextInt();
        System.out.print("please enter value of c: ");
        int c = input.nextInt();
        if(a>=b && a>=c){
            System.out.println(a +" is the greatest number");
        } else if (b>=a && b>=c) {
            System.out.println(b +" is the greatest number");
        }else{
            System.out.println(c +" is the greatest number");
    }
    }

}






