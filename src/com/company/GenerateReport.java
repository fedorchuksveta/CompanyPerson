package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class GenerateReport {
    public GenerateReport(int a) {
    }

    void generateReport(int a) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Виберіть параметр, за яким необхідно згенерувати звіт:\n"
                + "1: згенерувати всю базу працівників;\n"
                + "2: згенерувати базу працівників за посадою;\n"
                + "3: згенерувати базу працівників по підрозділах;\n"
                + "4: згенерувати базу працівників по номеру кімнати;\n"
                + "5: повернутися.");


        int answer = scanner.nextInt();

        if (answer == 1) {
            FileInputStream fr = new FileInputStream(new File("outputReg.txt"));
            byte[] content = new byte[fr.available()];
            fr.read(content);
            fr.close();
            String[] lines = new String(content, StandardCharsets.UTF_8).split("\n");
            for (String line : lines) {
                String[] words = line.split(";");
                int sumb = 0;
                for (int j = 0; j < words.length; j++) {
                    sumb += words[j].length();
                }
                for (int k = 0; k < (sumb + words.length + 25); k++) {
                    System.out.print("-");
                }
                System.out.println();
                for (a = 0; a < words.length - 1; a++) {
                    System.out.print("|");
                    System.out.print(" ");
                    System.out.print(words[a]);
                    System.out.print(" ");

                }
                System.out.print("|" + "\n");
                for (int k = 0; k < (sumb + words.length + 25); k++) {
                    System.out.print("-");
                }
                System.out.println();
            }
            System.out.println();
            Restart restart = new Restart();
            restart.restart();

        }

        if (answer == 2) {
            scanner.nextLine();

            System.out.println("Введіть посаду");
            String post = scanner.nextLine();
            printO(post);
        }

        if (answer == 3) {
            scanner.nextLine();

            System.out.println("Введіть підрозділ");
            String departmant = scanner.nextLine();
            printO(departmant);
        }

        if (answer == 4) {
            scanner.nextLine();

            System.out.println("Введіть номер кімнати");
            String room = scanner.nextLine();
            printO(room);
        }

        if (answer == 5) {
            Beginning beginning = new Beginning();
            beginning.beginning();
        }

    }

//    public void printO(String i) throws IOException {
//        FileInputStream fis = new FileInputStream(new File("outputReg.txt"));
//        byte[] content = new byte[fis.available()];
//        fis.read(content);
//        fis.close();
//        String[] lines = new String(content, StandardCharsets.UTF_8).split("\n");
//        for (String line : lines) {
//            String[] words = line.split(";");
//            for (String word : words) {
//                if (word.equalsIgnoreCase(i)) {
//                    System.out.println(line);
//                }
//            }
//        }
//        System.out.println();
//        Restart restart = new Restart();
//        restart.restart();
//    }

//    public void printO(String i) throws IOException {
//        FileInputStream fis = new FileInputStream(new File("outputReg.txt"));
//        byte[] content = new byte[fis.available()];
//        fis.read(content);
//        fis.close();
//        String[] lines = new String(content, StandardCharsets.UTF_8).split("\n");
//        FileWriter writer = new FileWriter("gen.txt", true);
//
//        String id = "ID";
//        String lastName = "Прізвище";
//        String firstName = "Ім'я";
//        String surname = "По-батькові";
//        String dateBirth = "Дата народження";
//        String position = "Посада";
//        String department = "Підрозділ";
//        String numberRoom = "Номер кімнати";
//        String telefon = "Службовий телефон";
//        String emeil = "Службовий e-mail";
//        String salary = "Місячний оклад";
//        String dateWork = "Дата прийняття на роботу";
//        String note = "Поле для приміток";
//
//        writer.write("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" + "\n"  );
//        writer.write("|" + id + "               " + "|" + lastName + "               " + "|" + firstName + "               " + "|" + surname + "               " +
//                    "|" + dateBirth + "               " + "|" + position + "               " + "|" + department + "               " + "|" + numberRoom + "               " +
//                    "|" + telefon + "               " + "|" + emeil + "               " + "|" + salary + "               " + "|" + dateWork + "               " + "|" + note + "               " + "\n");
//
// //       writer.write(id + lastName + firstName + surname + dateBirth + position + department + numberRoom + telefon + emeil + salary + dateWork + note);
//
//        writer.close();
//
//
//
//
//        for (String line : lines) {
//            String[] words = line.split(";");
//            int sumb = 0;
//            for (int j = 0; j < words.length; j++) {
//                sumb += words[j].length();
//            }
//            for (String word : words) {
//                if (word.equalsIgnoreCase(i)) {
//                    for (int k = 0; k < (sumb + words.length + 25); k++) {
//                        System.out.print("-");
//                    }
//                    System.out.println();
//                    for (int a = 0; a < words.length - 1; a++) {
//                        System.out.print("|");
//                        System.out.print(" ");
//                        System.out.print(words[a]);
//                        System.out.print(" ");
//
//                    }
//                    System.out.print("|" + "\n");
//                    for (int k = 0; k < (sumb + words.length + 25); k++) {
//                        System.out.print("-");
//                    }
//                    System.out.println();
//                }
//            }
//        }
//        System.out.println();
//        Restart restart = new Restart();
//        restart.restart();
//    }

    public void printO(String i) throws IOException {
        FileInputStream fis = new FileInputStream(new File("outputReg.txt"));
        byte[] content = new byte[fis.available()];
        fis.read(content);
        fis.close();
        String[] lines = new String(content, StandardCharsets.UTF_8).split("\n");
        for (String line : lines) {
            String[] words = line.split(";");
            int sumb = 0;
            for (int j = 0; j < words.length; j++) {
                sumb += words[j].length();
            }
            for (String word : words) {
                if (word.equalsIgnoreCase(i)) {
                    for (int k = 0; k < (sumb + words.length + 25); k++) {
                        System.out.print("-");
                    }
                    System.out.println();
                    for (int a = 0; a < words.length - 1; a++) {
                        System.out.print("|");
                        System.out.print(" ");
                        System.out.print(words[a]);
                        System.out.print(" ");

                    }
                    System.out.print("|" + "\n");
                    for (int k = 0; k < (sumb + words.length + 25); k++) {
                        System.out.print("-");
                    }
                    System.out.println();
                }
            }
        }
        System.out.println();
        Restart restart = new Restart();
        restart.restart();
    }
}


