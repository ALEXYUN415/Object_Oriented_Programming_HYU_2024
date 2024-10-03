package week1;

import java.util.Scanner;
public class Scanner1 {

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("문자열을 입력하세요: ");
            String str = input.nextLine();
            System.out.println("입력한 문자열: " + str);

            System.out.println("정수를 입력하세요: ");
            int intValue = input.nextInt();
            System.out.println("입력한 정수: " + intValue);

            System.out.println("실수를 입력하세요: ");
            double doubleValue = input.nextDouble();
            System.out.println("입력한 실수: " + doubleValue);


    }
}
