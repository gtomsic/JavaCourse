public class AddingFirstAndLastDigit {
    public static void main(String[] args){
        System.out.println(sumFirstAndLastDigit(11));
    }

    public static int sumFirstAndLastDigit(int number) {
        if(number < 0) {
            return -1;
        }
        int start = 0, middle = 0, end = 0, temp, sum = 0;

        temp = 0;
        while(number > 0) {
            temp = temp + 1;
            if(temp == 1) {
                start = number % 10;
            }
            if(temp == 2) {
                middle = number % 10;
            }
            if(temp == 3) {
                end = number % 10;
            }
            number = number / 10;
        }
        if(temp == 1) {
          return  start += start;
        }
        if(temp == 2) {
            return start = start + middle;
        }
        sum = start + end;
        return sum;
    }
}
