import java.util.Arrays;

public class CyclicRotation{
	public static void main(String[] args){
		int[] a = new int[]{3, 8, 9, 7, 6};
		int times = 3;
		System.out.println("Before: " + Arrays.toString(a));
		cyclicRotation(a, times);
		System.out.println("After: " + Arrays.toString(a));
	}
	
	private static void cyclicRotation(int[] a, int times){
		if(a.length == 0) return;
		if(a.length > 100 || times > 100) return;
		if(a.length == 1) return;
		if(times < 0) return;
		if(a.length == times) return;
		for(int i = 1; i <= times; i ++){
			int tmp = -1001;
			for(int j = a.length - 1; j >= 1; j --){
				if(a[j] < -1000 && a[j] > 1000) return;
				if(j == a.length - 1) tmp = a[a.length - 1];
				a[j] = a[j - 1];
			}
			a[0] = tmp;
		}
	}
}