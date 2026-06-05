class Dog {
    String name;
    int age;
    String breed;
    Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
    void bark() {
        System.out.println(name + " barks");
    }
    void spin() {
        System.out.println(name + " is spinning ");
    }
    void run() {
        System.out.println(name + " is running");
    }
}
public class DogClass {
    public static void main(String[] args) {
        Dog dog = new Dog("Bob", 1, "Husky");
        System.out.println("name " + dog.name);
        System.out.println("age  " + dog.age);
        System.out.println("breed " + dog.breed);
        dog.bark();
        dog.spin();
        dog.run();
    }
}
