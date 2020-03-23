public class Recursion{

    public static int factorial(int n){
        
        return 0;
    }

    public static int fib(int n){
     
        return 0;
    }

    public static void pyramid(int nStars){
        
    }

    public static void upsideDownPyramid(int nStars){

        
    }

    public static double harmonic(int x){

        return 0;
    }

    public static void main(String[] args){

        System.out.println(factorial(7));

        System.out.println(fib(8));

        pyramid(5);

        upsideDownPyramid(5);

        System.out.println(harmonic(5));

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