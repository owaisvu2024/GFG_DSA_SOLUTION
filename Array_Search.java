public class Array_Search {
    public int search(int arr[], int x) {
        // code here
        for(int i=0;i<arr.length;i++){
            if(x==arr[i]){
                return i;
                
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Array_Search obj =new Array_Search();
        int x=7;
        int arr[]={1,2,3,5,7,8};
        System.out.println(obj.search(arr,x));
    }
}
