import java.util.Scanner;

public class SumNum {
    public static void main(String[] args){
        int a,b,c;
        int sum;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter number 1: ");
        a = keyboard.nextInt();
        Scanner keyboard1 = new Scanner(System.in);
        System.out.print("Please enter number 2: ");
        b = keyboard1.nextInt();
        Scanner keyboard2 = new Scanner(System.in);
        System.out.print("Please enter number 3: ");
        c = keyboard2.nextInt();
        sum = a + b + c;
        System.out.println("Our sum is " + sum);
    }
}
