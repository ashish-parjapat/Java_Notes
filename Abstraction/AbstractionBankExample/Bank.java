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

    public abstract void Withdrawal();
    public abstract void Deposit();
    public abstract void ChangePwd();
    public abstract void Details();




    
}