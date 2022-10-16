package homework_week_7;
/* 1. Write a java program that tells us that Input number is odd or even?
 HINT: use ternary operator (? :)
 */
import java.util.Scanner;

public class Class1 {
public static void main(String [] args){
    Class1 obj = new Class1();
    obj.myEvenOdd();
}
public void  myEvenOdd(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = scanner.nextInt();
    String evenOdd = (num % 2 == 0) ? "even" : "odd";
    System.out.println(num + "  is  " + evenOdd);
    scanner.close();
}
}
