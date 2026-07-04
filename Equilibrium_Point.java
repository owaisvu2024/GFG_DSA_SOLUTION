public class Equilibrium_Point {
     public static int findEquilibrium(int arr[]) {
        // code here
        int leftsum=0;
        int rightsum=0;
        int totalsum=0;
        
        for(int i=0;i<arr.length;i++){
            totalsum+=arr[i];
            
        }
        
        for(int i=0;i<arr.length;i++){
            totalsum-=arr[i];
            
            if(totalsum==leftsum){
                return i;
            }
            
            leftsum+=arr[i];
            
        }
        return -1;
        
    }

    public static void main(String[] args){
    Equilibrium_Point obj=new Equilibrium_Point();
    int arr[]={1, 2, 0, 3};
    System.out.print(obj.findEquilibrium(arr));
    }
}
