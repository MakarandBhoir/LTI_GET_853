package chapter5.task;

public class T1_CountDiv {
	public int solution(int A, int B, int K) {
		int counter = 0;
		for (int num = A; num <= B; num++) {
			if (num % K == 0) {
				counter++;
			}
		}
		return counter;
	}

	// Ridhi
	public int solution2(int A, int B, int K) {// A=6, B=11, K=2
		if (A % K != 0)// 6 % 2 = 0
			A = (A / K * K) + K;

		if (B % K != 0)// 11 % 2 = 1
			B = (B / K * K); // (11/2*2) = 10

		return (B - A) / K + 1; // ((10 - 6) / 2)+ 1
	}
	// Arijit
	public int solution3(int A, int B, int K) { // A=6, B=11, K=2
		return (B / K) - (A / K) + (A % K != 0 ? 0 : 1);
		// (11 / 2) - (6 / 2) + (6 % 2 != 0 ? 0 : 1)
		// (5) - (3) + 1
		// 3
	}

	public static void main(String[] args) {
		System.out.println("Result: " + new T1_CountDiv().solution(6, 11, 2));
	}
}




