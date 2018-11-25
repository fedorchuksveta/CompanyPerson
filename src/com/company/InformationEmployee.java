package com.company;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class InformationEmployee {
    public InformationEmployee(int a) {
    }

    void informationEmployee(int a) throws IOException {
        FileReader fr = new FileReader("outputReg.txt");
        Scanner sqr = new Scanner(fr);
        LineNumberReader lnr = new LineNumberReader(fr);

        System.out.println("Переглянути дані одного працівника? - 1;\n"
                + "Переглянути дані всіх працівників? - 2;\n"
                + "Повернутись? - 3.");

        Scanner sqr1 = new Scanner(System.in);
        int answer = sqr1.nextInt();

        if (answer == 1) {
            String line;

            System.out.println("Введіть ID працівника:");
            int i = sqr1.nextInt();

            while ((line = lnr.readLine()) != null) {
                String[] cols = line.split(";");
                int col = Integer.parseInt(cols[0]);
                if (i == col) {
                    System.out.println(line);
                    break;
                }
            }

            Restart restart = new Restart();
            restart.restart();
        }

        if (answer == 2) {
            int i = 1;

            while (sqr.hasNextLine()) {
                System.out.println(i + " : " + sqr.nextLine());
                i++;
            }
            Restart restart = new Restart();
            restart.restart();
        }
        if (answer == 3) {
            Beginning beginning = new Beginning();
            beginning.beginning();
        }
        fr.close();
    }
}
