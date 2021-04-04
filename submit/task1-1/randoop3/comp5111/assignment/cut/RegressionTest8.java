package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ", 85, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!  \rhi! ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        double[] doubleArray6 = new double[] { 2, (-137), 139, (byte) 10, 139, 726 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[2.0, -137.0, 139.0, 10.0, 139.0, 726.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  hi!hi! \rh \r\ri \r\r! \r\r", "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!hi! \rh \r\ri \r\r! \r\r" + "'", str3, "  hi!hi! \rh \r\ri \r\r! \r\r");
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        long[] longArray1 = new long[] { 100 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        java.lang.Class<?> wildcardClass3 = longArray1.getClass();
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[100]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  hi! \rhi!  \rhi! ", pattern1, "  \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi! \rhi!  \rhi! " + "'", str3, "  hi! \rhi!  \rhi! ");
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (java.lang.CharSequence) " \rhi! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", 172);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r", 27);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", "", "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! " + "'", str3, "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ");
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!  \rhi! ", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\n\r", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!", pattern1, " hi!  hi!h hi!i hi!! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) " hi! \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray9 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence3, charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi! ", charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  hi!hi! hi! \rhi!  \rhi! h hi!i \r\r! \r\r", charArray9);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", charArray9);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \r", true, (int) (short) 10, (java.lang.CharSequence) "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ", 21, 20);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi!  \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", (-72));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \rhi! ", 83);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r", "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!", "  \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r \r \r \n \r \r \r ", pattern1, " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r \r \r \n \r \r \r " + "'", str3, " \r \r \r \n \r \r \r ");
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", (java.lang.CharSequence) "\n\rhi!  \rhi! ", 726);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "    hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \rhi!  \rhi! ", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi! ", charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\rhi!  \rhi! ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!  \rhi! ", (-120));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \r\rh \r\ri \r\r! \r\rhi! hi!   \r\rh \r\ri \r\r! \r\rhi! hi! h  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! i  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! !  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! hi! ", charArray5);
        java.lang.Class<?> wildcardClass11 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \rhi! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 0, (byte) 0 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \rhi!  \rhi!   \rhi!  \rhi! ", " \rhi!  \rhi! ", "  hi! \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    hi! \rhi!  \rhi!    hi! \rhi!  \rhi! " + "'", str3, "    hi! \rhi!  \rhi!    hi! \rhi!  \rhi! ");
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        char[] charArray11 = new char[] { '4', '\r', ' ', '\r' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \rhi!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\n\r", charArray11);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", charArray11);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "    hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4\r \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4\r \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, \r,  , \r]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!", "\r\n\r", " \r \r \r \n \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!" + "'", str3, "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!");
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \rhi!  \rhi!  \n\rh \r\ri \r\r! \r\r", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi!  \n\rh \r\ri \r\r! \r\r" + "'", str3, " \rhi!  \rhi!  \n\rh \r\ri \r\r! \r\r");
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!", (int) (short) -1, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", false, (int) '\000', charSequence3, 12, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \rhi! ", charSequence1, 22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", 286);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  hi!hi! \rh \r\ri \r\r! \r\r", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r \r \r \n \r \r \r ", (java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("    hi! \rhi!  \rhi!    hi! \rhi!  \rhi! ", " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", " \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    hi! \rhi!  \rhi!    hi! \rhi!  \rhi! " + "'", str3, "    hi! \rhi!  \rhi!    hi! \rhi!  \rhi! ");
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:    hi! ?hi!  ?hi! h   ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??i   ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??!   ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??hi! hi!   ?hi!  ?hi! h   ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??i   ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??!   ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??hi! hi! ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) (-136));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \rhi! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (int) '\000', 57);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \rhi!  \rhi!   \rhi!  \rhi! ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!", " hi! \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", "   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!" + "'", str3, " hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!");
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi!  \rhi!  \n\rh \r\ri \r\r! \r\r", (java.lang.CharSequence) " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \rhi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi! ", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", charArray3);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " \rhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " \rhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , \r, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ", "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ", " \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! " + "'", str3, "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ");
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", " \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", "    hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! " + "'", str3, " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi! \rhi!  \rhi! ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "    hi! \rhi!  \rhi!    hi! \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 37 + "'", int1 == 37);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", (java.lang.CharSequence) "   \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "    hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "    hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "    hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ ,  ,  ,  , h, i, !,  , \r, h, i, !,  ,  , \r, h, i, !,  , h,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, i,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, h, i, !,  , h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , h,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, i,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, h, i, !,  , h, i, !,  , \r, h,  , h, i, !, i,  , \r, \r, !,  , \r, \r]");
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        char[] charArray10 = new char[] { '4', '\r', ' ', '\r' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \rhi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\n\r", charArray10);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", charArray10);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4\r \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4\r \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, \r,  , \r]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  ", (java.lang.CharSequence) "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi! \rhi!  \rhi! ", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        java.lang.Class<?> wildcardClass6 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        char[] charArray9 = new char[] { '4', '\r', ' ', '\r' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \rhi!  \rhi! ", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4\r \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4\r \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, \r,  , \r]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", (java.lang.CharSequence) " ", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "    hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "  hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", (java.lang.CharSequence) "   \rhi!    \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\rhi!  \rhi! ", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) " \rhi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi! ", false, 147, (java.lang.CharSequence) "  \r\n\r", (-6), 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi!   \r hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi!   \n\rh \r\ri \r\r! \r\r", "\r\n\r", "  hi!hi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi!   \r hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi!   \n\rh \r\ri \r\r! \r\r" + "'", str3, " \r hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi!   \r hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi!   \n\rh \r\ri \r\r! \r\r");
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", (java.lang.CharSequence) " hi!  hi!\r hi!\r hi! \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\rhi! ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \rhi! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (java.lang.CharSequence) "  hi!hi! hi! \rhi!  \rhi! h hi!i \r\r! \r\r", 80);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ", "   \rhi!  \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! ", "  hi! \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! " + "'", str3, " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ");
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence3 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence3, charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\n\r", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , \r, \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, 139, 40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ", false, 85, charSequence3, 24, (-136));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \rhi! \r \rhi! \n \rhi! \r \rhi! ", pattern1, "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi! \r \rhi! \n \rhi! \r \rhi! " + "'", str3, " \rhi! \r \rhi! \n \rhi! \r \rhi! ");
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " hi!\r   \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\rhi!  \rhi! ", (java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", pattern1, " \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! " + "'", str3, "   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi! ", (java.lang.CharSequence) "  hi!hi! \rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r ", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r\r", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence1, charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rhi! ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , h, i, !]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 62 + "'", int5 == 62);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  \r\n\r", (java.lang.CharSequence) "  hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "  hi!hi! \rh hi!i \r\r! \r\r", "  \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", "\r\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        java.lang.Class<?> wildcardClass10 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", pattern1, " \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! " + "'", str3, " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "    hi! \rhi!  \rhi!    hi! \rhi!  \rhi! ", (java.lang.CharSequence) " hi!  hi!\r hi!\r hi! \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        java.lang.CharSequence charSequence7 = null;
        char[] charArray10 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi! ", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence7, charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!  hi!\r hi!\r hi!", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi! ", charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! ", charArray10);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray10);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \rhi!    \r\r \r \r\r \r \r\r ", charArray10);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charSequence0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", pattern1, " \r\rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! " + "'", str3, " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ", true, (-29), (java.lang.CharSequence) " \r", (-16), (-643));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "  hi!hi! hi! \rhi!  \rhi! h hi!i \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 37 + "'", int1 == 37);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  ", 715, 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", 23, (-298));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\r");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi! ", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", charArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray5);
        java.lang.Class<?> wildcardClass14 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , \r, \r]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \rhi!  \rhi! ", "  hi! \rhi!  \rhi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " hi!  hi!h hi!i hi!! hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " hi!  hi!h hi!i hi!! hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , h, i, !,  ,  , h, i, !, h,  , h, i, !, i,  , h, i, !, !,  , h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", " hi!  hi!\r hi!\r hi! \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-82) + "'", int3 == (-82));
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-57) + "'", int3 == (-57));
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!  \rhi! ", 299, 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", true, (-63), (java.lang.CharSequence) "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", 10, 643);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", " hi!  hi!h hi!i hi!! hi!", "  \r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! " + "'", str3, "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ");
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!  \rhi! ", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi!", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence2, charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!     \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  hi! \rhi!  \rhi! ", false, (-298), (java.lang.CharSequence) "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", (int) (short) 0, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) " \rhi! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (-121));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!", true, (int) (short) 100, (java.lang.CharSequence) "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rhi! ", (int) (byte) 10, (-121));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\n\r", (java.lang.CharSequence) " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" hi!\r   \r\r \r \r\r \r \r\r ", " hi! \rhi!  \rhi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, " \rhi! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \r", "\n", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r" + "'", str3, " \r");
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  \r\n\r", true, (-297), (java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", (-14), (-8));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\r");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , \r, \r]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "     \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r      \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r    \r  ", (-297));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!  \rhi! ", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  hi!hi! hi! \rhi!  \rhi! h hi!i \r\r! \r\r", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 13 + "'", int9 == 13);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi!  \rhi!  \n\rh \r\ri \r\r! \r\r", (java.lang.CharSequence) "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rhi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ", pattern1, "  hi! \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r " + "'", str3, "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ");
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r\r", charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi!   \r hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi!   \n\rh \r\ri \r\r! \r\r", (java.lang.CharSequence) "  hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 293 + "'", int2 == 293);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", 21, 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", (java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi! ", 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("  \rhi!  \rhi! ", "  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ", "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! " + "'", str3, "   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!  \rhi! ", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\n\r", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  hi! \rhi!  \rhi! ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \rhi! ", "   ", " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi! " + "'", str3, " \rhi! ");
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! ", " \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi! ", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", (java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", (int) (short) 100, 143);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray6);
        java.lang.Class<?> wildcardClass12 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \r hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi!   \r hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi!   \n\rh \r\ri \r\r! \r\r", "\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ", pattern1, " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r " + "'", str3, "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ");
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", (java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-165) + "'", int3 == (-165));
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \rhi!  \rhi! ", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  hi!hi! hi! \rhi!  \rhi! h hi!i \r\r! \r\r", charArray8);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!  hi!\r hi!\r hi! \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " hi!  hi!\r hi!\r hi! \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " hi!  hi!\r hi!\r hi! \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , h, i, !,  ,  , h, i, !, \r,  , h, i, !, \r,  , h, i, !,  , \r, \r,  ,  , \r, \r, \r,  , \r, \r, \r,  , \r, \r, h,  , \r, \r,  ,  , \r, \r, \r,  , \r, \r, \r,  , \r, \r, i,  , \r, \r,  ,  , \r, \r, \r,  , \r, \r, \r,  , \r, \r, !,  , \r, \r,  ,  , \r, \r, \r,  , \r, \r, \r,  , \r, \r]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", pattern1, "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi! h hi!hi! i hi!hi! ! hi!hi! " + "'", str3, " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \rhi!  \rhi! ", (java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r\rh \r\ri \r\r! \r\r", " hi!\r   \r\r \r \r\r \r \r\r ", "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\rh \r\ri \r\r! \r\r" + "'", str3, " \r\rh \r\ri \r\r! \r\r");
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \r\rh \r\ri \r\r! \r\rhi! hi!   \r\rh \r\ri \r\r! \r\rhi! hi! h  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! i  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! !  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! hi! ", (java.lang.CharSequence) " \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!", (java.lang.CharSequence) " hi! \rhi!  \rhi! ", 453);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" \r hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi!   \r hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi!   \n\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
        java.lang.Class<?> wildcardClass2 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ ,  ,  , h, i, !,  , \r, h, i, !,  ,  , \r, h, i, !,  , h,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, i,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, h, i, !,  , h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , h,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, i,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, h, i, !,  , h, i, !,  ]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \rhi! ", true, 0, charSequence3, (-18), (int) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \rhi!  \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! ", 20, 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        char[] charArray10 = new char[] { '4', '\r', ' ', '\r' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \rhi!", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ", charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4\r \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4\r \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, \r,  , \r]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "   ", " hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "   ", 15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \r hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi!   \r hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi!   \n\rh \r\ri \r\r! \r\r", "  hi!hi! \rh hi!i \r\r! \r\r \rhi!  hi!hi! \rh hi!i \r\r! \r\r\rhi!  hi!hi! \rh hi!i \r\r! \r\r \rhi!  hi!hi! \rh hi!i \r\r! \r\r\rhi! ", "\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi!   \r hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi!   \n\rh \r\ri \r\r! \r\r" + "'", str3, " \r hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi!   \r hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi!   \n\rh \r\ri \r\r! \r\r");
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "  hi!hi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-157) + "'", int3 == (-157));
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \rhi!  \rhi! ", (java.lang.CharSequence) "  hi!hi! \rh hi!i \r\r! \r\r \rhi!  hi!hi! \rh hi!i \r\r! \r\r\rhi!  hi!hi! \rh hi!i \r\r! \r\r \rhi!  hi!hi! \rh hi!i \r\r! \r\r\rhi! ", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \rhi! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", " \r\rh \r\ri \r\r! \r\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r\rh \r\ri \r\r! \r\rhi! ", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\rh \r\ri \r\r! \r\rhi! " + "'", str3, " \r\rh \r\ri \r\r! \r\rhi! ");
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  hi!hi! \rh \r\ri \r\r! \r\r", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  hi!hi! \rh \r\ri \r\r! \r\r", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \rhi!  \rhi! ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \rhi! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", pattern1, " hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi! hi!hi! h hi!hi! i hi!hi! ! hi!hi! " + "'", str3, " \rhi! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \rhi!  \rhi! ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r", charArray3);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " \rhi!  \rhi! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " \rhi!  \rhi! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , \r, h, i, !,  ,  , \r, h, i, !,  ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 12 + "'", int7 == 12);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r \r \r \n \r \r \r ", (java.lang.CharSequence) " \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (-24));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "     \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r      \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r    \r  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  hi!hi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", 15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \rhi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence1, charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \rhi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " \rhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " \rhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , \r, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" hi!  hi!h hi!i hi!! hi!", " hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \rhi!  \rhi!   \rhi!  \rhi! ", (java.lang.CharSequence) "\r", 643);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        boolean[] booleanArray3 = new boolean[] { true, true, true };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        java.lang.Class<?> wildcardClass6 = booleanArray3.getClass();
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray3), "[true, true, true]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  hi!hi! \rh \r\ri \r\r! \r\r", false, (int) '\r', (java.lang.CharSequence) "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", (-643), (-91));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\r");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi! ", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\rhi! ", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi!  \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , \r, \r]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 18 + "'", int10 == 18);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi! ", " hi!", "   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! hi! " + "'", str3, "   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! hi! ");
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \rhi! ", "    hi! \rhi!  \rhi!    hi! \rhi!  \rhi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", (java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \rhi!  \rhi!  \n\rh \r\ri \r\r! \r\r", " \rhi! ", "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi!  \rhi!  \n\rh \r\ri \r\r! \r\r" + "'", str3, "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi!  \rhi!  \n\rh \r\ri \r\r! \r\r");
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ", (-8), 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " hi!  hi!\r hi!\r hi! \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", (-18));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!", (java.lang.CharSequence) " \rhi! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "     \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r      \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r    \r  ", (java.lang.CharSequence) "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        char[] charArray8 = new char[] { '4', '\r', ' ', '\r' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4\r \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4\r \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, \r,  , \r]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", " \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! " + "'", str3, " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ");
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! ", (-13));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!", (java.lang.CharSequence) "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi!  \rhi!  \n\rh \r\ri \r\r! \r\r", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!  \rhi! ", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ", 1, 755);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \r\r", " hi!hi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        float[] floatArray1 = new float[] { (short) 0 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) byteArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\rhi!  \rhi! ", (java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ", "    hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \rhi! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (java.lang.CharSequence) " hi!", 899);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", true, (-61), (java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", (-8), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ", "  \rhi!  \rhi!   \rhi!  \rhi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!  \rhi! ", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\n\r", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  \r\rh \r\ri \r\r! \r\rhi! hi!   \r\rh \r\ri \r\r! \r\rhi! hi! h  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! i  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! !  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! hi! ", (java.lang.CharSequence) " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \rhi! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (-157), (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ", (-120));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ", " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ", " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r " + "'", str3, "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ");
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", (java.lang.CharSequence) " hi!  hi!\r hi!\r hi!", (-297));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \rhi! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", " ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 39 + "'", int3 == 39);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        float[] floatArray1 = new float[] { 139 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[139.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (java.lang.CharSequence) "  hi!hi! \rh hi!i \r\r! \r\r \rhi!  hi!hi! \rh hi!i \r\r! \r\r\rhi!  hi!hi! \rh hi!i \r\r! \r\r \rhi!  hi!hi! \rh hi!i \r\r! \r\r\rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", " hi!  hi!\r hi!\r hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , \r, \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        char[] charArray12 = new char[] { '4', '4', ' ', '\n', '\000' };
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi!", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  hi!hi! \rh \r\ri \r\r! \r\r", charArray12);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "44 \n\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "44 \n\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, 4,  , \n, \000]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   \rhi!  \rhi!   \rhi!  \rhi! ", pattern1, " \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \rhi!  \rhi!   \rhi!  \rhi! " + "'", str3, "   \rhi!  \rhi!   \rhi!  \rhi! ");
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { " \rhi!  \rhi! ", "\r", " hi!  hi!h hi!i hi!! hi!", " \r\r   \r\r \r \r\r \r \r\r " };
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", (java.lang.CharSequence) "   \rhi!  \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! ", 142);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:   ?hi!  ?hi! h   ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??i   ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??!   ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??hi! hi!   ?hi!  ?hi! h   ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??i   ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??!   ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??hi! hi! ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", true, (-14), (java.lang.CharSequence) "    hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", 22, 172);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        char[] charArray9 = new char[] { '4', '\r', ' ', '\r' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \rhi!", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4\r \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4\r \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, \r,  , \r]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        boolean[] booleanArray6 = new boolean[] { false, true, true, true, true, true };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[false, true, true, true, true, true]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , \r]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi!   \r hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi!   \n\rh \r\ri \r\r! \r\r", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, true, 0, (java.lang.CharSequence) "  hi!hi! \rh \r\ri \r\r! \r\r", 0, 91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\rhi!  \rhi! ", pattern1, " \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\rhi!  \rhi! " + "'", str3, "\n\rhi!  \rhi! ");
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 525 + "'", int1 == 525);
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi! ", (java.lang.CharSequence) "  hi!hi! \rh hi!i \r\r! \r\r \rhi!  hi!hi! \rh hi!i \r\r! \r\r\rhi!  hi!hi! \rh hi!i \r\r! \r\r \rhi!  hi!hi! \rh hi!i \r\r! \r\r\rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        int[] intArray3 = new int[] { (-23), ' ', (-228) };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-23, 32, -228]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", pattern1, "  \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r" + "'", str3, " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r");
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \r\rh \r\ri \r\r! \r\r \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! ", (int) (byte) 100, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\rhi! ", (java.lang.CharSequence) "    hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) "   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! hi! ", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", "   \r\rh \r\ri \r\r! \r\r \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! hi! ", false, 293, (java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r", 121, (-91));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", pattern1, "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! " + "'", str3, " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ");
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \r \r \r \n \r \r \r ", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \r\rh \r\ri \r\r! \r\r \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! ", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (-3), 755);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rhi! ", false, (-15), (java.lang.CharSequence) "     \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r      \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r    \r  ", 19, 299);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", (java.lang.CharSequence) "   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi! \rhi!  \rhi! ", charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  hi!hi! \rh hi!i \r\r! \r\r", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r", pattern1, "  hi!hi! hi! \rhi!  \rhi! h hi!i \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r" + "'", str3, " \r");
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi! ", "   \rhi!  \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! ", " hi! \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi! " + "'", str3, " hi!hi! ");
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", false, 286, (java.lang.CharSequence) " ", 8, 85);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " hi! \rhi!  \rhi! ", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\rhi!  \rhi! ", "  hi!hi! \rh hi!i \r\r! \r\r", "     \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r      \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r    \r  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\rhi!  \rhi! " + "'", str3, "\n\rhi!  \rhi! ");
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\r");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi! ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , \r, \r]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "   \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  \rhi!  \rhi!   \rhi!  \rhi! ", "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r\r", (int) '#', 80);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r");
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence5, charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\n\r", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \rhi!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ", charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\n\r", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , \r, \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray9 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi! ", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence6, charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!  hi!\r hi!\r hi!", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi! ", charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! ", charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  ", 27);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        char[] charArray8 = new char[] { '4', '4', ' ', '\n', '\000' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "44 \n\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "44 \n\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, 4,  , \n, \000]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", "    hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! " + "'", str3, "   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ", " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", "  \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! " + "'", str3, " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ");
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r", pattern1, "     \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r      \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r    \r  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r" + "'", str3, " \r");
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!  hi!h hi!i hi!! hi!", " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!  hi!h hi!i hi!! hi!" + "'", str3, " hi!  hi!h hi!i hi!! hi!");
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rhi! ", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.Class<?> wildcardClass13 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  hi!hi! \rh \r\ri \r\r! \r\r", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!\r   \r\r \r \r\r \r \r\r ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ ]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", (java.lang.CharSequence) " \r\r", 57);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "  hi!hi! \rh hi!i \r\r! \r\r \rhi!  hi!hi! \rh hi!i \r\r! \r\r\rhi!  hi!hi! \rh hi!i \r\r! \r\r \rhi!  hi!hi! \rh hi!i \r\r! \r\r\rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \r\r", " hi!  hi!h hi!i hi!! hi!", " \r\rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r" + "'", str3, " \r\r");
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \rhi!  \rhi! ");
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \rhi!  \rhi! ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " \rhi!  \rhi! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " \rhi!  \rhi! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , \r, h, i, !,  ,  , \r, h, i, !,  ]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 12 + "'", int3 == 12);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("     \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r      \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r    \r  ", "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ", "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r      \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r    \r  " + "'", str3, "     \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r      \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r    \r  ");
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\r");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi! ", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , \r, \r]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\rhi!  \rhi! ", pattern1, " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\rhi!  \rhi! " + "'", str3, "\n\rhi!  \rhi! ");
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r ", (java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", "   \r\rh \r\ri \r\r! \r\r \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! ", "  \r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! " + "'", str3, " \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r ", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  hi!hi! \rh hi!i \r\r! \r\r", charArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \rhi!    \r\r \r \r\r \r \r\r ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!\r   \r\r \r \r\r \r \r\r ", " hi!hi! ", "  hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!\r   \r\r \r \r\r \r \r\r " + "'", str3, " hi!\r   \r\r \r \r\r \r \r\r ");
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  \r\rh \r\ri \r\r! \r\rhi! hi!   \r\rh \r\ri \r\r! \r\rhi! hi! h  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! i  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! !  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! hi! ", pattern1, " \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \r\rh \r\ri \r\r! \r\rhi! hi!   \r\rh \r\ri \r\r! \r\rhi! hi! h  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! i  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! !  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! hi! " + "'", str3, "  \r\rh \r\ri \r\r! \r\rhi! hi!   \r\rh \r\ri \r\r! \r\rhi! hi! h  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! i  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! !  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! hi! ");
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", pattern1, " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! " + "'", str3, "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ");
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  \rhi!  \rhi!   \rhi!  \rhi! ", "  \r\rh \r\ri \r\r! \r\rhi! hi!   \r\rh \r\ri \r\r! \r\rhi! hi! h  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! i  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! !  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! hi! ", " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \rhi!  \rhi!   \rhi!  \rhi! " + "'", str3, "  \rhi!  \rhi!   \rhi!  \rhi! ");
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " hi! \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", "", "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! " + "'", str3, "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r  \rhi!  \rhi!   \rhi!  \rhi! \r", "\n\rhi!  \rhi! ", " \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r  \rhi!  \rhi!   \rhi!  \rhi! \r" + "'", str3, "\r  \rhi!  \rhi!   \rhi!  \rhi! \r");
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \rhi! ", "  hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!  \rhi! ", "  hi!hi! \rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi! " + "'", str3, " \rhi! ");
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \rhi!", "\n\rhi!  \rhi! ", "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!" + "'", str3, " \rhi!");
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", (java.lang.CharSequence) " \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", " \r hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi!   \r hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi!   \n\rh \r\ri \r\r! \r\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ", pattern1, "   \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r " + "'", str3, "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ");
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  hi!hi! \rh \r\ri \r\r! \r\r", true, 0, (java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi! ", 2, 13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  \r\n\r", " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \r\n\r" + "'", str3, "  \r\n\r");
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , h, i, !, h, i, !,  , h,  , h, i, !, h, i, !,  , i,  , h, i, !, h, i, !,  , !,  , h, i, !, h, i, !,  , h,  , h, i, !, h, i, !,  , h,  , h, i, !, h, i, !,  , i,  , h, i, !, h, i, !,  , !,  , h, i, !, h, i, !,  , i,  , h, i, !, h, i, !,  , h,  , h, i, !, h, i, !,  , i,  , h, i, !, h, i, !,  , !,  , h, i, !, h, i, !,  , !,  , h, i, !, h, i, !,  , h,  , h, i, !, h, i, !,  , i,  , h, i, !, h, i, !,  , !,  , h, i, !, h, i, !,  ]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 143 + "'", int3 == 143);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  hi! \rhi!  \rhi! ", (-1), (-13));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n", pattern1, " \r hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi!   \r hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi!   \n\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! ");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "  \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "  \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ,  , \r, h, i, !,  ,  , \r, h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  ]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!", " \r\r", " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!" + "'", str3, "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!");
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!\r   \r\r \r \r\r \r \r\r ", 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!  \rhi! ", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence1, charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \rhi!  \rhi! ", "  \rhi!  \rhi!   \rhi!  \rhi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, "  \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \rhi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence2, charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " \rhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " \rhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , \r, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
        double[] doubleArray1 = new double[] { 10 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        java.lang.Class<?> wildcardClass4 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "  hi!hi! \rh hi!i \r\r! \r\r \rhi!  hi!hi! \rh hi!i \r\r! \r\r\rhi!  hi!hi! \rh hi!i \r\r! \r\r \rhi!  hi!hi! \rh hi!i \r\r! \r\r\rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \r\r", (java.lang.CharSequence) "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.Class<?> wildcardClass11 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        java.lang.Class<?> wildcardClass10 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", (java.lang.CharSequence) " hi! \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " \r hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi!   \r hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi!   \n\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  hi!hi! \rh \r\ri \r\r! \r\r", (java.lang.CharSequence) " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \rhi! \r \rhi! \n \rhi! \r \rhi! ", " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        char[] charArray10 = new char[] { '4', '\r', ' ', '\r' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!\r   \r\r \r \r\r \r \r\r ", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi! \rhi!  \rhi! ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4\r \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4\r \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, \r,  , \r]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!     \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  ", (java.lang.CharSequence) "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rhi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  hi!hi! \rh hi!i \r\r! \r\r \rhi!  hi!hi! \rh hi!i \r\r! \r\r\rhi!  hi!hi! \rh hi!i \r\r! \r\r \rhi!  hi!hi! \rh hi!i \r\r! \r\r\rhi! ", " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  ", " \rhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi!  \rhi!  \n\rh \r\ri \r\r! \r\r", pattern1, " \r\r   \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi!  \rhi!  \n\rh \r\ri \r\r! \r\r" + "'", str3, "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi!  \rhi!  \n\rh \r\ri \r\r! \r\r");
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", (java.lang.CharSequence) " hi!\r   \r\r \r \r\r \r \r\r ", 142);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!\r   \r\r \r \r\r \r \r\r ", (java.lang.CharSequence) "  \rhi!  \rhi! ", (-6));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!  hi!\r hi!\r hi!", charSequence1, (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
        long[] longArray1 = new long[] { 100 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) longArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[100]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", (-19), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", (-63), 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  hi!hi! \rh hi!i \r\r! \r\r \rhi!  hi!hi! \rh hi!i \r\r! \r\r\rhi!  hi!hi! \rh hi!i \r\r! \r\r \rhi!  hi!hi! \rh hi!i \r\r! \r\r\rhi! ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ", (java.lang.CharSequence) " \rhi!  \rhi!  \n\rh \r\ri \r\r! \r\r", 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\r");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi! ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , \r, \r]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r", " \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r" + "'", str3, " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r");
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \rhi! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", 755, 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  \r\rh \r\ri \r\r! \r\rhi! hi!   \r\rh \r\ri \r\r! \r\rhi! hi! h  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! i  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! !  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! hi! ", " \r hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi!   \r hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi!   \n\rh \r\ri \r\r! \r\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", "  hi!hi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", " hi! \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! " + "'", str3, "   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \rhi!  \rhi!   \rhi!  \rhi! ", (java.lang.CharSequence) "\n\rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", (java.lang.CharSequence) " hi!", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , \r, \r,  ,  , \r, \r, \r,  , \r, \r, \r,  , \r, \r, h,  , \r, \r,  ,  , \r, \r, \r,  , \r, \r, \r,  , \r, \r, i,  , \r, \r,  ,  , \r, \r, \r,  , \r, \r, \r,  , \r, \r, !,  , \r, \r,  ,  , \r, \r, \r,  , \r, \r, \r,  , \r, \r,  ,  ,  , \r, \r,  , \r,  , \r, \r,  , \r,  , \r, \r,  ]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \rhi!  \rhi! ", (java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\n\r", 643, (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.Class<?> wildcardClass12 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        char[] charArray13 = new char[] { '4', '\r', ' ', '\r' };
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray13);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!", charArray13);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!  \rhi! ", charArray13);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r\r", charArray13);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", charArray13);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r", charArray13);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi!  \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", charArray13);
        int int22 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4\r \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4\r \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, \r,  , \r]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray11 = new char[] { '4', '\r', ' ', '\r' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \rhi!  \rhi! ", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi! \rhi!  \rhi! ", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4\r \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4\r \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, \r,  , \r]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  hi!hi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", (java.lang.CharSequence) "  hi! \rhi!  \rhi! ", (-297));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
        short[] shortArray0 = new short[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) shortArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\rhi! ", (java.lang.CharSequence) "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence1, charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\n\r", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", "  \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! " + "'", str3, " \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ");
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  ", 755);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "", "", "" };
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        java.lang.Class<?> wildcardClass8 = charSequenceArray3.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  ", " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  " + "'", str3, "  ");
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi! \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (-23), 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ", (java.lang.CharSequence) " hi! \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", " hi! \rhi!  \rhi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi!  \rhi!  \n\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi!  \rhi!  \n\rh \r\ri \r\r! \r\r", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 546 + "'", int3 == 546);
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\n\r", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", (java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", 286);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ", true, 525, (java.lang.CharSequence) "  hi! \rhi!  \rhi! ", (-643), (-299));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r", 20, 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  ", " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", pattern1, " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r" + "'", str3, " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r");
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("  \r\rh \r\ri \r\r! \r\rhi! hi!   \r\rh \r\ri \r\r! \r\rhi! hi! h  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! i  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! !  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! hi! ", " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!", (java.lang.CharSequence) " \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", 299);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" hi!  hi!\r hi!\r hi! \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! ", (java.lang.CharSequence) "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rhi! ", 643);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("   \rhi!  \rhi!   \rhi!  \rhi! ", " \r\r   \r\r \r \r\r \r \r\r ", "     \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r      \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r    \r  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \rhi!  \rhi!   \rhi!  \rhi! " + "'", str3, "   \rhi!  \rhi!   \rhi!  \rhi! ");
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, 2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str17 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str16 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str17 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " hi!  hi!\r hi!\r hi! \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!", " \rhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ", "   \rhi!  \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" ", pattern1, "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r\r", " hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r" + "'", str3, " \r\r");
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n", pattern1, "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
        char[] charArray6 = new char[] { '4', '\r', ' ', '\r' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4\r \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4\r \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, \r,  , \r]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        float[] floatArray6 = new float[] { 10.0f, 4, 19, 2, 1.0f, (byte) 10 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[10.0, 4.0, 19.0, 2.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \rhi!  \rhi! ");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r ", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " \rhi!  \rhi! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " \rhi!  \rhi! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , \r, h, i, !,  ,  , \r, h, i, !,  ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "   ", (-13));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! ", (java.lang.CharSequence) " \r", (-298));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", true, 19, (java.lang.CharSequence) " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", 98, (-72));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
        float[] floatArray2 = new float[] { 100L, 100.0f };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) floatArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "  \r\rh \r\ri \r\r! \r\rhi! hi!   \r\rh \r\ri \r\r! \r\rhi! hi! h  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! i  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! !  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\r");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi! ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", charArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , \r, \r]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!  hi!\r hi!\r hi!", pattern1, " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!  hi!\r hi!\r hi!" + "'", str3, " hi!  hi!\r hi!\r hi!");
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", " \rhi!  \rhi! ", "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", true, (int) (byte) 100, (java.lang.CharSequence) " hi! \rhi!  \rhi! ", 31, (-3));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", (java.lang.CharSequence) "   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!  \rhi! ", (java.lang.CharSequence) " hi!hi! ", (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
        char[] charArray6 = new char[] { ' ', '\r', 'a', '\n', '\n' };
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " \ra\n\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " \ra\n\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , \r, a, \n, \n]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\n\r", (int) (short) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!", (java.lang.CharSequence) "  hi!hi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\rhi! ");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " \r\rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " \r\rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , \r, \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, h, i, !,  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (java.lang.CharSequence) "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! " + "'", str3, "  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "   \rhi!  \rhi!   \rhi!  \rhi! ", (-297));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\r");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi! ", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", charArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi!  \rhi!  \n\rh \r\ri \r\r! \r\r", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , \r, \r]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  hi! \rhi!  \rhi! ", true, (-22), (java.lang.CharSequence) " \rhi! ", (int) (short) -1, (-120));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", (-137), 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  hi!hi! hi! \rhi!  \rhi! h hi!i \r\r! \r\r", true, 62, (java.lang.CharSequence) "     \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r      \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r    \r  ", 24, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   ", (java.lang.CharSequence) " \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! ", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! " + "'", str3, "  \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ");
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r \r \r \n \r \r \r ", 13, 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!  hi!\r hi!\r hi!", (java.lang.CharSequence) "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "    hi! \rhi!  \rhi!    hi! \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \rhi!  \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , \r, \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", 19, 286);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "   \r\rh \r\ri \r\r! \r\r \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 72 + "'", int1 == 72);
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \rhi!    \r\r \r \r\r \r \r\r ", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi! ", (java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-287) + "'", int3 == (-287));
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("    hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", " hi! \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r ", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  hi!hi! \rh hi!i \r\r! \r\r", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \r\n\r", charArray7);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi! ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ", charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "  \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "  \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ,  , \r, h, i, !,  ,  , \r, h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
        char[] charArray7 = new char[] { '4', '\r', ' ', '\r' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi! ", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4\r \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4\r \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, \r,  , \r]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("  ", " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", "   \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  " + "'", str3, "  ");
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 755 + "'", int1 == 755);
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray9 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence3, charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r\r", charArray9);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi!  \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " hi!", 29);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 0, (byte) 10 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        java.lang.Class<?> wildcardClass10 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", (java.lang.CharSequence) " hi! \rhi!  \rhi! ", 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!", pattern1, " \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!" + "'", str3, " hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!");
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\r");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , \r, \r]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", "  \r\rh \r\ri \r\r! \r\rhi! hi!   \r\rh \r\ri \r\r! \r\rhi! hi! h  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! i  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! !  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! hi! ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r" + "'", str3, " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r");
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:   ?hi!  ?hi! h   ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??i   ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??!   ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??hi! hi!   ?hi!  ?hi! h   ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??i   ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??!   ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??hi! hi!   ?hi!  ?hi!   ?hi!  ?hi! h    ?hi!  ?hi!   ?hi!  ?hi!    ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??i    ?hi!  ?hi!   ?hi!  ?hi!    ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??!    ?hi!  ?hi!   ?hi!  ?hi!    ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??hi! ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", true, (-29), (java.lang.CharSequence) "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!", 13, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!  hi!\r hi!\r hi!", (java.lang.CharSequence) "  hi! \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" hi!  hi!\r hi!\r hi!", "  ", " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi! \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!\r hi!\r hi!" + "'", str3, " hi! \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!\r hi!\r hi!");
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) -1, (byte) 0 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! " + "'", str3, " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
        byte[] byteArray0 = new byte[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        java.lang.Class<?> wildcardClass3 = byteArray0.getClass();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\n\r", 37, 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi! \rhi!  \rhi! ", pattern1, "  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi! \rhi!  \rhi! " + "'", str3, " hi! \rhi!  \rhi! ");
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \rhi!  \rhi! ", (java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \rhi!", (java.lang.CharSequence) " \rhi!", (-14));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! ", "  \rhi!  \rhi!   \rhi!  \rhi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!", 525, 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", pattern1, " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! " + "'", str3, " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence4, charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4459");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!", "  hi!hi! \rh \r\ri \r\r! \r\r", "  hi! \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!" + "'", str3, " hi!");
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4460");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  ", pattern1, "  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  " + "'", str3, "  ");
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4461");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi! \rhi!  \rhi! ", 899, 755);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4462");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " hi! \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!\r hi!\r hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4463");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r", (java.lang.CharSequence) "   \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4464");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  hi!hi! \rh hi!i \r\r! \r\r", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4465");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray7);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\r]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4466");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " hi!  hi!h hi!i hi!! hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " hi!  hi!h hi!i hi!! hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , h, i, !,  ,  , h, i, !, h,  , h, i, !, i,  , h, i, !, !,  , h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4467");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!", (-299));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4468");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!  \rhi! ", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        java.lang.Class<?> wildcardClass10 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4469");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("  hi!hi! hi! \rhi!  \rhi! h hi!i \r\r! \r\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:   hi!hi! hi! ?hi!  ?hi! h hi!i ??! ??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4470");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " ", (-19), 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4471");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", 643, 286);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4472");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", true, (-22), (java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (-61), 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4473");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("     \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r      \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r    \r  ", pattern1, " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r      \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r    \r  " + "'", str3, "     \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r      \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r    \r  ");
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4474");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", (java.lang.CharSequence) "\n\rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4475");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  \rhi!  \rhi! ", (java.lang.CharSequence) "   \rhi!  \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! ", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4476");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", charArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi!  \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4477");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  \rhi!  \rhi! ", " \r\rh \r\ri \r\r! \r\rhi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4478");
        int[] intArray6 = new int[] { 719, 121, 8, 5, 21, (-12) };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[719, 121, 8, 5, 21, -12]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4479");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4480");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi! \rhi!  \rhi! ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , \r, \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4481");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  hi! \rhi!  \rhi! ", (java.lang.CharSequence) "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4482");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4483");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4484");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r ", 121, (-61));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4485");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  \r\rh \r\ri \r\r! \r\rhi! hi!   \r\rh \r\ri \r\r! \r\rhi! hi! h  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! i  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! !  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! hi! ", (java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4486");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4487");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ", pattern1, "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! " + "'", str3, " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ");
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4488");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  ", "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4489");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "    hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", false, 293, (java.lang.CharSequence) " \rhi! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (-15), (int) '\r');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4490");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \rhi!  \rhi! ", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4491");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4492");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4493");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4494");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4495");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", (java.lang.CharSequence) "   \rhi!  \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! ", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4496");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! ", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \rhi!  \rhi!   \rhi!  \rhi! ", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4497");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "   \r\rh \r\ri \r\r! \r\r \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4498");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ", " \r\rh \r\ri \r\r! \r\r", "  hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! " + "'", str3, " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ");
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4499");
        char[] charArray8 = new char[] { '4', '4', ' ', '\n', '\000' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "44 \n\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "44 \n\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, 4,  , \n, \000]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 142 + "'", int11 == 142);
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4500");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", (java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }
}

