public class EvenDigits {

    //program to count the evenDigit no. present in an array
    public static void main(String[] args) {
        int arr[] = {34, 5430, 1, 4567, 87, 0, 50};
        System.out.println("The no. of evendigit numbers are: "+evenDigit(arr));
    }

    static int evenDigit(int[] arr){
        int c=0;
        for(int i=0; i< arr.length; i++){
            String s = Integer.toString(arr[i]);
            if(s.length()%2 == 0){
                c+=1;
            }
        }
        return c;
    }
}
