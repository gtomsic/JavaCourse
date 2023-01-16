public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-222));
    }
    public static boolean isPalindrome(int number){
        int r, sum = 0, temp;
        temp = number;
        while(number != 0) {
            r = (number % 10);
            sum = (sum * 10) + r;
            number = number / 10;
        }
        if(temp == sum) {
            return true;
        }
        return false;
    }

}
