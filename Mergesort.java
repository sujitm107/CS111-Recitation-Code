
public class Mergesort {

    public static void mergesort(char[] a, int l, int r) {
        if (l >= r) {
            return;
        }
        int middle = (l + r) / 2;
        mergesort(a, l, middle);
        mergesort(a, middle + 1, r);
        merge(a, l, middle, r);
    }
    
    public static void merge(char[] a, int l, int m, int r) { 
        // copy lower half of the array into b
        char[] b = new char[m - l + 1];
        for (int i = 0; i <= m - l; i++) {
            b[i] = a[l + i];
        }
    
        int i = 0, j = m + 1, k = l;
        
        while (i <= m - l && j <= r) {
            if (a[j] < b[i]) { //char-to-char comparison
                a[k] = a[j];
                k += 1;
                j += 1;
            } else {
                a[k] = b[i];
                k += 1;
                i += 1;
            }
        }
        while (i <= m - l) {
            a[k] = b[i];
            k += 1;
            i += 1;
        }
        while (j <= r) {
            a[k] = a[j];
            k += 1;
            j += 1;
        }
    }

    public static void main(String[] args){
        
        char[] arr = new char[20];

        for(int i = 0; i<arr.length; i++){
            arr[i] = (char)((int) (Math.random()*25)+97);
            System.out.print(arr[i] + " ");
        }

        mergesort(arr, 0, arr.length-1);
        System.out.println();

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }


    }

}