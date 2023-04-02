package Sem4;
import java.util.*;

abstract class Account {
    double interestRate, amount;
    abstract double calculateInterest(double interestRate);
}

class FDaccount extends Account {
    int days, age;
    FDaccount(double am, int d, int a) {
        amount = am;
        days = d;
        age = a;
    }

    double calculateInterest(double interestRate) {
        return (amount * (interestRate/100) );
    }
}


class RDaccount extends Account {
    int age;
    double months;
    RDaccount(double am, int d, int a) {
        amount = am;
        months = d;
        age = a;
    }

    double calculateInterest(double interestRate) {
        double mon = (months*(months+1))/24 ;
        double interest = amount * mon * (interestRate/100) ;
        return interest;
    }
}

class SBaccount extends Account {
    SBaccount(double am) {
        amount = am;
    }

    double calculateInterest(double interestRate) {
        return (amount * (interestRate/100) );
    }
}




public class Interest {
    public static void main(String[] args) {
        int d,a;
        double am;

        Scanner input = new Scanner(System.in);

        System.out.println("Main Menu");
        System.out.println("\n1. Interest Calculator - SB");
        System.out.println("2. Interest Calculator - FD");
        System.out.println("3. Interest Calculator - RD");
        System.out.println("4. Exit");

        System.out.println("\nEnter your choice : ");
        int ch = input.nextInt();

        while(ch != 4) {
            switch (ch) {

                case 1:
                    System.out.println("Types of Accounts");
                    System.out.println("1. Normal");
                    System.out.println("2. NRI");
                    System.out.println("\nEnter the type of account : ");
                    int c = input.nextInt();

                    System.out.println("Enter the SB amount : ");
                    am = input.nextDouble();
                    SBaccount scc = new SBaccount(am);

                    switch (c) {
                        case 1:
                            System.out.println("Interest gained is : " + scc.calculateInterest(4));
                            break;
                        case 2:
                            System.out.println("Interest gained is : " + scc.calculateInterest(6));
                            break;
                        default:
                            System.out.println("Enter a valid account type!!!");
                    }
                    break;

                case 2:
                    System.out.println("Enter the FD amount : ");
                    am = input.nextDouble();
                    System.out.println("Enter the number of days : ");
                    d = input.nextInt();
                    System.out.println("Enter your age : ");
                    a = input.nextInt();

                    FDaccount acc = new FDaccount(am,d,a);

                    if(am < 10000000) {
                        if(a < 60) {
                            if(d>=7 && d<=14) acc.interestRate = 4.50;
                            else if(d>=15 && d<=29) acc.interestRate = 4.75;
                            else if(d>=30 && d<=44) acc.interestRate = 5.50;
                            else if(d>=44 && d<=60) acc.interestRate = 7.00;
                            else if(d>=61 && d<=184) acc.interestRate = 7.50;
                            else if(d>=185 && d<=365) acc.interestRate = 8.00;
                        }
                        else {
                            if(d>=7 && d<=14) acc.interestRate = 5.00;
                            else if(d>=15 && d<=29) acc.interestRate = 5.25;
                            else if(d>=30 && d<=44) acc.interestRate = 6.00;
                            else if(d>=44 && d<=60) acc.interestRate = 7.50;
                            else if(d>=61 && d<=184) acc.interestRate = 8.00;
                            else if(d>=185 && d<=365) acc.interestRate = 8.50;
                        }
                    }
                    else {
                        if(d>=7 && d<=14) acc.interestRate = 6.50;
                        else if(d>=15 && d<=29) acc.interestRate = 6.75;
                        else if(d>=30 && d<=44) acc.interestRate = 6.75;
                        else if(d>=44 && d<=60) acc.interestRate = 8.00;
                        else if(d>=61 && d<=184) acc.interestRate = 8.50;
                        else if(d>=185 && d<=365) acc.interestRate = 10.00;
                    }

                    System.out.println("Interest gained is : " + acc.calculateInterest(acc.interestRate));
                    break;


                case 3:
                    System.out.println("Enter the RD amount : ");
                    am = input.nextDouble();
                    System.out.println("Enter the number of months : ");
                    d = input.nextInt();
                    System.out.println("Enter your age : ");
                    a = input.nextInt();

                    RDaccount rcc = new RDaccount(am,d,a);

                    if(a < 60) {
                        if(d>=1 && d<=6) rcc.interestRate = 7.50;
                        else if(d>=7 && d<=9) rcc.interestRate = 7.75;
                        else if(d>=10 && d<=12) rcc.interestRate = 8.00;
                        else if(d>=13 && d<=15) rcc.interestRate = 8.25;
                        else if(d>=16 && d<=18) rcc.interestRate = 8.50;
                        else if(d>=19 && d<=21) rcc.interestRate = 8.75;
                    }
                    else {
                        if(d>=1 && d<=6) rcc.interestRate = 8.00;
                        else if(d>=7 && d<=9) rcc.interestRate = 8.25;
                        else if(d>=10 && d<=12) rcc.interestRate = 8.50;
                        else if(d>=13 && d<=15) rcc.interestRate = 8.75;
                        else if(d>=16 && d<=18) rcc.interestRate = 9.00;
                        else if(d>=19 && d<=21) rcc.interestRate = 9.25;
                    }

                    System.out.println("Interest gained is : " + rcc.calculateInterest(rcc.interestRate));
                    break;

                default:
                    System.out.println("Enter a valid option to perform!!!");
                    break;
            }

            System.out.println("\nEnter your choice : ");
            ch = input.nextInt();
        }

        System.out.println("------ Thanks for using our services ------");
    }
}
