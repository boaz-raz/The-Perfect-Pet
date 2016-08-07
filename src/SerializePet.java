import java.io.*;

public class SerializePet

{
    public static void main(String [] args)
    {
        // creating new pet object and store is in to .ser byte file to local dir
        Pet myPet = new Pet();
        myPet.name = "Foxy";
        myPet.breed = "Labradoodle";
        myPet.color = "Brown";
        myPet.height = "20 in";
        myPet.age = 2;
        myPet.hunger = 1;
        myPet.hairHeight = 2;

        try
        {
            FileOutputStream fileOut =
                    new FileOutputStream("pet.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(myPet);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in ./pet.ser");
        }catch(IOException i)
        {
            i.printStackTrace();
        }
    }
} // end SerializedDemo class