/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoo;

import java.io.Console;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Jafet
 */
public class Zoo {

    public static void main(String args[]) {
        /*PolarBear juanello = new PolarBear("Juanello", 
                                            new LifeSpan(3,20),
                                            PolarBear.Gender.Male,
                                            4.2f,
                                            6,
                                            600);
        
        Rabbit petronilo = new Rabbit("Petronilo", new LifeSpan(1,200), Animal.Gender.Female, 0.2f, 1f, 10f);
        
        PolarBear bears[] = new PolarBear[10];
        for(int i=0; i < 10; i++){
            bears[i] = new PolarBear("Juanello " + i, new LifeSpan(1,2*(i+1)), PolarBear.Gender.Male,4.2f, 6, 600);
        }
        System.out.println(PolarBear.getCountCreated());
        System.out.println(Rabbit.getCountCreated());
        /*
        System.out.println(juanello);
        juanello.run();
        juanello.makeSound();
        System.out.println("***************");
        System.out.println(petronilo);
        petronilo.run();
        petronilo.makeSound();
         */

        Vector<PolarBear> myPolarBears = new Vector<PolarBear>();
        Vector<Lion> myLions = new Vector<Lion>();
        Vector<Rabbit> myRabbits = new Vector<Rabbit>();

        Scanner scanner = new Scanner(System.in);
        String input = "";
        do {
            String menu = "Welcome to the Zoo Manager\n";
            menu += "1) Create a Polar Bear\n";
            menu += "2) Create a Lion\n";
            menu += "3) Create a Rabbit\n";
            menu += "4) Create a Dog\n";
            menu += "8) Print my Zoo\n";
            menu += "9) Exit\n";

            int option = LivingBeing.getValidIntFromUser(menu);
            if (option >= 1 && option <= 3) {
                System.out.print("Give me a name: ");
                String name = scanner.nextLine();
                System.out.println();
                Animal.Gender animalGender = Animal.getValidGenderFromUser("Give me a gender\n1)Male\n2)Female\n");
                float height = LivingBeing.getValidFloatFromUser("Give me the height: ");
                float weight = LivingBeing.getValidFloatFromUser("Give me the weight: ");
                float topSpeed = LivingBeing.getValidFloatFromUser("Give me top speed: ");
                int minimumLifeSpan = LivingBeing.getValidIntFromUser("Give me minimum life span: ");
                int maximumLifeSpan = -1;
                do{        
                    maximumLifeSpan = LivingBeing.getValidIntFromUser("Give me maximum life span: ");
                } while(maximumLifeSpan<minimumLifeSpan);
                        
                switch (option) {
                    case 1:
                        PolarBear bear = new PolarBear(name, new LifeSpan(minimumLifeSpan, maximumLifeSpan), animalGender, height, topSpeed, weight);
                        myPolarBears.add(bear);
                        break;
                    case 2:
                        Lion lion = new Lion(name, new LifeSpan(minimumLifeSpan, maximumLifeSpan), animalGender, height, topSpeed, weight);
                        myLions.add(lion);
                        break;
                    case 3:
                        Rabbit rabbit = new Rabbit(name, new LifeSpan(minimumLifeSpan, maximumLifeSpan), animalGender, height, topSpeed, weight);
                        myRabbits.add(rabbit);
                        break;

                }
            }

            if (option == 8) {
                for (int i = 0; i < myPolarBears.size(); i++) {
                    System.out.println((i + 1) + ")\n" + myPolarBears.get(i));
                }
                System.out.println("----");
                for (int i = 0; i < myLions.size(); i++) {
                    System.out.println((i + 1) + ")\n" + myLions.get(i));
                }
                System.out.println("----");
                for (int i = 0; i < myRabbits.size(); i++) {
                    System.out.println((i + 1) + ")\n" + myRabbits.get(i));
                }
            }

        } while (!input.equals("9"));
    }

}
