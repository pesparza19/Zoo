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
public class Lion extends Animal {

    private static int countCreated = 0;
    
    public static int getCountCreated() {
        return countCreated;
    }
    
    private static void incrementCountCreated(){
        countCreated++;
    }
    
    //Constructor
    public Lion(String name, LifeSpan lifeSpan, Gender gender, float height, float topSpeed, float weight){
        super(name, lifeSpan, gender, height, topSpeed, weight);
        setDiet(Diet.Carnivore);
        incrementCountCreated();
    }

    public void run() {
    }
    
    @Override
    public void makeSound(){
        System.out.println("Roooooooaaaaaaaarrr");
    }

}
