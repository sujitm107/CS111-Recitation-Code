public class Strings{
    /**
     * A Palindrome is defined as a string that is the same both forwards and backwards. For example,
     * "bob" and "otto" are both palindromes, while “hello” is not.
     * 
     * 1. Write a method that takes in a string and returns true if the string is a palindrome, false
     * otherwise.
     * 2. Modify this method so that the detection is not case sensitive. For example, "Bob" and "OtTo"
     * should now return true.
     * 3. Modify this method so that the detection ignores spaces. For example "no lemon, no melon"
     * should now return true.
     * 
     */

    public static boolean palindrome(String s){

        //racecar -- true

        //melon

        // r --> a --> c
        
        //otto -- true

        for(int i = 0; i<s.length()/2; i++){

            char left = s.charAt(i);
            char right = s.charAt(s.length()-1-i);

            if(left != right){
                return false;
            }

        }

        return true;
    }

    public static boolean palindrome2(String s){

        //Bob
        //oTto
        s = s.toLowerCase();

        //Bob --> bob

        for(int i = 0; i<s.length()/2; i++){

            char left = s.charAt(i);
            char right = s.charAt(s.length()-1-i);

            if(left != right){
                return false;
            }

        }

        return true;
    }

    public static boolean palindrome3(String s){

        //no lemon no melon
        String noSpaces = "";

        //nolemonnomelon

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) != ' '){
                noSpaces += s.substring(i, i+1);
            }
        }

        for(int i = 0; i<noSpaces.length()/2; i++){

            char left = noSpaces.charAt(i);
            char right = noSpaces.charAt(noSpaces.length()-1-i);

            if(left != right){
                return false;
            }

        }

        return true;
    }
    
    /**
     * Write a recursive method, isPalindrome, which takes a String as a parameter, and returns true if
     * the String is a palindrome.
     * 
     * For the purposes of this method, you may assume Strings with a length of 0 or 1 are palindromes.
     */

    public static boolean recursivePalindrome(String s){
        //racecar
        //base cases


        if(s.length() < 2){
            return true;
        }

        char left = s.charAt(0);
        char right = s.charAt(s.length()-1);
        if(left != right){
            return false;
        }

        //recursive step
        //CLUE: Use substring
        return recursivePalindrome(s.substring(1, s.length()-1));
    }

    /**
     * An anagram is a rearrangement of the letters of a word to form a new word. For example, an
     * anagram of "listen" is "silent".
     * 
     * Write a method, anagram, that takes a String as input, and returns true if it is an anagram.
     */


    public static boolean anagram(String word1, String word2){
        if(word1.length() != word2.length()){
            return false;
        }

        //word1 = listen
        //word2 = silent

        for(int i = 0; i<word1.length(); i++){
            char c = word1.charAt(i);
            int index = word2.indexOf(c);

            if(index == -1){
                return false;
            } else {
                String before = word2.substring(0, index);
                String after = word2.substring(index+1);

                word2 = before + after;
            }
        }


        return true;
    }

    /**
     * Assume that we have a string consisting only of letters. We want to find the longest subsequence
     * where a single letter repeats.
     * 
     * For example, in the string “abaabacccaabbbba”, the longest repeating subsequence is the four b's
     * near the end.
     * 
     * Write a method, subseq, to find the longest repeating subsequence of a String and return it.
     */

    public static String lrs(String s){

        return null;
    }

    public static void main(String[] args){

        System.out.println(palindrome("racecar"));

        System.out.println(palindrome("melon"));

        System.out.println(palindrome2("Bob"));
        
        System.out.println(palindrome3("no lemon no melon"));

        System.out.println(recursivePalindrome("otto"));

        System.out.println(anagram("listen", "silent"));

    }
}