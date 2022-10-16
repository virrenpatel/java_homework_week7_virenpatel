package homework_week_7;
/* 5.WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
salary
 HRA = basic salary 10%
 DA = Basic salary 8%
 TA = Basic salary 9%
 PF= Basic salary 20%
 Gross salary = basic salary + HRA + TA + DA –PF
Print in following format
_______________________________
| Salary Slip |
|______________________________|
| Employee Id : 2564 |
| Employee Name : Jay |
|______________________________|
| Basic Salary : 25000.0 |
| HRA 10% : 2500.0 |
| TA 8% : 2250.0 |
| DA 9% : 2000.0 |
| PF - 20& : 5000.0 |
|______________________________|
| Gross Salary : 26750.0 |
|===========================
 */
import java.util.Scanner;

public class Class5 {
    public static void main(String [] args){
        Class5 obj = new Class5();
        obj.unit();
        obj.calc();
        obj.display();
    }
    int empno;
    String name;
    float salary, hra, ta, da, pf, gp;
    public void Employee()
    {
        empno=0;
        name = "";
        salary = 0.0f;
        hra = 0.0f;
        ta = 0.0f;
        da = 0.0f;
        pf = 0.0f;
        gp = 0.0f;
    }
    public void unit()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Employee ID=");
        empno = sc.nextInt();
        System.out.print("Enter Employee Name=");
        name = sc.next();
        System.out.print("Enter Salary=");
        salary = sc.nextFloat();
    }
    public void calc()
    {
        hra = (salary * 10 ) / 100;
        ta = (salary * 8) / 100;
        da = (salary * 9 ) / 100;
        pf = (salary * 20) / 100;
        gp = salary + hra + ta + da - pf ;

    }
    public void display()
    {
        System.out.println("-----------------------------------------");
        System.out.println("            Salary Slip\n              ");
        System.out.println("----------------------------------------\n");
        System.out.println("Employee ID             : "+empno+"\n");
        System.out.println("Name                    : "+name+"\n");
        System.out.println("----------------------------------------\n");
        System.out.println("Basic Salary            : "+salary+"\n");
        System.out.println("HRA (10%)               : "+hra+"\n");
        System.out.println("TA (9%)                 : "+ta+"\n");
        System.out.println("DA (8%)                 : "+da+"\n");
        System.out.println("PF (20%)                : "+pf+"\n");
        System.out.println("----------------------------------------\n");
        System.out.println("Grass Salary            : "+gp+"\n");

    }
    }


