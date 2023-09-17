//sort the given array such that all the zeroes are at end and remaining all will occur in same order.


public class bubblesortquestion {
    static int [] bubblesort1(int [] arr){
        int n=arr.length;

        for(int i=0;i<arr.length;i++){
            boolean frag=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]==0&&arr[j+1]!=0){
                    int tempo=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tempo;
                    frag=true;
                }
            }
            if(frag==false){
                
            }
        }



        return arr;
    }
    public static void main(String[] args){

        int [] arrr={2,3,4,5,0,0,0};
        // {0,5,3,2,1,0,7,9,0,0};
        bubblesort1(arrr);
        for(int i=0;i<arrr.length;i++){
            System.out.print(arrr[i]);
        }
    }
    
}
