package homework_week_7;
/* 20.Write Java programto test if an array contains a specific value.
 */
public class Class20 {
    public static void main(String [] args){
    Class20 obj = new Class20();
    obj.myArray();
    }
    public void myArray() {

        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int toFind = 3;
        boolean found = false;
        for (int n : num) {
            if (n == toFind) {
                found = true;
                break;
            }
        }
        if (found){
        System.out.println(toFind + " is found.");
    }else{
            System.out.println(toFind + " is not found.");
        }
    }

}
