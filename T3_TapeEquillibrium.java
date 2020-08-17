package chapter3.task;

public class T3_TapeEquillibrium {
	public int solution(int A[]) {// A[] = {3, 1, 2, 4, 3};
		int N = A.length; //5
		int minDiff = Integer.MAX_VALUE;//minDiff = 2147483647
		if(N == 2) {
			return Math.abs( A[0] - A[1] );
		}
		for(int P=1; P < N; P++) {// P = 1, 2, 3, 4, 5
			int sumL = 0, sumR = 0; // sumL = 0, sumR = 0
			for(int i=0; i<P; i++) {//i = 0, 1
				sumL = sumL + A[i]; // sumL = 3, 4, 6, 10
			}
			for(int i=P; i < N; i++) {//i = 1, 2
				sumR = sumR + A[i];// sumR = 10, 9, 7, 3
			}
			int currDiff = Math.abs(sumL - sumR);//7, 5, 1, 7
			minDiff = Math.min(minDiff, currDiff);//7, 5, 1, 1
		}
		return minDiff;
	}
	public int solution2(int A[]) {
		int N = A.length;
		int minDiff = Integer.MAX_VALUE;//minDiff = 2147483647
		if(N == 2) {
			return Math.abs( A[0] - A[1] );
		}
		// calculate total sum of elements from array
		int sum = 0;
		for(int num : A) {
			sum = sum + num;// 13
		}
		int sumL = 0;
		for(int i=0; i<N-1; i++) {
			sumL = sumL + A[i];
			int sumR = sum - sumL;
			int currDiff = Math.abs(sumL - sumR);
			minDiff = Math.min(minDiff, currDiff);
		}
		return minDiff;
	}
	public static void main(String[] args) {
		int A[] = {3, 1, 2, 4, 3};
		System.out.println("Min Difference is: "+new T3_TapeEquillibrium().solution(A));
	}
}
