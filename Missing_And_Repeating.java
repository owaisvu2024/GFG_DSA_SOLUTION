import java.util.ArrayList;
import java.util.Arrays;

public class Missing_And_Repeating {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        Arrays.sort(arr);
       int count=1;
       int duplicate=-1;
       int missing=-1;
        ArrayList<Integer>result=new  ArrayList<>();
        
        for(int i=1;i<arr.length;i++){
            
            if(arr[i]==arr[i-1]){
                duplicate=arr[i];
               
                break;
            }
        }
        for(int i=0;i<arr.length;i++){
            
            if(count==arr[i]){
                count++;
            }
             }
      missing=count;
            result.add(duplicate);
         result.add(missing);
           return result;
        
 }
 public static void main(String[] args){
  Missing_And_Repeating obj=new Missing_And_Repeating();
  int arr[]={1,3,4,5,6,7,8,9,10,10};

  System.out.println(obj.findTwoElement(arr));
 }
}
