import java.util.Arrays;

public class Two_Sum_Pair_with_Given_Sum {
    boolean twoSum(int arr[], int target) {
        // code here
       int start =0;
       int end =arr.length-1;
       
       Arrays.sort(arr);
       while(start<end){
           int sum=arr[start]+arr[end]; 
           if(sum==target){
               return true;
           }
           
           else if(target>sum){
            start++;
           }
           else{
               end--;
           }
           
       }
       
       return false;
           
    }
    public static void main(){
        Two_Sum_Pair_with_Given_Sum obj=new Two_Sum_Pair_with_Given_Sum();
        int arr[]={0, -1, 2, -3, 1};
        int target=-2;
        System.out.print(obj.twoSum(arr,target));
    }
}
