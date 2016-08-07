/**
 * Created by boazraz on 8/7/16.
 */
public class Pet implements java.io.Serializable

{
    private String name;
    private String breed;
    private String color;
    private String height;
    private transient int hunger;
    private int age;
    private transient int hairHeight;

    public Pet(String name, String breed, String color, String height, int hunger, int age, int hairHeight) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.height = height;
        this.hunger = hunger;
        this.age = age;
        this.hairHeight = hairHeight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHairHeight() {
        return hairHeight;
    }

    public void setHairHeight(int hairHeight) {
        this.hairHeight = hairHeight;
    }



    public void printStatus()
    {
        System.out.println("Testing Pet class");
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", height='" + height + '\'' +
                ", hunger=" + hunger +
                ", age=" + age +
                ", hairHeight=" + hairHeight +
                '}';
    }
}