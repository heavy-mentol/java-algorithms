import  java.util.Random;

public class QuickSort{
	public static void main(String[] args){
		int[] array = new int[]{4, 3, 9, 2, 7, 1, 6, 0, 5, 8};
		printArray(array);
		quickSort(array);
		printArray(array);
	}
	
	private static void quickSort(int[] array){
		quickSort(array, 0, array.length - 1);
	}
	
	private static void quickSort(int[] array, int lowIndex, int highIndex){
		if(lowIndex >= highIndex) return;
		
		int pivotIndex = getRandomPivotIndex(lowIndex, highIndex);
		int pivot = array[pivotIndex];
		swap(array, pivotIndex, highIndex);
		
		int leftPointer = partition(array, lowIndex, highIndex, pivot);
		
		quickSort(array, lowIndex, leftPointer - 1);
		quickSort(array, leftPointer + 1, highIndex);
	}
	
	private static int partition(int[] array, int lowIndex, int highIndex, int pivot){
		int leftPointer = lowIndex;
		int rightPointer = highIndex;
		
		while(leftPointer < rightPointer){
			while(array[leftPointer] <= pivot && leftPointer < rightPointer){
				leftPointer ++;
			}
			
			while(array[rightPointer] >= pivot && leftPointer < rightPointer){
				rightPointer --;
			}	
			swap(array, leftPointer, rightPointer);
		}
		swap(array, leftPointer, highIndex);
		return leftPointer;
	}
	
	private static void swap(int[] array, int i1, int i2){
		int tmp = array[i1];
		array[i1] = array[i2];
		array[i2] = tmp;
	}
	
	private static void printArray(int[] array){
		for(int n: array) System.out.print(n);
		System.out.println();
	}
	
	public static int getRandomPivotIndex(int min, int max) {
		return new Random().nextInt(max - min) + min;
	}
}