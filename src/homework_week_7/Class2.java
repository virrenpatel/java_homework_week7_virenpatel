package homework_week_7;
/* 2. Write a java program to input any year like (ex.2007) and find out if it is leap year or
not?
 */
import java.util.Scanner;

public class Class2 {
    public static void main(String [] args){
        Class2 obj = new Class2();
        obj.myLeapYear();

    }
    public void myLeapYear(){
        Scanner leapyear = new Scanner(System.in);
        System.out.println("Input the year: ");
        int year = leapyear.nextInt();
        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && ( year % 400 == 0));
        if (x && (y || z))
        {
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + "is not leap year");
        }
        leapyear.close();
    }
}
