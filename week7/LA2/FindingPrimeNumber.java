package week7.LA2;

import java.util.InputMismatchException; // 예외처리
import java.util.Scanner;


public class FindingPrimeNumber {

    // 소수찾기 메소드
    public static boolean checkPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    //------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            // 시작 값 입력 받기
            System.out.println("Enter the start value for the range to find primes:");
            int start = input.nextInt();

            System.out.println("Enter the end value for the range to find primes:");
            int end = input.nextInt();

            // 입력된 값이 유효한지 확인하고 유효하지 않으면 예외로 throw (end가 0보댜 작은 경우는 첫번쨰 조건에서 걸리기 떄문에 괜찮다)
            if (start >= end || start < 0) {
                throw new IllegalArgumentException("Invalid input: Start must be less than End, and both numbers must be greater than zero.");
            }

            // 소수를 찾아서 출력하고 합계 계산
            System.out.println("Primes in range:");
            long sum = 0; // sum이 int형의 범위를 넘게 되면 오버 플로우로 되기떄문에 큰 값을 넘으면 오류가 난다
            // 소수 합 연산
            for (int i = start; i <= end; i++) {
                if (checkPrime(i)) {
                    System.out.print(i + " ");

                    if (sum + i > Integer.MAX_VALUE) {
                        throw new ArithmeticException("Exceeded the range of int data type.");
                    }
                    sum += i;
                }
            }

            // 소수의 합 출력
            System.out.println("\nSum of primes: " + sum);
        }
        catch (InputMismatchException e) {
            // 입력값을 숫자로 변환할 수 없는 경우 예외 처리
            System.out.println("Having an unknown problem." + e.getMessage());
        }
        catch (IllegalArgumentException e) {
            // 유효하지 않은 입력값 (0,0 이나 첫번째 입력보다 두번째 입력이 작은경우)예외 처리
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e) {
            // int 데이터 타입의 최대값을 초과하는 경우 예외 처리
            System.out.println(e.getMessage());
        }

        finally {
            // Scanner 닫기(파일 입력, 출력은 안닫으면 실행 안되지만 스캐너는 없어도 실행은 된다)
            input.close();
        }
    }

}


