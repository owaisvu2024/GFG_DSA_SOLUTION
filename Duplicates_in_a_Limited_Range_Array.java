import java.util.ArrayList;
import java.util.Arrays;
public class Duplicates_in_a_Limited_Range_Array {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        ArrayList<Integer>result =new ArrayList<>();
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                result.add(arr[i]);
            }
            
        }
        return result;
    }

    public static void main(){
    Duplicates_in_a_Limited_Range_Array obj=new Duplicates_in_a_Limited_Range_Array();
    int arr[]={2,3,1,2,3,1};
    System.out.println(obj.findDuplicates(arr));
    }
    
}
