public class reverseArray {
    static void main(String[] args) {
        System.out.println("Welcome to Reversing an Array");
        int [] numArr = ArrayUtility.inputArray();
        reverse(numArr);
        System.out.println("Reversed Array is: ");
        ArrayUtility.displayArray(numArr);
    }
    public static void reverse(int[] arr){
        int i = 0;
        while(i< arr.length/2){
            int swap = arr[i];
            arr[i] = arr[(arr.length - 1)-i];
            arr[(arr.length - 1)-i] = swap;
            i++;
        }
    }
}
