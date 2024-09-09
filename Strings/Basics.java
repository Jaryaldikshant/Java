
public class Basics {

    public static void main(String[] args) {
// System.out.println(name);
// Here , both a and b are pointing to same object due to 2 reasons:
// 1: String Pool:  a separate memory structure inside the Heap memory , it makes our program optimised and no need to create another similar string, as it is already present inside the string pool
// 2: Imutability: Strings are immutable in java , we can't change them using referense variable, due to some security issues
                // System.out.println(name);
// Here , both a and b are pointing to same object due to 2 reasons:
// 1: String Pool:  a separate memory structure inside the Heap memory , it makes our program optimised and no need to create another similar string, as it is already present inside the string pool

// 2: Imutability: Strings are immutable in java , we can't change them using referense variable, due to some security issues


        String a = "Dikshant";
        System.out.println(a);

    // Here new object named "jaryal" is formed in the string pool and a refence variable a is now pointing to new object

        a = "Jaryal" ;
        System.out.println(a);

    }
}
