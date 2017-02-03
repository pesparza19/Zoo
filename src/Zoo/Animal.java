/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoo;

import java.util.Scanner;

/**
 *
 * @author Jafet
 */
public class Animal extends LivingBeing{

    public enum Diet {
        Carnivore,
        Herbivore,
        Omnivore
    }
    
    protected enum Gender {
        Male,
        Female
    }
    
    private Diet diet;
    private Gender gender;
    private float topSpeed;
    
    //Constructor
    protected Animal(String name, LifeSpan lifeSpan, Gender gender, float height, float topSpeed, float weight){
        super(name, height, lifeSpan, weight);
        setGender(gender);
        setTopSpeed(topSpeed);
    }
    
    public Diet getDiet() {
        return diet;
    }

    protected void setDiet(Diet diet) {
        this.diet = diet;
    }

    public Gender getGender() {
        return gender;
    }

    protected void setGender(Gender gender) {
        this.gender = gender;
    }

    public float getTopSpeed() {
        return topSpeed;
    }

    protected void setTopSpeed(float topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void die(){}
    public void eat(){}
    public void makeSound(){
        System.out.println("Please insert a sound");
    }
    
    public static Gender getValidGenderFromUser(String textRequest){
        Gender resultingValue = Gender.Female;
        int input = -1;
        do {
            input = LivingBeing.getValidIntFromUser(textRequest);
        } while(input != 1 && input !=2);
        
        if(input == 1){
            resultingValue = Gender.Male;
        }
        
        return resultingValue;
    }
    
    @Override
    public String toString(){
        String info = "";
        info += "Name: " + getName() + "\n";
        info += "LifeSpan: " + getLifeSpan() + "\n";
        info += "Gender: " + getGender() + "\n";
        info += "Height: " + getHeight() + "\n";
        info += "Top Speed: " + getTopSpeed() + "\n";
        info += "Weight: " + getWeight();
        
        return info;
    }
}
