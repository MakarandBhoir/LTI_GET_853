package chapter4.basic;

public class CountingElementsBasic2 {
	public boolean slow_solution(int A[], int B[]) {
		int n = A.length, sum_a = 0, sum_b = 0;
		for (int num : A)
			sum_a += num; // sum_a = 12
		
		for (int num : B)
			sum_b += num; // sum_b = 8
		
		int change;
		for (int i = 0; i < n; i++) { // i = 0, 1, 2
			for (int j = 0; j < n; j++) {// j = 0, 1, 2
				change = B[j] - A[i];//2 - 5 = -3, 2 - 5 = -3, 3 - 5 = -2
				sum_a += change; // 12 + (-3) = 9, 12 + (-2) = 10
				sum_b -= change; // 8 - (-3) = 11 8 - (-2) = 10
				if (sum_a == sum_b) {
					System.out.println(A[i]+" "+B[j]);
					return true;
				}
				sum_a -= change;// 9 - (-3) = 12
				sum_b += change;// 11 + (-3) = 8
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int A[] = {1, 2, 5, 4}; // 12
		int B[] = {2, 2, 3, 1}; // 8
		System.out.println("Swaping Possible?: "+new CountingElementsBasic2().slow_solution(A, B));
	}
}
