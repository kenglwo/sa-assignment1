package comp5111.assignment.cut;

import soot.*;
import soot.jimple.*;
import soot.jimple.internal.JIfStmt;
import soot.jimple.internal.JTableSwitchStmt;
import soot.util.Chain;
import soot.AbstractUnit;

import java.util.Iterator;
import java.util.Map;

public class Instrumenter extends BodyTransformer {

    /* some internal fields */
    private static int testType;
    static SootClass counterClass;
    static SootMethod addExecutedStatementsNum, addExecutedBranchNum, addExecutedLineNum, addExecutedLineList;

    static {
        counterClass = Scene.v().loadClassAndSupport("comp5111.assignment.cut.Counter");
        addExecutedStatementsNum = counterClass.getMethod("void addExecutedStatementsNum(int)");
        addExecutedBranchNum = counterClass.getMethod("void addExecutedBranchNum(int)");
        addExecutedLineNum = counterClass.getMethod("void addExecutedLineNum(int)");
        addExecutedLineList = counterClass.getMethod("void addExecutedLineList(int)");
        // addStatementsNum = counterClass.getMethod("void addStatementsNum()");
    }

    public Instrumenter(int testType){
        this.testType = testType;
    }
     /* instructions before method returns
     */
    @Override
    protected void internalTransform(Body body, String phase, Map options) {
        // body's method
        SootMethod method = body.getMethod();
        // we dont instrument constructor (<init>) and static initializer (<clinit>)
        if (method.isConstructor() || method.isStaticInitializer()) {
            return;
        }

        // debugging
        String methodSignature = method.getSignature();
        // System.out.println("instrumenting method: " + method.getSignature());
        String className = methodSignature.split(":")[0];
        className = className.replace("<comp5111.assignment.cut.", "");

        // get body's unit as a chain
        Chain<Unit> units = body.getUnits();
        // System.out.println(units.getJavaSourceStartLineNumber());

        // get a snapshot iterator of the unit since we are going to
        // mutate the chain when iterating over it.
        //
        Iterator<?> stmtIt = units.snapshotIterator();

        // typical while loop for iterating over each statement
        while (stmtIt.hasNext()) {

            // cast back to a statement.
            Stmt stmt = (Stmt) stmtIt.next();
            int lineNumber = stmt.getJavaSourceStartLineNumber();

            if (testType == 0){ // statement coverage
                if (stmt instanceof Stmt) {
                    Counter.addStatementsNum();

                    InvokeExpr incExpr = null;
                    incExpr = Jimple.v().newStaticInvokeExpr(addExecutedStatementsNum.makeRef(), IntConstant.v(1));
                    Stmt incStmt = Jimple.v().newInvokeStmt(incExpr);
                    units.insertBefore(incStmt, stmt);

                    // for each class
                    if (!Counter.map.containsKey(className)){
                        Counter.addKeyToMap(className);
                    }
                    Counter.addValueOfMap(className);
                }
            } else if(testType == 1) { // branch coverage
                if (stmt instanceof JIfStmt || stmt instanceof JTableSwitchStmt) {
                    Counter.addBranchNum();

                    InvokeExpr incExpr = null;
                    incExpr = Jimple.v().newStaticInvokeExpr(addExecutedBranchNum.makeRef(), IntConstant.v(1));
                    Stmt incStmt = Jimple.v().newInvokeStmt(incExpr);
                    units.insertBefore(incStmt, stmt);

                    // for each class
                    if (!Counter.map.containsKey(className)){
                        Counter.addKeyToMap(className);
                    }
                    Counter.addValueOfMap(className);
                }

            } else if(testType == 2){
                if (lineNumber != -1) {
                    Counter.addLineNum();

                    InvokeExpr incExpr = null;
                    // incExpr = Jimple.v().newStaticInvokeExpr(addExecutedLineNum.makeRef(), IntConstant.v(1));
                    incExpr = Jimple.v().newStaticInvokeExpr(addExecutedLineList.makeRef(), IntConstant.v(lineNumber));
                    Stmt incStmt = Jimple.v().newInvokeStmt(incExpr);
                    units.insertBefore(incStmt, stmt);

                    // for each class
                    if (!Counter.map.containsKey(className)){
                        Counter.addKeyToMap(className);
                    }
                    Counter.addValueOfMap(className);
                }
            }

        }
    }
}
