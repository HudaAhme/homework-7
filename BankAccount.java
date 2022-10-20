/**
 * Created by DELL on 20/10/2022.
 */
public class BankAccount {
    private double Account ;


    public  BankAccount(double intitiablance)
    {
       Account=intitiablance;
    }
    public void BankAccount()
    {
        Account=0;
    }
    public void diposit(double amount)

    {
        Account=Account+amount;
    }
    public void withdraw(double amount)
    {
        Account=Account-amount;
    }
    public double getbalance()
    {
        return Account;
    }
}
