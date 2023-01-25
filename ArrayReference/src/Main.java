import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myIntArray = new int[5];
		int[] anotherArray = myIntArray;
		
		System.out.println("myIntArray = " + Arrays.toString(myIntArray));
		System.out.println("anotherArray = " + Arrays.toString(anotherArray));
		// IF YOU CHANGE ONE ARRAY 
		// IT WILL AFFECT THE OTHER ARRAY
		anotherArray[0] = 51;
		// AFTER CHANGE ONE OF THE ARRAY

		System.out.println("after changing myIntArray = " + Arrays.toString(myIntArray));
		System.out.println("after changing anotherArray = " + Arrays.toString(anotherArray));
	}

}
