package com.company;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EditEmployee {
    public EditEmployee() {
    }

    private static File sInputFile;
    private static File sTemporaryFile;

    private static BufferedReader sFileReader;
    private static BufferedWriter sFileWriter;

    void editEmployee() throws IOException {
        FileReader fr = null;
        try {
            fr = new FileReader("output.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner sqr = new Scanner(fr);

        sInputFile = new File("output.txt");
        sTemporaryFile = new File("outputReg.txt");

        try {
            sFileReader = new BufferedReader(new FileReader(sInputFile));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            sFileWriter = new BufferedWriter(new FileWriter(sTemporaryFile));
        } catch (IOException e) {
            e.printStackTrace();
        }

        int stringCounter = 1;
        String currentFileString;

        Scanner sqr1 = new Scanner(System.in);
        System.out.println("Введіть ID працівника, якого хочете редагувати.\n"
                + "Для виходу натисніть 0.");

        int i = sqr1.nextInt();

        if (i == 0) {
            Beginning beginning = new Beginning();
            beginning.beginning();
        } else
            while ((currentFileString = sFileReader.readLine()) != null) {
                if (stringCounter == i) {
                    System.out.println("Дійсно змінити - " + currentFileString + "  ?\n"
                            + "1: так; " + "2: ні. ");

                    int yn = sqr1.nextInt();

                    if (yn == 1) {
                        ArrayList<Employee> employees = new ArrayList<>();

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

                        employees.add(employee);

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

                            sFileWriter.write(id + ";" + lastName + ";" + firstName + ";" + surname + ";" + dateBirth + ";"
                                    + position + ";" + department + ";" + numberRoom + ";" + telefon + ";" +
                                    emeil + ";" + salary + ";" + dateWork + ";" + note);
                        }
                    }
                    if (yn == 2) {
                        EditEmployee editEmployee = new EditEmployee();
                        editEmployee.editEmployee();
                    }
                } else {
                    sFileWriter.write(currentFileString);
                }
                sFileWriter.newLine();
                stringCounter++;
            }
        sFileReader.close();
        sFileWriter.close();

        sInputFile.delete();
        sTemporaryFile.renameTo(sInputFile);

        Restart restart = new Restart();
        restart.restart();
    }
}


