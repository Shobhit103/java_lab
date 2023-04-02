package Sem4;
import java.util.*;

class Video {
    String videoName;
    Boolean checkout = false;
    int rating;
    Scanner input = new Scanner(System.in);

    void getName() {
        System.out.println("Enter the name of the video : ");
        videoName = input.nextLine();
    }
    void doCheckout() {checkout = true;}
    void doReturn() {checkout = false;}
    void receiveRating(int rate) {rating = rate;}
    int getRating() {return rating;}
}


class VideoStore {
    static Video[] store = new Video[10];
    static Scanner input = new Scanner(System.in);
    static int i=-1;


    static void addVideo() {
        store[++i] = new Video();
        store[i].getName();
    }

    static void doCheckout() {
        input.nextLine();
        System.out.println("Enter the name of the Video");
        String Name = input.nextLine();

        for (int j = 0; j <= i; j++) {
            if (store[j].videoName.equals(Name) && store[j].checkout == false) {
                store[j].doCheckout();
                System.out.println(Name + " checked out successfully");
                break;
            } else {
                System.out.println(Name + " not available in the store");
            }
        }
    }

    static void doReturn() {
        input.nextLine();
        System.out.println("Enter the name of the Video");
        String Name = input.nextLine();
        for (int j = 0; j <= i; j++) {
            if (store[j].videoName.equals(Name) && store[j].checkout == true) {
                store[j].doReturn();
                System.out.println(Name + " returned, Visit us again");
            } else {
                System.out.println(Name + " already available in the store");
            }
        }
    }

    static void receiveRating() {
        input.nextLine();
        System.out.println("Enter the name of the Video");
        String Name = input.nextLine();
        System.out.println("Enter the rating of the Video");
        int Rate = input.nextInt();
        int check=0;

        for (int j = 0; j <= i; j++) {
            if ( (store[j].videoName).equals(Name) ) {
                store[j].rating = Rate;
                System.out.println(Name + " rated successfully");
                check=1;
                break;
            }
        }

        if(check==0) {System.out.println(Name + " doesn't exists in the store");}
    }

    static void listInventory() {
        System.out.println("Name\t\t\tAvailability\t\t\tRating");
        for(int j=0; j<=i; j++) {
            System.out.println("\n" + store[j].videoName + "\t\t\t" + !store[j].checkout + "\t\t\t" + store[j].rating);
        }
    }


}

public class VideoRentalStore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\t\t---------- VIDEO RENTAL STORE -----------");
        System.out.println("\n\n\tMAIN MENU");
        System.out.println("1. Add Video");
        System.out.println("2. Do Checkout");
        System.out.println("3. Return Video");
        System.out.println("4. Rate the Video");
        System.out.println("5. List Inventory");
        System.out.println("6. Exit");

        System.out.println("\n\nEnter option to perform : ");
        int ch = input.nextInt();

        while(ch!=6){
            switch (ch) {
                case 1:
                    VideoStore.addVideo();
                    break;
                case 2:
                    VideoStore.doCheckout();
                    break;
                case 3:
                    VideoStore.doReturn();
                    break;
                case 4:
                    VideoStore.receiveRating();
                    break;
                case 5:
                    VideoStore.listInventory();
                    break;
                case 6:
                    System.out.println("Thanks for visiting us");
                    break;
                default:
                    System.out.println("Enter the valid option to perform!!!");
            }

            System.out.println("\nEnter option to perform : ");
            ch = input.nextInt();

        }
    }
}
