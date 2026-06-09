import java.util.Scanner;

public class DeleteFromArray {
    static void main(String[] args) {
        System.out.println("Welcome to Array Deletion");
        Scanner input = new Scanner(System.in);
        int[] numArr = ArrayUtility.inputArray();
        System.out.print("enter the element to be deleted: ");
        int numToDelete = input.nextInt();
        int[] newArr = deleteNumber(numArr,numToDelete);
        System.out.println("Updated Array: ");
        ArrayUtility.displayArray(newArr);
    }
    public static int[] deleteNumber(int[] numArr, int numToDelete){
        int occ = numberOfOccurences.noOfOccurences(numArr,numToDelete);
        int newSize = numArr.length - occ;
        if(occ == 0){
            return numArr;
        }
        int[] newArr = new int[newSize];
        int i =0, j=0;
        while(i<numArr.length){
            if(numArr[i] != numToDelete){
                newArr[j] = numArr[i];
                j++;
            }
            i++;
        }
        return newArr;
    }
}
