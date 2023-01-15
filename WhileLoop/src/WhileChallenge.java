public class WhileChallenge {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 20) {
            boolean isEven = isEvenNumber(i);
            System.out.println(i + " is " + (isEven ? "Even" : "Odd"));
            i++;
        }
    }

    public static boolean isEvenNumber(int num) {
        if((num % 2) == 0) {
            return true;
        }
        return false;
    }
}
