/*
	A non-empty array A consisting of N integers is given.

	A permutation is a sequence containing each element from 1 to N once, and only once.

	For example, array A such that:
		A[0] = 4
		A[1] = 1
		A[2] = 3
		A[3] = 2

	is a permutation, but array A such that:
		A[0] = 4
		A[1] = 1
		A[2] = 3

	is not a permutation, because value 2 is missing.

	The goal is to check whether array A is a permutation.

	Write a function:

		class Solution { public int solution(int[] A); }

	that, given an array A, returns 1 if array A is a permutation and 0 if it is not.

	For example, given array A such that:
		A[0] = 4
		A[1] = 1
		A[2] = 3
		A[3] = 2

	the function should return 1.

	Given array A such that:
		A[0] = 4
		A[1] = 1
		A[2] = 3

	the function should return 0.

	Write an efficient algorithm for the following assumptions:

			N is an integer within the range [1..100,000];
			each element of array A is an integer within the range [1..1,000,000,000].
*/

import java.util.Arrays;

public class PermCheck{
	public static void main(String[] args){
		int[] a_true = new int[]{4, 1, 3, 2};
		System.out.println(permCheck(a_true));
		
		int[] a_false = new int[]{4, 1, 3};
		System.out.println(permCheck(a_false));
	}
	
	private static int permCheck(int[] a){
		if(a.length == 0) return 0;
		if(a.length == 1){
			if(a[0] == 1) return 1;
			if(a[0] != 1) return 0;
		}
		if(a.length > 100000) return 0;
		
		Arrays.sort(a);
		if(a[0] != 1) return 0;
		
		int prev = 0;
		for(int i: a){
			if(i < 1 || i > 1000000000) return 0;
			if(prev > 0 && (i - prev != 1)) return 0;
			prev = i;
		}
		return 1;
	}
}