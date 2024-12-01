package homework;

import homework.runner.TestRunner;
import homework.test.AnnotationsTest;

public class Main {
    public static void main(String[] args) {
        TestRunner.test(AnnotationsTest.class);
    }
}