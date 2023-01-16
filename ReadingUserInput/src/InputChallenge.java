import java.util.Scanner;

public class InputChallenge {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int sum = 0;
        do{
            try {
                i++;
                System.out.println("Enter a number: ");
                int inputNumber = Integer.parseInt( scanner.nextLine());
                if(isValid(inputNumber)) {
                    sum += inputNumber;
                } else {
                    System.out.println("Invalid number");
                    i--;
                }
                System.out.println("Enter number #"  + inputNumber + ":" );
            } catch (NumberFormatException notANumber) {
                i--;
                System.out.println("Invalid number");
            }
        } while(i <= 5);
        System.out.println("Total Sum: " + sum);
    }

    public static boolean isValid(int number) {
        if(number >= 0) {
            return true;
        }
        return false;
    }
}
