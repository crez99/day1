package day3;

public class Account {


    //states
    private String accountName;
    private String accountNumber;
    private double accountBalance;


    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    //  public void setAccountBalance(double accountBalance) {
    //     this.accountBalance = accountBalance;
    // }


    //behavior
    public void transferBalance(Account a1, Account a2, double amountToBeTransferred) {


        // a1.accountBalance -= amountToBeTransferred;
        //a2.accountBalance += amountToBeTransferred;

        //logic to check balance if it is available
        if (amountToBeTransferred <= accountBalance) {
            a1.accountBalance = a1.accountBalance - amountToBeTransferred;
            a2.accountBalance = a2.accountBalance + amountToBeTransferred;
        } else {
            System.err.print("Insufficient balance");
        }

    }


    public void deposit(Account s, double amountToBeDeposited) {

        //s.accountBalance += amountToBeDeposited;

        //logic to check negative balance deposited

        if (amountToBeDeposited > 0) {
            accountBalance = accountBalance + amountToBeDeposited;
        } else {
            System.err.print("Amount deposited must be greater than zero");
        }

    }

}



