import java.util.Scanner;

public class Age {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int Byear;
        System.out.println("What is your birth year?: ");
        Byear = scanner.nextInt();

        int age = 2018 - Byear;

        System.out.println("Your age is:" +age);
    }
}