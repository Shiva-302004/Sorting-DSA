public class binarysearch3d {

    static boolean binarysearch3d1(int [][] arr,int target){
        int n=arr.length;
        int m=arr[0].length;
        int st=0;
        int end=(n*m)-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            int midele=arr[mid/m][mid%m];
            if(target==midele) return true;
            if(target<midele){
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }


        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(binarysearch3d1(matrix,3));
        
    }
    
}
