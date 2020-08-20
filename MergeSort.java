package chapter6.basic;

import java.util.Arrays;

public class MergeSort {
	void merge(int A[], int L, int M, int H) {
		int LS = M - L + 1;
		int RS = H - M;

		int Left[] = new int[LS];
		int Right[] = new int[RS];

		for (int i = 0; i < LS; ++i)
			Left[i] = A[L + i];

		for (int j = 0; j < RS; ++j)
			Right[j] = A[M + 1 + j];

		int i = 0, j = 0;
		// i=0, 1, 2, 3
		// j=0, 1, 2, 3
		int k = L;// 0, 1, 2, 3, 4, 5, 6
		while (i < LS && j < RS) {
			if (Left[i] <= Right[j]) { // A[] = {2, 5, 15, 17, 26, 99}
				A[k] = Left[i];
				i++;
			} else {
				A[k] = Right[j];
				j++;
			}
			k++;
		}
		/* Copy remaining elements of L[] if any */
		while (i < LS) {
			A[k] = Left[i];
			i++;
			k++;
		}
		while (j < RS) {
			A[k] = Right[j];
			j++;
			k++;
		}
	}

	void mergeSort(int A[], int L, int H) // A[] = {2, 15, 17, 5, 99, 26}, L=0, H=5
	{
		if (L < H) { // 0 < 5
			int M = (L + H) / 2; // 2
			mergeSort(A, L, M); // A, L=0, M=2
			mergeSort(A, M + 1, H);
			merge(A, L, M, H);
		}
	}

	public static void main(String[] args) {
		int A[] = { 2, 15, 17, 5, 99, 26 };
		int L = 0;
		int H = A.length - 1;
		System.out.println("Before: "+Arrays.toString(A));
		new MergeSort().mergeSort(A, L, H);
		System.out.println("After: "+Arrays.toString(A));
	}

}
