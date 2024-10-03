package soongsil;

public class ExQuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Quick sort 산공과 231111  안영아");
		
		int[]  data = {31,8,48,73,11,3,20,29,65,15};
		
		System.out.println("Quick sort 전 데이터");

		for(int i=0; i<data.length; i++) {
			System.out.print(data[i] + "  ");
		}
		System.out.println();
		
		
		Sorting soong  = new Sorting(data);
		
		//quick sort
		soong.quickSort();
		
		
		System.out.println("Quick sort 후 데이터");
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i] + "  ");
		}
		System.out.println();
		
		
		
		
		
		
		
		
	}

}
