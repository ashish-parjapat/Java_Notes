public class ICICI extends Bank {

    public ICICI(long AccountNo,String Name,double Balance,int Pwd){
        super(AccountNo, Name, Balance, Pwd);
    }

    @Override


    public void ShowBalance(){
        System.out.println("Balance is"+Balance);
    }


    @Override

    public void Withdrawal(double amt,int Pwd){

        if(this.Pwd==Pwd){
            if(Balance>amt){
                Balance=Balance-(amt)*1.02;
                System.out.println("amount withdrawn Succesgfully");
                System.out.println("Balnce is "+this.Balance);
            }else{
                System.out.println("Balnce is less than the enter amount");
            }
        }else{
            System.out.println("Password does not match");
        }
      
    }


    
    @Override

    public void Deposit(double amt){
        Balance=Balance+amt;
        System.out.println("Amount depoited succesfully");
        System.out.println("Your Bank Balnance is "+this.Balance);
        
    }




    @Override

    public void ChangePwd(int Opwd,int Npwd){
        if(Opwd==this.Pwd){
            if(Npwd>999 && Npwd<10000){
                this.Pwd=Npwd;;
                System.out.println("Password changed succesfully");
            
        }else{
            System.out.println("Enter coorect Password");
        }
    }


        else{
            System.out.println("Wrong password");
        }
    }
    
    
    @Override

    public void Details(){
        System.out.println("Your Balnance is "+this.Balance);
        System.out.println("Account number is "+this.AccountNo);
    }


    
}
