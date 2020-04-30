import java.util.*;

public class RBinarySearchSolutions {


    public static int binarySearch(int[] arr, int target, int left, int right){
        //base case
        if(left > right){
            return -1;
        }

        //recursive step
        //int middle = (left + right)/2;
        int middle = left + (right + left)/2; //to prevent overflow, do you know what this means?

        if(arr[middle] == target){
            return middle;
        } else if (target > arr[middle]){
            return binarySearch(arr, target, middle+1, right);
        } else {
            return binarySearch(arr, target, left, middle-1);
        }

    }

    public static void main(String[] args){

        int[] x = {2, 4, 5, 6, 8, 2, 1, 4, 12, 34, 21, 23, 40};
        Arrays.sort(x);
        
        int y = binarySearch(x, 12, 0, x.length-1);
        System.out.println(y);
    }
}