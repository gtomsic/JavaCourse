import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// Sorted Array
		int[] unsortedArray = getRandomArray(20);
		
		int[] sortedArray = sortArray(unsortedArray);
		
		System.out.println(Arrays.toString(sortedArray));
		
		
	}
	
	public static int[] getRandomArray(int len) {
		Random random = new Random();
		
		int[] newArray = new int[len];
		
		for(int i = 0; i < len; i++) {
			newArray[i] = random.nextInt(300);
		}
		
		return newArray;
	}
	
	public static int[] sortArray(int[] array) {
		int[] sortedArray = Arrays.copyOf(array, array.length);
		int tempVar;
		boolean runLoop = true;
		while(runLoop) {
			runLoop = false;
			for(int i = 0; i < array.length - 1; i++) {
				if(sortedArray[i] > sortedArray[i + 1]) {
					tempVar = sortedArray[i];
					sortedArray[i] = sortedArray[i + 1];
					sortedArray[i + 1] = tempVar;
					runLoop = true;
				}
			}
		}
		return sortedArray;
	}

}
