import java.util.*;

// Bubble Sort 

// Time complexity O(n ^2);

class Bubblesort{
    public static void printarray(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main (String args[]){
        int arr[] = {54,67,64,55,66,43,23};

        for(int i=0; i<arr.length-1; i++){ //n- 1
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }   
            }
        }
        printarray(arr);
    }
}

