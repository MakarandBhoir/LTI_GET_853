package chapter5.basic;

import java.util.Arrays;

public class PrefixSumBasic2 {
	public int[] prefixSum(int A[]) {
		int P[] = new int[A.length];
		P[0] = A[0];
		for(int i=1; i<A.length; i++) {
			P[i] = P[i-1]+A[i];
		}
		return P;
	}
	public static void main(String[] args) {
		int A[] = {10, 5, -2, 15, -10, -9, 2};
		int P[] = new PrefixSumBasic2().prefixSum(A);
		
		System.out.println(Arrays.toString(A));
		System.out.println(Arrays.toString(P));
		
		System.out.println("Result: "+P[6]); // O(1)
		System.out.println("Result: "+(P[6] - P[5-1])); // O(1) P[i, j] = P[j] - P[i-1], P[5, 6] = P[6] - P[5-1]
		System.out.println("Result: "+P[2]); // O(1)
		System.out.println("Result: "+(P[5] - P[2-1])); // O(1)
	}
}
