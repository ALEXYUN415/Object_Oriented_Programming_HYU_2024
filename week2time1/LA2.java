package week2time1;

import java.util.Scanner;

public class LA2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("degree : ");
        float degree = input.nextFloat();

        if (degree < -10) {
            System.out.println("Temperature is out of the recommended range for outfit advice.");
        } else if (degree < -5) {
            System.out.println("Wear a heavy coat,gloves, and a warm hat");
        } else if (degree < 5) {
            System.out.println("Wear a coat and hat");
        } else if (degree < 15) {
            System.out.println("Wear a light jacket.");
        } else if (degree < 25) {
            System.out.println("Wear a long-sleeve shirt and pants.");
        } else if (degree < 30) {
            System.out.println("wear a t=shirt and short");
        }else
            System.out.println("Temperature is out of the recommended range for outfit advice.");
    }
}