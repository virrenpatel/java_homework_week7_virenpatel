package homework_week_7;
/* 16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
“ZERO”.
 */
import java.util.Scanner;

public class Class16 {
    public static void main(String [] args){
        Class16 obj = new Class16();
        obj.myNumberCheck();
}
    public void myNumberCheck(){
    int num;
    //Scanner class to read value
    Scanner scanner=new Scanner(System.in);
        System.out.print("Enter any integer number: ");
        num=scanner.nextInt();
        //check condition for +ve, -ve and Zero
        if(num>0)
        System.out.println(num + " is POSITIVE NUMBER.");
        else if(num<0)
        System.out.println(num + " is NEGATIVE NUMBER.");
        else
        System.out.println("IT's ZERO.");
        scanner.close();
        }
        }
