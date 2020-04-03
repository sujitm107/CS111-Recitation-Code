public class StringsSolutions{

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

        for(int i = 0; i<s.length()/2 ; i++){
            if(s.charAt(i) != s.charAt(s.length()-(i+1))){
                return false;
            }
        }

        return true;
    }

    public static boolean palindrome2(String s){

        String s2 = s.toLowerCase();

        for(int i = 0; i<s.length()/2 ; i++){
            if(s2.charAt(i) != s2.charAt(s2.length()-(i+1))){
                return false;
            }
        }
        
        return false;
    }

    public static boolean palindrome3(String s){

        int l = 0;
        int r = (s.length()-1);

        while((r-l) > 2){

            if(s.charAt(l) == ' '){
                r--;
            } else if(s.charAt(r) == ' '){
                l++;
            } else if(s.charAt(l) != s.charAt(r)){
                return false;
            } else {
                r--;
                l++;
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

        if(s.length() < 2){
            return true;
        }

        if(s.charAt(0) != s.charAt(s.length()-1) ){
            return false;
        }
        
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

        for(int i = 0; i<word1.length(); i++){
            char c = word1.charAt(i);
            int index = word2.indexOf(c);

            if(index == -1){
                return false;
            }else{
                String before = word2.substring(0,index);
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

        String temp = s.substring(0,1);
        String max = "";

        for(int i = 1; i<s.length(); i++){
            if(s.charAt(i) == temp.charAt(temp.length()-1)){
                temp += s.substring(i, i+1);
            }else{
                temp = s.substring(i, i+1);
            }

            if(temp.length() > max.length() ){
                max = temp;
            }

        }

        return max;
    }

    public static void main(String[] args){

        System.out.println(lrs("fsdkjfslddddddsfsdff"));

    }
}