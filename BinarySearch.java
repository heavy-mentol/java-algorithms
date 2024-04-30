public class BinarySearch{
	public static void main(String[] args){
		int[] numbers = new int[]{0,3,7,12,17,20,66,100,102};
		System.out.println(binarySearch(numbers, 666));
	}
	
	private static int binarySearch(int[] numbers, int toFind){
		int from = 0, to = numbers.length -1;
		int pivot = 0, currentValue = 0;
		while(from <= to){
			pivot = (from + to) / 2;
			currentValue = numbers[pivot];
			if(toFind < currentValue){
				to = pivot - 1;
			}else if(toFind == currentValue){
				return pivot;
			}else{
				from = pivot + 1;
			}
		}
		return -1;
	}
}