package com.company;

import com.company.controllers.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyApplication {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RED = "\u001B[31m";

    private final RegistrationController controller;
    private final PatientController controller2;
    private final DoctorController controller3;
    private final DepartmentController controller4;
    private final TestController controller5;
    private final Scanner scanner;

    public MyApplication(RegistrationController controller, PatientController controller2, DoctorController controller3, DepartmentController controller41, TestController controller5) {
        this.controller = controller;
        this.controller2 = controller2;
        this.controller3 = controller3;
        this.controller4 = controller41;
        this.controller5 = controller5;
        scanner = new Scanner(System.in);
    }

    public void start() {//options of my applications
        System.out.println("Please, enter who are you?");
        System.out.println("1.Admin");
        System.out.println("2.Patient");
        int choose = scanner.nextInt();

        if(choose==1){
            System.out.println(ANSI_GREEN + "Please enter your password" + ANSI_RESET);
            int password_input = scanner.nextInt();
            int password = 123456789;

        if(password_input == password) {
            while (true) {
                System.out.println();
                System.out.println(ANSI_GREEN + "Welcome to My Application" + ANSI_RESET);
                System.out.println("---- Select option: -----");
                System.out.println("1.Create Registration");
                System.out.println("2.Create Patient");
                System.out.println("3.Create Doctor");
                System.out.println("4.Record Test");
                System.out.println("5. Go back to the main menu");
                System.out.println("0. Exit");
                System.out.println();
                try {//it is how works my options
                    System.out.print("Enter option (1-7): ");
                    int option = scanner.nextInt();
                    if (option == 1) {
                        Registration();
                    } else if (option == 2) {
                        createPatient();
                    } else if (option == 3) {
                        createDoctor();
                    } else if(option==4){
                        createTest();
                    }else if(option==5){
                        start();
                    }else if(option == 0){
                        System.exit(0);
                    } else {
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Input must be integer");
                    scanner.nextLine(); // to ignore incorrect input
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

                System.out.println("----------------------------");
            }
        }else {
            System.out.println(ANSI_RED + "Wrong password detected!\nPlease, try again " + ANSI_RESET);
        }
    }else if(choose==2){
            while (true) {
                System.out.println();
                System.out.println(ANSI_GREEN + "Welcome to My Application" + ANSI_RESET);
                System.out.println("Select option:");
                System.out.println("1.Give Result");
                System.out.println("2.Get location");
                System.out.println("0. Go back to the main menu");
                System.out.println();
                try {//it is how works my options
                    System.out.print("Enter option (1-7): ");
                    int option = scanner.nextInt();
                    if (option == 1) {
                        giveResults();
                    } else if(option==2){
                            departmentLocations();
                    }else if(option == 0) {
                       start();
                    } else {
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Input must be integer");
                    scanner.nextLine(); // to ignore incorrect input
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

                System.out.println("----------------------------");
            }
        }

    }

        public void Registration(){
            System.out.println("Please enter your registration");
            int reg_id = scanner.nextInt();
            System.out.println("Please enter your patient");
            int pat_id = scanner.nextInt();
            System.out.println("Please enter your doctor");
            int doctor_id = scanner.nextInt();
            System.out.println("Please enter your test_id");
            int test_id = scanner.nextInt();
            String response = controller.createRegistration(reg_id,pat_id,doctor_id,test_id);
            System.out.println(response);
        }

        public void giveResults() {
            System.out.println("Please enter your patient_id");
            int pat_id = scanner.nextInt();
            System.out.println("Please enter your test_id");
            int test_id = scanner.nextInt();

            String response = controller2.giveTestResult(pat_id,test_id);
            System.out.println(response);
        }
         public void createPatient(){
        System.out.println("Please enter id");
        int patient_id = scanner.nextInt();
        System.out.println("Please enter name");
        String name = scanner.next();
        System.out.println("Please enter surname");
        String surname = scanner.next();
        String response = controller2.createPatient(patient_id,name,surname);
        System.out.println(response);
    }
    public void createDoctor(){
        System.out.println("Please enter id");
        int doc_id=scanner.nextInt();
        System.out.println("Please enter name");
        String name = scanner.next();
        System.out.println("Please enter surname");
        String surname=scanner.next();
        String response = controller3.createDoctor(doc_id,name,surname);
        System.out.println(response);
    }
    public void createTest(){
        System.out.println("Please enter id");
        int test_id=scanner.nextInt();
        System.out.println("Please enter date");
        String date = scanner.next();
        System.out.println("Please enter test name");
        String test_name=scanner.next();

        String response = controller5.createTest(test_id,date,test_name);
        System.out.println(response);
    }

    public void departmentLocations() {
        String response = controller4.getLocation();
        System.out.println(response);
    }
    //    public void createDepMenu() {
//        System.out.println("Please enter name");
//        String name = scanner.next();
//
//        System.out.println("Please enter location");
//        String location = scanner.next();
//
//        System.out.println("Please enter phone");
//        String phone = scanner.next();
//
//        System.out.println("Please choose by id;");
//        ArrayList<Integer> ids = new ArrayList<>();
//        for (int i = 0; i < 1; i++) {
//            int num = scanner.nextInt();
//            ids.add(num);
//        }
//
//        String response = controller.createDepartment(name, location, phone, ids);
//        System.out.println(response);
//    }

    private <T> void password(T param1){
        System.out.println("Here is nothing!");
    }

}
