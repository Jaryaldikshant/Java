
class Pen {

    // Here we defined the BluePrint of the pen
    String color;
    String type; // ball or gel pen ?

    // Methods
    public void write() {
        System.out.println("Write Something");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

// defining other class
class Student {

    String name;
    int age;

    // methods
    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);

    }
    // define a Constructor

// 1.Non-Perameterised Constructor
// 2.Perameterised Constructor
    Student(String name, int age) {
        this.name = name;

        // this.age is the age of the object which is defined upper and age i sthe argument passed in this constructor
        this.age = age;
    }

// 3.Copy Constructor
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    Student() {

    }

    // Polymorphism: Same function is used for different Purposes
    public void printInformation(String name) {
        System.out.println(name);
    }

    public void printInformation(int age) {
        System.out.println(age);
    }

    public void printInformation(String name, int age) {
        System.out.println(name + " " + age);
    }

}

public class OOPS {

    public static void main(String[] args) {

        // Here we defined the objects
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

// write function will called here
        // pen1.write();
        // Pen pen2 = new Pen();
        // pen2.color = "red";
        // pen2.type = "ballpoint";
        // pen1.printColor();
        // pen2.printColor();
        Student s1 = new Student();
        s1.name = "Dikshant";
        s1.age = 20;
        // Student s2 = new Student(s1);
        // s2.printInfo();

        // s1.printInfo();
        s1.printInformation(s1.name,s1.age);

    }
}
