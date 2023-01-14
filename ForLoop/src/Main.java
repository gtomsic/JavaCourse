public class Main {
    public static void main(String[] args) {
        double moneyToBorrow = 100.0;
       for(double rate = 7.5; rate <= 10.0; rate = rate + 0.25) {
           double interestAmount = calculateInterest(moneyToBorrow, rate);
                   if(interestAmount > 8.5) {
                       break;
                   };
           System.out.println(moneyToBorrow + " at " + rate + "% interest = " + interestAmount);
       }
    }

    public  static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}