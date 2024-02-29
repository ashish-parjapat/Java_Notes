import java.util.Scanner;

/**
 * bookmyshow
 */
public class bookmyshow implements IBMS {
    String EmailId,Pwd;
    Scanner sc=new Scanner(System.in);


    //Signup method

    @Override
    public void Signup() {
        

        System.out.println("Enter the Email Id");
        EmailId=sc.next();
        System.out.println("Enter the passworsd");
        Pwd=sc.next();
        System.out.println("Signed up sucessfully");
        Login();
        
    }


//Login Method

    @Override
    public void Login() {
        System.out.println("Do you have an account ? Y / N");
        char ch=sc.next().charAt(0);

        if(ch=='N'||ch=='n'){
            System.out.println("Please signup");
            Signup();
        }
      else  if(ch=='Y'||ch=='y'){

        }

        else{
            System.out.println("enter proper input");
            Login();
        }
       
    }

    

    
}
