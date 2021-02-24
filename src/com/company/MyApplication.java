package com.company;

import com.company.controllers.DepartmentController;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MyApplication {
    private final DepartmentController controller;
    private final Scanner scanner;

    public MyApplication(DepartmentController controller) {
        this.controller = controller;
        scanner = new Scanner(System.in);
    }

    public void start() {//options of my applications
        while (true) {
            System.out.println();
            System.out.println("Welcome to My Application");
            System.out.println("Select option:");
            System.out.println("0. Exit");
            System.out.println();
            try {//it is how works my options
                System.out.print("Enter option (1-7): ");
                int option = scanner.nextInt();
                if (option == 1) {
                    createDepMenu();
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

    public void createDepMenu() {
        System.out.println("Please enter name");
        String name = scanner.next();

        System.out.println("Please enter location");
        String location = scanner.next();

        System.out.println("Please enter phone");
        String phone = scanner.next();

        System.out.println("Please choose by id;");
        ArrayList<Integer> ids = new ArrayList<>();
        for (int i = 0; i < 1; i++) {
            int num = scanner.nextInt();
            ids.add(num);
        }



        String response = controller.createDepartment(name, location, phone, ids);
        System.out.println(response);
    }

}
