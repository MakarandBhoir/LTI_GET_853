package chapter4.basic;

public class CountingElementsBasic3 {
	public int[] counting(int A[], int m) {
		int n = A.length;
		int count[] = new int[m + 1];
		for (int k = 0; k < n; k++) {
			count[A[k]] += 1;
		}
		return count;
	}
	public boolean fast_solution(int A[], int B[], int m) {
		int n = A.length;
		int sum_a = 0, sum_b = 0;
		for (int num : A)
			sum_a += num; //sum_a = 14
		for (int num : B) 
			sum_b += num; //sum_b = 8
		int diff = sum_b - sum_a; // diff = 8 - 14 = -6
		if(diff % 2 == 1) { // -6 % 2 = 0
			return false;
		}
		diff = diff / 2;// diff = -6 / 2 = -3
		int count[] = counting(A, m); // count [0, 0, 1, 1, 1, 1]
		for(int i=0; i<n; i++) {
			if((0 <= B[i] - diff) && (B[i] <= m) && (count[B[i] - diff]>0)) {
				return true;
			}
			// B[0] = 1 - (-3) = 4 && 1 <= 5 && count[1 - (-3)]
		}
		return false;
	}
	public static void main(String[] args) {
		int B[] = {1, 3, 2, 2};
		int A[] = {3, 2, 5, 4};
		int m = 5;
		System.out.println(new CountingElementsBasic3().fast_solution(A, B, m));
	}
}
