package chapter4.task;

import java.util.*;

class T3_MissingElement {
	public int solution(int[] A) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < A.length; i++) {
			set.add(A[i]);
		}
		int missing = 1;
		while (set.contains(missing)) {
			missing++;
		}
		return missing;
	}
	public static void main(String[] args) {
		int A[] = {1, 3, 6, 5, 1, 2};
		System.out.println(new T3_MissingElement().solution(A));
	}
}
