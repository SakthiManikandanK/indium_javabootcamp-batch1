import java.util.Arrays;

public class BinarySearch {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        int [] a1 = {1};

        int key = 3;
        int result = Arrays.binarySearch(arr,key);
        if (result < 0)
            System.out.println("Element is not found!");
        else
            System.out.println("Element is found at index: "+result);
    }
}
