import java.util.Random;
import java.util.Scanner;

public  class SBI extends Bank {
    Scanner sc=new Scanner(System.in);
    

    public SBI(long AccountNo,String Name,double Balance,int Pwd){
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
                Balance=Balance-(amt)*1.03;
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

    @Override


    public void ChangePwdwithOtp(){
        Random r =new Random();
        int otp= r.nextInt(899999)+1000;

        System.out.println("Your otp is "+otp);
        System.out.println("Enter otp");
        int verifyotp= sc.nextInt();

        if(otp==verifyotp){
            System.out.println("enter your new password");
            int newPwd=sc.nextInt();
            if(newPwd<10000 && newPwd>1000){
                this.Pwd=newPwd;
                System.out.println("Password chnaged succesfully");
            }else{
                System.out.println(" please enter the 4 digit password ");
            ChangePwdwithOtp();

            }
        }else{
            System.out.println("Invalid password");
            System.out.println("do you want to send the otp gain");
            System.out.println("Press Y for Yes N for No");
            char choice=sc.next().charAt(0);
            if(choice=='Y'||choice=='y'){
                ChangePwdwithOtp();
            }else{
                System.out.println("Try another methiod to chnage the password");
            }
        }

        



    }




}
