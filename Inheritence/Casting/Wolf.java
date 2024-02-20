public class Wolf extends Animal {
    String color;

    public Wolf(int age,String color){
        super(age);
        this.color=color;

    }
    

    public void makeNoise(){
        System.out.println("Grr Grr");
    }

    public void hunt(){
        System.out.println("Wolf is hunting");
    }
    
}
