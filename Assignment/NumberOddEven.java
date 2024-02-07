import java.util.Scanner;

public class NumberOddEven {

       public static void main(String[]args){

Scanner in=new Scanner(System.in);
System.err.println("Enter a number :");
int n=in.nextInt();
int k=n;
int oddDigit=0,evenDigit=0;
while(n>0){
    int last=n%10;
    if(last%2==0){
        evenDigit++;
    }else{
        oddDigit++;
    }
    n/=10;
}
System.err.println("Number of odd digit in "+" " +k+ "is  "+oddDigit);
System.err.println("Number of even digit in "+ " "+k+ "is "+evenDigit);


    }
    
}
