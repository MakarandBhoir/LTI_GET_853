package chapter5.task;

public class T4_PassingCar {
	public int solution(int A[]) {
		int eastCount = 0;
		int passing = 0;
		for (int car : A) {
			if (car == 1) {
				passing = passing + eastCount;
			} else {
				eastCount++;
			}
		}
		return passing;
	}

	public static void main(String[] args) {
		//int A[] = {0, 1, 0, 1, 1};
		int A[] = {0, 0, 0, 1, 1};
		System.out.println(new T4_PassingCar().solution(A));
	}
}
