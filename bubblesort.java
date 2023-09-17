public class bubblesort {

    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }

    static void bubblesorts(int []arr){

        int n=arr.length;
        for(int i=0;i<n-1;i++){
            boolean flag=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    // swap(arr[j+1], arr[j]);
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if(flag==false){
                return;
            }
        }


        // return arr;

    }
    static int[] printArray(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);

        }
        return arr;
    }
    public static void main(String[] args) {
        // System.out.println("shiva");
        int []arr={2,1,3,4,5};

        bubblesorts(arr);
        printArray(arr);

        


    }
    
}
