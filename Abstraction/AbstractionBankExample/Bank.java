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

    public void ShowBalance(int pwd){
        if(pwd==this.Pwd){
            System.out.println("Bank Balance is "+Balance);

        }else{
            System.out.println("Please check your passwprd");
        }
        
    }

    public abstract void Withdrawal(double amt,int pwd);
    public abstract void Deposit(double amt);
    public abstract void ChangePwd(int Opwd,int newPwd);
    public abstract void Details();

    public abstract void ChangePwdwithOtp();

    public abstract void Transaction();




    
}