import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] intArray = readIntegers();

        System.out.println(Arrays.toString(intArray));
        System.out.println("Minimum Value in Array = " + findMin(intArray));

        reverseArray(intArray);

    }

    public static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number separated by comma(,): ");
        String[] stringArray = scanner.nextLine().split(",");
        int[] intArray = new int[stringArray.length];

        for(int i = 0; i < stringArray.length; i++){
            intArray[i] = Integer.parseInt(stringArray[i].trim());
        }
        return intArray;
    }

    private static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for(int el : array){
            if(el < min) {
                min = el;
            }
        }
        return min;
    }

    private static void reverseArray(int[] array) {
        int[] copyArray = Arrays.copyOf(array, array.length);
        int[] newArray = new int[array.length];
        System.out.println(Arrays.toString(copyArray));
        int temp = array.length - 1;
        for(int i = 0; i < array.length; i++) {
            newArray[temp] = copyArray[i];
            temp--;
        }
        System.out.println("=".repeat(30));
        System.out.println(Arrays.toString(newArray));
    }
}