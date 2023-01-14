public class Main {
    public static void main(String[] args) {
        double moneyToBorrow = 100.0;
       for(double rate = 7.5; rate <= 10.0; rate = rate + 0.25) {
           System.out.println(moneyToBorrow + " at " + rate + "% interest = " + calculateInterest(moneyToBorrow, rate));
       }

    }

    public  static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}