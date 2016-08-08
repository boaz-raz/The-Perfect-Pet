import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by boazraz on 8/7/16.
 */

public class SerializationPetApp {

    // create ArryList to store the pets
    private   static  List<Pet> pets = new ArrayList<Pet>();
    private static SerializationPet petExample = new SerializationPet();

    public static void main(String [] args)
    {
        // Enter few pets as an example
        pets.add(new Pet("Name", "Breed", "Color", "3 inc", 0, 0,0));
        pets.add(new Pet("Name", "Breed", "Color", "3 inc", 1, 5,2));
        pets.add(new Pet("Name", "Breed", "Color", "3 inc", 1, 5,2));

        // Print out current pets list
        System.out.println("The Currnet pets list" + "\n" +
                "------------------------------------------");
        System.out.println("Pets: " + pets);

        System.out.println("------------------------------------------" + "\n");


        // call the method addMyPet to add user's pet
//        addMyPet();

        // create an instance of Serialization Pet class


        // takes to arguments List and file name
        petExample.serilaize(pets,"src/pets.ser");

        // feedback message to the user
        System.out.println("Serialization process was done " + "\n");


        // TODO ADD MENU HERE
        menu();

    } // end main


    // addMyPet
    private static void addMyPet() {
        // create an instance of Serialization Pet class
//        SerializationPet petExample2 = new SerializationPet();

        // add your own pet method
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("*** Please enter your Pet info (press enter on each entry!) " + "\n" +
                    " Name, Breed, Color, Height, Hunger level (int 0-3 where 0 is very hungry)," + "\n" +
                    " Age (int), Hair Height (int 0-5)  ");
            pets.add (new Pet (sc.next(),sc.next() , sc.next(),sc.next(), sc.nextInt(), sc.nextInt(),sc.nextInt()));
            break;
        }
    }


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
                    "0) Exit");


            int input = sc.nextInt();

            if (input == 1) {
                deserialize();
            } else if (input == 2) {
                addMyPet();
            } else if (input == 3) {
                //TODO add print hungru pets
            } else if (input == 4) {
                //TODO add feed method
            } else if (input == 0) {
                System.out.println("Exiting the program thanks and good bey \n");
                keepgooing = false;
            } else {
                System.out.println("Please select valid number \n");

            }

        } // end while
    } // end menu

    private static void deserialize(){
        // Deserialize the list from the
        List<Pet> newList  = petExample.deserialize("src/pets.ser");
        System.out.println("New list: " + newList);

    }

} // end SerializationPetApp class
