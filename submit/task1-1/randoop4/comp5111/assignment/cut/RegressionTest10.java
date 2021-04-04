package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

    public static boolean debug = false;

    @Test
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?hi!?hi!?hi!?hi!?hi!?hi!?hi!?h?hi!?hi!?hi!?hi!?hi!?hi!?hi!?i?hi!?hi!?hi!?hi!?hi!?hi!?hi!?!?hi!?hi!?hi!?hi!?hi!?hi!?hi!?  ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        char[] charArray7 = new char[] { ' ', '#', ' ' };
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n \n \n", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \n    \n    \n    \n\n   \n", (-22), (-537));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n");
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence5, charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n \n\n\n \n\n\n \n\n\n", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n  \n  \n  \n  \n  \n  \n  \n", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , \n]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\n\n\n\n \n \n \n", "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", " \n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\n\n\n\n \n \n \n" + "'", str3, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\n\n\n\n \n \n \n");
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n\n\n\n\n\n\n \n \n \n \n\n\n\n\n\n\n \n \n \n\n\n\n\n\n\n\n\n \n \n \n", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r \r \r \r \r \r \r \r \r \r \r \r \r", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \r \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", (java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n  \n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n   \n  \n  \n  \n  \n  \n  \n  \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", 33, 299);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n", charSequence1, 422);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \r \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n", pattern1, " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \nh \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \ni \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n! \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \r \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \r \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence1, charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n \n\n\n \n\n\n \n\n\n", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , \n]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", (java.lang.CharSequence) "\rh\ri\r!\r", (-39));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        char[] charArray8 = new char[] { ' ', '#', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rh\ri\r!\r", (java.lang.CharSequence) "   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", 87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", true, 5, (java.lang.CharSequence) "hi!", 322, (-94));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n", false, (-95), (java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n", 131, 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", charArray4);
        java.lang.Class<?> wildcardClass8 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " \n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", (java.lang.CharSequence) "", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r", (-400));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rh\ri\r!\r", 537, 223);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " \rh\ri\r!\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \nh \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \ni \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n! \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\n\n\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\n\n\n", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \n", pattern1, "\r\r\r\r\r\r    \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \n" + "'", str3, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \n");
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n  \n", pattern1, "\n\n\n  \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \n" + "'", str3, " \n  \n");
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        char[] charArray8 = new char[] { ' ', '#', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n", charArray8);
        java.lang.Class<?> wildcardClass15 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\n \n\n\n \n\n\n \n\n\n");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     ", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\n\n\n \n\n\n \n\n\n \n\n\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\n\n\n \n\n\n \n\n\n \n\n\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\n, \n, \n,  , \n, \n, \n,  , \n, \n, \n,  , \n, \n, \n]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "   \n    \n    \n    \n\n   \n    \n    \n    \n    \n\n   \n    \n    \n    \n    \n\n   \n    \n    \n    \n    \n\n   \n", false, 31, (java.lang.CharSequence) "\n \n", 147, (-72));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", pattern1, "\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n" + "'", str3, "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", 0, 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \n", (-239), 495);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\r, \r, \r, \r, \r, \r,  ,  ,  ,  ,  , \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \r, \r, \r, \r, \r, \r,  ,  ,  ,  ,  ,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \r, \r, \r, \r, \r, \r,  ,  ,  ,  ,  ,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \r, \r, \r, \r, \r, \r,  ,  ,  ,  ,  ,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n, \r, h, \r, i, \r, !, \r, \n, \r, h, \r, i, \r, !, \r, \n, \r, h, \r, i, \r, !, \r, \n, \r, h, \r, i, \r, !, \r, \n, \r, h, \r, i, \r, !, \r, \n, \r, h, \r, i, \r, !, \r, \n, \r, h, \r, i, \r, !, \r, \n]");
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n", (java.lang.CharSequence) "\n\n\n\n   \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", 370, 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) "\n\n\n\n\n\n\n \n \n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", (int) '\n', 46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\n\n\n\n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n\n\n" + "'", str3, "\n\n\n\n\n\n");
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", "\r\r\r\r\r\r    \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \nh \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \ni \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n! \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "\n\n\n\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", true, 28, (java.lang.CharSequence) "\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", 395, (-422));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\n \n\n\n \n\n\n \n\n\n", "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \r \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n \n\n\n \n\n\n \n\n\n" + "'", str3, "\n\n\n \n\n\n \n\n\n \n\n\n");
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\r\r\r\r\r      \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", "\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r      \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n" + "'", str3, "\r\r\r\r\r\r      \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n");
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", (int) (byte) -1, 131);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r \r \r \r \r \r \r \r \r \r \r \r \r", pattern1, "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r \r \r \r \r \r \r \r \r \r \r \r \r" + "'", str3, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r \r \r \r \r \r \r \r \r \r \r \r \r");
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 29 + "'", int3 == 29);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", pattern1, "     \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\rh\ri\r!\r \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "\n\n\n\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        char[] charArray9 = new char[] { '#', '4', ' ', '#', '\000' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n \n\n\n \n\n\n \n\n\n", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        java.lang.Class<?> wildcardClass16 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "#4 #\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "#4 #\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, 4,  , #, \000]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        char[] charArray7 = new char[] { ' ', '#', ' ' };
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     ", "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", "\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     " + "'", str3, "\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     ");
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", pattern1, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n", pattern1, "\n\n\n  \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n" + "'", str3, "  \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n");
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        long[] longArray2 = new long[] { 239, '\r' };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) longArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[239, 13]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\r", (java.lang.CharSequence) "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        char[] charArray9 = new char[] { ' ', '#', ' ' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n  \n", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \n    \n    \n    \n\n   \n \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\r\r\r\r\r      \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", (java.lang.CharSequence) "     \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\rh\ri\r!\r \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\n\n\n\n \n \n \n", " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n", "   \n    \n    \n    \n\n   \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\n\n\n\n \n \n \n" + "'", str3, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\n\n\n\n \n \n \n");
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        char[] charArray8 = new char[] { ' ', '#', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n \n \n \n \n \n \n", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", charArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n   \n \n \n \n  \n \n \n  \n \n \n  \n \n \n", "\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n", " \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n   \n \n \n \n  \n \n \n  \n \n \n  \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n   \n \n \n \n  \n \n \n  \n \n \n  \n \n \n" + "'", str3, " \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n   \n \n \n \n  \n \n \n  \n \n \n  \n \n \n");
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n", (java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \r \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n", 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \n    \n    \n    \n\n   \n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n,  , \n,  , \n,  , \n,  , \n,  , \n]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray9 = new char[] { ' ', '#', ' ' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n  \n", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\n\n\n", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", "\n\n\n\n   \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r\r\r\r\r  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", 64, 67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n", "\r\r\r\r\r\r  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   \n", pattern1, "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n\n\n\n \n\n\n \n\n\n \n\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n" + "'", str3, "   \n");
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ", " \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\n\n\n\n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     " + "'", str3, "\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ");
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "\r", "\n\n\n \n\n\n \n\n\n \n\n\n", "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", "\n\n\n \n\n\n \n\n\n \n\n\n", "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n" };
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n \n \n \n \n \n \n \n", 422);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", 322);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "\r\r\r\r\r\r      \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", (-5));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n   \n \n \n \n  \n \n \n  \n \n \n  \n \n \n", (java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n", (int) '\000', (-103));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        char[] charArray8 = new char[] { ' ', '#', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n  \n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n \n\n\n \n\n\n \n\n\n", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", charArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n", "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", "\r\r\r\r\r\r    \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n" + "'", str3, " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n");
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     ", (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", false, (-19), (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", (int) (byte) 0, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", (java.lang.CharSequence) "     \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", charArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , \n]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\r\r\r\r\r      \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", 119, (-21));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", 117);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", pattern1, "\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n   \n \n \n \n  \n \n \n  \n \n \n  \n \n \n", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", 422, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rh\ri\r!\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n, \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, i, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n,  , \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, i, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r\r\r\r\r     ", "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r     " + "'", str3, "\r\r\r\r\r\r     ");
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "     \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\rh\ri\r!\r \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", (java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r", (java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("     \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", pattern1, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n" + "'", str3, "     \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\rh\ri\r!\r", (-31));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\n\n\n\n", "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence2, charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n \n\n\n \n\n\n \n\n\n", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , \n]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 12 + "'", int8 == 12);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        double[] doubleArray2 = new double[] { (byte) 0, (short) 0 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n", (java.lang.CharSequence) "\n\n\n\n\n\n\n \n \n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) "\r", 67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r", "", "   \n    \n    \n    \n\n   \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n    \n    \n    \n\n   \n\r   \n    \n    \n    \n\n   \n" + "'", str3, "   \n    \n    \n    \n\n   \n\r   \n    \n    \n    \n\n   \n");
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r \r \r \r \r \r \r \r \r \r \r \r \r", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n,  , \n,  ,  , \n,  ,  , \n,  ,  , \n,  ,  , \n,  ,  , \n,  , \n]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 38 + "'", int10 == 38);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n  \n  \n  \n  \n  \n  \n  \n", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        char[] charArray12 = new char[] { ' ', '#', ' ' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray12);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray12);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray12);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", charArray12);
        int int22 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray12);
        boolean boolean23 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r\r\r\r\r    \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", "\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r    \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "\r\r\r\r\r\r    \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        char[] charArray8 = new char[] { ' ', '#', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n \n \n", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", (java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n   \n  \n  \n  \n  \n  \n  \n  \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", 330);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", (java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", "\n\n\n\n\n\n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n" + "'", str3, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n");
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n", "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n", "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n" + "'", str3, " \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n");
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n", (java.lang.CharSequence) "\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", (int) '\n');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        char[] charArray9 = new char[] { ' ', '#', ' ' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n \n \n", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \n  \n  \n  \n  \n  \n  \n  \n", "\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", 158, (-159));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n \n", " \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\n\n\n\n \n \n \n", "\n\n\n\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n" + "'", str3, "\n \n");
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        char[] charArray10 = new char[] { '#', '4', ' ', '#', '\000' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n", charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#4 #\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#4 #\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, 4,  , #, \000]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", true, 39, (java.lang.CharSequence) " \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n", 110, 287);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r\r\r\r\r     ", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", "\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n" + "'", str3, "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray7 = new char[] { 'a', 'a', '#' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence3, charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, a, #]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r\r\r\r\r      \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", pattern1, "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r      \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n" + "'", str3, "\r\r\r\r\r\r      \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n");
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        char[] charArray11 = new char[] { '#', '4', ' ', '#', '\000' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n", charArray11);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\r", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "#4 #\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "#4 #\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, 4,  , #, \000]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \n  \n  \n  \n  \n  \n  \n  \n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \nh \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \ni \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n! \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n  \n  \n  \n  \n  \n  \n  \n" + "'", str3, "   \n  \n  \n  \n  \n  \n  \n  \n");
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n", "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", " \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\n\n\n\n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "     \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\rh\ri\r!\r \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", true, 120, (java.lang.CharSequence) "\n \n", 95, 333);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", pattern1, "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n" + "'", str3, "\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\n\n\n\n\n\n \n \n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r\r\r\r\r     ", pattern1, "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r     " + "'", str3, "\r\r\r\r\r\r     ");
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", 64);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\n \n\n\n \n\n\n \n\n\n");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\n\n\n \n\n\n \n\n\n \n\n\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\n\n\n \n\n\n \n\n\n \n\n\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\n, \n, \n,  , \n, \n, \n,  , \n, \n, \n,  , \n, \n, \n]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        char[] charArray11 = new char[] { ' ', '#', ' ' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n \n \n \n \n \n \n", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray11);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "", 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ", false, 22, (java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", (-65), (int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", (java.lang.CharSequence) "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n\n\n\n \n\n\n \n\n\n \n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", (-326));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, " \n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", (java.lang.CharSequence) " \r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "   \n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "   \n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ,  ,  , \n,  ,  , \n,  ,  , \n,  ,  , \n,  ,  , \n,  ,  , \n,  ,  , \n,  ,  , \n]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", true, 0, (java.lang.CharSequence) " \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n", (-94), (-176));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r", (java.lang.CharSequence) "   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        float[] floatArray1 = new float[] { (byte) 10 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\r\r\r\r\r  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\n\n\n\n \n \n \n", "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n\n\n\n \n\n\n \n\n\n \n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\n\n\n\n \n \n \n" + "'", str3, " \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\n\n\n\n \n \n \n");
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "", 118);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", 95, (-95));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        double[] doubleArray3 = new double[] { (short) -1, (-1.0f), '4' };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) doubleArray3);
        java.lang.Class<?> wildcardClass6 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r\r\r\r\r    \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\r]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , \n]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", pattern1, "\n\n\n  \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n" + "'", str3, "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n");
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) " \r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", 111);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", (java.lang.CharSequence) " \n  \n  \n  \n  \n  \n  \n  \n", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n\n\n\n \n\n\n \n\n\n \n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     ", "   \n  \n  \n  \n  \n  \n  \n  \n   \n  \n  \n  \n  \n  \n  \n  \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     " + "'", str3, "\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     ");
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r\r\r\r\r\r     ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r\r\r\r\r\r     ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r\r\r\r\r\r     ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r, \r, \r, \r, \r, \r,  ,  ,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 13 + "'", int5 == 13);
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        char[] charArray10 = new char[] { '#', '4', ' ', '#', '\000' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray10);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#4 #\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#4 #\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, 4,  , #, \000]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n  \n", (-24), 159);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", false, (int) (byte) 1, (java.lang.CharSequence) "\n \n \n \n \n \n \n \n", 0, 31);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", "\n\n\n\n\n\n", "\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n" + "'", str3, "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \n    \n    \n    \n\n   \n    \n    \n    \n    \n\n   \n    \n    \n    \n    \n\n   \n    \n    \n    \n    \n\n   \n", (java.lang.CharSequence) "\n\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r\r\r\r\r    \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", pattern1, "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r    \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "\r\r\r\r\r\r    \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n   \n \n \n \n  \n \n \n  \n \n \n  \n \n \n", "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n   \n \n \n \n  \n \n \n  \n \n \n  \n \n \n" + "'", str3, " \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n   \n \n \n \n  \n \n \n  \n \n \n  \n \n \n");
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \rh\ri\r!\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", pattern1, "\rh\ri\r!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rh\ri\r!\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n" + "'", str3, " \rh\ri\r!\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", 0, 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n", " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \nh \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \ni \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n! \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n" + "'", str3, "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n");
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " \r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     ", pattern1, "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     " + "'", str3, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     ");
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", "     \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray10 = new char[] { 'a', 'a', '#' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence6, charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\n\n\n\n \n \n \n", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, a, #]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        char[] charArray11 = new char[] { ' ', '#', ' ' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n  \n", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n", charArray11);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n  \n", charArray11);
        java.lang.Class<?> wildcardClass20 = charArray11.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) wildcardClass20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:    ?  ?  ?  ?  ?  ?  ?  ??  ?  ?  ?  ?  ?  ?  ?? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        short[] shortArray2 = new short[] { (byte) 10, (short) 100 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n", pattern1, " \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\n\n\n\n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n\n\n\n \n\n\n \n\n\n \n\n\n", "     \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ", "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n", false, 57, (java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \r \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n", 72, (-94));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        char[] charArray12 = new char[] { ' ', '#', ' ' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray12);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray12);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray12);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", charArray12);
        int int22 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\n\n\n\n \n \n \n", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", "   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", " \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("   \n    \n    \n    \n\n   \n    \n    \n    \n    \n\n   \n    \n    \n    \n    \n\n   \n    \n    \n    \n    \n\n   \n", "     \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\rh\ri\r!\r \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        long[] longArray5 = new long[] { (byte) -1, '\r', (short) 10, 1L, 1L };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[-1, 13, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r \r \r \r \r \r \r \r \r \r \r \r \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", pattern1, "   \n    \n    \n    \n\n   \n \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", pattern1, "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n" + "'", str3, "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", (-21));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     ", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 158 + "'", int3 == 158);
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \nh \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \ni \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n! \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", (java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", 19, 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        float[] floatArray6 = new float[] { 25, (short) -1, (-21), (-15), 7, 72 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[25.0, -1.0, -21.0, -15.0, 7.0, 72.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", (java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r \r \r \r \r \r \r \r \r \r \r \r \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", false, 8, (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", 223, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", true, (int) (byte) -1, (java.lang.CharSequence) "   \n    \n    \n    \n\n   \n    \n    \n    \n    \n\n   \n    \n    \n    \n    \n\n   \n    \n    \n    \n    \n\n   \n", 299, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n   \n \n \n \n  \n \n \n  \n \n \n  \n \n \n", (-238), (-119));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n", charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n   \n  \n  \n  \n  \n  \n  \n  \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 113 + "'", int1 == 113);
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", pattern1, "\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n" + "'", str3, "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n \n", false, 327, (java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", 24, 110);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        int[] intArray5 = new int[] { 2, 3, 19, 7, 28 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[2, 3, 19, 7, 28]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\r\r\r\r\r  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\n\n\n\n \n \n \n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n" + "'", str3, "\r\r\r\r\r\r  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n");
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "   \n    \n    \n    \n\n   \n \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n", 46);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        char[] charArray11 = new char[] { ' ', '#', ' ' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n", charArray11);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 29 + "'", int19 == 29);
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", pattern1, "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n" + "'", str3, "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        char[] charArray9 = new char[] { ' ', '#', ' ' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n  \n", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        char[] charArray13 = new char[] { ' ', '#', ' ' };
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray13);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray13);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray13);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray13);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray13);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", charArray13);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \n    \n    \n    \n\n   \n", charArray13);
        boolean boolean23 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n  \n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " \n  \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " \n  \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , \n,  ,  , \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", (java.lang.CharSequence) "   \n    \n    \n    \n\n   \n\r   \n    \n    \n    \n\n   \n", (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n   \n \n \n \n  \n \n \n  \n \n \n  \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", pattern1, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", "\n \n \n \n \n \n \n \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray10 = new char[] { '#', '4', ' ', '#', '\000' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\n\n\n", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\n\n\n", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#4 #\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#4 #\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, 4,  , #, \000]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        long[] longArray4 = new long[] { 6, (-22), 22, 2 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[6, -22, 22, 2]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \n  \n  \n  \n  \n  \n  \n  \n   \n  \n  \n  \n  \n  \n  \n  \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", pattern1, "\r\r\r\r\r\r  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n  \n  \n  \n  \n  \n  \n  \n   \n  \n  \n  \n  \n  \n  \n  \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "   \n  \n  \n  \n  \n  \n  \n  \n   \n  \n  \n  \n  \n  \n  \n  \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray6 = new char[] { 'a', 'a', '#' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence2, charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a, a, #]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \nh \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \ni \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n! \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n", "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n", "  \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \nh \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \ni \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n! \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n" + "'", str3, " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \nh \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \ni \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n! \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n");
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n  \n  \n  \n  \n  \n  \n  \n", (java.lang.CharSequence) "\r\r\r\r\r\r  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n");
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r\r\r\r\r\r     ");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\r\r\r\r\r\r     ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\r\r\r\r\r\r     ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\r, \r, \r, \r, \r, \r,  ,  ,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r\r\r\r\r    \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \n", " \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r    \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "\r\r\r\r\r\r    \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\n\n\n\n\n\n\n \n \n \n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n\n\n\n \n\n\n \n\n\n \n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", "\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 340 + "'", int3 == 340);
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", 118);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r", (java.lang.CharSequence) " \n  \n", (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ", (java.lang.CharSequence) "\n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\rh\ri\r!\r", false, (-422), (java.lang.CharSequence) "   \n", 10, 327);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", 348);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, "\n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ", 330, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray10 = new char[] { ' ', '#', ' ' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 119 + "'", int15 == 119);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n", 28, (-238));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\n\n\n\n \n \n \n", (-39), (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n", (java.lang.CharSequence) "\n \n", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n\n\n\n \n\n\n \n\n\n \n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", "  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n\n\n\n \n\n\n \n\n\n \n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n" + "'", str3, "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n\n\n\n \n\n\n \n\n\n \n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", pattern1, "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\n\n\n\n\n \n \n \n");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\n\n\n\n\n\n \n \n \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\n\n\n\n\n\n \n \n \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \n, \n, \n, \n, \n, \n,  , \n,  , \n,  , \n]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 28 + "'", int3 == 28);
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", (-376), 395);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        int[] intArray4 = new int[] { '\n', 6, (byte) 10, (byte) -1 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 6, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n \n \n \n \n \n \n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , \n]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n   \n \n \n \n  \n \n \n  \n \n \n  \n \n \n", charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\n\n\n", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence1, charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", charArray5);
        java.lang.Class<?> wildcardClass12 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", 297);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n", 0, (-95));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "\r", "\n\n\n \n\n\n \n\n\n \n\n\n", "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", "\n\n\n \n\n\n \n\n\n \n\n\n", "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n" };
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charSequenceArray5);
        java.lang.Class<?> wildcardClass9 = charSequenceArray5.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r" + "'", str3, "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r");
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray10 = new char[] { ' ', '#', ' ' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence3, charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n\n\n\n \n\n\n \n\n\n \n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", "", " \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n" + "'", str3, " \n  \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n");
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        char[] charArray9 = new char[] { ' ', '#', ' ' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n  \n", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n \n\n\n \n\n\n \n\n\n", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        java.lang.Class<?> wildcardClass17 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r", true, 38, (java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n", 38, (int) '\000');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
        char[] charArray10 = new char[] { '#', '4', ' ', '#', '\000' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#4 #\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#4 #\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, 4,  , #, \000]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", 312);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n", 147, 57);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n\n\n\n \n\n\n \n\n\n \n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
        char[] charArray11 = new char[] { ' ', '#', ' ' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray11);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "     \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", true, (-239), (java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", (-422), (-422));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n \n", "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n" + "'", str3, "\n \n");
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n\n\n\n \n\n\n \n\n\n \n\n\n", "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", " \n  \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n\n\n\n \n\n\n \n\n\n \n\n\n" + "'", str3, "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n\n\n\n \n\n\n \n\n\n \n\n\n");
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        char[] charArray2 = new char[] {};
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", charArray2);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
        boolean[] booleanArray5 = new boolean[] { true, false, true, false, false };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[true, false, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n \n \n", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", charArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \nh \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \ni \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n! \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) str11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n \n \n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r\r\r\r\r  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n" + "'", str3, "\r\r\r\r\r\r  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n");
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) "\n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\n\n\n\n \n \n \n", true, 135, (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", 36, 15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray10 = new char[] { ' ', '#', ' ' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence3, charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "\n\n\n\n\n\n\n \n \n \n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", 91, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
        char[] charArray11 = new char[] { '#', '4', ' ', '#', '\000' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n", charArray11);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "#4 #\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "#4 #\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, 4,  , #, \000]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
        short[] shortArray1 = new short[] { (short) 0 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n\n\n\n \n\n\n \n\n\n \n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \n    \n    \n    \n\n   \n    \n    \n    \n    \n\n   \n    \n    \n    \n    \n\n   \n    \n    \n    \n    \n\n   \n", (java.lang.CharSequence) " \r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r", (-326));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r\r\r\r\r    \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", 31, 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n\n\n\n \n\n\n \n\n\n \n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", true, (-72), (java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n", (-72), 39);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", 15, (-118));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
        long[] longArray5 = new long[] { (byte) -1, '\r', (short) 10, 1L, 1L };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[-1, 13, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        int[] intArray6 = new int[] { (byte) 100, '\r', (short) 10, 100, (short) 0, '\n' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 13, 10, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\n\n\n\n \n \n \n", (java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n\n\n\n \n\n\n \n\n\n \n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", 22, 158);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", " \rh\ri\r!\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", (java.lang.CharSequence) "  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray8 = new char[] { ' ', '#', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 213 + "'", int1 == 213);
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \rh\ri\r!\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", true, 131, (java.lang.CharSequence) " ", (int) (short) -1, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
        char[] charArray11 = new char[] { ' ', '#', ' ' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n \n \n", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     ", charArray11);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:    ?  ?  ?  ?  ?  ?  ?  ?????????????????????????????? ? ? ? ? ???????????????? ? ? ? ? ? ? ? ? ? ? ? ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \n    \n    \n    \n\n   \n\r   \n    \n    \n    \n\n   \n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
        char[] charArray10 = new char[] { ' ', '#', ' ' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
        char[] charArray12 = new char[] { '#', '4', ' ', '#', '\000' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n", charArray12);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n", charArray12);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray12);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     ", charArray12);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n  \n", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#4 #\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#4 #\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, 4,  , #, \000]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \r \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n", true, (-359), (java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", (-238), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
        char[] charArray10 = new char[] { ' ', '#', ' ' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n \n \n \n \n \n \n", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 322 + "'", int17 == 322);
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 136 + "'", int12 == 136);
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\n\n   \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n", charArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n", false, 1, (java.lang.CharSequence) "  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", (-65), (-299));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n", (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, 0, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "\r", " ", "\r", "hi!", "\r", "hi!" };
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray6);
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \rh\ri\r!\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", 132, 118);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n  \n", "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n", " \n  \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \n" + "'", str3, " \n  \n");
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", true, 22, (java.lang.CharSequence) "\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ", 28, 92);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n", (java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", 330);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 216 + "'", int3 == 216);
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", "\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
        char[] charArray10 = new char[] { '\r', ' ', ' ', 'a', 'a', '\r' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n  \n", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n \n\n\n \n\n\n \n\n\n", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\n\n\n\n \n \n \n", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\r  aa\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\r  aa\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\r,  ,  , a, a, \r]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n   \n \n \n \n  \n \n \n  \n \n \n  \n \n \n", (java.lang.CharSequence) "\n \n \n \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
        long[] longArray0 = new long[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5361");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r \r \r \r \r \r \r \r \r \r \r \r \r", (int) ' ', (-65));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\r\r\r\r\r\r  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5363");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n\n\n  \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5364");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5365");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n \n \n \n", true, 64, (java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", 5, (-3));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r\r\r\r\r      \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", pattern1, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r      \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n" + "'", str3, "\r\r\r\r\r\r      \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n");
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5367");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \n", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5368");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n   \n \n \n \n  \n \n \n  \n \n \n  \n \n \n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5369");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\n\n\n\n\n\n \n \n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5370");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n \n \n \n \n \n \n \n");
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n  \n  \n  \n  \n  \n  \n  \n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\r\r\r\r\r     ", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\n   \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5372");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\r\r\r\r\r\r  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5373");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", "\r\r\r\r\r\r    \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", 6, 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5375");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\n\n\n\n \n \n \n");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \n    \n    \n    \n\n   \n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \n    \n    \n    \n\n   \n \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\n\n\n\n \n \n \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\n\n\n\n \n \n \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n, \n, \n, \n, \n, \n, \n, \n,  , \n,  , \n,  , \n]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5376");
        double[] doubleArray2 = new double[] { (byte) 0, (short) 0 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        java.lang.Class<?> wildcardClass10 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", "\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5378");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n", (java.lang.CharSequence) "hi!", 239);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5379");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     ", "\r\r\r\r\r\r  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     " + "'", str3, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     ");
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { " ", "", " ", "\r" };
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5381");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", (-537));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5382");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r", false, (-239), (java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", 0, 159);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5383");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", 103, 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5384");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  ?  ?????????????????????????????? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ???????????????? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ?  ?  ?  ?? ?  ?  ?  ?? ?  ?  ?  ?? ?  ?  ?  ?? ?  ?  ?  ?? ?  ?  ?  ?? ?  ?  ?  ?? ?  ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
        char[] charArray8 = new char[] { ' ', '#', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n  \n", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5386");
        char[] charArray7 = new char[] { ' ', '#', ' ' };
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n \n\n\n \n\n\n \n\n\n", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5387");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", 370);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5388");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \n  \n  \n  \n  \n  \n  \n  \n", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, true, 87, (java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", 113, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5390");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n  \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n  \n\n \n", true, 94, (java.lang.CharSequence) "\n", 122, 322);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5392");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n  \n", (java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n\n\n\n \n\n\n \n\n\n \n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", 411);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5393");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \n    \n    \n    \n\n   \n    \n    \n    \n    \n\n   \n    \n    \n    \n    \n\n   \n    \n    \n    \n    \n\n   \n", (java.lang.CharSequence) "   \n    \n    \n    \n\n   \n", 47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5394");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5395");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5396");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n   \n \n \n \n  \n \n \n  \n \n \n  \n \n \n", pattern1, "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n   \n \n \n \n  \n \n \n  \n \n \n  \n \n \n" + "'", str3, " \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n   \n \n \n \n  \n \n \n  \n \n \n  \n \n \n");
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
        char[] charArray8 = new char[] { ' ', '#', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n  \n  \n  \n  \n  \n  \n  \n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5398");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", false, 1, (java.lang.CharSequence) " \n  \n  \n  \n  \n  \n  \n  \n", 147, 135);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5399");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n", (java.lang.CharSequence) "\rh\ri\r!\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5401");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, 100, 203);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5403");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", charArray4);
        java.lang.Class<?> wildcardClass8 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5404");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", " \rh\ri\r!\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \nh \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \ni \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n! \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n" + "'", str3, "\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5405");
        char[] charArray6 = new char[] { ' ', '#', ' ' };
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5406");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5407");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \nh \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \ni \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n! \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n", (java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n\n\n\n \n\n\n \n\n\n \n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \n    \n    \n    \n\n   \n    \n    \n    \n    \n\n   \n    \n    \n    \n    \n\n   \n    \n    \n    \n    \n\n   \n", pattern1, "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n    \n    \n    \n\n   \n    \n    \n    \n    \n\n   \n    \n    \n    \n    \n\n   \n    \n    \n    \n    \n\n   \n" + "'", str3, "   \n    \n    \n    \n\n   \n    \n    \n    \n    \n\n   \n    \n    \n    \n    \n\n   \n    \n    \n    \n    \n\n   \n");
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5409");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n\n\n\n \n\n\n \n\n\n \n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", true, 40, (java.lang.CharSequence) "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n", (-359), 78);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5411");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", 103, 298);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5412");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n \n \n \n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     ", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n" + "'", str3, "\n \n \n \n");
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5413");
        double[] doubleArray3 = new double[] { (short) -1, (-1.0f), '4' };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) doubleArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5414");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r", 65, 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5415");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n\n\n\n \n\n\n \n\n\n \n\n\n", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5416");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-537) + "'", int3 == (-537));
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n", false, (int) '4', (java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", (-299), 135);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5418");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", "\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5419");
        double[] doubleArray3 = new double[] { (short) -1, (-1.0f), '4' };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) doubleArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5420");
        char[] charArray8 = new char[] { ' ', '#', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n  \n  \n  \n  \n  \n  \n  \n", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("     \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\rh\ri\r!\r \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\rh\ri\r!\r \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n" + "'", str3, "     \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\rh\ri\r!\r \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
    }

    @Test
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5422");
        char[] charArray7 = new char[] { ' ', '#', ' ' };
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29 + "'", int13 == 29);
    }

    @Test
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5423");
        char[] charArray8 = new char[] { ' ', '#', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n  \n", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5424");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", 240, 187);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5425");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5426");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", (int) '\n');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5427");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5428");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5429");
        char[] charArray8 = new char[] { '#', '4', ' ', '#', '\000' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#4 #\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#4 #\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, 4,  , #, \000]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5430");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n", "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n", "\r\r\r\r\r\r  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n" + "'", str3, " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n");
    }

    @Test
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5431");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5432");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", 0, (-15));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5433");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("     \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\rh\ri\r!\r \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5434");
        char[] charArray9 = new char[] { ' ', '#', ' ' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", charArray9);
        java.lang.Class<?> wildcardClass16 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 111 + "'", int15 == 111);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5435");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \n    \n    \n    \n\n   \n \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n", (java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5436");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r", pattern1, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r" + "'", str3, "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r");
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5437");
        short[] shortArray4 = new short[] { (byte) 0, (byte) 100, (byte) 0, (short) 0 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 100, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5438");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) " ", 118);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 118 + "'", int3 == 118);
    }

    @Test
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5439");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", (java.lang.CharSequence) "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", 297);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5440");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n   \n \n \n \n  \n \n \n  \n \n \n  \n \n \n", false, 98, (java.lang.CharSequence) "  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", 23, (-2));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5441");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n", "\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5442");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5443");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r \r \r \r \r \r \r \r \r \r \r \r \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5444");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\n\n\n\n \n \n \n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  ??????????????????????????????????????????? ? ? ? ? ? ? ? ? ? ? ? ? ??????????????? ? ? ? ? ? ? ? ? ? ? ? ? ??????????????? ? ? ? ? ? ? ? ? ? ? ? ???????? ? ? ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5445");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", (-98), 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5446");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", false, (-72), (java.lang.CharSequence) "\n\n\n\n\n\n\n \n \n \n", (-47), 120);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5447");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", 299, 50);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5448");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", false, 29, (java.lang.CharSequence) "\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     ", 20, (-159));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5449");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\r\r\r\r\r\r    \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 279 + "'", int1 == 279);
    }

    @Test
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5450");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\n\n\n\n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5451");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\n\n\n", (java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5452");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n   \n  \n  \n  \n  \n  \n  \n  \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", 64, 537);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5453");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", "hi!", "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5454");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5455");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rh\ri\r!\r", "\n\n\n \n\n\n \n\n\n \n\n\n", "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r" + "'", str3, "\rh\ri\r!\r");
    }

    @Test
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5456");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n\n\n\n \n\n\n \n\n\n \n\n\n", false, 113, (java.lang.CharSequence) " \r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", 10, 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5457");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n");
        int int2 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 297 + "'", int2 == 297);
    }

    @Test
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5458");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n \n \n \n", "\rh\ri\r!\r", "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n" + "'", str3, "\n \n \n \n");
    }

    @Test
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5459");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n   \n \n \n \n  \n \n \n  \n \n \n  \n \n \n", 30, 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5460");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5461");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "   \n    \n    \n    \n\n   \n    \n    \n    \n    \n\n   \n    \n    \n    \n    \n\n   \n    \n    \n    \n    \n\n   \n", (java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5462");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n   \n  \n  \n  \n  \n  \n  \n  \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5463");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5464");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n", false, 32, (java.lang.CharSequence) "\n \n \n \n \n \n \n \n", 30, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5465");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 1 };
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100, 0, 1, 1]");
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
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5466");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \n", "\n\n\n\n\n\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5467");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5468");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("     \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", pattern1, " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n" + "'", str3, "     \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5469");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", (java.lang.CharSequence) "\n \n \n \n", 65);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5470");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) "   \n    \n    \n    \n\n   \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5471");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n", "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5472");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ", (-21));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5473");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n \n \n", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n  \n  \n  \n  \n  \n  \n  \n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5474");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n   \n  \n  \n  \n  \n  \n  \n  \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "     \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n,  , \n,  ,  , \n,  ,  , \n,  ,  , \n,  ,  , \n,  ,  , \n,  , \n]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5475");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n", "  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n" + "'", str3, "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
    }

    @Test
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5476");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r", (java.lang.CharSequence) "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n", 113);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5477");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.Class<?> wildcardClass7 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5478");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "     \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
        int int2 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray1);
        java.lang.Class<?> wildcardClass3 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "     \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "     \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 316 + "'", int2 == 316);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5479");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n", charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5480");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     ", "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test5481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5481");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ", 370, 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5482");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.Class<?> wildcardClass13 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5483");
        char[] charArray9 = new char[] { ' ', '#', ' ' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n \n \n", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n  \n", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5484");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \n", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n" + "'", str3, " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n");
    }

    @Test
    public void test5485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5485");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence3, charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n \n\n\n \n\n\n \n\n\n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , \n]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5486");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test5487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5487");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\r\r\r\r\r      \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 12 + "'", int3 == 12);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5488");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test5489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5489");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", "\n\n\n\n   \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", " \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\n\n\n\n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n" + "'", str3, "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n");
    }

    @Test
    public void test5490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5490");
        char[] charArray5 = new char[] { '4', 'a' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n \n \n \n \n \n \n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n \n \n", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4, a]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test5491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5491");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n \n \n \n \n \n \n", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n \n \n \n \n \n \n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\n\n\n\n \n \n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n \n", charArray5);
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
    public void test5492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5492");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", pattern1, "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n" + "'", str3, "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n");
    }

    @Test
    public void test5493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5493");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n  \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n", 120);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5494");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\r\r\r\r\r\r    \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5495");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r", (java.lang.CharSequence) " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n", (-95));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5496");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", "  \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test5497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5497");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n\n\n\n   \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 401 + "'", int1 == 401);
    }

    @Test
    public void test5498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5498");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", (-3), (-98));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5499");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test5500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5500");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", (java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }
}

