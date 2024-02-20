public class Dog extends Animal {
    String bread;

public Dog(int age,String bread){
    super(age);
    this.bread=bread;

}

    public void makeNoise(){
        System.out.println("Bow Bow");
    }
    public void guardHouse(){
        System.out.println("guarding");
    }


    
    
}
