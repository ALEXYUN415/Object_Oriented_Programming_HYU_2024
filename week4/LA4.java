package week4;

import java.util.Scanner;


public class LA4 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter the number od item : ");
        int itemCount = input.nextInt();
        input.nextLine();

        ShoppingList[] Lists = new ShoppingList[itemCount];

        createOrder(itemCount, Lists); // 주문받기 메소드 호출
        printOrders(itemCount, Lists); //
        getTotalAmount(Lists);


    }
    public static void createOrder(int itemCount, ShoppingList[] Lists){
        for(int i = 0; i < itemCount; i++) {

            Lists[i] = new ShoppingList(); //쇼핑리스트 클래스의 배열 생성

            System.out.println("Enter details for item " + (i + 1) +" : "); // 괄호 안하면 문자로 생각함

            System.out.print("Item Name: ");
            //input.nextLine();
            Lists[i].itemName = input.nextLine();

            System.out.print("Price: ");
            Lists[i].price = input.nextInt();
            input.nextLine();

            System.out.print("Count: ");
            Lists[i].count = input.nextInt();
            input.nextLine();
        }
    }
    public static void printOrders(int itemCount, ShoppingList[] Lists){
        System.out.println("\nAll items entered :");
        for (int i = 0; i < itemCount ; i++) {
            System.out.println("Item Name : " + Lists[i].itemName + ", Price : " + Lists[i].price + ", Count : " + Lists[i].count);

        }
    }

    public static void getTotalAmount(ShoppingList[] Lists){
        int sum =0;
        for (int i = 0; i < Lists.length; i++) {
            sum += Lists[i].price * Lists[i].count;
        }
        System.out.println("\nMoney needed : " + sum);
    }

}

class ShoppingList{
    String itemName;
    int price;
    int count;
}