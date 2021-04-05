package org.bsd405.ichesnokov.file;

import java.util.Scanner;

public class FileUtils {
    public static void printScannerInput(Scanner scan) {
        String str1 = scan.nextLine();
        System.out.println("input1 = " + str1);
        String str2 = scan.nextLine();
        System.out.println("input2 = " + str2);
    }
}
