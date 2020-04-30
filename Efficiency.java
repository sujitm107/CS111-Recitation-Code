
public class Efficiency {
        public static void main(String[] args){

        //Print Strings and Big O
            String[] arr = {"one", "two", "three", "four", "five"};

            String[] arr2 = {"7"};

            for(int i = 0; i<arr.length; i++){
                System.out.println(arr[i]); //5 n operations
            }

            for(int i = 0; i<arr.length; i++){
                System.out.println(arr[i]); //5  n operations 
            }

            // O(n)

            //10

        //Nested For Loops
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                System.out.println(arr[i]); // 25 = 5*5 49 = 7*7  O(n^2) = n*n
            }
        }

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<5; j++){
                System.out.println(arr[i]); // 25 = 5*5  7*5 = 35 10*5 = 50 n*5 = O(n)
            }
        }

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr2.length; j++){
                System.out.println(arr[i]); // 25 = 5*5  7*5 = 35 10*5 = 50 n*5 = O(n)
            }
        }

        //Sequential Search
        String[] friends = {"Mark", "John", "Sophie"}; // -- m as the number of friends

        String[] people = {"Sal", "Ryan", "Matt", "Mohit", "Andrew", "Mark", "John"};

        //n as the number of people at the party

        for(int i = 0; i<friends.length; i++){
            for(int j = 0; j<people.length; i++){
                if(friends[i].equals(people[j])){
                    System.out.println(true);
                }
            }
        }

        //O(m*n)

        //Iterative Binary Search
        String[] friends2 = {"Mark", "John", "Sophie"};

        String[] people2 = {"Sal", "Ryan", "Matt", "Mohit", "Mark", "John", "Andrew"};
                            //   l                      m         l mr       m             r
                            //   // l=0
                            //   // r=6

        //Big O of Gradebook Averages

    }
}