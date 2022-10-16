package homework_week_7;
/* 6. Write a java program to input any number and find out if it’s odd or even
 */
import java.util.Scanner;

public class Class6 {
    public static void main(String [] args){
        Class6 obj = new Class6();
        obj.myEvenOdd();
    }
    public void myEvenOdd() {
        Scanner evenOdd = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = evenOdd.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        }else{
            System.out.println(num + " is odd");
        }
    }
}
