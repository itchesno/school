package org.bsd405.ichesnokov.file;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

class File1Test {

    @Test
    void printScannerInput() {
        FileUtils.printScannerInput(new Scanner(new ByteArrayInputStream("text1\ntext2".getBytes())));
    }
}