package chapter5.task;

public class T3_MinAvgTwoSlice {
	public int solution(int A[]) { // A[] = { 4, 2, 2, 5, 1, 5, 8 }
		double min = Double.MAX_VALUE; // 3, 2
		int pos = 0; // pos = 0, 1
		for (int i = 0; i < A.length - 1; i++) {//i = 0, 1, 2, 3, 4, 5, 6
			double avg = (A[i] + A[i + 1]) / 2.0; // 3, 2, 3.5, 3, 6.5
			if (min > avg) {
				pos = i;
				min = avg;
			}
		}
		for (int i = 0; i < A.length - 2; i++) {
			double avg = (A[i] + A[i + 1] + A[i + 2]) / 3.0;
			if (min > avg) {
				pos = i;
				min = avg;
			}
		}
		return pos;
	}

	public static void main(String[] args) {
		int A[] = { 4, 2, 2, 5, 1, 5, 8 };
		System.out.println(new T3_MinAvgTwoSlice().solution(A));
	}
}
