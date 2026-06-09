public class arrayChallenge {
    static void main(String[] args) {
        System.out.println("welcome to array sum and average!");
        int[] numArray = ArrayUtility.inputArray();
        long sum = sum(numArray);
        double avg = avg(numArray);
        System.out.println("sum of the numbers is: " + sum);
        System.out.println("average of the numbers is: " + avg);
    }
    public static long sum(int[] numArray){
        long sum = 0;
        int i = 0;
        while(i<numArray.length){
            sum += numArray[i];
            i++;
        }
        return sum;
    }
    public static double avg(int[] numArray){
        double sum = sum(numArray);
        return(sum/numArray.length);
    }
}
