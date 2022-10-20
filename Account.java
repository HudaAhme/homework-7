/**
 * Created by DELL on 20/10/2022.
 */
public class Account {
    public static void main(String[] args) {
        BankAccount bank= new BankAccount(100000);
        bank.diposit(1000);
        System.out.println("the balnce after diposit  "+bank.getbalance());
        bank.withdraw(400);
        System.out.println("the balnce after withdraw  "+bank.getbalance());
        bank.getbalance();
        System.out.println("the value is balance  "+bank.getbalance());
    }
    }

