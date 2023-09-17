public class countsortbasics {

    static int max1(int []arr){
        int maxi=arr[0];
        for(int i=0;i<arr.length;i++){
            if(maxi<arr[i]){
                maxi=arr[i];
            }
        }
        return maxi;
    }
    static int count(int []arr,int n){
        // int maxi=arr[0];
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                c=c+1;
               
            }
        }
        return c;
    }

    static int [] frequencyarray(int arr[]){

        int max=max1(arr);

        int [] count1= new int[max+1];
       for(int i=0;i<count1.length;i++){
        count1[i]=count(arr, i);
       }

       int k=0;
       for(int i=0;i<count1.length;i++){
        for(int j=0;j<count1[i];j++){

            arr[k++]=i;

        }
       }
       return arr;
        
    }
    static int [] frequencyarray1(int arr[]){
        int n=arr.length;
        int [] ans=new int[n];

        int max=max1(arr);

        int [] count1= new int[max+1];
       for(int i=0;i<count1.length;i++){
        count1[i]=count(arr, i);
       }

       for(int i=1;i<count1.length;i++){
        count1[i]=count1[i]+count1[i-1];
       }

       for(int i=n-1;i>0;i--){
          int idx= count1[arr[i]]-1;
          ans[idx]=arr[i];
          count1[arr[i]]--;
       }
       for(int i=1;i<n;i++){
        arr[i]=ans[i];
       }
       return arr;
        
    }
    

    public static void main(String[] args){

        int [] arr={1,3,4,5,2,6,3,6,3,4,1,5};

    
       int []ans= frequencyarray1(arr);
        for(int i:ans){
            System.out.print(i+" ");
        }
        

    }
    
}
