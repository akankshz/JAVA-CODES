import java.util.Scanner;

public class numberOfOccurences {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("finding number of occurences");
        int[] numArr = ArrayUtility.inputArray();
        System.out.print("enter the number you want to find: ");
        int num = input.nextInt();
        int occurences = noOfOccurences(numArr,num);
        System.out.println("Your element was found "+occurences+" times in the array");
    }
    public static int noOfOccurences(int[] numArr, int num){
        int occ = 0;
        int i = 0;
        while(i<numArr.length){
            if(numArr[i] == num){
                occ++;
            }
            i++;
        }
        return occ;
    }
}
