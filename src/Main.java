// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      int[] arr = {23, 6,0, 7, 12, 3, 9, 99, 11, 50};
      int ans = linearSearch(arr, 100);
        System.out.println(ans);

      System.out.println(linearSearch("Muskan",'l'));
    }
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        int i;
        for( i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
      return -1;
    }

    //Search in a string
    static boolean linearSearch(String str, char target){
        if(str.isEmpty()){
            return false;
        }
        for(char ch: str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
}