package homework_week_7;
/* 9. Input any alphabet from "A" to "F" and print their city name accordingly with use of Switch statment.
if any other alphabet should be invalid entry.
 */
import java.util.Scanner;

public class Class9 {
    public static void main(String[] args) {
        myCityName();
    }
    public static void myCityName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter String Name ");
        String input = scanner.next();
        switch (input) {
            case "a":
            case "A":
                System.out.println("Ahmedabad");
                break;
            case "b":
            case "B":
                System.out.println("Bangalore");
                break;
            case "c":
            case "C":
                System.out.println("Chennai");
                break;
            case "d":
            case "D":
                System.out.println("Delhi");
                break;
            case "e":
            case "E":
                System.out.println("Edinburgh");
                break;
            case "f":
            case "F":
                System.out.println("Faring don");
                break;

            default:
                System.out.println("Invalid Entry");
            scanner.close();
        }
    }
}


