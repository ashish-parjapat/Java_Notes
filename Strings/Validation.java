import java.util.Scanner;

public class Validation {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String Email;
        String Pass;
  boolean isUpper=false;
  boolean isLower=false;
  boolean isSybol=false;
  boolean isNum=false;
  
        System.out.println("Enter the email id");
        Email=sc.next();

        if(Email.contains(".com")&&Email.contains("@")){
            System.out.println("Entre the password");
            Pass=sc.next();
            byte[]arr=Pass.getBytes();
            if(Pass.length()>=8){

                for (int i = 0; i < arr.length; i++) {
                    if((arr[i]>=65 &&arr[i]<=91)){
                        isUpper=true;
                    }


                     if((arr[i]>96 &&arr[i]<=123)){
                        isLower=true;
                    }

                    if(arr[i]>=48 &&arr[i]<=58){
                        isNum=true;
                    }

                    else{
                        isSybol=true;
                    }
                    
                }

                if(isUpper&&isLower&&isNum&&isSybol){
                    System.out.println("Password set ");
    
                }else{
                    System.out.println("4 conditons does not match");
                }




            }else{
                System.out.println("Enter the 8 digit passord");
            }

            
            
          




        }

        else{
            System.out.println("Enter the valid email id");
        }

       
            
        

        
        
        
    }
    
}
