import java.util.Arrays;

public class SearchIN2DArray {
    public static void main(String[] args) {
        int[][] arr = {{23, 4, 1},
                       {18, 12, 3, 9},
                       {78, 99, 34, 56},
                       {18,9}
                      };
        int target = 9;
        int[] ans = searchIn2D(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchIn2D(int[][] arr, int target){
        int row, col;
        for( row=0; row<arr.length; row++){
            for(col=0; col<arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
