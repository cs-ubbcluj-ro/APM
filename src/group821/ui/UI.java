package ui;

import domain.Doctor;
import service.Service;

import java.util.Scanner;

public class UI {
    private Service service;

    public UI(Service service) {
        this.service = service;
    }

    public void showMenu()
    {
        System.out.println("1 - Add doctor");
        System.out.println("2 - List all doctors");
        System.out.println("0 - Exit");
    }

    public void run() {
        while (true) {
            showMenu();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose an option: ");
            int option = scanner.nextInt();
            if (option == 0) return;
            switch (option) {
                case 1:
                {
                    System.out.println("Enter doctor's id: ");
                    int id = scanner.nextInt();
                    System.out.println("Enter doctor's name: ");
                    String name = scanner.next();
                    System.out.println("Enter doctor's specialty: ");
                    String specialty = scanner.next();
                    System.out.println("Enter doctor's grade: ");
                    double grade = scanner.nextDouble();
                    service.addDoctor(id, name, specialty, grade);
                    break;
                }
                case 2:
                    for (Doctor doc: service.getAll())
                        System.out.println(doc);
            }
        }
    }
}
