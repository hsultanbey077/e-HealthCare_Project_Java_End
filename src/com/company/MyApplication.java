package com.company;

import com.company.controllers.DepartmentController;
import com.company.controllers.PatientController;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MyApplication {

    private final PatientController controller2;
    private final Scanner scanner;

    public MyApplication( PatientController controller2) {

        this.controller2 = controller2;
        scanner = new Scanner(System.in);
    }

    public void start() {//options of my applications
        while (true) {
            System.out.println();
            System.out.println("Welcome to My Application");
            System.out.println("Select option:");
            System.out.println("1.Give Result");
            /**
             * OPTIONS
             */

            System.out.println("0. Exit");
            System.out.println();
            try {//it is how works my options
                System.out.print("Enter option (1-7): ");
                int option = scanner.nextInt();
                if (option == 1) {
                    giveResults();
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

        public void giveResults() {
            System.out.println("Please enter your patient_id");
            int pat_id = scanner.nextInt();
            System.out.println("Please enter your test_id");
            int test_id = scanner.nextInt();

            String response = controller2.giveTestResult(pat_id,test_id);
            System.out.println(response);
        }

}
