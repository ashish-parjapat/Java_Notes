import java.util.Scanner;

class SumOdddigit{
    public static void main(String[]args){

Scanner in=new Scanner(System.in);
System.out.println("Enter a number:");
int n=in.nextInt();
int oddSum=0;

while(n>0){
    int last=n%10;
    if(last%2==1){
        oddSum+=last;
    }
    n/=10;


}
System.out.println("Sum of odd digit is:"+oddSum);


    }
}