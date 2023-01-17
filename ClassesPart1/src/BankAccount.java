public class BankAccount {
    private int accountNumber;
    private int accountBalance;
    private String accountName;
    private String email;
    private String phoneNumber;

    // GETTERS START HERE

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // SETTERS START HERE

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void accountDeposit(int amount) {
        boolean isSuccess = false;
        try{
            do{
                if(amount < 0) {
                    System.out.println("Invalid Value, Try again.");
                    break;
                } else {
                    this.accountBalance += amount;
                    System.out.println("Account Balance = " + this.accountBalance);
                    isSuccess = true;
                }
            } while(!isSuccess);

        } catch (NumberFormatException error) {
            System.out.println("Invalid format");
        }
    }

    public void accountWithdrawal(int amount) {
        boolean isValid = false;
        do{
            try{
                if(amount < 0) {
                    System.out.println("Invalid Value. Try again.");
                    break;
                }
                if(this.accountBalance < amount) {
                    System.out.println("Your balance is less than your requested amount = " + this.accountBalance);
                    break;
                } else {
                    this.accountBalance = this.accountBalance - amount;
                    isValid = true;
                    System.out.println("Account Balance = " + this.accountBalance);
                }
            } catch (NumberFormatException error) {
                System.out.println("Invalid amount");
            }
        }while(!isValid);
    }
}
