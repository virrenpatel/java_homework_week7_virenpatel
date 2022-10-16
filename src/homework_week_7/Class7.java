package homework_week_7;
/* 7.Write a java program input sales id, seller's name, sales amount, and salary basic and
then fined this sales
Commission
 Sales amount >= 50,000 35%
 Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%
 */
import java.util.Scanner;
public class Class7 {
    public static void main(String [] args){
        Class7 obj = new Class7();
        obj.unit();
        obj.calc();
        obj.display();
    }
    int salesId;
    String name;
    float salesAmount, salary, salesCommission;
    public void Commission()
    {
        salesId=0;
        name = "";
        salary = 0.0f;
        salesAmount = 0.0f;
        salesCommission = 0.0f;
    }
    public void unit()
    {
        Scanner unit=new Scanner(System.in);
        System.out.print("Enter Sales ID=");
        salesId = unit.nextInt();
        System.out.print("Enter Seller's Name=");
        name = unit.next();
        System.out.print("Enter Salary Basic=");
        salary = unit.nextFloat();
        System.out.print("Enter Sales Amount=");
        salesAmount = unit.nextFloat();
    }
   public void calc()
    {
        if (salesAmount >= 50000) {
            salesCommission = (salary * 35) / 100;
        } else if (salesAmount >= 30000) {
            salesCommission = (salary * 20) / 100;
        } else if (salesAmount >= 20000) {
            salesCommission = (salary * 10) / 100;
        } else if (salesAmount >= 10000) {
            salesCommission = (salary * 5) / 100;
        } else if (salesAmount < 10000) {
            salesCommission = (salary * 2) / 100;
        }
    }
    public void display()
    {
        System.out.println("Sales Commission: "+salesCommission+"\n");
    }
    }

