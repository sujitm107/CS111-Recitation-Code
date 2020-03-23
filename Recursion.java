public class Recursion{

    public static int factorial(int n){
        /**
         * Write a recursive method for finding the factorial of a given number: public int factorial(int n)
         * What is the base case
         * What is the recursive step?
         */
        
        
        return 0;
    }

    public static int fib(int n){

        /**
         * Fibonacci’s sequence is a sequence in which the current term is obtained by adding the previous two terms. 
         * The first two terms of the sequence are 1. 
         * Here are the first 10: {1, 1, 2, 3, 5, 8, 13, 21, 34, 55}
         * Write a recursive method, fib, which takes an integer n, as a parameter, and computers the nth term of the sequence
        */
     
        return 0;
    }

    public static void pyramid(int nStars){

        /**
         * Write two recursive methods, pyramid and upsideDownPyramid, which both take one
         * parameter, and print triangle of the given height.
         * 
         * For example, given a height 5, pyramid prints:
         *      *
         *      **
         *      ***
         *      ****
         *      *****
         * 
         */
        
    }

    public static void upsideDownPyramid(int nStars){
        //Hint: How many base cases do you need?

        /**
         *  *****
         *  ****
         *  ***
         *  **
         *  *
         */

    }

    public static double harmonic(int x){

        /**
         * The xth harmonic number is defined as a the series: 1 + 1/2 + 1/3 + ... + 1/i
         * 
         * Ex. That is, the first harmonic number (x = 1) is 1. 
         * The second is x = 2 is 1 + 0.5 = 1.5
         */

        return 0;
    }

    public static void main(String[] args){

        //System.out.println(factorial(7));

        //System.out.println(fib(8));

        pyramid(5);

        upsideDownPyramid(5);

        //System.out.println(harmonic(5));

    }

    public static void printRow(int nStars){
        if(nStars == 0){
            System.out.println(); //Force a new line
            return; //no more recursion
        }
        System.out.print("*");
        printRow(nStars - 1);
    }


}