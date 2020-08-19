package chapter5.task;

import java.util.Arrays;

public class T2_GenomicRangeQuery {

	public int[] solution(String S, int P[], int Q[]) {// S = "CAGCCTA", P[] = {2, 5, 0}, Q[] = {4, 5, 6}
		int result[] = new int[P.length];// result[] = {2, 4, 1}
		String str = "";
		for (int i = 0; i < P.length; i++) {// i=0, 1, 2, 3
			str = S.substring(P[i], Q[i] + 1); // GCC, T, CAGCCTA.substring(2, (4+1)-1)
			if (str.contains("A"))
				result[i] = 1;
			else if (str.contains("C"))
				result[i] = 2;
			else if (str.contains("G"))
				result[i] = 3;
			else if (str.contains("T"))
				result[i] = 4;
		}
		return result; // [2, 4, 1]
	}

	// Sai
	public int[] solution2(String S, int P[], int Q[]) {// S = "CAGCCTA", P[] = {2, 5, 0}, Q[] = {4, 5, 6}
		int k = S.length();
		int a[] = new int[k]; // a[] = {2, 1, 3, 2, 2, 4, 1}
		int[] result = new int[P.length];
		if (k == 0)
			return result;
		for (int i = 0; i < k; i++) {
			switch (S.charAt(i)) {
			case 'A':
				a[i] = 1;
				break;
			case 'C':
				a[i] = 2;
				break;
			case 'G':
				a[i] = 3;
				break;
			case 'T':
				a[i] = 4;
			}
		}
		for (int i = 0; i < P.length; i++) {
			int m = P[i];
			int n = Q[i];
			int min = 5;
			while (m <= n) {
				if (a[m] < min)
					min = a[m];
				m++;
			}
			result[i] = min;
		}

		return result;
	}

	public int[] solution3(String S, int[] P, int[] Q) {// S = "CAGCCTA", P[] = {2, 5, 0}, Q[] = {4, 5, 6}
		int len = S.length(); //7
		int[][] arr = new int[len][4];
		int[] result = new int[P.length]; //result = [0, 0, 0]

		for (int i = 0; i < len; i++) {
			char c = S.charAt(i);
			if (c == 'A')
				arr[i][0] = 1;
			if (c == 'C')
				arr[i][1] = 1;
			if (c == 'G')
				arr[i][2] = 1;
			if (c == 'T')
				arr[i][3] = 1;
		}
		// compute prefixes
		for (int i = 1; i < len; i++) {
			for (int j = 0; j < 4; j++) {
				arr[i][j] += arr[i - 1][j];
			}
		}
		for (int i = 0; i < P.length; i++) {
			int x = P[i];
			int y = Q[i];
			for (int a = 0; a < 4; a++) {
				int sub = 0;
				if (x - 1 >= 0)
					sub = arr[x - 1][a];
				if (arr[y][a] - sub > 0) {
					result[i] = a + 1;
					break;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String DNA = "CAGCCTA"; // (2, 4-1)
		// String DNA = "CCAGTTGT"; // AGT, T, CCAGTTG, GTTG
		int P[] = { 2, 5, 0 };
		int Q[] = { 4, 5, 6 };
		int result[] = new T2_GenomicRangeQuery().solution(DNA, P, Q);
		System.out.println(Arrays.toString(result));
	}
}
