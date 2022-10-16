package homework_week_7;
/* 4. Number of Days In Month
Write a method isLeapYear with a parameter of type int named year.
The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
If the parameter is not in that range return false.
Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
otherwise return false.
 */
import java.util.Scanner;

public class Class4 {
    public static void main(String[] args) {
    isLeapYear(2000);
    getDayInMonth(3,2020);
    }
    public static void isLeapYear(int year) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Year: ");
        year = scanner.nextInt();
        boolean isLeap = false;
        if (year >= 1 && year <= 9999 && year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            } else
                isLeap = true;
        } else {
            isLeap = false;
        }

        if (isLeap == true)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");

    }
    public static int getDayInMonth(int month, int year) {
        Scanner scanner = new Scanner(System.in);

        int number_of_DaysInMonth = 0;
        String MonthOfName = "Unknown";

        System.out.println("Input a month number:");
        month = scanner.nextInt();

        System.out.println("Input a year:");
        year = scanner.nextInt();

        switch (month) {
            case 1:
                MonthOfName = "January";
                number_of_DaysInMonth = 31;
                break;
            case 2:
                MonthOfName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    number_of_DaysInMonth = 29;
                } else {
                    number_of_DaysInMonth = 28;
                }
                break;
            case 3:
                MonthOfName = "March";
                number_of_DaysInMonth = 31;
                break;
            case 4:
                MonthOfName = "April";
                number_of_DaysInMonth = 30;
                break;
            case 5:
                MonthOfName = "May";
                number_of_DaysInMonth = 31;
                break;
            case 6:
                MonthOfName = "June";
                number_of_DaysInMonth = 30;
                break;
            case 7:
                MonthOfName = "July";
                number_of_DaysInMonth = 31;
                break;
            case 8:
                MonthOfName = "August";
                number_of_DaysInMonth = 31;
                break;
            case 9:
                MonthOfName = "September";
                number_of_DaysInMonth = 30;
                break;
            case 10:
                MonthOfName = "October";
                number_of_DaysInMonth = 31;
                break;
            case 11:
                MonthOfName = "November";
                number_of_DaysInMonth = 30;
                break;
            case 12:
                MonthOfName = "December";
                number_of_DaysInMonth = 31;
                break;
        }
        System.out.println(MonthOfName + " " + year + " has " + number_of_DaysInMonth + " days\n");
        return number_of_DaysInMonth;

    }
   }


