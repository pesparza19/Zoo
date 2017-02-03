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
public class LivingBeing {
    
    private String name;
    private float height;
    private LifeSpan lifeSpan;
    private float weight;

    private LivingBeing(){}
    
    protected LivingBeing(String name, float height, LifeSpan lifeSpan, float weight){
        setName(name);
        setHeight(height);
        setLifeSpan(lifeSpan);
        setWeight(weight);
    }
    
    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public float getHeight() {
        return height;
    }

    protected void setHeight(float height) {
        this.height = height;
    }

    public LifeSpan getLifeSpan() {
        return lifeSpan;
    }

    protected void setLifeSpan(LifeSpan lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public float getWeight() {
        return weight;
    }

    protected void setWeight(float weight) {
        this.weight = weight;
    }
    
    public static float getValidFloatFromUser(String textRequest){
        float resultingValue;
        Scanner scanner = new Scanner(System.in);
        
        do{
            System.out.print(textRequest);
            try{
                resultingValue = Float.parseFloat(scanner.nextLine());
            } catch(NumberFormatException nfe){
                resultingValue = -1f;
                System.out.println("That was not a float, please use floats");
            }
            
        } while (resultingValue < 0);
        
        return resultingValue;
    }
    
    public static int getValidIntFromUser(String textRequest){
        int resultingValue;
        Scanner scanner = new Scanner(System.in);
        
        do{
            System.out.print(textRequest);
            try{
                resultingValue = Integer.parseInt(scanner.nextLine());
            } catch(NumberFormatException nfe){
                resultingValue = -1;
                System.out.println("That was not an integer, please use integer");
            }
            
        } while (resultingValue < 0);
        
        return resultingValue;
    }
    
    public void die() {
    }
}
