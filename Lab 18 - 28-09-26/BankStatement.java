class BankAccountNew 
{
    int balance = 1000;

    synchronized void deposit(int amount) 
    {
        balance = balance + amount;
        System.out.println("Deposited: " + amount + " | Balance: " + balance);
        notify();
    }

    synchronized void withdraw(int amount) 
    {
        while (balance < amount) 
            {
            System.out.println("Insufficient Balance for withdrawal of: " + amount);
            try 
            {
                wait();
            } 
            catch (InterruptedException e) 
            {

            }
        }
        balance = balance - amount;
        System.out.println("Withdrawn: " + amount + " | Balance: " + balance);
    }
}

class DepositThread extends Thread 
{
    BankAccountNew account;

    DepositThread(BankAccountNew account) 
    {
        this.account = account;
    }

    public void run() 
    {
        for (int i = 1; i <= 5; i++) 
        {
            account.deposit(500);
            try 
            {
                Thread.sleep(100);
            } 
            catch (InterruptedException e) 
            {

            }
        }
    }
}

class WithdrawalThread extends Thread 
{
    BankAccountNew account;

    WithdrawalThread(BankAccountNew account) 
    {
        this.account = account;
    }

    public void run() 
    {
        for (int i = 1; i <= 5; i++) 
        {
            account.withdraw(500);
            try 
            {
                Thread.sleep(100);
            } 
            catch (InterruptedException e) 
            {

            }
        }
    }
}

public class BankStatement 
{
    public static void main(String[] args) 
     {
        BankAccountNew account = new BankAccountNew();
        DepositThread d = new DepositThread(account);
        WithdrawalThread w = new WithdrawalThread(account);
        d.start();
        w.start();
    }
}