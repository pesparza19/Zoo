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
public class Eagle extends Animal {

    //Constructor
    public Eagle(String name, LifeSpan lifeSpan, Gender gender, float height, float topSpeed, float weight){
        super(name, lifeSpan, gender, height, topSpeed, weight);
        setDiet(Diet.Carnivore);
    }
    
    public void fly(){}
    
    @Override
    public void makeSound(){
        System.out.println("Waaaaaaaaac");
    }
    
}
