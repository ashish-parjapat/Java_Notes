/**
 * Animal
 */
public class Animal {

    int age;

    public Animal(int age){
        this.age=age;

    }
    public void makeNoise(){
        System.out.println("Animal make noise");
    }

    public void run(){
        System.out.println("Animal is running");
    }


    public void details(Animal a){
        System.out.println(a.age);
        makeNoise();

        if(a instanceof Dog){
            Dog d=(Dog)a;
            System.out.println(d.bread);
        }

        else if(a instanceof Wolf){
            Wolf wo=(Wolf)a;
            System.out.println(wo.color);
            wo.hunt();
        }

    }
}