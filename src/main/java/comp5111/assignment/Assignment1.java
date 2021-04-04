package comp5111.assignment;
import comp5111.assignment.cut.EntryPoint;

import java.util.Arrays;

public class Assignment1 {
    public static void main(String[] args) {

        /* check the arguments */
        if (args.length <= 1 || (args[0].compareTo("0") != 0 && args[0].compareTo("1") != 0 && args[0].compareTo("2") != 0)) {
            System.err.println("Usage: java Assignment1 [coverage level] classnames ...");
            System.err.println("Usage: [coverage level] = 0 for statement coverage");
            System.err.println("Usage: [coverage level] = 1 for branch coverage");
            System.err.println("Usage: [coverage level] = 2 for line coverage");
            System.exit(0);
        }

        // these args will be passed into soot.
        String[] classNames = Arrays.copyOfRange(args, 2, args.length);
        for (int i = 0; i < classNames.length; i++) {
                String newClassName = "comp5111.assignment.cut." + classNames[i];
                classNames[i] = newClassName;

                // System.out.println("### class name ###");
                // System.out.println(newClassName);
        }

        String testSuite = args[1];

        if (args[0].compareTo("0") == 0) {
            // TODO invoke your statement coverage instrument function
            // TODO run tests on instrumented classes to generate coverage report

            EntryPoint.main(classNames, 0, testSuite);

        } else if (args[0].compareTo("1") == 0) {
            // TODO invoke your branch coverage instrument function
            // TODO run tests on instrumented classes to generate coverage report
            EntryPoint.main(classNames, 1, testSuite);


        } else if (args[0].compareTo("2") == 0) {
            // TODO invoke your line coverage instrument function
            // TODO run tests on instrumented classes to generate coverage report
            EntryPoint.main(classNames, 2, testSuite);

        }
    }
}
