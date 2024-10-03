package week13;

public class BankAccount implements Runnable {
    protected int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    // 동기화된 입급 메소드
    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited:" + amount + ", Current Balance: " + balance);
    }

    // 동기화된 출금 메소드
    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn:" + amount + ", Current Balance: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawl of " + amount);
        }
    }

    public synchronized int getBalance() {
        return balance;
    }
    @Override
    public void run() {
        deposit(2000);
        withdraw(13500);
        deposit(3000);
        withdraw(4000);
    }
}
