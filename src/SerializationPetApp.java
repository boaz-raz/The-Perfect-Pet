import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by boazraz on 8/7/16.
 */

public class SerializationPetApp {

    // create ArryList to store the pets
    private static  List<Pet> pets = new ArrayList<Pet>();

    // create an instance of Serialization Pet class
    private static SerializationPet petExample = new SerializationPet();

    public static void main(String [] args)
    {
        // Enter few pets as an example
        pets.add(new Pet("Name", "Breed", "Color", "3 inc", 3, 0,4));
        pets.add(new Pet("Name", "Breed", "Color", "3 inc", 1, 5,2));
        pets.add(new Pet("Name", "Breed", "Color", "3 inc", 1, 5,2));
        pets.add(new Pet("Name", "Breed", "Color", "3 inc", 4, 5,3));
        pets.add(new Pet("Name", "Breed", "Color", "3 inc", 3, 5,5));

        // Print out current pets list
        System.out.println("The Current pets list" + "\n" +
                "------------------------------------------");
        System.out.println("Pets: " + pets);

        System.out.println("------------------------------------------" + "\n");

        // takes to arguments List and file name
        petExample.serilaize(pets,"src/pets.ser");

        // feedback message to the user
        System.out.println("Serialization process was done " + "\n");


        // calling the menu method for the user to select the method
        menu();

    } // end main


    // menu to navigate
    private static void menu(){

        Scanner sc = new Scanner(System.in);
        boolean keepgooing = true;

        while (keepgooing) {
            System.out.println("Welcome to the CSCI240 Pet store: (press the number on the left to lunch command)" + "\n" +
                    "------------------------------------------" + "\n" +
                    "1) Print and Deserialize the list" + "\n" +
                    "2) Enter your pet info to the list" + "\n" +
                    "3) List all the hungry pets" + "\n" +
                    "4) Feed all hungry pets" + "\n" +
                    "5) List all pets who needs hair cut (longer than 3 inches)" + "\n" +
                    "6) Cut hair for pets with hair longer than 3 inches" + "\n" +
                    "0) Exit");


            int input = sc.nextInt();

            if (input == 1) {
                deserialize();
            } else if (input == 2) {
                addMyPet();
                System.out.println("Printing the new list of pets \n");
                // printing the new list to the user as a feedback
                deserialize();
            } else if (input == 3) {
                printHungaryPets();
            } else if (input == 4) {
                feedAllPets();
            } else if (input == 5) {
                printAllPetsForHairCut();
            } else if (input == 6) {
                hairCut();
            } else if (input == 0){
                System.out.println("Exiting the program thanks and good bey \n");
                keepgooing = false;
            } else {
                System.out.println("Please select valid number \n");
            }

        } // end while
    } // end menu


    //METHODS

    private static void deserialize(){
        // Deserialize the list from the
        List<Pet> newList  = petExample.deserialize("src/pets.ser");
        System.out.println("New list: " + newList);

    }

   // output to the user all the hungary pets which is int value 2 and below
    private static void printHungaryPets(){
        System.out.println("print Hungary pets method was called \n");

        // create query like for the arraylist to print out all the pets that hunger level is less and equal to 2
        // Display our objects.
        for (Pet p : pets) {
            if (p.getHunger() <= 2) {
                System.out.println(p);
            }
        }
    }

    // print all pets who need hair cut where hair is more than 3 inches long
    private static void printAllPetsForHairCut(){
        System.out.println("List of pets who needs hair cut (hair is longer than 3 inches " + "\n" +
                "----------------------------------- \n");
        for (Pet p : pets) {
            if (p.getHairHeight() >= 3) {
                System.out.println(p);
            }

        }

    }

    // feed all pets where hunger level is <= to 2
    private static void feedAllPets(){
        System.out.println("Fedding all the hungry pets :)  " + "\n" +
                "----------------------------------- \n");
        for (Pet p : pets) {
            if (p.getHunger() <= 2) {
                p.setHunger(0);
                System.out.println(p);
            }
        }

    }

    // give hair cut for pets who has hair longer than 3 inches
    private static void hairCut(){
        System.out.println("List of pets who needs hair cut (hair is longer than 3 inches " + "\n" +
                "----------------------------------- \n");
        for (Pet p : pets) {
            if (p.getHairHeight() >= 3) {
                p.setHairHeight(1);
                System.out.println(p);
            }

        }

    }


    // addMyPet method
    private static void addMyPet() {

        // create an instance of Serialization Pet class
        // add your own pet method
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("*** Please enter your Pet info (press enter on each entry!) " + "\n" +
                    " Name, Breed, Color, Height, Hunger level (int 0-4 where 0 is very hungry)," + "\n" +
                    " Age (int), Hair Height (int 0-5)  ");
            pets.add (new Pet (sc.next(),sc.next() , sc.next(),sc.next(), sc.nextInt(), sc.nextInt(),sc.nextInt()));
            break;
        }
    }

} // end SerializationPetApp class
