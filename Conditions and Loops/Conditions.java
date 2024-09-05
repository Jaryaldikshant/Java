 
public class Conditions{

    public static void main(String[] args) {

        // syntax of if statements

         /*

        if(boolean expression T or F){
            //  body
        }

        else{
            //  do this
        }

         */


        int sal = 10000;
//
//        if (sal < 10000) {
//            sal = sal+ 2000;
//        } else {
//            sal = sal+1000;
//        }



//        Multiple if-else statements
        if(sal <= 1000){
            sal += 1000;
        }

        else if (sal  <= 5000) {
            sal += 10;
        }

        else{
            sal = 0;
        }

        System.out.print(sal);


    }

}
