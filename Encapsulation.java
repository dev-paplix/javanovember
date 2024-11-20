public class Encapsulation {
    
    // Define the variables
    private String name;
    private int age;

    // Define the getter and setter methods

    // Getter method for name

    public String getName() {
        return name;
    }
    
    // Setter method for name

    public void setName(String name) {
        this.name = name;
    }
    
    // Getter method for age

    public int getAge() {
        return age;
    }
    
    // Setter method for age

    public void setAge(int age) {
        if (age > 0){
            this.age = age;
        } else {
            System.out.println("Age cannot be negative");
        }
    }

    public static void main(String[] args) {
        Encapsulation person = new Encapsulation();
        person.setName("Syafig");
        person.setAge(17);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

    }
}
