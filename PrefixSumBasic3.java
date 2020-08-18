package chapter5.basic;

import java.util.Arrays;

public class PrefixSumBasic3 {
	public int[] prefix_sum(int[] A) {
		int n = A.length;
		int P[] = new int[n + 1];
		for (int k = 1; k < n + 1; k++) {
			P[k] = P[k - 1] + A[k - 1];
		}
		return P;
	}

	public static void main(String[] args) {
		int A[] = {10, 5, -2, 15, -10, -9, 2};
		int P[] = new PrefixSumBasic3().prefix_sum(A);
		System.out.println(Arrays.toString(P));
	}

}
