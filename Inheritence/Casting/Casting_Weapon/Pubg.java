public class Pubg {

    int score;

    public Pubg(int score){
        this.score=score;
    }
   

    public Weapon pressButton(){
       
        if(score<=150){
            return new Knife();
        }

        else if(score<=350){
            return new Gun();
        }
        else{
            return new Bomb();
        }
        

    }
    
}
