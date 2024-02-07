public class sumExceptFirst {

    public static void main(String[] args) {
        int n=456321;
        int newnumber=n%10;

        int sum=0;
        while(n>9){
            sum+=n%10;
            n/=10;
        }

        System.err.println(sum);
    }
    
}
