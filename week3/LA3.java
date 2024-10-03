package week3;

import java.util.Scanner;

public class LA3 { // 예금 메소드와 출금 메소드 만들기


    public static int desposit(int balance, int amount){ //예금 메소드(정수형) , balance - 잔액 /amount - 입력값
        return balance + amount;
    }
    public static int withdraw(int balance, int amount) {// 출금 메소드
        return balance - amount;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int balance = 0; // 사용할 변수 3개 생성해주 (잔액, 입금금액, 출금 금액)
        int depositAmount;
        int withdrawAmount;

        while (true) { // 4번을 입력할때까지 반복 -> 스위치케이스 사용
            System.out.println("---------------------------------------------------------------");
            System.out.println("1. Deposit   |   2. Withdraw  |  3. Check Balance  |  4. Exit");
            System.out.println("---------------------------------------------------------------");
            System.out.print("Choice : ");

            int choice = input.nextInt(); // 숫자 입력받기

            switch (choice) {

                case 1: // 1번 (입금)
                    System.out.print("Enter deposit amount: ");
                    depositAmount = input.nextInt();
                    balance = desposit(balance,depositAmount);
                    System.out.println("Deposit successful. Current balance: " + balance + " won");
                    break;

                case 2: // 2번 (출금) ---> 이 경우만 예외가 있음
                        // 1) 출금 금액이 잔액보다 많은경우 2) 정상적인 경우
                    System.out.print("Enter withdrawal amount: ");
                    withdrawAmount = input.nextInt();
                    if (withdrawAmount > balance){ // 1)번 경우
                        System.out.println("Tried to withdraw " + withdrawAmount + " won, but the balance is insufficient.");
                        break; // 다시 선택하기 위해 case:2 탈출
                    }
                    balance = withdraw(balance, withdrawAmount);
                    System.out.println("Withdrawal successful. Current balance: " + balance + " won");
                    break; //2)번인 경우 입금 완료

                case 3: // 3번 (잔액)
                    System.out.println("Current balance: " + balance + " won");
                    break;

                case 4: //4번 (프로그램 종료)
                    System.out.println("Exiting program. Thank you!");
                    return;
                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        }
    }
}
