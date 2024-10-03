package soongsil;

public class ExShellSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Shell sort 산공과 231111  안영아");
		
		int[]  data = {3,31,48,73,8,33,11,15,20,65,29,28,65,25,4};
		
		System.out.println("Shell sort 전 데이터");

		for(int i=0; i<data.length; i++) {
			System.out.print(data[i] + "  ");
		}
		System.out.println();
		
		
		Sorting   ahn = new Sorting(data);
		
		//shell sort
		ahn.shellSort();
		
		System.out.println("Shell sort 후 데이터");
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i] + "  ");
		}
		System.out.println();
		
		
	}

}
