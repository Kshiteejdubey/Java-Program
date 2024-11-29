public class LowerBound {

    public static void main(String[]args){
           int[] arr ={2,3,5,6,6,7,9};
            int  n =6;
             
            for (int i = 0; i < arr.length; i++) {
                  if (arr[i] == n) {
                         System.out.println(i);
                         break;
                  }
            }
    } 
}