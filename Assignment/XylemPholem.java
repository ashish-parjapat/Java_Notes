public class XylemPholem {

    public static void main(String[] args) {
        int n=723211;
        int k=n;
    
   int first=n%10;
   int last=0;
   while(n>9){
    n/=10;
   }

   last=n;
int wholesum=0;
while(k>0){
    wholesum+=k%10;
    k/=10;

}

int midsum= wholesum-(first+last);
if(midsum==(first+last)){
    System.err.println("Xylem");
}else{
    System.err.println("pholem");
}

    }
    
}
