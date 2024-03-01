public class Movies extends BookMyShow {

    String Movie_Name,Seat_type;
    double amt;
    int Seat;

    String Popcorn_type,Coke_type,Nacos_type;
    int Popcorn_qty,Coke_qty,Nacos_qty;
    String UserAddonchoice;


public void SeatSelection(){
    System.out.println("enter the type of seat");
    System.out.println("1 for normal 150rs , 2 for executive 250rs , 3 for Recline 500rs");

    int ch=sc.nextInt();
    System.out.println("enter the number of seats");
    Seat=sc.nextInt();

    if(ch==1){
        Seat_type="Normal";
        amt+=Seat*150;
    }
   else if(ch==2){
        Seat_type="executive";
        amt+=Seat*250;
    }
    else if(ch==3){

        Seat_type="Recline";
        amt+=Seat*500;
  
    }else{
        System.out.println("enter proper input");

        SeatSelection();
    }



}

//Addon methid

public boolean Addon(){
    System.out.println("do you want add on press 1 for yes , 2 for no");
    int ch=sc.nextInt();
    if(ch==1){

        System.out.println("Press 1 for Popcorn , 2 for coke , 3 for Nacos");
        int type=sc.nextInt();
        if(type==1){
            UserAddonchoice="Popcorn";

        }
        else if(type==2){
            UserAddonchoice="Coke";

        }
        else {
            UserAddonchoice="Nacos";
        }
        if(type==1){
            System.out.println("Press 1 for Small--->150rs , 2 for Midum--->300 ,3 for Large---->500");
            int size=sc.nextInt();
            System.out.println("Enter the quantity");
            int qty=sc.nextInt();

            Popcorn_qty=qty;
            if(size==1){
                amt+=150*qty;
                Popcorn_type="Small";
            }

            else if(size==2){
                amt+=300*qty;
                Popcorn_type="Midum";
            }
            else{
                amt+=500*qty;
                Popcorn_type="Large";
            }
        }
        else if(type==2){

            System.out.println("Press 1 for Small--->100, 2 for Midum--->150 ,3 for Large--->180");
            int size=sc.nextInt();
            System.out.println("Enter the quantity");
            int qty=sc.nextInt();
            Coke_qty=qty;
            if(size==1){
                amt+=100*qty;
                Coke_type="Small";
            }

            else if(size==2){
                amt+=150*qty;
                Coke_type="Midum";
            }
            else{
                amt+=180*qty;
                Coke_type="Large";
            }
        }

        else if(type==3){

            System.out.println("Press 1 for Small--->80 , 2 for Midum---->150 ,3 for Large---->300");
            int size=sc.nextInt();
            System.out.println("Enter the quantity");
            int qty=sc.nextInt();
            Nacos_qty=qty;
            if(size==1){
                amt+=80*qty;
                Nacos_type="Small";
            }

            else if(size==2){
                amt+=150*qty;
                Nacos_type="Midum";
            }
            else{
                amt+=300*qty;
                Nacos_type="Large";
            }
        }
        else{
            System.out.println("enter the valid input");
            Addon();
        }







    }else{
        System.out.println("Thanks for you time");
        return false;
    }

    GenerateBill();

    return true;
}



public void GenerateBill(){
    System.out.println("Enjoy the movie "+Movie_Name);
    System.out.println("Your seat type is "+Seat_type);
    System.out.println("Your Addon is"+ UserAddonchoice);
    if(UserAddonchoice=="Popcorn"){
        System.out.println("YOur Quantity is "+Popcorn_qty);
    }

   else if(UserAddonchoice=="Coke"){
        System.out.println("YOur Quantity is "+Coke_qty);
    }else{
        System.out.println("YOur Quantity is "+ Nacos_qty);
    }

    System.out.println("Your total bill is "+amt);
}




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
