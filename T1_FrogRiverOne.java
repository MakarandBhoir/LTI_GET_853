package chapter4.task;

import java.util.HashSet;
import java.util.Set;

class T1_FrogRiverOne {
	public int solution(int X, int[] A) {// A[] = {1, 3, 1, 4, 2, 3, 5, 4}, X=5
		int leafCount = 0; // leafCount = 0, 1, 2, 3, 4
		boolean leaf[] = new boolean[X + 1];// leaf[] = {F, T, T, T, T, T}
		for (int i = 0; i < A.length; i++) {// i = 0, 1, 2, 3, 4, 5, 6
			if (leaf[A[i]] == false && A[i] <= X) {
				leaf[A[i]] = true;
				leafCount++;
			}
			if (leafCount == X) {
				return i;
			}
		}
		return -1;
	}
	public int solution2(int X, int []A) {
		Set<Integer> hs=new HashSet<Integer>();
        for(int i=0;i<A.length;i++)
        {
            hs.add(A[i]);
            if(hs.size()==X)
            {
                return i;
            }
        }
        return -1;
	}
	public static void main(String[] args) {
		int A[] = {1, 3, 1, 4, 2, 3, 5, 4};
		int X = 5;
		System.out.println(new T1_FrogRiverOne().solution2(X, A));
	}
}
