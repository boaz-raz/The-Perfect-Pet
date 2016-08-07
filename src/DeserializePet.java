//import java.io.*;
//public class DeserializePet
//{
//    public static void main(String [] args)
//    {
//         Pet p = null;
//        try
//        {
//            FileInputStream fileIn = new FileInputStream("pet.ser");
//            ObjectInputStream in = new ObjectInputStream(fileIn);
//            p = (Pet) in.readObject();
//            in.close();
//            fileIn.close();
//        }catch(IOException i)
//        {
//            i.printStackTrace();
//            return;
//        }catch(ClassNotFoundException c)
//        {
//            System.out.println("Employee class not found");
//            c.printStackTrace();
//            return;
//        }
//        System.out.println("Deserialized Pet...");
//        System.out.println("Name: " + p.name);
//        System.out.println("Breed: " + p.breed);
//        System.out.println("Color: " + p.breed);
//        System.out.println("Height: " + p.height);
//        System.out.println("Hunger: " + p.hunger);
//        System.out.println("Age: " + p.age);
//        System.out.println("Hair Height: " + p.hairHeight);
//    }
//}