import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        /*Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println("The number you just entered is " + num);*/


        /*Scanner input = new Scanner(System.in);
        int[] num = new int[5];
        int total = 0;
        double avg = 0;
        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter a number: ");
            num[i] = input.nextInt();
        }
        System.out.println("The numbers are ");
        for (int j = 0; j < num.length; j++) {
            System.out.print(num[j] + "\t");
            total += num[j];
        }
        avg = total / num.length;
        System.out.println("\n\nThe total of the numbers is " + total);
        System.out.println("The average of the number is " + avg);*/


        Scanner input = new Scanner(System.in);
        System.out.print("How many entries of number? : ");
        int numEntry = input.nextInt();
        double[] num = new double[numEntry];
        double total = 0;
        int i, j;
        
        for(i = 0; i < num.length; i++){
            System.out.print("Enter numbers #" + (i+1) + ": ");
            num[i] = input.nextInt();
        }
        System.out.println("\nWhat operation to operate the number with?\n[1]Addition\t[2]Subtraction" +
                "\t[3]Multiplication\t[4]Division");
        int response = input.nextInt();
        if (response == 1){
            for (j = 0; j<num.length;j++){
                total+= num[j];
            }
        } else if (response == 2) {
            for (j = 0; j<num.length;j++){
                total-= num[j];
            }
        } else if (response == 3) {
            total = num[0];
            for (j = 1; j<num.length;j++){
                total*= num[j];
            }
        } else if (response == 4) {
            total = num[0];
            for (j = 1; j<num.length;j++){
                total= total / num[j];
            }
        } else {
            System.exit(0);
        }
        System.out.println("The result is "+total);
    }
}