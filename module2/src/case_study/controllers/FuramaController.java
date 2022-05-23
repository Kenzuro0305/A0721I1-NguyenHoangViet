package case_study.controllers;

import case_study.services.impl.EmployServiceImpl;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMainMenu();
    }
    public static void displayMainMenu(){
        boolean check = true;
        while (check){
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()){
                case 1: {
                    displayEmployeeMenu();
                    break;
                }
                case 2: {
                    displayCustomerMenu();
                    break;
                }
                case 3: {
                    displayFacilityMenu();
                    break;
                }
                case 4: {
                    displayBookingMenu();
                    break;
                }
                case 5: {
                    displayPromotionMenu();
                    break;
                }
                default:
                    check = false;
            }
        }
    }
    public static void displayEmployeeMenu(){
        EmployServiceImpl employService = new EmployServiceImpl();
        boolean check = true;
        while (check){
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employees");
            System.out.println("3. Edit employees");
            System.out.println("4. Return to menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()){
                case 1: {
                    employService.display();
                    break;
                }
                case 2: {
                    employService.addNew();
                    break;
                }
            }
        }
    }
    public static void displayCustomerMenu(){
        boolean check = true;
        while (check){
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return to menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()){
                case 1: {

                }
            }
        }
    }
    public static void displayFacilityMenu(){
        boolean check = true;
        while (check){
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return to menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()){
                case 1: {

                }
            }
        }
    }
    public static void displayBookingMenu(){
        boolean check = true;
        while (check){
            System.out.println("1. Add new booking ");
            System.out.println("2. Display list booking ");
            System.out.println("3. Create new contracts ");
            System.out.println("4. Display list contracts ");
            System.out.println("5. Edit contracts ");
            System.out.println("6. Return main menu ");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()){
                case 1: {

                }
            }
        }
    }
    public static void displayPromotionMenu(){
        boolean check = true;
        while (check){
            System.out.println("1. Display list customers use service");
            System.out.println("2. Display list customers get voucher");
            System.out.println("3. Return main menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()){
                case 1:{

                }
            }
        }
    }
}
