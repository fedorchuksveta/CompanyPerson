package com.company;

import java.io.*;
import java.util.Scanner;

public class RemoveEmployee {
    public RemoveEmployee(int a) {
    }

    private static File sInputFile;
    private static File sTemporaryFile;

    private static BufferedReader sFileReader;
    private static BufferedWriter sFileWriter;

    void removeEmployee(int a) throws IOException {

        sInputFile = new File("output.txt");
        sTemporaryFile = new File("outputReg.txt");

        sFileReader = new BufferedReader(new FileReader(sInputFile));
        sFileWriter = new BufferedWriter(new FileWriter(sTemporaryFile));

        int stringCounter = 1;

        String currentFileString;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ви дійсно хочете видалити працівника?\n1: так;\n" + "2: ні.\n");
        int answer = scanner.nextInt();

        if (answer == 1) {
            System.out.println("Введіть ID працівника");
            int i = scanner.nextInt();

            while ((currentFileString = sFileReader.readLine()) != null) {
                if (stringCounter != i) {
                    sFileWriter.write(currentFileString);
                    //       sFileWriter.newLine();
                }
                sFileWriter.newLine();
                stringCounter++;
            }
            sFileReader.close();
            sFileWriter.close();
     //       sInputFile.delete();
            sTemporaryFile.renameTo(sInputFile);
            System.out.println("Працівник видалений.");
           Restart restart = new Restart();
           restart.restart();
        }
        if (answer == 2) {
            Beginning beginning = new Beginning();
            beginning.beginning();
        }
    }
}





