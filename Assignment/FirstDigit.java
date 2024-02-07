import java.util.Scanner;

public class FirstDigit {
    
     public static void main(String[]args){

Scanner in=new Scanner(System.in);
System.err.println("Enter a number :");
int n=in.nextInt();
int last=0;
while(n>0){

    last=n%10;
    
    n/=10;
}
System.err.println("first digit is is :"+last);

    }
    
}
