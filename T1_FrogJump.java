package chapter3.task;

class T1_FrogJump {
	// Correctness - 100% & Performance - 0% Total = 44%
	public int solution(int X, int Y, int D) {
		int count = 0;
		while (X < Y) {
			X = X + D;
			count = count + 1;
		}
		return count;
	}
	
	// Correctness - 100% & Performance - 100% Total = 100%
	// O(1)
	public int solution2(int X, int Y, int D) {
		int diff = Y - X; // 85 - 10 = 75
		if(diff == 0)
			return 0;
		if(diff % D == 0)// 75 % 30 = 2, Rem = 15
			return diff / D;
		else
			return (diff / D) + 1;
	}
}
