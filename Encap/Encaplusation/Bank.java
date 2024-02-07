package Encaplusation;

import java.util.Scanner;

public class Bank {
    Scanner in =new Scanner(System.in);
  private long AccountNumber=5859101002728L;
  private double Balance;
  private int Pwd;

//check password length function
  public boolean CheckLength(int n){

   int i=0;
   while(n>0){
    n/=10;
    i++;
   }

   if(i!=4){
    return false;
   }

   return true;


  }


  


  public Bank(int Pwd,double Balance){

   this.Pwd=Pwd;
   
    this.Balance=Balance;

  }
  
  
  public long GetAccountNumber(){

    System.out.println("Enter your Password: ");

    int EnteredPwd=in.nextInt();

    if(EnteredPwd==Pwd){
        return AccountNumber;

    }else{
        System.out.println("Wrong Password");
        return 0;


    }
        
  }



  //setPwd function


  public void SetPwd(){
    int i=0;

    while(i!=3){
        System.out.println("Enter your password");
    int EnteredPwd=in.nextInt();
    if(EnteredPwd==Pwd){
        System.out.println("Enter new Password");
        int newEnteredPwd=in.nextInt();
        boolean length=CheckLength(newEnteredPwd);
        if(length==false){
            System.out.println("enter only 4 digit password");
            i++;


        }else if(length==true){
            if(newEnteredPwd!=Pwd){
                this.Pwd=newEnteredPwd;
                System.out.println("Set the password successfuly");
                i=3;
            }else{
                System.out.println("old and new password can be same");
                i++;
            }
        }
    }
    else{
        System.out.println("Wrong password");
        i++;
    }

    }

    if(i>3){
        System.out.println("Reset your password with mobile number");
        return;
    }
  }

  //getBalance function

  public double getBalance(){

    System.out.println("Enter ypur password");

    int EnteredPwd=in.nextInt();
    if(EnteredPwd==Pwd){
        System.out.println("Your Balance is "+Balance);
        return Balance;
    }else{
        System.out.println("Wrong password");
        return 0.0;
    }





  }

  //withdrawal function

  public void withdrawal(){
    System.out.println("Enter ypur password");

    int EnteredPwd=in.nextInt();
    if(EnteredPwd==Pwd){

        System.out.println("Enter the amount to be withdraw ");
        double amount=in.nextDouble();

        if(amount>Balance){
            System.out.println("Not enough balance");
            return;
            
        }
        else{
            System.out.println("Transction succesful");

            double availabeBalnce=Balance-amount;
        

            System.out.println("Availabel balnce "+String.format("%.2f", availabeBalnce));
            System.out.format("Avaialbe Balanace %.2f", availabeBalnce);
            return;

        }
    }


  }





}
