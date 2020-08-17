package chapter3.task;

class T2_MissingElement {
	// Correctness - 100% & Performance - 60% Total = 80%
	public int solution(int[] A) {// A[] = {3, 1, 2, 5}
		int size = A.length; // 4
		if (size == 0)
			return 1;
		// calculate sum of elements in array
		int sum = 0;// sum = 0
		for (int num : A) {
			sum = sum + num; // sum = 11
		}
		// sumX = ((4 + 1) * (4 + 2)) / 2 = 15
		int sumX = ((size + 1) * (size + 2)) / 2;
		// 15 - 11 = 4
		return sumX - sum;
	}

	// Correctness - 100% & Performance - 100% Total = 100%
	public int solution2(int[] A) {// A[] = {3, 1, 2, 5} --> {1, 2, 3, 4} = n * (n+1) / 2
		long size = A.length; // 4          // ((n+1) * (n+2)) / 2 =     
		if (size == 0)
			return 1;
		// calculate sum of elements in array
		long sum = 0;// sum = 0
		for (int num : A) {
			sum = sum + num; // sum = 11
		}
		// sumX = ((4 + 1) * (4 + 2)) / 2 = 15
		long sumX = ((size + 1) * (size + 2)) / 2;
		// 15 - 11 = 4
		return (int) (sumX - sum);
	}
	
	public int solution3(int A[]) { //A = {3, 1, 2, 5}
		int size = A.length;// 4
		boolean []arr = new boolean[size + 1];// arr[] = {true, true, true, false, true}
		for(int num : A) {
			arr[num-1] = true;// arr[3-1]=true, arr[1-1]=true, arr[2-1]=true, arr[5-1]=true
		}
		for(int i=0; i<arr.length; i++) {//i = 0, 1, 2, 3
			if(arr[i] == false)
				return i + 1; // 3 + 1
		}
		return -1;// just to fullfill the syntax
	}

	public static void main(String[] args) {
		int A[] = { 3, 1, 2, 5 };
		// int A[] = {};
		// int A[] = {1, 2, 3};
		System.out.println("Missing Element: " + new T2_MissingElement().solution3(A));
	}
}
