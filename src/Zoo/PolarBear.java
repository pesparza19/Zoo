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
public class PolarBear extends Animal {
    
    private static int countCreated = 0;
    
    public static int getCountCreated() {
        return countCreated;
    }
    
    private static void incrementCountCreated(){
        countCreated++;
    }
    
    

    //Constructor
    //private PolarBear(){
    //}
    
    //Constructor
    public PolarBear(String name, LifeSpan lifeSpan, Gender gender, float height, float topSpeed, float weight){
        super(name, lifeSpan, gender, height, topSpeed, weight);
        setDiet(Diet.Carnivore);
        incrementCountCreated();
    }
    
    
    public void run(){
        System.out.println("I'm running like a bear");
    }
    
    @Override
    public void makeSound(){
        System.out.println("Brrrrrr");
    }
    
}
