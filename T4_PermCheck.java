package chapter4.task;

public class T4_PermCheck {
	//Sudheer
	public int solution(int A[]) {
		long N = A.length;
		long sum = 0;

		for (int i = 0; i < A.length; i++)
			sum = sum + A[i];

		if (N * (N + 1) / 2 == sum) {
			return 1;
		} else
			return 0;
	}

	// Arijit
	public int solution2(int A[]) {// A[] = { 4, 3, 1 };
		int x = 0;
		for (int i = 0; i < A.length; i++) {
			x ^= (i + 1) ^ A[i];
		}
		return (x == 0) ? 1 : 0;
	}

	// Yash
	static int largest(int arr[]) {
		int i;
		int max = arr[0];
		for (i = 1; i < arr.length; i++)
			if (arr[i] > max)
				max = arr[i];

		return max;
	}
	public int solution3(int[] A) { // A[] = { 4, 3, 1 };
		int n = A.length; // 3

		int m = largest(A); // 4
		int count[] = new int[m + 1]; // count[] = {0, 1, 0, 1, 1}
		for (int k = 0; k < n; k++) {
			count[A[k]] = count[A[k]] + 1;
		}

		for (int i = 1; i < m + 1; i++) {
			if (count[i] == 0)
				return 0;
			else if (count[i] != 1)
				return 0;
		}
		return 1;
	}

	public static void main(String[] args) {
		int A[] = { 4, 3, 1, 2 };
		// int A[] = { 4, 3, 1 };
		System.out.println(new T4_PermCheck().solution2(A));
	}

}
