public class Selectionsort {
    static int[] printArray(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);

        }
        return arr;
    }
    static int[] selectionsort1(int arr[]){
        int n=arr.length;

        for(int i=0;i<n;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(arr[min_index]>arr[j]){
                    min_index=j;
                }
            }
            int temp=arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;

        }

        return arr;
    }
    public static void main(String[] args) {
        
        int [] arr={5,6,7,1,4,3,2};
        selectionsort1(arr);
        printArray(arr);

    }
    
}
