public class WhileChallenge {
    public static void main(String[] args) {
        int i = 4;
        int evenCount = 0;
        int oddCount = 0;
        while (i <= 20) {
            i++;
            boolean isEven = isEvenNumber(i);
            if(!isEven) {
                oddCount++;
                continue;
            }
            System.out.println(i + " is " + (isEven ? "Even" : "Odd"));
            evenCount++;
            if(evenCount >= 5) {
                break;
            }
        }
        System.out.println("Total odd numbers found = " + oddCount);
        System.out.println("Total even numbers found = " + evenCount);
    }

    public static boolean isEvenNumber(int num) {
        if((num % 2) == 0) {
            return true;
        }
        return false;
    }
}
