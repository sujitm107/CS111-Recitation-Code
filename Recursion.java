public class Recursion{

    public static int factorial(int n){ //5
        /**
         * Write a recursive method for finding the factorial of a given number: public int factorial(int n)
         * What is the base case
         * What is the recursive step?
         */

        if(n == 0){
            return 1;
        }
        if(n == 1){
            return 1;
        }
       
       return n*factorial(n - 1);

       // 5! = 5*4!
       // 4! = 4*3!

       /*
            factorial(5) = 5*factorial(4); 5*24 = 120
            factorial(4) = 4*factorial(3); 4*6 = 24
            factorial(3) = 3*factorial(2); 3*2 = 6
            factorial(2) = 2*factorial(1); 2*1 = 2
            factorial(1) = 1
       */
    }

    public static int fib(int n){ //2 --> 2nd term
        /**
         * Fibonacci’s sequence is a sequence in which the current term is obtained by adding the previous two terms. 
         * The first two terms of the sequence are 1. 
         * Here are the first 10: {1, 1, 2, 3, 5, 8, 13, 21, 34, 55}
         * Write a recursive method, fib, which takes an integer n, as a parameter, and computers the nth term of the sequence
        */
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 1;
        }

        //Starting from the 3rd term we can use recursion!
        return fib(n-1)+fib(n-2);
    }

        /*
            fib(5) = fib(4)+fib(3) -- 3+2 = 5
            fib(4) = fib(3)+fib(2) -- 2+1 = 3
            fib(3) = fib(2)+fib(1) -- 1+1 = 2
            fib(2) = 1
            fib(1) = 1
        */

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

         if(nStars == 0){
             return;
         }

         upsideDownPyramid(nStars-1);
         printRow(nStars);

    }

    /*
    upsideDownPyramid(2) -- > upsideDownPyramid(1) --> upsideDownPyramid(0)
                       printRow(3) <-- printRow(2)    <--    printRow(1)   <--

    */


    public static void upsideDownPyramid(int nStars){
        //Hint: How many base cases do you need?

        /**
         *  *****
         *  ****
         *  ***
         *  **
         *  *
         */

        /* DO NOT USE WHEN USING RECURSION
            break -- stops the loop
            continue -- that goes to the next iteration
        */

        if(nStars == 0){
            return; //return means exit really
        }

        //nStars = 3
        printRow(nStars);
        upsideDownPyramid(nStars-1);

    }

    /*
        upsideDownPyramid(3) = printRow(3);                 ***
                               upsideDownPyramid(2);
        upsideDownPyramid(2) = printRow(2);                 **
                               upsideDownPyramid(1);
        upsideDownPyramid(1) = printRow(1);                 *
                               upsideDownPyramid(0); return;
                    
    */

    public static double harmonic(int x){
        /**
         * The xth harmonic number is defined as a the series: 1 + 1/2 + 1/3 + ... + 1/i
         * 
         * Ex. That is, the first harmonic number (x = 1) is 1. 
         * The second is x = 2 is 1 + 0.5 = 1.5
         */

        return 0.0;
    }

    public static void main(String[] args){

        //System.out.println(factorial(7));

        //System.out.println(fib(6));

        //pyramid(5);

        //upsideDownPyramid(5);

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