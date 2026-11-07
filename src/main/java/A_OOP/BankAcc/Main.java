package A_OOP.BankAcc;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BankAccount aayamsAcc = new BankAccount("Aayam", "1626", new BigDecimal("5000"));

        BankAccount rahulsAcc = new BankAccount("Rahul", "5432", new BigDecimal(12000));

        aayamsAcc.deposit(new BigDecimal("2000"));

        System.out.println("Aayam: " + aayamsAcc.getAccBalance());
        System.out.println("Rahul: " + rahulsAcc.getAccBalance());


        BankAccount account1 = new BankAccount(
                "Aayam", "1626", new BigDecimal("5000")
        );

        BankAccount account2 = account1;

        account2 = new BankAccount(
                "Rahul", "5432", new BigDecimal("12000")
        );

        account2.deposit(new BigDecimal("3000"));


        System.out.println("Test line");


    }



}
