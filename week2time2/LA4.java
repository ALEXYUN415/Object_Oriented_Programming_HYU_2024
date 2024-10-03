package week2time2;

import java.util.Scanner;

public class LA4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many layers do you want your pyramid to be?");
        int num = input.nextInt();
        System.out.println("\nThe pyramid below shows the " + num + " layers");

        for (int i = 0; i <= num; i++ ) {
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}