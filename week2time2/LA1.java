package week2time2;

import java.util.Scanner;

public class LA1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("숫자를 입력하시오 : ");
        int value1 = input.nextInt();
        System.out.println("두번째 숫자를 입력하시오 : ");
        int value2 = input.nextInt();


        if (value1 > value2) { // 무조건 입력받은 숫자중 작은게 처음으로 오게하기 위해서 새로운 변수 선언해서 저장
            int ex = value1;
            value1 = value2;
            value2 = ex;
        }
        if (value2 - value1 <= 2) { // 두 수 사이 값이 2보다 작을 경우
            if (value1 == value2) { // 같은 값일 경우
                System.out.println("No even numbers found.");
            } else if (value1 % 2 == 1 & value2 % 2 == 1) { // 둘다 홀수
                System.out.print(value1 + 1); // 작은값에다가 1 더하기
            } else if (value1 % 2 == 0 & value2 % 2 == 0) { // 두 수의 차이가 2보다 작을떄 and 두 수가 짝수일때
                System.out.print("No even numbers found."); // 가운데 짝수 없음
            } else {
                System.out.print("No even numbers found.");
            }
        }
        else { // 반복 실행
            for (int i = value1 + 1; i < value2; i++) { /*반복문*/
                if (i % 2 == 0) { // 짝수인경우 짝수만 출력
                    System.out.print(i);
                    if (i + 2 < value2) { // 맨 마지막에는 , 찍지 않기 위해서
                        System.out.print(",");
                    }
                }

            }
        }
    }
}