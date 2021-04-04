package comp5111.assignment.cut;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class Counter {
    private static int statementsNum = 0;
    private static int executedStatementsNum = 0;

    private static int branchNum = 0;
    private static int executedBranchNum = 0;

    private static int lineNum = 0;
    private static int executedLineNum = 0;
    private static List<Integer> executedLineList = new ArrayList<Integer>();

    public static Map<String, Integer> map = new HashMap<>();

    public static void addKeyToMap(String className){
        map.put(className, 0);
    }
    public static void addValueOfMap(String className){
        int counter = map.get(className) + 1;
        map.replace(className, counter);
    }

    // statement coverage
    public static void addStatementsNum() {
        statementsNum += 1;
    }
    public static void addExecutedStatementsNum(int n) {
        executedStatementsNum += n;
    }

    public static int getStatementsNum (){
        return statementsNum;
    }

    public static int getExecutedStatementsNum (){
        return executedStatementsNum;
    }

    // branch coverage
    public static void addBranchNum() {
        branchNum += 1;
    }
    public static void addExecutedBranchNum(int n) {
        executedBranchNum += n;
    }

    public static int getBranchNum (){
        return branchNum;
    }

    public static int getExecutedBranchNum (){
        return executedBranchNum;
    }

    // line coverage
    public static void addLineNum() {
        lineNum += 1;
    }
    public static void addExecutedLineNum(int n) {
        executedLineNum += n;
    }

    public static void addExecutedLineList(int n){
        executedLineList.add(n);
    }

    public static int getLineNum (){
        return lineNum;
    }

    public static int getExecutedLineNum (){
        return executedLineNum;
    }

    public static List<Integer> getExecutedLineList (){
        return executedLineList;
    }


}
