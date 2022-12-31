import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Hello Youssef Mohammed This program to add two Numbers");
        System.out.println("enter a number n1: ");
        int n1=input.nextInt();
        System.out.println("enter a number n2: ");
        int n2= input.nextInt();
        System.out.println("Result ="+ (n1+n2));
    }
}