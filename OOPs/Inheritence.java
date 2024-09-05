
class Shape {

    public void area() {
        System.out.println("display Area");
    }
}

// Here Triangle class extends the properties of Shape class
// 1. Single Level Inheritence
// Shape: Base Class
// Triangle: Derived Class
class Triangle extends Shape {

    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

// 2. Multi Level Inheritence: chaining of classes from shape -> triangle -> Equilateral triangle
class EquilateralTriangle extends Triangle {

    public void area(int l, int h) {

        System.out.println(1 / 2 * l * h);
    }

}

// 3. Hierarchical Inheritence: different derived class using the same base class
class Cricle extends Shape {

    public void area(int r) {
        System.out.println(3.14 * r * r);
    }
}



public class Inheritence {

    public static void main(String[] args) {

       

    }
}
