package chapter5.basic;

public class PrefixSumBasic1 {

	public static void main(String[] args) {
		int A[] = {10, 5, -2, 15, -10, -9, 2};
		System.out.println("Result: "+new PrefixSumBasic1().profit_loss(A, 0, A.length-1));
		System.out.println("Result: "+new PrefixSumBasic1().profit_loss(A, 5, A.length-1));
		System.out.println("Result: "+new PrefixSumBasic1().profit_loss(A, 0, 2));
		System.out.println("Result: "+new PrefixSumBasic1().profit_loss(A, 2, 5));		
	}

	int profit_loss(int[] A, int start, int end) {
		int profit = 0;
		for(int i=start; i<=end; i++) {
			profit += A[i];
		}
		return profit;
	}
}
