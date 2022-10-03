import java.util.Scanner;

class PracticalThree {
    public static void main(String[] args){
        double tax = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Category: ");
        String category = scanner.nextLine();
        
        System.out.print("Enter Your Income: ");
        int income = scanner.nextInt();

        if(category.equals("General")){
            if(income <= 180000){
                System.out.println("Tax : " + tax);
                return;
            } else if(income <= 500000){
                tax = 180000 * 0 + (income - 180000) * 0.10;
                System.out.println("Tax : " + tax);
            } else if(income <= 800000){
                tax = 180000 * 0 + 500000 * 0.10 + (income - 500000) * 0.20;
            } else {
                tax = 180000 * 0 + 500000 * 0.10 + 800000 * 0.20 + (income - 800000) * 0.30;
        }
    } else if(category.equals("Women")){
            if(income <= 190000){
                System.out.println("Tax : " + tax);
                return;
            } else if(income <= 500000){
                tax = 180000 * 0 + (income - 180000) * 0.10;
                System.out.println("Tax : " + tax);
            } else if(income <= 800000){
                tax = 180000 * 0 + 500000 * 0.10 + (income - 500000) * 0.20;
            } else {
                tax = 180000 * 0 + 500000 * 0.10 + 800000 * 0.20 + (income - 800000) * 0.30;
        }
    }
}
} 