// package castle.comp5111.example;
package comp5111.assignment.cut;
// package comp5111.assignment.cut.Instrumenter;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.math.BigDecimal;

import java.lang.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.runner.JUnitCore;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

import soot.Pack;
import soot.PackManager;
import soot.Scene;
import soot.Transform;
import soot.options.Options;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.IOException;

import java.io.File;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class EntryPoint {
		public static float linenumber = 0;
    public static void main(String[] args, int testType, String testSuite) {

				instrumentWithSoot(args, testType);
        runJunitTests();

        try {
          FileWriter file = new FileWriter("./repot.txt", true);
          PrintWriter pw = new PrintWriter(new BufferedWriter(file));

          if (testType == 0){
            System.out.println("all statements: " + Counter.getStatementsNum());
            System.out.println("executedStatementsNum: " + Counter.getExecutedStatementsNum());
            pw.println("##### Statement Coverage #####");
            pw.println("##### Test Suite: " + testSuite + " #####");
            pw.println("all statements: " + Counter.getStatementsNum()) ;
            pw.println("executedStatementsNum: " + Counter.getExecutedStatementsNum());
            double statementCoverageRate = ((double)Counter.getExecutedStatementsNum() / (double)Counter.getStatementsNum()) * 100;
            BigDecimal temp = new BigDecimal(String.valueOf(statementCoverageRate)).setScale(2, RoundingMode.HALF_UP);
            statementCoverageRate = temp.doubleValue();
            System.out.println("statement coverage: " + statementCoverageRate);
            pw.println("statement coverage: " + statementCoverageRate);

            // coverage for each class
            System.out.println("coverage for each class: ");
            pw.println("coverage for each class: ");
            for(Map.Entry<String, Integer> entry: Counter.map.entrySet()){
              String key = entry.getKey();
              int value = entry.getValue();
              double coverage = ( (double)value / (double)Counter.getStatementsNum() ) * 100;

              BigDecimal temp1 = new BigDecimal(String.valueOf(coverage)).setScale(2, RoundingMode.HALF_UP);
              coverage = temp1.doubleValue();
              System.out.println(key + ":" + value + " => " + coverage + "%");
              pw.println(key + ":" + value + " => " + coverage + "%");
            }
            pw.println("\n");
          } else if(testType == 1){
            System.out.println("all branches: " + Counter.getBranchNum());
            System.out.println("executedBranchesNum: " + Counter.getExecutedBranchNum());
            pw.println("##### Branch Coverage #####");
            pw.println("##### Test Suite: " + testSuite + " #####");
            pw.println("all branches: " + Counter.getBranchNum());
            double branchCoverageRate = ((double)Counter.getExecutedBranchNum() / (double)Counter.getBranchNum()) * 100;
            BigDecimal temp = new BigDecimal(String.valueOf(branchCoverageRate)).setScale(2, RoundingMode.HALF_UP);
            branchCoverageRate = temp.doubleValue();
            System.out.println("branch coverage: " + branchCoverageRate);
            pw.println("branch coverage: " + branchCoverageRate);
            // coverage for each class
            System.out.println("coverage for each class: ");
            pw.println("coverage for each class: ");
            for(Map.Entry<String, Integer> entry: Counter.map.entrySet()){
              String key = entry.getKey();
              int value = entry.getValue();
              double coverage = ( (double)value / (double)Counter.getBranchNum() ) * 100;

              BigDecimal temp1 = new BigDecimal(String.valueOf(coverage)).setScale(2, RoundingMode.HALF_UP);
              coverage = temp1.doubleValue();
              System.out.println(key + ":" + value + " => " + coverage + "%");
              pw.println(key + ":" + value + " => " + coverage + "%");
            }
            pw.println("\n");
          } else if(testType == 2){
            System.out.println("all lines: " + Counter.getLineNum());
            System.out.println("executedLineNum: " + Counter.getExecutedLineList().size());
            pw.println("##### Line Coverage #####");
            pw.
            println("##### Test Suite: " + testSuite + " #####");
            pw.println("all lines: " + Counter.getLineNum());
            pw.println("executedLineNum: " + Counter.getExecutedLineList().size());
            double lineCoverageRate = ((double)Counter.getExecutedLineList().size() / (double)Counter.getLineNum())* 100;
            BigDecimal temp = new BigDecimal(String.valueOf(lineCoverageRate)).setScale(2, RoundingMode.HALF_UP);
            lineCoverageRate = temp.doubleValue();
            System.out.println("line coverage: " + lineCoverageRate);
            pw.println("line coverage: " + lineCoverageRate);

            // coverage for each class
            System.out.println("coverage for each class: ");
            pw.println("coverage for each class: ");
            for(Map.Entry<String, Integer> entry: Counter.map.entrySet()){
              String key = entry.getKey();
              int value = entry.getValue();
              double coverage = ( (double)value / (double)Counter.getLineNum() ) * 100;

              BigDecimal temp1 = new BigDecimal(String.valueOf(coverage)).setScale(2, RoundingMode.HALF_UP);
              coverage = temp1.doubleValue();
              System.out.println(key + ":" + value + " => " + coverage + "%");
              pw.println(key + ":" + value + " => " + coverage + "%");
            }
            pw.println("\n");
          }
          pw.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
    }

    private static void instrumentWithSoot(String[] classNames, int testType) {
    // private static void instrumentWithSoot(String className) {
        // the path to the compiled Subject class file
        // String classUnderTestPath = ".\\raw-classes";
        // String targetPath = ".\\target\\classes";
        String classUnderTestPath = "./raw-classes";
        String targetPath = "./target/classes";

        // String targetPathTest = "./target/classes/randoop0";
        // String targetPathTest = "./target/classes/randoop0:./target/classes/randoop1:./target/classes/randoop2:./target/classes/randoop3:./target/classes/randoop4";
        // String targetPathTest = ".\\src\\test\\randoop0;.\\src\\test\\randoop1;.\\src\\test\\randoop2;.\\src\\test\\randoop3;.\\src\\test\\randoop4;";
        // String targetPathTest = ".\\src\\test\\randoop0;";

        String classPathSeparator = ":";
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            classPathSeparator = ";";
        }

        /*Set the soot-classpath to include the helper class and class to analyze*/
        Options.v().set_soot_classpath(Scene.v().defaultClassPath() + classPathSeparator + targetPath + classPathSeparator + classUnderTestPath);

        // we set the soot output dir to target/classes so that the instrumented class can override the class file
        Options.v().set_output_dir(targetPath);

        // retain line numbers
        Options.v().set_keep_line_number(true);
        // retain the original variable names
        Options.v().setPhaseOption("jb", "use-original-names:true");

        /* add a phase to transformer pack by call Pack.add */
        Pack jtp = PackManager.v().getPack("jtp");

        Instrumenter instrumenter = new Instrumenter(testType);
        jtp.add(new Transform("jtp.instrumenter", instrumenter));

        // pass arguments to soot
        soot.Main.main(classNames);

    }

    private static void runJunitTests() {
      // String testArray[] = {"comp5111.assignment.cut.RegressionTest0","comp5111.assignment.cut.RegressionTest1","comp5111.assignment.cut.RegressionTest2","comp5111.assignment.cut.RegressionTest3","comp5111.assignment.cut.RegressionTest4","comp5111.assignment.cut.RegressionTest5","comp5111.assignment.cut.RegressionTest6","comp5111.assignment.cut.RegressionTest7","comp5111.assignment.cut.RegressionTest8","comp5111.assignment.cut.RegressionTest9","comp5111.assignment.cut.RegressionTest10","comp5111.assignment.cut.RegressionTest11", };
      // for (int i=0; i < testArray.length; i++){
        Class<?> testClass = null;
        try {
            // here we programmitically run junit tests
            // testClass = Class.forName(testArray[i]);
            // testClass = Class.forName(testArray[testIndex]);
            testClass = Class.forName("comp5111.assignment.cut.RegressionTest");
            // testClass = Class.forName("comp5111.assignment.cut.RegressionTest");
            JUnitCore junit = new JUnitCore();

            System.out.println("Running junit test: " + testClass.getName());
            junit.run(testClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
      // }
    }
}
