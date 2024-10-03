package week2time1;


import java.util.Scanner;
public class LA1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("숫자를 입력하시오 :");
        int num = input.nextInt();

        if (num%2==0 && num != 0){
            System.out.println("The number in even");
        } else if (num==0) {
            System.out.println("The number in zero and even");
        }
            else
                System.out.println("The number in odd");
    }
}
