public class Comedy extends BookMyShow {

    String Comedy_Name;

    public void ComedySelection(){
     if(Loc.equals("Gurugram")){
         System.out.println("enter the movie to watch");
         System.out.println("Press 1 for Bassi, 2 for Vicky gujral" );
 
         int ch=sc.nextInt();
         if(ch==1){
             Comedy_Name="Bassi";
         }
       else  if(ch==2){
             Comedy_Name="Vicky gujral";
         }
       
         else{
             ComedySelection();
         }
         System.out.println("Selected movie is"+ Comedy_Name);
         
 
         
 
     }
     else if(Loc.equals("Noida")){
 
 
         System.out.println("enter the movie to watch");
         System.out.println("Press 1 for Abishek, 2 for Kapil sharma" );
 
         int ch=sc.nextInt();
         if(ch==1){
             Comedy_Name="Abishek";
         }
       else  if(ch==2){
             Comedy_Name="Kapil sharma";
         }
       
         else{
             ComedySelection();
         }
         System.out.println("Selected movie is"+ Comedy_Name);
     }
 
     else{
         System.out.println("enter the movie to watch");
         System.out.println("Press 1 for Pappu , 2 Bhupi Baba");
 
         int ch=sc.nextInt();
         if(ch==1){
             Comedy_Name="Pappu ";
         }
       else  if(ch==2){
             Comedy_Name="Bhupi Baba";
         }
       
         else{
            ComedySelection();
         }
         System.out.println("Selected movie is"+ Comedy_Name);
     }
 
 
 
    }
 
    
}
