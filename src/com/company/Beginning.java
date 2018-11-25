package com.company;

import java.util.Scanner;

public class Beginning {
    void beginning() {
        Scanner sqr = new Scanner(System.in);
        System.out.println("Виберіть дію, яку ви хочете виконати:\n" + "1: додати нового працівника;\n" +
                "2: переглянути дані працівника; \n" + "3: редагувати існуючого працівника;\n" +
                "4: видалити існуючого працівника; \n" +
                "5: згенерувати звіт; \n");

        try {
            int a = sqr.nextInt();

            NewEmployee newEmployee = new NewEmployee(a);

            if (a == 1) {
                newEmployee.newEmployee();
            }

            InformationEmployee informationEmployee = new InformationEmployee(a);
            if (a == 2) {
                informationEmployee.informationEmployee(a);
            }

            EditEmployee editEmployee = new EditEmployee();
            if (a == 3) {
                editEmployee.editEmployee();
            }

            RemoveEmployee removeEmployee = new RemoveEmployee(a);

            if (a == 4) {
                removeEmployee.removeEmployee(a);
            }

            GenerateReport generateReport = new GenerateReport(a);
            if (a == 5) {
                generateReport.generateReport(a);

            } else {
                System.out.println("Не правильно введене значення." + "\n");
                beginning();
            }
        } catch (Exception e) {
            System.out.println("Не правильно введене значення." + "\n");
            beginning();
        }
    }
}