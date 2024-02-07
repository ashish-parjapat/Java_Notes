import java.util.Scanner;

public class SumSquareDigit {


    public static void main(String[]args){

Scanner in=new Scanner(System.in);
System.err.println("Enter a number :");
int n=in.nextInt();
int sum=0;
while(n>-0){

    int last=n%10;
    sum+=last*last;
    n/=10;
}
System.err.println("Sum of sqaure of digit of is :"+sum);

    }
    
}
