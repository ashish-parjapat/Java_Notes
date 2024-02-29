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
    public boolean Login() {
        System.out.println("Do you have an account ? Y / N");
        char ch=sc.next().charAt(0);

        if(ch=='N'||ch=='n'){
            System.out.println("Please signup");
            Signup();
            // return true;
        }

        // user is login
      else  if(ch=='Y'||ch=='y'){
        System.out.println("Enter your email Id");

        String verifyEmail=sc.next();

        System.out.println("Enter the password");

        String verifyPwd=sc.next();

        if(verifyEmail.equalsIgnoreCase(EmailId) && verifyPwd.equals(Pwd)){

        }
        else{
            System.out.println("Enter valid credentials");
            Login();
        }
        // return true;

        }

        else{
            System.out.println("enter proper input");
            Login();
          
        }

        return true;
       
    }

    

    
}
