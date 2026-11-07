package A_OOP.BankAcc;

import java.math.BigDecimal;

public class BankAccount {
    private final String accountName;
    private final String accountNum;
    private BigDecimal accBalance;

   public BankAccount(String accountName, String accountNum, BigDecimal accBalance){
            if (accountName == null || accountName.isBlank()) {
                throw new IllegalArgumentException("Account name cannot be null or blank.");
            }

            if (accountNum == null || accountNum.isBlank()) {
                throw new IllegalArgumentException("Account number cannot be null or blank.");
            }

            if (accBalance == null) {
                throw new IllegalArgumentException("Initial balance cannot be null.");
            }

            if (accBalance.signum() < 0) {
                throw new IllegalArgumentException("Initial balance cannot be negative.");
            }

            this.accountName = accountName;
            this.accountNum = accountNum;
            this.accBalance = accBalance;

    }


   public BigDecimal getAccBalance(){
        return accBalance;
    }

   public BigDecimal deposit(BigDecimal amount){
        if (amount == null) {
            throw new IllegalArgumentException("Deposit amount cannot be null.");
        }

        if(amount.signum()<=0){
            throw new IllegalArgumentException("Deposit amount must be greater than zero.");
        }

        accBalance = accBalance.add(amount);

        return accBalance;

    }

   public BigDecimal withdraw(BigDecimal amount){
        if(amount == null){
            throw new IllegalArgumentException("Withdrawal amount cannot be null");
        }

        if (amount.signum() <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be greater than zero.");
        }

        if(amount.compareTo(accBalance) > 0){
            throw new IllegalArgumentException("Insufficient funds");
        }

        accBalance = accBalance.subtract(amount);

        return accBalance;

    }

}
