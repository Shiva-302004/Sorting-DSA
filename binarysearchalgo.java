public class binarysearchalgo {

    static boolean binarysearch(int arr[], int target) {
        int st = 0;
        int end = arr.length - 1;
        
        while (st <= end) {
            int mid = (st + end) / 2;

            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] > target) {
                end = mid - 1;
                // return false;
            } else if (arr[mid] < target) {
                st = mid + 1;
                // return false;
            }
        }

        return false;
    }
    static boolean binarysearch1(int arr[],int st,int end,int target){
        //  st=0;
        //  end=arr.length-1;
         if(st>end) return false;
         int mid=(st+end)/2;

        if(target==arr[mid]){return true;}

        else if(target<arr[mid]){
            return binarysearch1(arr,  st, mid-1,target);
        }
        else{
           return  binarysearch1(arr,  mid+1, end,target);
        }






        // return false;
    }
    

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,  13, 14, 15,78 };
        // int target=11;
        // while(target<13){
        // System.out.println(binarysearch(arr,target ));
        // target++;
        // }
        System.out.println(binarysearch1(arr, 0, arr.length-1,1));


    }

}
