package week3;

import java.util.Scanner;

public class LA4 {

    // 틱택토 만들기
    // 각 기능을 수행하는 메소드를 만들어야함
    // 메소드 5개 만들기
    // 1. 보드의 가시성 확보 띄어쓰기 메소드
    // 2. 턴 넘겨주기 메소드
    // 3. 이겼을 경우 2가지 확인하는 경우 만들기
    // 4. 보드가 가득 찼을 경우를 확인하는 메소드 만들기
    // 5. 게임 재시작 메소드

    public static char[][] board = {{'-', '-', '-'}, {'-', '-', '-'}, {'-', '-', '-'}};
    // 2차원 배열을 생성
    // 각 인덱스마다 기본으로 '-'를 삽입
    public static Scanner input = new Scanner(System.in); // 스캐너로 삽입 생성

    public static void main(String[] args) {

        while(true) {
            // false 일때 탈출
            // 이길경우(일자, 대각선)일때를 계산하는 함수
            // 아니면 무조건 무승부

            printBoard(); // 보드판 생성(2차원 배열)
            turn('X'); // 각 턴제로 배열을 채워주기/ x먼저 입력
            if(checkWin('X')) { // x가 이기는 경우
                printBoard();
                System.out.println("X wins!");
                if (!regame()){
                    break;
                }
                System.out.println("One more game!!");
            } else if(boardFull()) { // 이기지 않았는데 다 채워졌음
                printBoard();
                System.out.println("Draw!");
                if (!regame()){
                    break;
                }
                System.out.println("regame!!");
            }

            printBoard(); // 보드판 생성(2차원 배열)
            turn('O'); // 그다음 o입력
            if(checkWin('O')) { // o가 이김
                printBoard();
                System.out.println("O wins!");
                if (!regame()){
                    break;
                }
                System.out.println("One more game!!");
            } else if(boardFull()) { // 이기지 않았는데 다 채워짐
                printBoard();
                System.out.println("Draw!");
                if (!regame()){
                    break;
                }
                System.out.println("One more game!!");
            }
        }
    }
    //---------------------------------------------------------------------------------
    public static void printBoard() { // 게임판을 계속 생성해주는 메소드
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " "); // 3*3 틱택토 보드 (띄어쓰기로 가시성 확보...)
            }
            System.out.println(); // 줄넘기기
        }
    }
    //---------------------------------------------------------------------------------
    public static void turn(char player) {
        // player 라는 매개변수 입력받기
        // 턴을 넘겨주기 메소드
        // 이부분이 제일 어려웠음;;;;;;
        while(true) {
            System.out.println("It's " + player + "'s turn, Enter coordinates(for exammple : 1 1) ");
            int row = input.nextInt() -1;// 배열은 인덱스가 0으로 하기때문에 입력하는 숫자에서 -1해줘서 컴퓨터가 알아먹게하기
            int col = input.nextInt() -1;// 행과 열 입력받기

            if(row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-') {
                // 범위안에 있어야하고, 내가 지정한곳이 지정되어있지 않아야한다
                board[row][col] = player; // 배열 채우고
                break; // 탈출
            } else { // 정상적이지 않다면? 다시 하라고 하고 while 반복
                System.out.println("This is worng move -> (" + (row+1) + "," + (col+1) + ") is not valid. Try again");
            }
        }
    }
    //---------------------------------------------------------------------------------
    public static boolean checkWin(char player) { //이기는 경우의 메소드
        // 1자로 이기는 경우 -> 행들이 다 같은 플레이어이거나 열들이 다 같은 플레이어이면 승리
        for(int i = 0; i < 3; i++) {
            if((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                    (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }

        // 대각선으로 이기는 경우 2가지
        if((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }
        return false;
    }
//---------------------------------------------------------------------------------
    public static boolean boardFull() { // 보드가 꽉 찼는지 확인하는 메소드
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') { // 보드에 '-'가 하나도 없다면? -> 전부 채워졌다고 판단
                    return false; // false 로 반복
                }
            }
        }
        return true; // 다 차있으면 다 찼다고 확인
    }
//---------------------------------------------------------------------------------
    public static boolean regame() { // 개임 재시작 메소드
        while (true) { // 반복문으로 수정만 5번....
            System.out.println("Do you want to play more? (Yes = 1 / No = 2): ");
            int choice = input.nextInt();
            if (choice == 1) {
                // 보드 초기화
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        board[i][j] = '-';
                    }
                }
                return true;
            } else if (choice == 2) {
                System.out.println("Thank you for playing!");
                return false;
            } else {
                System.out.println("Invalid number choice. Please enter 1 for regame or 2 for exit game.");
            }
        }
    }
}


