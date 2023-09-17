public class binarysearchprob1 {

    static int binarysearch(int [] arr,int st,int end){
        // int st=0;
        // int end=arr.length-1;
        // int idx=0;
        int ans=-1;
        int n=arr.length;

        while(st<=end){
            int mid=(st+end)/2;
            if(arr[mid]<=arr[n-1]){
                ans=mid;
                end=mid-1;

            }else{
                st=mid+1;
            }
        }



        return ans;
    }

   static int targetbinary(int [] arr,int target){
    int st=0;
    int n=arr.length;
    int end= n-1;
    // int idex=-1;
    while(st<=end){
        int mid=(st+end)/2;
        if(arr[mid]==target){
            // idex=1;
            return mid;

        }
        else if(arr[st]==arr[mid]&&arr[mid]==arr[end]){
            st++;
            end--;
        }
        else if(arr[mid]<arr[end]){
            if( target>arr[mid] &&target<=arr[end]){
                st=mid+1;

            }
            else{
                end=mid-1;
            }

        }else{
            if(target>=arr[st]&&target<arr[mid]){
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
    }
    return -1;
   }


    public static void main(String[] args) {

        int array[]={2,2,3,3,4,5,6,1,2};
        System.out.println(targetbinary(array, 10));
       System.out.println(binarysearch(array,0,array.length-1)); 
        
    }
    
}
