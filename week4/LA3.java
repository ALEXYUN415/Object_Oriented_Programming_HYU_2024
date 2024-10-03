package week4;

import java.util.Scanner;

class Hamburger{
    int breads,cheeses,petties,vegetables;
}

public class LA3 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome our hamburger store!");
        Hamburger hamburger = new Hamburger();

            makeHamburger(hamburger); // 햄버거 입력
            calculatePrintCalories(hamburger);
            additionalOrder(hamburger);

    }

    public static void makeHamburger(Hamburger hamburger){ // 햄버거 재료들 갯수 입력받는 메소드

        System.out.print("\nEnter the number of breads: ");
        hamburger.breads = input.nextInt();
        System.out.print("Enter the number of cheeses: ");
        hamburger.cheeses = input.nextInt();
        System.out.print("Enter the number of petties: ");
        hamburger.petties = input.nextInt();
        System.out.print("Enter the number of vegetables: ");
        hamburger.vegetables = input.nextInt();
        System.out.println();

    }

    public static void calculatePrintCalories(Hamburger hamburger){ //햄버거 칼로리 계산하는 칼로리

            int sum;
            System.out.println("The calories in the food you ordered are: ");
            int bc = hamburger.breads * 80;
            System.out.println("Bread Calories: " + bc);
            int cc = hamburger.cheeses * 100;
            System.out.println("Cheese Calories: " + cc);
            int pc = hamburger.petties * 250;
            System.out.println("Patty Calories: " + pc);
            int vc = hamburger.vegetables * 20;
            System.out.println("Veggies Calories: " + vc);
            sum = bc + cc + pc + vc;
            System.out.println("Total calories of the hamburger: " + sum);
    }


    public  static void additionalOrder(Hamburger hamburger){

        while (true) {
        System.out.println("\nDo you have additional order?");
        System.out.println("Please input 1 if 'yes' and 2 if 'no'.");
        System.out.print("input: ");
        int omt = input.nextInt(); // ont -> one more time
            while (omt < 1 || omt > 2) { // 1과 2가 아닌 경우 다시 입력하라고 하고 반복
                System.out.println("Please input 1 or 2");
                System.out.print("input: ");
                omt = input.nextInt();
            }

            if (omt == 1) {
                makeHamburger(hamburger);
                calculatePrintCalories(hamburger);

            } else {
                System.out.println("Please come again next time.");
                return;
            }

        }
    }
}

