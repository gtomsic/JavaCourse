public class PrimeNumberChallenge {
    public static void main(String[] args){
        for(int i = 1; i < 10; i++) {
            System.out.println(i +" is" + (isPrime(i) ? "" : " NOT") + " a prime number");
        }
    }

    public  static boolean isPrime(int wholeNumber) {
        if(wholeNumber % 2 == 0) {
            return true;
        };
        return false;
    }
}
