package chapter4.task;

import java.util.Arrays;

public class T2_MaxCounter {
	public int[] solution(int N, int A[]) { // A[] = {3, 4, 4, 6, 1, 4, 4};
		int counter[] = new int[N]; // counter[] = {3, 2, 2, 4, 2}
		int min = 0, max = 0; // min = 2, max = 4
		
		for(int i=0; i<A.length; i++) {//i = 0, 1, 2, 3, 4, 5, 6, 7
			if(A[i] >= 1 && A[i] <= N) {
				if(counter [A[i]-1] < min) {
					counter[A[i]-1] = min;
				}
				counter[A[i]-1]++;
				max = Math.max(counter[A[i]-1], max);
			}
			else if(A[i] == N+1) {
				min = max;
			}
		}
		for(int i=0; i<counter.length; i++) {// i = 0, 1, 2, 3, 4, 5
			if(counter[i] < min)
				counter[i] = min;
		}
		return counter; // counter[] = {3, 2, 2, 4, 2}
	}
	
	public static void main(String[] args) {
		int A[] = {3, 4, 4, 6, 1, 4, 4};
		int N = 5;
		int counter[] = new T2_MaxCounter().solution(N, A);
		System.out.println(Arrays.toString(counter));
	}

}
