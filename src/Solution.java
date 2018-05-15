import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        String input;
        int length;

        Scanner scan = new Scanner(System.in);

        System.out.println("How many number do you want to add to the array? (2 - 10) ");
        length = scan.nextInt();
        scan.nextLine();

        int[] ar = new int[length];
        //add numbers to the array
        for (int i= 0; i < ar.length; i++) {
            System.out.println("Insert a number: ");
            ar[i] = scan.nextInt();
            scan.nextLine();
        }
        System.out.println("Sum: " + simpleArraySum(ar));

    }

    public static int simpleArraySum(int[] ar) {

        int sum = ar[0];

        for(int i = 0; i < ar.length-1; i++){
            sum = ar[i+1] + sum;
        }
        return sum;
    }
}
