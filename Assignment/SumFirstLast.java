public class SumFirstLast {
    public static void main(String[] args) {
        int n=12345;
        int last=n%10;
        
        while(n>9){
            n/=10;

        }
        int sum=n+last;
        System.err.println(sum);
        
    }
    
}
