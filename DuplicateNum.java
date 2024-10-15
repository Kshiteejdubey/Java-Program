import java.util.*;

public class DuplicateNum {
    public static void main(String[] args) {
         int arr[] = {2,4,4,7,8};
        Arrays.sort(arr);
         
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                  if (arr[i] == arr[j]) {
                       System.out.println(arr[j]);
                  }
            }
        }
    }
}
