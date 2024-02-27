import java.util.Random;
import java.util.Scanner;

public class ICICI extends Bank {
    Scanner sc=new Scanner(System.in);

    public ICICI(){
        super();
    }

    @Override


    public void ShowBalance(int pwd){
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
    @Override

    public void ChangePwdwithOtp(){
        Random r=new Random();

        int otp=r.nextInt(8999)+1000;

        System.out.println("your otp is "+otp);
        System.out.println("enter the otp");
        int verifyotp=sc.nextInt();

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



    public void Transaction(){

        System.out.println("Press 1 to check balance");
        System.out.println("Press 2 for withdraw");
        System.out.println("Press 3 for deposit");
        System.out.println("Press 4 for chnage Pwd");
        System.out.println("Press 5 for details");
        System.out.println("press 6 for exit");


int choice=sc.nextInt();
if(choice==1){
    System.out.println("Enter the password");
    int pwd=sc.nextInt();
    ShowBalance(pwd);
    Transaction();

}else if(choice==2){
    System.out.println("enter the pwd");
    int pwd=sc.nextInt();
    System.out.println("enter the ammoyunt");
    double amt=sc.nextDouble();
    Withdrawal(amt, pwd);
    Transaction();


}
else if(choice==3){
    System.out.println("enter the ammount to be depoistee");
    double amt=sc.nextDouble();
    Deposit(amt);
    Transaction();

}else if(choice==4){
    System.out.println("Press 1 to chnage the password with old password");
    System.out.println("Press 2 to chnage the password with  otp");
    int passwordchoice=sc.nextInt();
    if(passwordchoice==1){

        System.out.println("enter old passprd");
        int oldPass=sc.nextInt();
        System.out.println("enter new Password");
        int newPass=sc.nextInt();
        ChangePwd(oldPass,newPass);
        Transaction();
        
    }else{
        ChangePwdwithOtp();
        Transaction();
    }

}else if(choice==5){
    Details();
    Transaction();
}
else{
    return;
}





    
    }


    
}
