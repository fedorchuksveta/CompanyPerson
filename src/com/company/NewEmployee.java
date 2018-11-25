package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class NewEmployee {
    public NewEmployee(int a) {
    }

    public void newEmployee() throws IOException {

        Scanner sqr = new Scanner(System.in);

        System.out.println("Ви дійсно хочете додати нового працівника?\n" + "1: так;\n" + "2: ні; \n");

        try {
            int answer = sqr.nextInt();

            if (answer == 1) {
                Employee employee = new Employee();
                Scanner scanner = new Scanner(System.in);

                System.out.println("Введіть прізвище");
                employee.setLastName(scanner.nextLine());

                System.out.println("Введіть ім'я");
                employee.setFirstName(scanner.nextLine());

                System.out.println("Введіть по-батькові");
                employee.setSurname(scanner.nextLine());

                System.out.println("Введіть дату народження працівника");
                employee.setDateBirth(scanner.nextLine());

                System.out.println("Введіть посаду");
                employee.setPosition(scanner.nextLine());

                System.out.println("Введіть підрозділ");
                employee.setDepartment(scanner.nextLine());

                System.out.println("Введіть номер кімнати");
                employee.setNumberRoom(scanner.nextInt());

                System.out.println("Введіть службовий телефон працівника");
                employee.setTelefon(scanner.nextInt());

                System.out.println("Введіть службовий e-mail працівника");
                employee.setEmeil(scanner.next());

                System.out.println("Введіть місячний оклад працівника");
                employee.setSalary(scanner.nextInt());

                System.out.println("Введіть дату прийняття на роботу");
                employee.setDateWork(scanner.next());

                System.out.println("Примітки");
                employee.setNote(scanner.next());


                ArrayList<Employee> employees = new ArrayList<>();
                employees.add(employee);

                FileWriter writer = new FileWriter("output.txt", true);
                FileWriter writer1 = new FileWriter("outputReg.txt", true);

                for (Employee employee1 : employees) {
                    int id = employee1.getId();
                    String firstName = employee1.getFirstName();
                    String lastName = employee1.getLastName();
                    String surname = employee1.getSurname();
                    String dateBirth = employee1.getDateBirth();
                    String position = employee1.getPosition();
                    String department = employee1.getDepartment();
                    int numberRoom = employee1.getNumberRoom();
                    int telefon = employee1.getTelefon();
                    String emeil = employee1.getEmeil();
                    int salary = employee1.getSalary();
                    String dateWork = employee1.getDateWork();
                    String note = employee1.getNote();

                    writer.write(id + ";" + lastName + ";" + firstName + ";" + surname + ";" + dateBirth + ";"
                            + position + ";" + department + ";" + numberRoom + ";" + telefon + ";" +
                            emeil + ";" + salary + ";" + dateWork + ";" + note + "\n");
                    writer1.write(id + ";" + lastName + ";" + firstName + ";" + surname + ";" + dateBirth + ";"
                            + position + ";" + department + ";" + numberRoom + ";" + telefon + ";" +
                            emeil + ";" + salary + ";" + dateWork + ";" + note + "\n");
                    writer.close();
                    writer1.close();
                }
                Beginning beginning = new Beginning();
                beginning.beginning();
            } else {
                Beginning beginning = new Beginning();
                beginning.beginning();
            }
        }catch (IOException e){
            System.out.println("Не правильно введене значення." + "\n");
            newEmployee();
        }
    }
}