package chapter4.basic;

import java.util.Arrays;

public class CountingElementsBasic1 {
	public int[] counting(int A[], int m) {// A[] = {0, 0, 4, 2, 4, 5}, m = 5
		int n = A.length;//6
		int count[] = new int[m + 1];// count[] = {2, 0, 1, 0, 2, 1}
		for (int k = 0; k < n; k++) {// k = 0, 1, 2, 3, 4, 5, 6
			count[A[k]] = count[A[k]] + 1;
		}
		return count;
	}

	public static void main(String[] args) {
		int A[] = {0, 0, 4, 2, 4, 5};
		int m = 5;
		int count[] = new CountingElementsBasic1().counting(A, m);
		System.out.println(Arrays.toString(count));
	}

}
