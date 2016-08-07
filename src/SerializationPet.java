import java.io.*;
import java.util.List;

public class SerializationPet

{
    public void serilaize (List<Pet> pList, String fileName) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(pList);
        } catch (IOException ex) {
            System.out.println("An error occurred serialization process");
            System.out.println(ex.getMessage());

        }
    }

    // Deserialization the list of pets
    public List<Pet>  deserialize(String fileName) {

        // return null if list is empty. Otherwise return list of pets
        List<Pet> pList = null;
        // take cerise  of bytes and recreate an object
        try (ObjectInputStream in =
                     new ObjectInputStream(new FileInputStream(fileName))){
            // deserizlize
            pList = (List<Pet>) in.readObject();

        } catch (IOException | ClassNotFoundException ex) {
            System.out.printf("Problem during deserialize %s%n file ", fileName);
            System.out.println(ex.getMessage());

        }
        return pList;
    }

} // end SerializedDemo class
