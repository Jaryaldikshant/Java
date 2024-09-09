
// Here '+' operator is being overloaded: giving more functionalities

import java.util.ArrayList;

public class Operators {

    public static void main(String[] args) {

// Here operator is converting Charcter into ASCII value
        System.out.println('a' + 'b');

// Here, it concatinate the String
        System.out.println("a" + "b");

// Adding into the Asii value and then converting into character
        System.out.println((char) ('a' + 3));

// Here it will concatinate both the string and number by converting the integer into Integer that will call .toString() method
        System.out.println("a" + 3);

// Here it will convert the character into Character which call .toString() method
        System.out.println('a' + "a");

// 
        System.out.println("Dikshant" + new ArrayList<>());

        System.out.println("Dikshant" + new Integer(50));

// '+' operator can only use with primitives 

// Or it can't work for complex objects, you need to add string in between them or atleast one of these object is String
        String ans = new Integer(50) + "" + new ArrayList<>();
        System.out.println(ans);

    }

}
