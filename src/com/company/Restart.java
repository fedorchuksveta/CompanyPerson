package com.company;

import java.util.Scanner;

public class Restart {
   Scanner scanner = new Scanner(System.in);

    void restart(){
        System.out.println("Для продовження, натисніть 1");
        int start = scanner.nextInt();
        if (start == 1) {
            Beginning beginning = new Beginning();
            beginning.beginning();
        }

    }
}
