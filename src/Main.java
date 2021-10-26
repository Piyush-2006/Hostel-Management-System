import java.util.ArrayList;
import java.util.Scanner;

//*************************  Main Method **************************** */

public class Main {

    public static ArrayList<Student> boy;
    public static ArrayList<Student> girl;
    
    public static void main(String[] args) {

        boy =  new ArrayList<Student>();
        girl = new ArrayList<Student>();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter YOur Name: ");
        String name = input.next();
        System.out.println("Welcome, "+name);
        menu();
        

    }

    // ************************* Main Menubar of Management System ****************************
    

    public static void menu() {

        Scanner input = new Scanner(System.in);
        System.out.println("\t\t\t\t\tWelcome To Hostel Management System");
        System.out.println("\t\t\t\t\t------------------------------------");
        System.out.println("1. Registration");
        System.out.println("2. Food Circle");
        System.out.println("3. Emergency Doctor Services");
        System.out.println("4. Safety");
        System.out.println("5. Registered Members List");

        System.out.print("\nEnter the number of your choice: ");

        int choice = input.nextInt();
        input.nextLine();
        
        // ************************* Main Menubar selecing by user of Management System ****************************


        if (choice == 1) {
            registration();

        }

        else if (choice == 2) {
            foodCircle();

            if(goBack())
                    menu();

        }

else if (choice == 3) {

            emergencyDoctorServices();

            if(goBack())
                    menu();
        }

        else if (choice == 4) {
            
            securityPanel();

            if(goBack())
                    menu();

        }

        else if (choice == 5) {

            System.out.print("1. Boys Registured List\n");
            System.out.print("2. Girls Registured List\n");
            System.out.print("Enter the number of your choice: ");

