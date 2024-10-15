import java.util.Arrays;

public class PrefixSum {

    public static int prefixSum(int[][] arr){
        int r1 = 0, r2=3,c1=2,c2=3;
        int sum = 0;

        for (int i = r1; i <=r2; i++) {
             for (int j = c1; j <=c2; j++) {
                   sum += arr[i][j];
             }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = {
                  {1,1,1,1},
                  {1,1,1,1},
                  {1,1,1,1},
                  {1,1,1,1}
        };

        System.out.println(prefixSum(arr));
         for (int[] is : arr) {
                 System.out.println(Arrays.toString(is));
         }
    } 
} 
