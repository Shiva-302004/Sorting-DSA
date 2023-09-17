public class radixsort {
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
    static int max1(int []arr){
        int maxi=arr[0];
        for(int i=0;i<arr.length;i++){
            if(maxi<arr[i]){
                maxi=arr[i];
            }
        }
        return maxi;
    }
    static int [] frequencyarray1(int arr[],int place){
        int n=arr.length;
        int [] ans=new int[n];

        // int max=max1(arr);

        int [] count1= new int[7];
       for(int i=0;i<=count1.length-1;i++){
        // count1[i]=count(arr, i);
        count1[(arr[i]/place)%10]++;
       }

       for(int i=1;i<count1.length;i++){
        count1[i]=count1[i]+count1[i-1];
       }

       for(int i=n-1;i>0;i--){
          int idx= count1[(arr[i]/place)%10]-1;
          ans[idx]=arr[i];
          count1[(arr[i]/place)%10]--;
       }
       for(int i=1;i<n;i++){
        arr[i]=ans[i];
       }
       return arr;
        
    }

    static void radixsor1(int [] arr){
      int max=max1(arr);
      for(int place=1;(max/place)>0;place*=10){
        frequencyarray1(arr,place);
      }

    }

    public static void main(String[] args) {
        
        int [] arr={002,345,567,405,304,506,709};
        radixsor1(arr);

        for(int i:arr){
            System.out.println(i);

        }


    }
    
}
