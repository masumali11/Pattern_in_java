public class Binaryseach {
    public static int Binaryseach( int[] arr,int ele) {
        int s=0;
        int e=arr.length-1;
        while (s<=e){
            int mid=(s+e)/2;
            if (arr[mid]>ele) {
                e=mid-1;
            }else if (arr[mid]<ele){
                e=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,4,7,10,20,35,40};
        int index=Binaryseach(arr,7);
        System.out.println("index is"+index);
    }
}
