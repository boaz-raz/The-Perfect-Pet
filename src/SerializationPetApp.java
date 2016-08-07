import java.util.ArrayList;
import java.util.List;

/**
 * Created by boazraz on 8/7/16.
 */
public class SerializationPetApp {
    public static void main(String [] args)
    {
        List<Pet> pets = new ArrayList<Pet>();
        pets.add(new Pet("Name", "Breed", "Color", "3 inc", 0, 0,0));
        pets.add(new Pet("Name", "Breed", "Color", "3 inc", 1, 5,2));
        pets.add(new Pet("Name", "Breed", "Color", "3 inc", 1, 5,2));

        System.out.println("Pets: " + pets);

        // create an instance of Serilized Pet
        SerializationPet petExample = new SerializationPet();

        // takes to arguments List and file name
        petExample.serilaize(pets,"src/pets.ser");

        // feedback message to the user
        System.out.println("Serialization process was done ");


        // Deserialize the list from the
        List<Pet> newList  = petExample.deserialize("src/pets.ser");
        System.out.println("New list: " + newList);

    } // end main
} // end SerializationPetApp class
