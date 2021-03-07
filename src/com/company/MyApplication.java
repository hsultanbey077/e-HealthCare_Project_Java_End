package com.company;

import com.company.controllers.DoctorController;
import com.company.controllers.PatientController;
import com.company.controllers.RegistrationController;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyApplication {
    private final RegistrationController controller;
    private final PatientController controller2;
    private final DoctorController controller3;
    private final Scanner scanner;

    public MyApplication(RegistrationController controller, PatientController controller2, DoctorController controller3) {
        this.controller = controller;
        this.controller2 = controller2;
        this.controller3 = controller3;
        scanner = new Scanner(System.in);
    }


    public void start() {//options of my applications
        System.out.println("Please enter who are you?");
        System.out.println("1.admin");
        System.out.println("2.patient");
        int choose = scanner.nextInt();

        String admin = " Admin ";
        String patient = " Patient ";
        if(choose==1){

            int password_input = scanner.nextInt();
            int password = 123456789;

        if(password_input == password) {
            while (true) {
                System.out.println();
                System.out.println("Welcome to My Application");
                System.out.println("Select option:");
                System.out.println("1.Create Registration");
                System.out.println("2.Create Patient");
                System.out.println("3.Create Doctor");
                System.out.println("0. Exit");

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
                    } else if(option == 0){
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
            System.out.println("Wrong password detected!\nPlease, try again ");
        }
    }else if(choose==2){
            while (true) {
                System.out.println();
                System.out.println("Welcome to My Application");
                System.out.println("Select option:");
                System.out.println("1.Give Result");
                System.out.println("0. Exit");
                System.out.println();
                try {//it is how works my options
                    System.out.print("Enter option (1-7): ");
                    int option = scanner.nextInt();
                    if (option == 1) {
                        giveResults();
                    } else if(option == 0) {
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


    }

}
