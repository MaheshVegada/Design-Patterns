package Proxy;
/**
 *
 * @author Mahesh Vegada
 */
public class AccountProxy implements Account{
    private AccountImpl account;
    AccountProxy(String custName,double balance){
        account=new AccountImpl(custName, balance);
    }
    @Override
    public String withdraw(double amount){
        return account.withdraw(amount);
    }
    @Override
    public String deposit(double amount){
        return account.deposit(amount);
    }
}