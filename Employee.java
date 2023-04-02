package Sem4;
import java.util.*;

public class Employee {
    public static void main(String[] args) {


        int[] empNO = {1004, 1007, 1011, 1036, 1016, 1006, 1111};
        String[] empName = {"Jatin_Saini", "Divyansh", "Jatin_Kumar", "Shobhit", "Yash", "Narayan", "Mahadev"};
        String[] empDes = {};
        String[]  depName ={"Engineering", "Accountant" ,"Clerk", "FrontDesk", "R&D", "Manufacturing", "PM" };
        String[] datejoin = {"24/03/2003", "10/08/2010", "10/08/2003", "25/03/2003", "16/09/2005", "1/1/2000", "12/06/2006"};
        int[] basic = {50000,10000,90000,45000,20000,23000,30000};
        int[] hra = {4000, 5000, 6000, 4500, 2000, 3000, 6000};
        int[] it = {3000, 2000, 4000, 1000, 1500, 1000, 2000};
        char[] DesCodes= {'e', 'r', 'k', 'r', 'c', 'm', 'c'};
        int[] DA = {2000,3000,2500,1500,2000,4000,5000};

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the emp no:");
        int input_emp_no = input.nextInt();
        int check =0;
        for (int i = 0; i < empNO.length; i++) {
            if(input_emp_no == empNO[i]){
                System.out.println("EmpName\t\tdepName\t\tdateJoin\t\tbasic\t\thra\t\tit\t\tDescode\t\tSalary");
                System.out.println(empName[i] + "\t\t" + depName[i] + "\t\t" + datejoin[i] + "\t\t" + basic[i] + "\t\t" + hra[i] + "\t\t" + it[i] + "\t\t" + DesCodes[i] + "\t\t" + (basic[i] + hra[i] + DA[i] - it[i]));
                check=1;
                break;
            }
        }
        if(check==0){
            System.out.println("!!!No Employee found with this employee id !!!");
        }

        System.out.println("\n\n\n");

        char input_descode;
        System.out.println("Enter the designation code: ");
        input_descode = input.next().charAt(0);

        switch (input_descode) {
            case 'e':
                System.out.println("Designation : Engineer");
                System.out.println("DA : 1000");
                break;

            case 'c':
                System.out.println("Designation : Consultant");
                System.out.println("DA : 2000");
                break;
            case 'k' :
                System.out.println("Designation : clerk");
                System.out.println("DA : 1000");
                break;
            case 'r' :
                System.out.println("Designation : Receptionist");
                System.out.println("DA : 3000");
                break;
            case 'm':
                System.out.println("Designation : Manager");
                System.out.println("DA : 6000");
                break;
            default:
                System.out.println("invalid designation code");
                break;
        }
    }
}
