package week3;

import java.util.Scanner;

public class LA2 { // 학생의 성적적에 따라 등급을 결정하는 메소드를 만들고 그 메소드를 활용해서
                // 배열을 만든 뒤 점수들을 배열에 저장해서 처리하는 과정을 만들기

    public static char calculateGrade(int[] score, int n) { // 입력받은 정수로 n개의 배열을 가져오고 배열의 인덱스의 평균에 따라

        double sum = 0;                                        // 등급을 계산하는 메소드
        for (int i = 0; i < n; i++) {
            sum += score[i]; // 배열에 저장된 값들을 모두 더할때까지 반복
        }

        double avg = sum / n; //평균 내주기

        if (avg >= 90) {
            return 'A';
        } else if (avg >= 80) {
            return 'B';
        } else if (avg >= 70) {
            return 'C';
        } else if (avg >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    } // 리턴해주는 메소드로 만들어야한다 void형이 아니기 떄문에

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n; // 입력받을 점수의 갯수 n개로 정하는 정수 선언

        while (true) { // 점수의 갯수를 입력받을떄에서 특이점 2가지를 작성(0일때랑 0보다 작을경우)
            System.out.print("Enter the number of scores : ");
            n = input.nextInt(); // n 입력받기
            if (n < 1) { // 변경된 조건: 점수의 개수가 1 미만일 경우
                if (n == 0) { // 0일떄는 프로그램 종료
                    System.out.println("Exit the program");
                    return;
                } else {
                    System.out.println("The number of scores should be more than one"); // 변경된 메시지
                }
            } else {
                break; //while 문 탈출
            }
        }

        int[] scores = new int[n]; //n개의 배열을 생성


        while (true) { // n개의 배열에 정해진 범위의 숫자를 입력받기

            boolean check = true; //값을 확인하는 변수를 check 로 선언 -> 입력 받은 값을 확인하기 위해서
            System.out.print("Enter " + n + " scores: ");

            for (int i = 0; i < n; i++) { // 제대로 된 값이 아닐경우 찾기
                scores[i] = input.nextInt(); // 배열의 값 입력받기
                if (scores[i] < 0 || scores[i] > 100) { // 점수의 범위가 조건에 안맞다면?
                    check = false; // 체크를 false로 변경 후 탈출
                }
            }
            if (check) { // 체크가 폴스가 아니라면 반복 금지
                break;
            }
                System.out.println("The score should be in the range of 0 to 100.");
                System.out.println("Invalid score found. Please enter " + n + " scores again.");
        }

        // 결과 출력
        char grade = calculateGrade(scores, n);
        System.out.println("Grade: " + grade);
    }
}
