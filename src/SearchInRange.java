public class SearchInRange {
    public static void main(String[] args) {
       int arr[] = {23, 6, -4, 0,-2,34};
        System.out.println(linearSearch(arr, 34, 3,6));
    }
    static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        int i;
        for( i=start; i<end; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
