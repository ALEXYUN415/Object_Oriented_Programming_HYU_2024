package week1;

public class Operator {

    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        System.out.println("*[사칙연산 + 나머지 구하기]\n");
        //덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum); // 출력 : a + b = 7
        //뺼셈
        int diff = a - b;
        System.out.println("a - b = " + diff); // 출력 : a - b = 3
        //곱셉
        int multi = a * b;
        System.out.println("a * b = " + multi); // 출력 : a * b = 10
        //나눗셈
        int div = a / b;
        System.out.println("a / b = " + div); // 출력 : a / b = 2
        //나머지
        int mod = a % b;
        System.out.println("a % b = " + mod); // 출력 : a % b = 1

        System.out.println("\n[문자열 더하기]\n");
        // 문자열과 문자열 더하기 1
        String result1 ="hello " + "world";
        System.out.println(result1);
        // 문자열과 문자열 더하기2
        String s1 ="string1";
        String s2 ="string2";
        String result2 = s1 + s2;
        System.out.println(result2);
        // 문자열과 숫자 더하기1
        String result3 = "a + b = " + 10;
        System.out.println(result3);
        // 문자열과 숫자 더하기2
        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println(result4);

        System.out.println("\n[증감 연산자]\n");
        int p = 0;
        p = p + 1;
        System.out.println("p = " + p); //1
        p = p + 1;
        System.out.println("p = " + p); //2
        // 전위 증감 연산자
        ++p; // p = p + 1
        System.out.println("p = " + p); //3
        // 후위 증감 연산자
        p++; // a = a + 1
        System.out.println("p = " + p); //4


    }






}






