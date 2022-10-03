import java.util.Scanner;

class PracticalTwo {
    public static void main(String args[]){
        System.out.print("Enter Number One: ");
        Scanner numOneInput = new Scanner(System.in);

        int numOne = numOneInput.nextInt();

        System.out.print("Enter Number Two: ");
        Scanner numTwoInput = new Scanner(System.in);

        int numTwo = numTwoInput.nextInt();

        numOne = numOne + numTwo;
        numTwo = numOne - numTwo;
        numOne = numOne - numTwo;

        System.out.println("Number One: " + numOne);
        System.out.print("Number Two: " + numTwo);
    }
}