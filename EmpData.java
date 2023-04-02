package Sem4;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class EmpData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            File f1 = new File("EmployeeData.csv");
            if (f1.createNewFile()) {
                System.out.println("File created: " + f1.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }

        System.out.println("Main menu");
        System.out.println("1. Add an employee");
        System.out.println("2. Display all employee");
        System.out.println("3. Write all employees to file");
        System.out.println("4. Read all employees from file");
        System.out.println("5. Display with EID");
        System.out.println("6. Exit");

        System.out.println("\nEnter the option to perform : ");
        int ch = input.nextInt();


        while(ch != 6) {
            switch(ch) {
                case 1:
                    System.out.println("Enter name : ");
                    input.nextLine();
                    String name = input.nextLine();
                    System.out.println("Enter Employee ID : ");
                    String id = input.nextLine();
                    System.out.println("Enter Designation : ");
                    String des = input.nextLine();
                    System.out.println("Enter Salary : ");
                    int sal = input.nextInt();


                    try {
                        FileWriter writer = new FileWriter("EmployeeData.csv", true);
                        writer.write("," + id + "," + name + "," + des + "," + sal);
                        writer.close();
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                    }
                    break;

                case 2:
                    try {
                        Scanner sc = new Scanner(new File("EmployeeData.csv"));
                        sc.useDelimiter(",");
                        System.out.println("----- Employee Data ------");
                        System.out.println("\nEmployee ID \t\t Name \t Designation \t Salary");
                        while(sc.hasNext()) {
                            for(int i=0; i<4; i++) {
                                System.out.print(sc.next() + " \t\t\t");
                            }
                            System.out.println();
                        }
                        sc.close();
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                    }
                    break;

                case 3:
                    System.out.println("Employee data Saved to File Successfully...!!!\n");
                    break;

                case 4:
                    try {
                        Scanner sc = new Scanner(new File("EmployeeData.csv"));
                        sc.useDelimiter(",");
                        System.out.println("Reading from file : ");
                        while(sc.hasNext()) {
                            System.out.println("Employee [EID = " + sc.next() + ", Name = " + sc.next() + ", Designation = " + sc.next() + ", Salary = " + sc.next() + " ]");
                        }
                        sc.close();
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                    }
                    break;

                case 5:
                    System.out.println("Enter EID : ");
                    input.nextLine();
                    String Id = input.nextLine();
                    try {
                        Scanner sc = new Scanner(new File("EmployeeData.csv"));
                        sc.useDelimiter(",");

                        while(sc.hasNext()) {
                            if( ( sc.next() ).equals(Id)) {
                                System.out.println("Employee [Name = " + sc.next() + ", Designation = " + sc.next() + ", Salary = " + sc.next() + " ]");
                            }
                            else{
                                sc.next();
                            }
                        }
                        sc.close();
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                    }
                    break;


                default:
                    System.out.println("Enter a valid option!!");
                    break;
            }

            System.out.println("\nEnter the option to perform : ");
            ch = input.nextInt();
        }
        System.out.println("----- Thanks for using our services -----");
    }

}
