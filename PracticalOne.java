import java.util.Scanner;

class PracticalOne {
    public static void main(String args[]){
        System.out.print("Enter Number Of Eggs: ");

        Scanner sc = new Scanner(System.in);
        int eggs = sc.nextInt();

        int gross = eggs / 144;

        int A = eggs % 144;

        int dozen = A / 12;

        int leftEggs = A % 12;

        System.out.print("Your number of eggs is " + gross + " gross " + dozen + " dozen " + " and " + leftEggs);
    }
}