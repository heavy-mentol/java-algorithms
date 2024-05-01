import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.
* 
* For example, number 9 has binary representation 1001 and contains a binary gap of length 2.
* The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3.
* The number 20 has binary representation 10100 and contains one binary gap of length 1.
* The number 15 has binary representation 1111 and has no binary gaps.
* The number 32 has binary representation 100000 and has no binary gaps.
* Write a function:
*
*   class Solution { public int solution(int N); }
* 
* that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.
* For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5.
* Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.
* Write an efficient algorithm for the following assumptions:
*
* N is an integer within the range [1..2,147,483,647].
*/


public class BinaryGap{
	public static void main(String[] args)throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		boolean exit = false;
		while(!exit){
			try{
				System.out.println("Give any number from 1 to 647: ");
				int n = strToNum(reader.readLine());
				System.out.println("Solution: " + solution(n));
				System.out.println("Try again? (y/n): ");
				if(!reader.readLine().equals("y")){
					exit = true;
					System.out.println("Bye!");
				}
			}catch(NumberFormatException nfe){
				System.out.println(nfe.getMessage() + " Try again.");
			}
		}
	}
	
	private static int solution(int n){
		if(n <= 0 || n > Integer.MAX_VALUE) return 0;
		String bin = Integer.toBinaryString(n);
		int longest = 0;
		for(int i = 0; i < bin.length(); i ++){
			char curr = bin.charAt(i);
			if(curr == '1'){
				int zeroCount = 0;
				boolean enclosed = false;
				i++;
				while(i < bin.length() && !enclosed){
					curr = bin.charAt(i);
					if(curr == '0'){
						zeroCount ++;
						i++;
					}else
						enclosed = true;
				}
				if(enclosed && zeroCount > longest) longest = zeroCount;
				i--;
			}
		}
		return longest;
	}
	
	private static int strToNum(String n) throws NumberFormatException{
		if(n != null && !n.trim().isEmpty()){
			return Integer.parseInt(n.trim());
		}
		throw new NumberFormatException("Not a number!");
	}
}