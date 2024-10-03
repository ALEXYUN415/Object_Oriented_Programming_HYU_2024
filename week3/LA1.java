package week3;

import java.util.Scanner;


// 대소비교 만들기
public class LA1 { //
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of integers to input: ");
        int n = input.nextInt(); // 입력할 정수의 갯수 n 입력받기

        while (n < 0) { // 정수의 갯수가 0보다 작을 경우
            System.out.println("Please enter an integer greater than 0");
            n = input.nextInt(); // 계속 입력하라고 반복
        }

            if (n == 0){ // 0을 입력하면 프로그램 종료
            System.out.println("program exit");
            return; // 프로그램 리턴해주기 (종료)
        }

            // 배열의 인덱스를 n개로 설정(정수형 배열)
        int[] numbers = new int[n];

        // 정수 입력받기
        System.out.println("Enter " + n + " integer");

        // 정수를 입력한 갯수만큼 입력받을떄까지 반복
        for (int i = 0; i < n; i++) {
            int num = input.nextInt();
            numbers[i] = num; //배열의 인덱스에 순서대로 입력한 num을 할당
        }

        // 최소와 최대 정수를 배열 안에 초기화 해서 넣기
        // numbers 배열의 첫번째 자리에 min과 max를 할당
        int min = numbers[0];
        int max = numbers[0];


        for (int i = 1; i < n; i++) { // 첫번째 자리부터 비교해서 0번째 자리에 있는 최대 최소를 비교
            if (numbers[i] < min) { // 배열에 저장된 수가 첫 자리에 할당된 min보다 작으면 min 변경
                min = numbers[i];
            }
            if (numbers[i] > max) {// 배열에 저장된 수가 첫 자리에 할당된 max보다 작으면 min 변경
                max = numbers[i];
            }
        }

        System.out.println("Min Integer :"  + min);
        System.out.println("Max Integer :"  + max);
    }
}
