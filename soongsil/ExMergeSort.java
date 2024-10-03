package soongsil;

public class ExMergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Merge sort 산공과 231111  안영아");
		
		int[]  data = {31,3,65,73,8,11,20,29,48,15};
		
		System.out.println("Merge sort 전 데이터");
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i] + "  ");
		}
		System.out.println();
		
		
		Sorting   ahn  = new  Sorting(data);
		
		//merge sort
		ahn.mergeSort();
		
		System.out.println("Merge sort 후 데이터");
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i] + "  ");
		}
		System.out.println();
		
		
		

	}

}
