import java.util.*;

public class RBinarySearch {


    public static int binarySearch(int[] arr, int target, int left, int right){
        //return the index of my target

        //base case
        if(left > right){
            return -1;
        }
        
        //int middle = (left + right) / 2;
        // int -- [-3 mil, 3mil] --> 3 mil + 1 = -29999999
        int middle = left + (right - left)/2; 

        //recursive step
        if(target == arr[middle]){
            return middle;
        } else if(target > arr[middle]){
            //check the right
            return binarySearch(arr, target, middle+1, right);
        } else {
            //check the left
            return binarySearch(arr, target, left, middle - 1);
        }

    }

    public static void main(String[] args){

        int[] x = {2, 4, 5, 6, 8, 2, 1, 4, 12, 34, 21, 23, 40};
        Arrays.sort(x);
        System.out.println(Arrays.toString(x));

        int y = binarySearch(x, 12, 0, x.length-1);

        System.out.println(y);
    }
}