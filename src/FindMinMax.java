public class FindMinMax {
    public static void main(String[] args) {
        int arr[] = {2, 4,1,-2,6,9,45,-32,0,6,1,-1};
        System.out.println(findMin(arr));
    }
    static int findMin(int[] arr){
        int i, min = arr[0];
        for(i=0; i<arr.length; i++){
            if(min>arr[i]){        // (min<arr[i] ) to get the max element in array
                int temp = min;
                min = arr[i];
                arr[i] = temp;
            }
        }
        return min;
    }
}
