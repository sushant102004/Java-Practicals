import java.util.Scanner;

class PracticalThree {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Category: ");
        String category = sc.nextLine();

        System.out.print("Enter Total Income: ");
        int income = sc.nextInt();

        System.out.println(category);
        // if(category == "GENERAL"){
        //     if(income < 180000){
        //         tax = 0;
        //         System.out.print("Tax: " + tax);
        //         return;
        //     } else if(income <= 500000){
        //         tax = 180000 * 0 + (income - 180000) * 0.10;
        //         System.out.print("Tax: " + tax);
        //         return;
        //     }
        // }
        
    }
}