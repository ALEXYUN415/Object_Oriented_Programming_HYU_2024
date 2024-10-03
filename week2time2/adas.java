package week2time2;

import java.util.Scanner;

public class adas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력하시오 : ");
        int value1 = input.nextInt();
        System.out.println("두번째 숫자를 입력하시오 : ");
        int value2 = input.nextInt();


        if (value1 > value2) {
            int ex = value1;
            value1 = value2;
            value2 = ex;
        }

        int check = 0;
        for (int i = value1 + 1; i < value2; i++) {
            if (i % 2 == 0) {
                check++;
                System.out.print(i);
                if (i + 2 < value2) {
                    System.out.print(", ");
                }
            }
        }

        if (check==0) {
            System.out.println("no even numbers");
        }
    }
}