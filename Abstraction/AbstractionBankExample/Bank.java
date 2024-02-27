import java.util.Scanner;

/**
 * Bank
 */
public abstract class Bank {
    Scanner sc=new Scanner(System.in);
   

    long AccountNo;
    String Name;
    double Balance;
    int Pwd;

    public Bank(){
        this.AccountNo=5859101002728L;

        System.out.println("enter your name");
        String Name=sc.nextLine();
        
        this.Name=Name;
        this.Balance=1000;
        System.out.println("Set your password");
        int Pwd=sc.nextInt();
      
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