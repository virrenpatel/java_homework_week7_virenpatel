package homework_week_7;
/* 3. Write a java program to input student Name, roll No, and three subjects Math, Science and
English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
Input, Marks should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 */
import java.util.Scanner;

public class Class3 {
    public static void main(String []args){
    Class3 obj = new Class3();
    obj.markSheet();
    }
    public void markSheet(){
        Scanner scanner = new Scanner(System.in);
        int maths,science,english,total;
        double percentage;
        String result = null;
        String grade = null;

        System.out.println("Enter Name        :");
        String name = scanner.nextLine();

        System.out.println("Enter Roll no        :");
        String rollnum = scanner.nextLine();

        System.out.println("Maths        :");
        maths = scanner.nextInt();

        System.out.println("Science        :");
        science = scanner.nextInt();

        System.out.println("English        :");
        english = scanner.nextInt();

        total = maths+science+english;
        int avg = total/3;
        System.out.println("Your marks are :" + total);
        System.out.println("Your Percentage is :" +avg);
        if (avg>=80){
            grade = "A+";
            System.out.println("Grade is:" +grade);
        }else if (avg>=60){
            grade = "A";
            System.out.println("Grade is:" +grade);
        }else if (avg>=50) {
            grade = "B";

            System.out.println("Grade is:" + grade);
        }else if (avg>=35) {
        grade = "C";
            System.out.println("Grade is:" + grade);
        }else if (avg>=35) {
            result = "Pass";
        }else {
            result = "Fail";
        }
        System.out.println("Result is  :  "+result);
        System.out.println("------------------------------------------------");
        System.out.println("|                                              |");
        System.out.println("|                   Mark Sheet                 |");
        System.out.println("|----------------------------------------------|");
        System.out.println("|    Name           :      "+name+        "    |");
        System.out.println("|    Roll no        :      "+rollnum+"         |");
        System.out.println("|----------------------------------------------|");
        System.out.println("|    Subjects       :                          |");
        System.out.println("|    Maths          :      "+maths+"           |");
        System.out.println("|    Science        :      "+science+"         |");
        System.out.println("|    English        :      "+english+"         |");
        System.out.println("|----------------------------------------------|");
        System.out.println("|    Total          :      "+total+"           |");
        System.out.println("|----------------------------------------------|");
        System.out.println("|    Percentage     :      "+avg+"             |");
        System.out.println("|    Result         :      "+result+"          |");
        System.out.println("|    Grade          :      "+grade+"           |");
        System.out.println("|----------------------------------------------|");
        scanner.close();
    }
}
