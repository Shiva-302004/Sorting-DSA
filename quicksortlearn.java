public class quicksortlearn {

    static void swap(int [] arr,int i,int j ){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static int partition(int []arr,int st,int end){
        int pivot=arr[st];
        int c=0;
        for(int i=st+1;i<=end;i++){
            if(arr[i]<=pivot){
                c=c+1;
            }
        }
        int curr_idx=st+c;
        swap(arr, st, curr_idx);

        int i=st,j=end;

        while(i<curr_idx  && j>curr_idx){
            while(arr[i]<=pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<curr_idx && j>curr_idx){
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        return curr_idx;

    }

    static void quicksort(int []arr,int st,int end){
        if(st>=end){return;}
        int idx=partition(arr, st, end);
        quicksort(arr, st, idx-1);
        quicksort(arr, idx+1, end);

    }

    public static void main(String[] args){

        int[] arr={7,6,4,2,45,65,34};
        int n=arr.length-1;
        quicksort(arr, 0, n);

        for(int i:arr){
            System.out.print(i+" ");
        }



    }
    
}
