package homework_week_7;

import java.util.Scanner;

public class Class8 {
    public static void main(String[] args){
    myCityName();

    }
    public static void myCityName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Alphabet: ");
        char city = scanner.next().charAt(0);// Reads first alphabet

        if (city == 'a' || city == 'A') {
            System.out.println("Ahmedabad");
        } else if (city == 'b' || city == 'B') {
            System.out.println("Bangalore");

        } else if (city == 'c' || city == 'C') {
            System.out.println("Chandigarh");
        } else if (city == 'd' || city == 'D') {
            System.out.println("Delhi");
        } else if (city == 'e' || city == 'E') {
            System.out.println("Egypt");
        } else if (city == 'f' || city == 'F') {
            System.out.println("France");
        } else {
            System.out.println("Invalid Entry");
        }
        scanner.close();
    }
    }


