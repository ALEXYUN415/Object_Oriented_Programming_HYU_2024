package week2time1;

import java.util.Scanner;

public class LA3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("korean won : ");

        double krw = input.nextFloat();
        double usd = (krw / 1315.25);
        System.out.println(usd);


    }
}

