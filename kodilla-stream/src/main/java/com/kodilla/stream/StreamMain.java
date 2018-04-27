package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.SaySomething;

public class StreamMain {
    public static void main(String[] args) {
        //     System.out.println("Welcome to module 7 - Stream");
        //      Processor processor = new Processor();
        //    Executor codeToExecute = () -> System.out.println("This is an example text.");
        //  processor.execute(codeToExecute);
        //}

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Tomek", (a -> "ABCD" + a + "ABCD"));
        poemBeautifier.beautify("Michal", (a -> a.toUpperCase()));
        poemBeautifier.beautify("KASIA", (a -> a.toLowerCase()));
        poemBeautifier.beautify("MAGDA", (a -> a.substring(1, 3)));
    }
}