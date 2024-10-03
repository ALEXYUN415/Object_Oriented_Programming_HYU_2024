package soongsil;

import java.util.Scanner;

public class ExMenuSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		int menu;
		

		while(true) {
			do {
				System.out.println("= 숭실대 산공과 231111 안영아 =");
				System.out.println("=== SORT ===");
				System.out.println("1. Selection");
				System.out.println("2. Bubble");
				System.out.println("3. Insertion");
				System.out.println("4. Merge");
				System.out.println("5. Quick");
				System.out.println("6. Heap");
				System.out.println("7. Shell");
				System.out.println("8. 종료");
				System.out.println("------------");
				System.out.print("menu : ");	
				menu = key.nextInt();
			} while(menu <1 || menu >8);
			
			if (menu == 8) {
				System.out.println("종료합니다.");
				break;
			}
			
			switch(menu) {
			case 1: //Selection
				break;
				
			case 2: //Bubble
		
				break;
				
			case 3: //Insertion
								
				break;
				
			case 4: // Merge
				
				break;
				
			case 5: //Quick
								
				break; 
				
			case 6: // Heap
				
				break; 
				
			case 7: // Shell
				
				break; 	
				
			default:
				break;
				
				
			} //end switch~case
		}  //end while
	} //end main


}
