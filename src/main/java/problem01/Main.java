package problem01;

public class Main {
	public static void main(String[] args) {
		int[] arr = { -10, -3, 5, 6, -20 };
		findMaxProduct(arr);
	}

	public static void findMaxProduct(int[] arr) {
		
		//
		// 코드를 완성 하십시오.
		//
		
		int result = 0;
		int iIdx = 0 , jIdx = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(i != j && result < arr[i] * arr[j]) {
					result = arr[i] * arr[j];
					iIdx = i;
					jIdx = j;
				}
			}
		}
		
		System.out.println("[" + arr[iIdx] + "," + arr[jIdx] + "]");
	}
}
