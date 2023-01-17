import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number. ");
        int number = scan.nextInt();
        int total =0;

        for (int i = 1; i <number ; i++) {
            if (number % i == 0) {
                total =total+i ;
            }

        }
        if(total == number){
            System.out.println("it is perfect number ! ");
        }else{
            System.out.println("Im sorry.This number is not perfect. ");
        }

    }
}