public class SplitNumbers {
    public static void main(String[] args){
        int number = 1234;
        System.out.println("Total sum from " + number + " = " + sumDigits(number));
        number = -123;
        System.out.println("Total sum from " + number + " = " + sumDigits(number));
        number = 237;
        System.out.println("Total sum from " + number + " = " + sumDigits(number));
        number = 4;
        System.out.println("Total sum from " + number + " = " + sumDigits(number));
    }

    public static int sumDigits(int num) {
        if(num < 0) {
            return -1;
        }
        int sum = 0;

        while (num > 9) {
            sum += (num % 10);
            num = num / 10;
        }
        sum += num;
        return sum;
    }
}
