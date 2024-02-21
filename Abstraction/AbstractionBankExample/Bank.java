import java.util.Scanner;

/**
 * Bank
 */
public abstract class Bank {
   

    long AccountNo;
    String Name;
    double Balance;
    int Pwd;

    public Bank(long AccountNo,String Name,double Balance,int Pwd){
        this.AccountNo=AccountNo;
        this.Name=Name;
        this.Balance=Balance;
        this.Pwd=Pwd;
    }

    public void ShowBalance(){
        System.out.println("Bank Balance is "+Balance);
    }

    public abstract void Withdrawal(double amt,int pwd);
    public abstract void Deposit(double amt);
    public abstract void ChangePwd(int Opwd,int Npwd);
    public abstract void Details();




    
}