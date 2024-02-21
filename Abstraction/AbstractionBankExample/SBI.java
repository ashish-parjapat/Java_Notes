public class SBI extends Bank {
    

    public SBI(long AccountNo,String Name,double Balance,int Pwd){
        super(AccountNo, Name, Balance, Pwd);
    }

@Override
    public void ShowBalance(){
        System.out.println("Balance is"+Balance);
    }
    @Override

    public void Withdrawal(){
        System.out.println("this is withdrwal method");
    }
    @Override

    public void Deposit(){
        System.out.println("this is depost method");
        
    }
@Override
    public void ChangePwd(){
        System.out.println("this will chnage pwd");
    }
    @Override

    public void Details(){
        System.out.println("this is detail method");
    }




}
