import java.util.Scanner;

public class ProductEven {

    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=in.nextInt();

        int product=1;
        while(n>0){
            int last=n%10;
            if(last%2==0){
                product*=last;
            }
            n/=10;
        }

        System.out.println("Product of even digit is:"+product);

    }
    
}
