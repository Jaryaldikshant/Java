
public class Comparison {

    public static void main(String[] args) {

// Here a object named "Dikshant" is created inside the String Pool which is inside the Heap memory, and a and b is pointing to smae object
        String a = "Dikshant";

        String b = "Dikshant";

// Gives true: as both are pointing to same object
        // System.out.println(a == b);
// Here, 2 new object is created inside the heap memory but not in the String Pool, which is "Dikshant" to whom x is pointing and "Dikshant" to whom y is pointing
        String x = new String("Dikshant");

        String y = new String("Dikhant");

// Gives False: both are pointing to 2 Different objects
        System.out.println(x == y);
        // When we only need to check value, we use 
        String str1 = new String("Dikshant");
        String str2 = new String("Dikshant");

        System.out.println(str1 == str2);

// To check for the value, it just checks the value not the object
        System.out.println(str1.equals(str2));




// internally is just storing the element in character array



// but we can't do this will give error
        // System.out.println(str1[0]);


// to find the what element is present in which index, use:
        System.out.println(str1.charAt(0));
    }
}
