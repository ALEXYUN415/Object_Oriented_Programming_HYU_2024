package week13;

public class TransactionManager {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(10000);

        Thread t1 = new Thread(account);
        Thread t2 = new Thread(account);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

        System.out.println("Final Balance: " + account.balance);
    }
}

