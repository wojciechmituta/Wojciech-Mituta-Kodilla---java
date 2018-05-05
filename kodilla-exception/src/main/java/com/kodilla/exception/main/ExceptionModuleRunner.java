package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;

public class ExceptionModuleRunner {
    public static void main(String args[]){
        FileReaderException fileReader = new FileReaderException();
        try {
            fileReader.readFile();
        }catch (FileReaderException e) {
            System.out.print("Problem while reading a file");
        }
    }
}
