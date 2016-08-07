/**
 * Created by boazraz on 8/7/16.
 */
public class Pet implements java.io.Serializable

{
    public String name;
    public String breed;
    public String color;
    public String height;
    public transient int hunger;
    public int age;
    public transient int hairHeight;

    public void printStatus()
    {
        System.out.println("Testing Pet class");
    }
}