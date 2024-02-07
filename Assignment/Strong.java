public class Strong {

    public static int fact(int k){
        int fact=1;
        for(int i=2;i<=k;i++){
            fact*=i;

        }
        return fact;
    }
    public static void main(String[] args) {
        int n=125;
        int check=n;
int sum=0;
        while(n>0){
            int digit=n%10;
            int factValue=fact(digit);
            sum+=factValue;
            n/=10;
        }

        System.err.println(sum);

        if(sum==check){
            System.err.println("Strong");
        }else{
            System.err.println("Not Strong");
        }
    }
    
    
}
