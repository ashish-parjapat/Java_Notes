import java.util.Scanner;

public class Validation {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String Email;
        String Pass;
boolean isAlphabet=false;
  boolean isUpper=false;
  boolean isLower=false;
  boolean isSybol=false;
  boolean isNum=false;
  while(true){

  
        System.out.println("Enter the email id");
        Email=sc.next();

        if((Email.contains("gmail.com")||Email.contains("yahoo.com")||Email.contains("outlook.com"))&&Email.contains("@")&&Email.charAt(0)!='@'&&){
            System.out.println("Entre the password");
            Pass=sc.next();
            byte[]arr=Pass.getBytes();
            if(Pass.length()>=8){

                if((arr[0]>65 &&arr[0]<96)||arr[0]>96||arr[0]<124){
                    isAlphabet=true;
                }

                for (int i = 0; i < arr.length; i++) {
                    if((arr[i]>=65 &&arr[i]<=91)){
                        isUpper=true;
                    }


                     if((arr[i]>96 &&arr[i]<=123)){
                        isLower=true;
                    }

                    if(arr[i]==1|| arr[i]==2|| arr[i]==3|| arr[i]==4|| arr[i]==5|| arr[i]==6|| arr[i]==7|| arr[i]==8|| arr[i]==9){
                        isNum=true;
                    }

                  if(arr[i]=='@'||arr[i]=='#'||arr[i]=='?'||arr[i]=='!'){
                    isSybol=true;
                  }
                    
                }

//find the string before the @

String matchingString="";
  for (int i = 0; i < Email.length(); i++) {
    if(Email.charAt(i)!='@'){
        matchingString+=Email.charAt(i);
        
    }else{
        break;
    }
    
  }


  if(matchingString.equals(Pass)){
    System.out.println("Email id and pwd canot be samee");
    throw new InvalidPwdException();
  }


                if(isUpper&&isLower&&isNum&&isSybol){
                 System.out.println("Pwd set succesfully");
    
                }else{
                  throw new InvalidPwdException();
                }




            }else{
               throw new InvalidPwdException();
            }

            
            
          




        }

        else{
           throw new InvalidEmailException();
        }

       
            
        
    }
        
        
        
    }
    
}
