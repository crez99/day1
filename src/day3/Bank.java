package day3;


public class Bank {


    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account();

//            a1.accountName ="Sireej";
        a1.setAccountName("Sireej");
//            a1.accountNumber="987654321";
        a1.setAccountNumber("987654321");
//            a1.accountBalance = 5000;
        a1.deposit(a1, 4000);

//            a2.accountName = "Aditya";
        a2.setAccountName("Aditya");
//            a2.accountNumber="123456789";
        a2.setAccountNumber("123456789");
//            a2.accountBalance = 8000;
        a2.deposit(a2, 3000);


        //before transfer balance

        System.out.println(a1.getAccountBalance());
        System.out.println(a2.getAccountBalance());


        //transfer balance a1 to a2

        //a1.setAccountBalance(4000-300);
        //a2.setAccountBalance(8000+300);

        a1.transferBalance(a1, a2, 250);

        System.out.println(a1.getAccountBalance());
        System.out.println(a2.getAccountBalance());


    }
}




