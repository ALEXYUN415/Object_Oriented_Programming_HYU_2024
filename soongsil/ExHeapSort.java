package soongsil;

public class ExHeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Heap sort 산공과 231111  안영아");
		
		int[]  data = {4,2,8,7,3,3,5,1,9};
		
		System.out.println("Heap sort 전 데이터");
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i] + "  ");
		}
		System.out.println();
		
		
		Sorting  young  = new  Sorting(data);
		
		//Heap sort
		young.heapSort();
		
		
		System.out.println("Heap sort 후 데이터");

		for(int i=0; i<data.length; i++) {
			System.out.print(data[i] + "  ");
		}
		System.out.println();
		
		
	}

}
