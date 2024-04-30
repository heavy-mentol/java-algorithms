import java.util.stream.IntStream;

public class TapeEquilibrium{
	public static void main(String[] args){
		int[] a = new int[]{3, 1, 2, 4, 3};
		System.out.println(tapeEquilibrium(a));
	}
	
	private static int tapeEquilibrium(int[] a){
		if(a.length < 2 || a.length > 100000) return 0;
		int leftSum = a[0];
		int rightSum = IntStream.of(a).sum() - leftSum;
		int min = Math.abs(leftSum - rightSum);
		for(int i = 1; i < a.length - 1; i++){
			if(a[i] < -1000 || a[i] > 1000) return 0;
			leftSum += a[i];
			rightSum -= a[i];
			int diff = Math.abs(leftSum - rightSum);
			if(diff < min) min = diff;
		}
		return min;
	}
	
	/*private static int tapeEquilibrium(int[] a){
		if(a.length == 0) return 0;
		if(a.length == 1) return a[0];
		int arraySum = IntStream.of(a).sum();
		int min = 0;
		for(int i = 0; i < a.length; i++){
			int pivot = a[i];
			int leftSum = IntStream.of(Arrays.copyOfRange(a, 0, pivot)).sum();
			int rightSum = arraySum - leftSum;
			int diff = Math.abs(leftSum - rightSum);
			if(min == 0)
				min = diff;
			else if(diff < min)
				min = diff;		
		}
		return min;
	}*/
}