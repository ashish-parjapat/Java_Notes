public class Movies extends bookmyshow {

    String Movie_Name;

   public void MovieSelection(){
    if(Loc.equals("Delhi")){
        System.out.println("enter the movie to watch");
        System.out.println("Press 1 for fighter , 2 for Animal , 3 for dunki");

        int ch=sc.nextInt();
        if(ch==1){
            Movie_Name="Fighter";
        }
      else  if(ch==2){
            Movie_Name="Animal";
        }
       else if(ch==3){
            Movie_Name="Dunki";
        }
        else{
            MovieSelection();
        }
        System.out.println("Selected movie is"+ Movie_Name);
        

        

    }
    else if(Loc.equals("Bangalore")){


        System.out.println("enter the movie to watch");
        System.out.println("Press 1 for Salar , 2 for Kgf , 3 for Kantara");

        int ch=sc.nextInt();
        if(ch==1){
            Movie_Name="Salar";
        }
      else  if(ch==2){
            Movie_Name="KGF";
        }
       else if(ch==3){
            Movie_Name="KANTARA";
        }
        else{
            MovieSelection();
        }
        System.out.println("Selected movie is"+ Movie_Name);
    }

    else{
        System.out.println("enter the movie to watch");
        System.out.println("Press 1 for Phuspa , 2 for Bahubali , 3 for RRR");

        int ch=sc.nextInt();
        if(ch==1){
            Movie_Name="Phuspa ";
        }
      else  if(ch==2){
            Movie_Name="Bahubali";
        }
       else if(ch==3){
            Movie_Name="RRR";
        }
        else{
            MovieSelection();
        }
        System.out.println("Selected movie is"+ Movie_Name);
    }



   }





    
}
