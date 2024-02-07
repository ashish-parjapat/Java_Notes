import java.util.Scanner;

public class RotateArray {


    public static void rotate(int arr[],int start,int end){

        while(end>start){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            end--;
            start++;
        }
    }

    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int []arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
       System.err.println("Enter k value");
       int k=in.nextInt();

    //    int []firstkarr=new int[k];

    //    for (int i = 0; i < firstkarr.length; i++) {
    //     firstkarr[i]=arr[i];
        
    //    }


    //    for (int i = 0; i < firstkarr.length; i++) {
    //     System.err.print(firstkarr[i]+" ");
    //    }
    //    System.err.println();

    //    int []lastkarr=new int[n-k];

    //    int j=0;

    //    for (int i = k; i < arr.length; i++) {
    //     lastkarr[j]=arr[i];
    //     j++;
        
    //    }

        
       
    //    for (int i = 0; i < lastkarr.length; i++) {
    //     System.err.print(lastkarr[i]+" ");
        
    //    }

    //    System.err.println();

    //    System.arraycopy(lastkarr,0,arr,0,lastkarr.length);
    //    System.arraycopy(firstkarr,0,arr,lastkarr.length,firstkarr.length);

    //    for (int i = 0; i < arr.length; i++) {
    //     System.err.print(arr[i]+" ");
        
    //    }


    rotate(arr, 0, k-1);
    rotate(arr, k, n-1);
    rotate(arr, 0, n-1);
        for (int i = 0; i < arr.length; i++) {
        System.err.print(arr[i]+" ");
        
       }

    }
}