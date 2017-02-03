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
public class Rabbit extends Animal {

    private static int countCreated = 0;
    
    public static int getCountCreated() {
        return countCreated;
    }
    
    private static void incrementCountCreated(){
        countCreated++;
    }
    
    public Rabbit(String name, LifeSpan lifeSpan, Gender gender, float height, float topSpeed, float weight) {
        /*LifeSpan averageLifeBear = new LifeSpan();
        averageLifeBear.setMinimum(1);
        averageLifeBear.setMaximum(8);
        setLifeSpan(averageLifeBear);
        setName("Rabbit");
        setDiet(Diet.Herbivore);
        setGender(Gender.Male);
        setHeight(0.2f);
        setTopSpeed(6);
        setWeight(3);*/
        super(name, lifeSpan, gender, height, topSpeed, weight);
        setDiet(Diet.Herbivore);
        incrementCountCreated();
    }
    
    public void run(){}
    
    @Override
    public void makeSound(){
        System.out.println("Wazzup dog");
    }
    
}
