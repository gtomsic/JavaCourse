public class WhileChallenge {
    public static void main(String[] args) {
        int i = 5;
        int sum = 0;
        while (i <= 20) {
            i++;
            boolean isEven = isEvenNumber(i);
            if(!isEven) {
                continue;
            }
            sum = sum + i;
            System.out.println(i + " is " + (isEven ? "Even" : "Odd"));
        }
        System.out.println("Total Sum = " + sum);
    }

    public static boolean isEvenNumber(int num) {
        if((num % 2) == 0) {
            return true;
        }
        return false;
    }
}
