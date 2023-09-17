

public class insertionsort {
    static int[] printArray(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);

        }
        return arr;
    }
    static int [] insertionsort1(int [] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0&& arr[j]<arr[j-1]){

                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;

                j--;

            }
        }



        return arr;
    }
    public static void main(String[] args) {
          
        int [] arr={5,6,7,1,4,3,2};
        insertionsort1(arr);
        printArray(arr);
        
    }
    
}
