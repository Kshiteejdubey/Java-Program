public class MIssingNumber{

    public static void main(String[] args){
             int arr[] = {1,2,4,7,6,5};
             int len = arr.length + 1;
             int totalSum = (len*len + len)/2;
             int temp=0;
             for (int i : arr) {
                 temp += i;
             }
 
             int missNum = totalSum - temp;

             System.out.println(missNum + " " + temp + " " + totalSum + " " + len);
    }
}