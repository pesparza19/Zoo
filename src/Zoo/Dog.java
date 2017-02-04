package Zoo;

public class Dog extends Animal {
    
    // Bla Bla Bla
    // My name is Fer!

    //Constructor
    public Dog(String name, LifeSpan lifeSpan, Animal.Gender gender, float height, float topSpeed, float weight){
        super(name, lifeSpan, gender, height, topSpeed, weight);
        setDiet(Animal.Diet.Carnivore);
    }
    
    public void fly(){}
    
    @Override
    public void makeSound(){
        System.out.println("Waaaaaaaaac");
    }
    
}
