import java.util.Arrays;
import java.util.Scanner;
public class Missing_Array{

        int missingNum(int arr[]) {
        // code here
        Arrays.sort(arr);
        int count = 1;
        for(int i=0;i<arr.length;i++){
            if(count==arr[i]){
                count++;
            
            }
            else{
                return count;
            }
            
        }
       return count;
    }
public static void main(String[] args){
Missing_Array obj=new Missing_Array();
int arr[]={1,3,4,5,6};
// int ans=obj.missingNum(arr);
System.out.println(obj.missingNum(arr));

}

}