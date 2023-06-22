package Java.Code.ObjectOrientedProgramming;
// Classes are the blueprint of an object
// Classes are the template for objects
// Classes can contain:
// 1. Data
// 2. Subroutines (methods)
// 3. Constructors
// 4. Nested types
// 5. Static and non-static fields

class Person {
    // Data
    private final String name;
    private final int age;

    //Constructor
    Person(String name , int age) {
        this.name = name;
        this.age = age;
    }
    // Subroutines (methods)
    void speak() {
        System.out.println("My name is " + name + " and I am " + age + " years old.\n");
    }
    void sayHello() {
        System.out.println("Hello there!\n");
    }
}
class car {
    private final String model;
    private final int year;

    car(String make , String model, int year) {
        this.model = model;
        this.year = year;
    }
    // Data
    // Subroutines (methods)
    void drive() {
        System.out.println("You drive the car.");
    }
    void stop() {
        System.out.println("You stop the car.");
    }
}

class CarCompany{
    protected final String name;

    CarCompany(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
    public void printName() {
        System.out.println("The name of the car company is " + name + ".");
    }

    newModel createNewModel(String model) {
        return new newModel(name, model);
    }

}

class newModel extends CarCompany{
    private final String model;

    newModel(String name, String model) {
        super(name);
        this.model = model;
    }
    void printModel() {
        System.out.println("The name of the car company is " + getName() + " and the model is " + model + ".");
    }
}






public class Classes {
    public static void main(String[] args) {

        Person person1 = new Person("Joe", 25);

        person1.sayHello();
        person1.speak();


        System.out.println("==================================================\n");

        Person person2 = new Person("Sarah", 21);
        person2.sayHello();
        person2.speak();


        System.out.println("==================================================\n");

        car car1 = new car("Chevrolet", "Camaro", 1967);
        car1.drive();
        car1.stop();

        System.out.println("==================================================\n");

        car car2 = new car("Ford", "Mustang", 1969);
        car2.drive();
        car2.stop();

        System.out.println("==================================================\n");

        CarCompany carCompany1 = new CarCompany("Ford");
        carCompany1.printName();

        System.out.println("==================================================\n");

        carCompany1.createNewModel("Mustang").printModel();

    }


}
