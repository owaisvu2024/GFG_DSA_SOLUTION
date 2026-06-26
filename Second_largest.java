import java.util.Arrays;

public class Second_largest {
    public int getSecondLargest(int[] arr) {
        // code here
        Arrays.sort(arr);
        int largest=arr.length-1;
        int s_largest=arr.length-2;
       
            while(s_largest>=0){
                if(arr[largest]>arr[s_largest]){
                return arr[s_largest];
                
                
            }
            s_largest--;
            
            
            }
                 return -1; 
            
         
        
    }
    public static void main(){
        Second_largest obj=new Second_largest();
        int arr[]={2,4,7,8,3,6,10};
        System.out.println(obj.getSecondLargest(arr));

    }
}
