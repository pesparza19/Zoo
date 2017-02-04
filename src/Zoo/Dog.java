/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoo;

/**
 *
 * @author Jafet
 */
public class Dog extends Animal {

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
