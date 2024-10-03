package soongsil.queue;
import java.util.Scanner;

public class EX01Queue {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayQueue<String> queueA = new ArrayQueue<>();
        Scanner key = new Scanner(System.in);

        int menu;
        String word;
        while(true ) {
            do {
                System.out.println("[4/11목 한양대 ]");
                System.out.println();      // 한줄 띄워라
                System.out.println("== Queue: 데이타는 문자열 ==");
                System.out.println("1. Enqueue");
                System.out.println("2. DeQueue");
                System.out.println("3. Front");
                System.out.println("4. isEmpty");
                System.out.println("5. dequeueAll");
                System.out.println("6. 종료");
                System.out.println("---------------------");
                System.out.print("메뉴 입력: ");
                menu = key.nextInt();

            } while(menu <1 || menu > 6);

            // System.out.println("menu = " + menu);
            if(menu == 6) {
                System.out.println("문자열 큐를 종료합니다");
                System.out.println("4/11목 숭실대 20202871 이승연");
                break;
            }

            switch(menu) {
                case 1:      // EnQueue
                    System.out.print("EnQueue 문자열 데이타 입력 : ");
                    word = key.next();      // 키보드 입력을 문자열로 변환
                    queueA.enqueue(word);
                    queueA.printAll();
                    System.out.println();
                    break;

                case 2:      // DeQueue
                    queueA.dequeue();
                    queueA.printAll();
                    System.out.println();
                    break;

                case 3:      // front
                    word = queueA.front();
                    System.out.println("front = " + word);
                    System.out.println();
                    break;

                case 4:      // isEmpty
                    System.out.println("isEmpty = " + queueA.isEmpty());
                    System.out.println();
                    break;

                case 5:      // dequeueAll
                    queueA.dequeueAll();
                    queueA.printAll();
                    System.out.println("quequeA가 비어 있습니다.");
                    System.out.println();
                    break;

                default:
                    break;
            }
        }      // end while
    }
}