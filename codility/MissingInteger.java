/*
	This is a demo task.

	Write a function:

		class Solution { public int solution(int[] A); }

	that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

	For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

	Given A = [1, 2, 3], the function should return 4.

	Given A = [−1, −3], the function should return 1.

	Write an efficient algorithm for the following assumptions:

			N is an integer within the range [1..100,000];
			each element of array A is an integer within the range [−1,000,000..1,000,000].
*/

import java.util.Arrays;

public class MissingInteger{
	public static void main(String[] args){
		int[] a_1 = new int[]{1, 3, 6, 4, 1, 2};
		System.out.println("Original: " + Arrays.toString(a_1));
		System.out.println("Result: " + missingInteger(a_1));
		
		int[] a_2 = new int[]{1, 2, 3};
		System.out.println("Original: " + Arrays.toString(a_2));
		System.out.println("Result: " + missingInteger(a_2));
		
		int[] a_3 = new int[]{-1, -3};
		System.out.println("Original: " + Arrays.toString(a_3));
		System.out.println("Result: " + missingInteger(a_3));
		
		int[] a_4 = new int[]{0,1,2,3,4,5,6,7,8,9,10};
		System.out.println("Original: " + Arrays.toString(a_4));
		System.out.println("Result: " + missingInteger(a_4));
		
		int[] a_5 = new int[]{102,103,104,105,106,107,108,109,110};
		System.out.println("Original: " + Arrays.toString(a_5));
		System.out.println("Result: " + missingInteger(a_5));
		
		int[] a_6 = new int[]{-1000000, 1000000};
		System.out.println("Original: " + Arrays.toString(a_6));
		System.out.println("Result: " + missingInteger(a_6));
	}
	
	private static int missingInteger(int[] a){
		Arrays.sort(a);
		int min = 1;
		for(int n: a) if(n == min) min ++;
		return min;
	}
}