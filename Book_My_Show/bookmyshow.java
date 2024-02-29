import java.util.Scanner;

/**
 * bookmyshow
 */
public class bookmyshow implements IBMS {
    String EmailId,Pwd,Loc;
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

    //content method

    public int Content(){
        System.out.println("Enter the choice");
        System.out.println("1 for movies, 2 for comedy , 3 for live events");

        int ch=sc.nextInt();




        return ch;
    }

    @Override

    public void Loc(bookmyshow b){

        if(b instanceof Movies){

            System.out.println("Enter location");
            System.out.println("1 for Delhi , 2 for Bangalore , 3 for Kota");

            int ch=sc.nextInt();
            if(ch==1){
                Loc="Delhi";
            }
            else if(ch==2){
                Loc="Bangalore";
            }
            else if(ch==3){
                Loc="Kota";
            }
            else{
               Loc(b);
                System.out.println("Selected location is "+ Loc);
            }

        }

      else if( b instanceof Comedy){

        System.out.println("Enter location");
        System.out.println("1 for Gurugram , 2 for Noida , 3 for Jaipur");

        int ch=sc.nextInt();
        if(ch==1){
            Loc="gurugram";
        }
        else if(ch==2){
            Loc="Noida";
        }
        else if(ch==3){
            Loc="Jaipur";
        }
        else{
           Loc(b);
            System.out.println("Selected location is "+ Loc);
        }

      }


    }



    

    
}
