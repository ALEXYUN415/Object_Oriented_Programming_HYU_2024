package week2time2;
import java.util.Scanner;
public class LA3 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("How many layers do you want your pyramid to be? ");
        int num = input.nextInt();


        for(int i = 0; i <= num ; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
