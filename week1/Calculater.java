package week1;

import java.util.Scanner ;

public class Calculater {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Put in the first number:");
        int a1= input.nextInt();

        System.out.print("Put in the second number:");
        int a2= input.nextInt();

        int Sum = a1 + a2 ;

        System.out.println("Sum:"+ Sum );

    }
}
