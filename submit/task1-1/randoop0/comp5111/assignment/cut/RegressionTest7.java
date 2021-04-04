package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" ", "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n" + "'", str3, "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n");
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray8);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\r", true, 0, (java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!", (-3), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?    h    i    !    ?    ?    h    i    !    ?    ?    h    i    !    ?    ? ? ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (int) '\000', 116);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r ", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " ", false, 8, (java.lang.CharSequence) "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n", (int) '4', 15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray9 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence3, charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "                   ", charArray9);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n                   \n                   \n                   \n \r ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\r]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n", (java.lang.CharSequence) "\nhi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", false, (int) (byte) 10, (java.lang.CharSequence) "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!", 40, 26);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n\r\n\r\n\r\n \r \r ", pattern1, "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r\n\r\n\r\n \r \r " + "'", str3, " \n\r\n\r\n\r\n \r \r ");
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", " \r\n   \n   \n   \n\r \r \r \r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-23) + "'", int3 == (-23));
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r", "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n", "  \r  \r \r \r \r\n\r\n\r\n \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r" + "'", str3, "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r");
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        float[] floatArray6 = new float[] { ' ', (byte) 10, (byte) -1, 1L, 100L, 100 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) floatArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        java.lang.Class<?> wildcardClass12 = floatArray6.getClass();
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[32.0, 10.0, -1.0, 1.0, 100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        char[] charArray11 = new char[] { '4', '#', '#', ' ', ' ', ' ' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\rhi!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!  \n \n \n \n \n \nhi!", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4##   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4##   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, #, #,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        char[] charArray13 = new char[] { '4', '#', '#', ' ', ' ', ' ' };
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray13);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\rhi!", charArray13);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   ", charArray13);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", charArray13);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n", charArray13);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4##   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4##   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, #, #,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r \r \r ", "    \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", "    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r \r \r " + "'", str3, " \r \r \r ");
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n", pattern1, "hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n                   \n                   \n                   \n \r ", "  ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ", "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! " + "'", str3, "hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ");
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   ", (java.lang.CharSequence) " \r \r \r   \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\n", pattern1, "hi!\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n" + "'", str3, "hi!\n");
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\rhi!", (java.lang.CharSequence) "hi!\n\nhi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", pattern1, " \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n" + "'", str3, "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!", (java.lang.CharSequence) " \r \r \r   \r \r \r ", 40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", (java.lang.CharSequence) "hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n", " \r\n   \n   \n   \n\r \r \r \r ", "\n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n" + "'", str3, "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n");
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\n", (java.lang.CharSequence) " \n\r\n\r\n\r\n \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \r ", (java.lang.CharSequence) "hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n \n \n \n", " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n", "\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n" + "'", str3, "\n \n \n \n");
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n   \n   \n   \n\r ", (-72));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        char[] charArray12 = new char[] { '4', '#', '#', ' ', ' ', ' ' };
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\rhi!", charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r ", charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", charArray12);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n hi!\n hi!\n", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4##   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4##   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #, #,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\rhi!\rhi!\rhi!", pattern1, "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rhi!\rhi!\rhi!" + "'", str3, "hi!\rhi!\rhi!\rhi!");
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "   ", false, 40, (java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n", 100, 496);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r", false, (-31), (java.lang.CharSequence) "\n   \n   \n   \n\r ", 31, 351);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!", false, 16, (java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", 179, 496);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n   \n   \n   \n\r ", (java.lang.CharSequence) "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("  \r  \r \r \r \r\n\r\n\r\n \r \r ", "hi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", "\nhi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n" + "'", str3, " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("   ", "hi!  \n \n \n \n \n \nhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ", (java.lang.CharSequence) "hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", (java.lang.CharSequence) "\n                   \n                   \n                   \n \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n", " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n", "  \r  \r \r \r \r\n\r\n\r\n \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n" + "'", str3, "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n");
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", true, 0, (java.lang.CharSequence) "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!", 179, 33);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n", pattern1, "hi!  \n \n \n \n \n \nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n" + "'", str3, "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n");
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence4 = null;
        char[] charArray9 = new char[] { '#', 'a', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence4, charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ", charArray9);
        java.lang.Class<?> wildcardClass16 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "#a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "#a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, a, 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "hi!" };
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray1);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray1);
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r \r \r ", (java.lang.CharSequence) "hi!hi!\n   \n   \n   \nhi!", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str16 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", (java.lang.CharSequence) "\n   \n   \n   \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", (java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r", (java.lang.CharSequence) "\n   \n   \n   \n", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r  \r \r \r ", 8, (-63));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n\nhi!\n", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\rhi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r \r \r ", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", charArray7);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\rhi!\rhi!\rhi!", "hi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n", pattern1, "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n" + "'", str3, " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n");
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "    \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", (java.lang.CharSequence) "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n", (java.lang.CharSequence) " \n\nhi!\n", (-5));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n", "hi!hi!\n   \n   \n   \nhi!", "\n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n" + "'", str3, "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n");
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r ", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", (java.lang.CharSequence) "hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \n\r\n\r\n\r\n \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", "hi!", "\n                   \n                   \n                   \n \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r\n\r\n\r\n \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n" + "'", str3, " \n\r\n\r\n\r\n \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n", true, 9, (java.lang.CharSequence) "    ", (int) '\000', 16);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n", charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n   \n   \n   \n\r ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!    ", "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", "\n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!    " + "'", str3, "hi!    ");
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("    h    i    !    \n    ", "  \r  \r \r \r \r\n\r\n\r\n \r \r ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    h    i    !    \n    " + "'", str3, "    h    i    !    \n    ");
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.Class<?> wildcardClass14 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        char[] charArray10 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray10);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\r]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\rhi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!", "hi!", "", "\r" };
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("                   ", pattern1, "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                   " + "'", str3, "                   ");
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  \r  \r \r \r \r\n\r\n\r\n \r \r ", pattern1, "   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \r  \r \r \r \r\n\r\n\r\n \r \r " + "'", str3, "  \r  \r \r \r \r\n\r\n\r\n \r \r ");
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        short[] shortArray2 = new short[] { (byte) 10, (byte) 100 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!", 127, 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  \r  \r \r \r \r\n\r\n\r\n \r \r ", false, 3, (java.lang.CharSequence) " ", 102, 33);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \r \r \r   \r \r \r ", (java.lang.CharSequence) "\n   \n   \n   \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r \r \r   \r \r \r ", (java.lang.CharSequence) "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  ", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r ", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", (java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n", 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " ", false, 90, (java.lang.CharSequence) "hi!hi!\rhi!", 2, (-22));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r ", (java.lang.CharSequence) "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n\nhi!\n", (java.lang.CharSequence) "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!  \n \n \n \n \n \nhi!", "\n\r\n\r\n\r\n", " \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  \n \n \n \n \n \nhi!" + "'", str3, "hi!  \n \n \n \n \n \nhi!");
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r", "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n", "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n" + "'", str3, "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n");
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "    h    i    !    \n    ", 179);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r", false, 14, (java.lang.CharSequence) "\r", (int) (short) 10, 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "    h    i    !    \n    ", (-63), (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\n\nhi!\n", (java.lang.CharSequence) "hi!    ", 62);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n", pattern1, "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n" + "'", str3, "hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n");
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, (-9));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  ", "    \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-69) + "'", int3 == (-69));
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", "\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        boolean[] booleanArray3 = new boolean[] { false, true, false };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        java.lang.Class<?> wildcardClass6 = booleanArray3.getClass();
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray3), "[false, true, false]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", (java.lang.CharSequence) "   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "hi!\n\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n   \n   \n   \n\r ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ", "   ", "  \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n  \r \r \r  h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r " + "'", str3, "\n  \r \r \r  h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ");
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!", "hi!", "", "\r" };
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray4);
        java.lang.Class<?> wildcardClass8 = charSequenceArray4.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "  \r \r \r ", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "                   ", 91);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!", "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " \r \r \r   \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "                   ");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n\nhi!\n", charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "                   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "                   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \r \r \r   \r \r \r ", (-76));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "    \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", (java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n\r\n\r\n\r\n \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " \n\r\n\r\n\r\n \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " \n\r\n\r\n\r\n \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ , \n, \r, \n, \r, \n, \r, \n,  , \r,  , \r,  , \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n,  , \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n,  , \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n,  , \n, \r, \n, \r, \n, \r, \n]");
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\n\nhi!\n", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\nhi!\n" + "'", str3, "hi!\n\nhi!\n");
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        short[] shortArray4 = new short[] { (byte) 1, (short) -1, (short) 1, (short) -1 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[1, -1, 1, -1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r \r \r   \r \r \r ", (java.lang.CharSequence) "\n", (-69));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r ", (-94));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "                   ", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r\n   \n   \n   \n\r \r \r \r ", "\n  \r \r \r  h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ", "\n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\n   \n   \n   \n\r \r \r \r " + "'", str3, " \r\n   \n   \n   \n\r \r \r \r ");
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \r  \r \r \r ", (java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n\nhi!\n", (java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        boolean[] booleanArray6 = new boolean[] { true, true, true, false, false, true };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        java.lang.Class<?> wildcardClass10 = booleanArray6.getClass();
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, true, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("    h    i    !    \n    ", "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n                   \n                   \n                   \n \r ", " \r ", "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n                   \n                   \n                   \n\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n" + "'", str3, "\n                   \n                   \n                   \n\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n");
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "hi!", "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n                   \n                   \n                   \n \r ", (java.lang.CharSequence) "\r", 86);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", pattern1, " \n\r\n\r\n\r\n \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n" + "'", str3, "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\n\nhi!\n", (java.lang.CharSequence) "\n  \r \r \r  h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ", (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, true, 0, (java.lang.CharSequence) "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", 76, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        short[] shortArray5 = new short[] { (short) -1, (short) 1, (short) -1, (byte) 1, (short) 0 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[-1, 1, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n", (java.lang.CharSequence) "hi!  \n \n \n \n \n \nhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! ", (java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n", 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n\r\n\r\n\r\n \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", pattern1, "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r\n\r\n\r\n \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n" + "'", str3, " \n\r\n\r\n\r\n \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        short[] shortArray4 = new short[] { (byte) 1, (short) -1, (short) 1, (short) -1 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[1, -1, 1, -1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  ", pattern1, " \n\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  " + "'", str3, "  ");
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", (java.lang.CharSequence) " \r  \r \r \r ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", (java.lang.CharSequence) "\nhi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r \r \r   \r \r \r ", (java.lang.CharSequence) "  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " ", true, (-5), (java.lang.CharSequence) "    h    i    !    \n    ", (int) '\000', 22);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n\r\n\r\n\r\n \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", (java.lang.CharSequence) "  \r \r \r ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str16 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        char[] charArray9 = new char[] { ' ', '#', '4', 'a', '#', '\r' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "    h    i    !    \n    ", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " #4a#\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " #4a#\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #, 4, a, #, \r]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 23 + "'", int11 == 23);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\n hi!\n hi!\n", (java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!\rhi!", (java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", (-13));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r", "    h    i    !    \n    ", "hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n   \n   \n   \n\r ", 26, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r ", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n   \n   \n   \n\r ", "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n   \n   \n   \n\r " + "'", str3, "\n   \n   \n   \n\r ");
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n                   \n                   \n                   \n \r ", " \n\nhi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        short[] shortArray2 = new short[] { (short) 1, (byte) 1 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        java.lang.Class<?> wildcardClass5 = shortArray2.getClass();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!", (-7), 179);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n" + "'", str3, "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        float[] floatArray0 = new float[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) floatArray0);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\n\r\n\r\n", true, 3, (java.lang.CharSequence) "\n  \r \r \r  h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ", 441, (-496));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n\r\n\r\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("    \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", "    ", "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n" + "'", str3, "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n   \n   \n   \n", (java.lang.CharSequence) " \n\r\n\r\n\r\n \r \r ", (-63));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n", "\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\rhi!", " \r ", "\n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rhi!" + "'", str3, "hi!\rhi!");
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n \n \n", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        char[] charArray11 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray11);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray11);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!\rhi!", charArray11);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n   \n   \n   \n\r ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\r]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!", " \n\r\n\r\n\r\n \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!" + "'", str3, "hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!");
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \r ", false, 559, (java.lang.CharSequence) "hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ", 102, (-23));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n\nhi!\n", "    ", "    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\nhi!\n" + "'", str3, " \n\nhi!\n");
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!\n   \n   \n   \nhi!", 47);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "    h    i    !    \n    ", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\r]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n \n \n", (java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!", "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 159 + "'", int1 == 159);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence4 = null;
        char[] charArray9 = new char[] { '#', 'a', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence4, charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray9);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "#a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "#a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, a, 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!", charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("    h    i    !    \n    ", "\n\r\n\r\n\r\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r ", (java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", (java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n", 47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n \n \n \n", 6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n", (java.lang.CharSequence) "    \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", "\n   \n   \n   \n\r ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\rhi!", "\n  \r \r \r  h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\r\n\r\n", (java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n", (java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r ", (int) '#', 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence3, charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\r]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "                   ", (java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 79 + "'", int1 == 79);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  \r \r \r ", 63, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n  \r \r \r  h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n  \r \r \r  h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n  \r \r \r  h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n,  ,  , \r,  , \r,  , \r,  ,  , h,  ,  ,  ,  , i,  ,  ,  ,  , !,  ,  ,  ,  , \n,  ,  ,  ,  , \n,  ,  ,  ,  , h,  ,  ,  ,  , i,  ,  ,  ,  , !,  ,  ,  ,  , \n,  ,  ,  ,  , \n,  ,  ,  ,  , h,  ,  ,  ,  , i,  ,  ,  ,  , !,  ,  ,  ,  , \n,  ,  ,  ,  , \n,  , \r,  ]");
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) " \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!", 86);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", "", "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r     h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n" + "'", str3, "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r     h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!", pattern1, "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \r ", "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n   \n   \n   \n\r ", 86);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "    h    i    !    \n    ", (java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!", (-94));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r \r \r   \r \r \r ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) " ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!\n hi!\n hi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n                   \n                   \n                   \n \r ", pattern1, "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r     h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n                   \n                   \n                   \n \r " + "'", str3, "\n                   \n                   \n                   \n \r ");
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", 3, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!", (-23), 441);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\r", "hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ", "hi!    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\r" + "'", str3, "\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\r");
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ", (java.lang.CharSequence) "hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!", (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " ", (java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", (java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r     h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r \r \r ", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, \r, \n, \r, \n, \r, \n,  , \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n,  , \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n,  , \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n,  , \n, \r, \n, \r, \n, \r, \n]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        char[] charArray6 = new char[] { '#', 'a', '4' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n   \n   \n   \n", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n\r\n\r\n\r\n \r \r ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, a, 4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", 72, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\r\n\r\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r  \r \r \r ", (java.lang.CharSequence) "\n   \n   \n   \n\r ", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r \r \r   \r \r \r ", charArray8);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", pattern1, "hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n" + "'", str3, "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\rhi!\rhi!\rhi!", "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r     h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!", "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r ", (java.lang.CharSequence) "    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence4, charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\r", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\r]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\rhi!", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        java.lang.Class<?> wildcardClass8 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) "                   ", (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!", pattern1, "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!" + "'", str3, "hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!");
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r\n   \n   \n   \n\r \r \r \r ", pattern1, "hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\n   \n   \n   \n\r \r \r \r " + "'", str3, " \r\n   \n   \n   \n\r \r \r \r ");
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r \r \r   \r \r \r ", (java.lang.CharSequence) "  ", 496);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \r  \r \r \r \r\n\r\n\r\n \r \r ", (java.lang.CharSequence) "    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r \r \r   \r \r \r ", pattern1, "\n                   \n                   \n                   \n\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r \r \r   \r \r \r " + "'", str3, " \r \r \r   \r \r \r ");
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 10, (byte) 1 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) byteArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \r \r \r   \r \r \r ", 79);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str16 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence3, charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r ", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray4);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n", "hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        char[] charArray9 = new char[] { '#', 'a', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "#a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "#a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, a, 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n                   \n                   \n                   \n \r ", false, (int) '4', (java.lang.CharSequence) "hi!", (-9), (-63));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\rhi!", false, (-69), (java.lang.CharSequence) "    \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", 91, 7);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n]");
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!", "                   ", " \r \r \r   \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!" + "'", str3, "hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!");
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\n hi!\n hi!\n", (java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\n", pattern1, "\n                   \n                   \n                   \n\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n" + "'", str3, "hi!\n");
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!", 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        char[] charArray9 = new char[] { '4', '#', '#', ' ', ' ', ' ' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n                   \n                   \n                   \n\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4##   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4##   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, #, #,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n   \n   \n   \n\r ", "    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", "hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n   \n   \n   \n\r " + "'", str3, "\n   \n   \n   \n\r ");
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!\n   \n   \n   \nhi!", (java.lang.CharSequence) "  \r  \r \r \r \r\n\r\n\r\n \r \r ", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  \r  \r \r \r \r\n\r\n\r\n \r \r ", "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n", "hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \r  \r \r \r \r\n\r\n\r\n \r \r " + "'", str3, "  \r  \r \r \r \r\n\r\n\r\n \r \r ");
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\r\n\r\n", pattern1, "\n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\r\n\r\n" + "'", str3, "\n\r\n\r\n\r\n");
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", (java.lang.CharSequence) "\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\r", 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!hi!\rhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n\r\n\r\n\r\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ", "hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r " + "'", str3, "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ");
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.Class<?> wildcardClass14 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 10 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 1, 1, 10]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        char[] charArray11 = new char[] { '4', '#', '#', ' ', ' ', ' ' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray11);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4##   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4##   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, #, #,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n", (int) (byte) 10, 102);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        double[] doubleArray1 = new double[] { '#' };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[35.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " \r  \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r\n   \n   \n   \n\r \r \r \r ", pattern1, " \n\r\n\r\n\r\n \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\n   \n   \n   \n\r \r \r \r " + "'", str3, " \r\n   \n   \n   \n\r \r \r \r ");
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  \r  \r \r \r \r\n\r\n\r\n \r \r ", charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "  \r  \r \r \r \r\n\r\n\r\n \r \r ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "\n  \r \r \r  h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r ", pattern1, " \r\n   \n   \n   \n\r \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r " + "'", str3, " \r ");
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n                   \n                   \n                   \n\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", (java.lang.CharSequence) "\n   \n   \n   \n\r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r     h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        char[] charArray10 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   ", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \r  \r \r \r \r\n\r\n\r\n \r \r ", charArray10);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \r \r \r ", charArray10);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n\r\n\r\n\r\n \r \r ", charArray10);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\r]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("                   ", "", "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n                   " + "'", str3, "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n                   ");
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\rhi!", "\n   \n   \n   \n", "\nhi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rhi!" + "'", str3, "hi!\rhi!");
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r", 116, 86);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!", (-495));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", "\n  \r \r \r  h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \r ", true, (-559), (java.lang.CharSequence) "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r", 13, (int) '\000');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", 0, (-5));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n   \n   \n   \n", (-19));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n", 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", (java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n", " \n\r\n\r\n\r\n \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", " \r\n   \n   \n   \n\r \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n" + "'", str3, "\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n");
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("    ", "hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\n hi!\n hi!\n", (java.lang.CharSequence) "hi!  \n \n \n \n \n \nhi!", 76);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r \r \r   \r \r \r ", (java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r ", (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!", (java.lang.CharSequence) " \n\r\n\r\n\r\n \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\rhi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\rhi!", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "    h    i    !    \n    ", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!", pattern1, "\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!" + "'", str3, "hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!");
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!", (java.lang.CharSequence) "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n", 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", (java.lang.CharSequence) "\n   \n   \n   \n\r ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        float[] floatArray1 = new float[] { 0 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        java.lang.Class<?> wildcardClass5 = floatArray1.getClass();
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n                   ", false, 441, (java.lang.CharSequence) "    h    i    !    \n    ", (-5), (int) '\000');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        int[] intArray4 = new int[] { (byte) 1, ' ', 4, (byte) 100 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 32, 4, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", pattern1, " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n" + "'", str3, "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray10 = new char[] { ' ', '#', '4', 'a', '#', '\r' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence1, charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n                   \n                   \n                   \n \r ", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " #4a#\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " #4a#\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , #, 4, a, #, \r]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 62 + "'", int14 == 62);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", "\n   \n   \n   \n\r ", "hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n" + "'", str3, "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        java.lang.Class<?> wildcardClass6 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n                   \n                   \n                   \n \r ", (java.lang.CharSequence) "    h    i    !    \n    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 62 + "'", int2 == 62);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n   \n   \n   \n\r ", "\n", "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!   \n   \n   \n\r " + "'", str3, "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!   \n   \n   \n\r ");
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\n hi!\n hi!\n", pattern1, " \n\r\n\r\n\r\n \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n hi!\n hi!\n" + "'", str3, "hi!\n hi!\n hi!\n");
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", 0, 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 226 + "'", int1 == 226);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r", 133, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        char[] charArray10 = new char[] { ' ', '#', '4', 'a', '#', '\r' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r \r \r   \r \r \r ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " #4a#\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " #4a#\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , #, 4, a, #, \r]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", (java.lang.CharSequence) "  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n\r\n\r\n\r\n \r \r ", true, (-2), (java.lang.CharSequence) "\n  \r \r \r  h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ", 1, 19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("                   ", pattern1, "hi!    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                   " + "'", str3, "                   ");
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", pattern1, "hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n" + "'", str3, "\nhi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence3, charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n \n \n", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\r]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", (-31), 79);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r", " \n\r\n\r\n\r\n \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", "\n   \n   \n   \n", "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n" + "'", str3, "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r ", 8, 116);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n hi!\n hi!\n");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!\n hi!\n hi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!\n hi!\n hi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !, \n,  , h, i, !, \n,  , h, i, !, \n]");
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n", (java.lang.CharSequence) "\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", "\n                   \n                   \n                   \n\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n", pattern1, "\n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n" + "'", str3, "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n");
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n", "                   ", "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n" + "'", str3, "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n");
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n", "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!", "hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n" + "'", str3, "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n");
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", (java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n", " \r ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!\rhi!", 0, 496);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n", "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!   \n   \n   \n\r ", pattern1, "hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!   \n   \n   \n\r " + "'", str3, "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!   \n   \n   \n\r ");
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!", pattern1, "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!" + "'", str3, "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!");
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r", " \n\nhi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!", pattern1, "hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r ", "    h    i    !    \n    ", "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r " + "'", str3, " \r ");
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!", "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r", "\n                   \n                   \n                   \n \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!" + "'", str3, "hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!");
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", (java.lang.CharSequence) " \n\nhi!\n", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        short[] shortArray2 = new short[] { (short) 1, (byte) -1 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[1, -1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", " \r \r \r ", "\n                   \n                   \n                   \n \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n" + "'", str3, "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        char[] charArray9 = new char[] { '4', '#', '#', ' ', ' ', ' ' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4##   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4##   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, #, #,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\r", "  ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!   \n   \n   \n\r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n", pattern1, " \n\r\n\r\n\r\n \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n" + "'", str3, "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n");
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", (java.lang.CharSequence) "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!    ", (java.lang.CharSequence) "\r", 127);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "\nhi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        long[] longArray3 = new long[] { (-3), (-1L), 91 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-3, -1, 91]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", pattern1, "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n" + "'", str3, "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n");
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\n hi!\n hi!\n", "hi!hi!\rhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n                   \n                   \n                   \n\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "    ", (java.lang.CharSequence) "   ", 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        char[] charArray9 = new char[] { ' ', '#', '4', 'a', '#', '\r' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n hi!\n hi!\n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " #4a#\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " #4a#\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #, 4, a, #, \r]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!", (java.lang.CharSequence) "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!  \n \n \n \n \n \nhi!", "\n", "hi!  \n \n \n \n \n \nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi!  \n \n \n \n \n \nhi! \n \n \n \n \nhi!" + "'", str3, "hi!  hi!  \n \n \n \n \n \nhi! \n \n \n \n \nhi!");
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n", (-4), 639);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        char[] charArray9 = new char[] { '4', '#', '#', ' ', ' ', ' ' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4##   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4##   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, #, #,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!", pattern1, " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!" + "'", str3, "hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!");
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n\r\n\r\n\r\n \r \r ", (java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", "hi!  \n \n \n \n \n \nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!", (-23));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        char[] charArray10 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r \r \r ", charArray10);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", charArray10);
        java.lang.Class<?> wildcardClass21 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\r]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) "\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\r", 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n   \n   \n   \n", pattern1, "\n                   \n                   \n                   \n \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n   \n   \n   \n" + "'", str3, "\n   \n   \n   \n");
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n                   ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ", "hi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n  \r \r \r  h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r", (java.lang.CharSequence) "hi!\n hi!\n hi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!\rhi!", (java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n                   \n                   \n                   \n\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", 91);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n \n \n", charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n   \n   \n   \n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\r]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n\r\n\r\n\r\n \r \r ", (java.lang.CharSequence) "                   ", 559);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ", (int) (short) 10, 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   ", pattern1, "hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   " + "'", str3, "   ");
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!\n   \n   \n   \nhi!", 47, (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\n\nhi!\n", 26, 180);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r ", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\r]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n                   ", 24, 226);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r     h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!    ", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n   \n   \n   \n\r ", (java.lang.CharSequence) "    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  \r  \r \r \r \r\n\r\n\r\n \r \r ", "   ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n\nhi!\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!", (java.lang.CharSequence) "\nhi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\r]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 139 + "'", int13 == 139);
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \n\nhi!\n", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        long[] longArray3 = new long[] { (byte) 0, (-94), (byte) -1 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, -94, -1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", (java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", 127);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", " \r  \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r  \r \r \r \n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n" + "'", str3, " \r  \r \r \r \n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \r \r \r ", (java.lang.CharSequence) "\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  ", (java.lang.CharSequence) "    \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!  hi!  \n \n \n \n \n \nhi! \n \n \n \n \nhi!", 0, (-69));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!", pattern1, "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!" + "'", str3, "hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!");
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n                   ", (-559));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\nhi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        java.lang.String[] strArray1 = new java.lang.String[] { "\n" };
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray1);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n" + "'", str2, "\n");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r \r \r ", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!\n   \n   \n   \nhi!", 0, (-5));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n", 40, 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \n \n \n", "\n   \n   \n   \n", " \n\r\n\r\n\r\n \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n" + "'", str3, "\n \n \n \n");
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\n hi!\n hi!\n", false, 72, (java.lang.CharSequence) "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n", (-23), 33);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, 0, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r \r \r   \r \r \r ", 0, 180);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  ", "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n", "    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  " + "'", str3, "  ");
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!\rhi!", "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", "hi!\n hi!\n hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\rhi!" + "'", str3, "hi!hi!\rhi!");
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\n\nhi!\n", "    \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\nhi!\n" + "'", str3, "hi!\n\nhi!\n");
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" \r  \r \r \r \n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", (java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", " ", "\r", "\r", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n", (java.lang.CharSequence) "    ", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!", (java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!", (int) '\000');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ", (java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!", (java.lang.CharSequence) "hi!    ", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) " ", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n   \n   \n   \n", (java.lang.CharSequence) "    \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r     h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", (java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n   \n   \n   \n", " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n   \n   \n   \n" + "'", str3, "\n   \n   \n   \n");
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r  \r \r \r ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n", pattern1, "\n                   \n                   \n                   \n \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n\r\n\r\n\r\n \r \r ", "\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n", "  \r  \r \r \r \r\n\r\n\r\n \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r\n\r\n\r\n \r \r " + "'", str3, " \n\r\n\r\n\r\n \r \r ");
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n", (java.lang.CharSequence) "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r \r \r   \r \r \r ", (java.lang.CharSequence) "\n                   \n                   \n                   \n \r ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("    ", pattern1, "hi!\n hi!\n hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    " + "'", str3, "    ");
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "", 639, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "    h    i    !    \n    ", (int) '\000', (-496));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r", "hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, \n, \r, \n, \r, \n, \r, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, \r, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, \r, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n", pattern1, "hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n" + "'", str3, " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n");
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  ??   ?   ?   ?? ? ? ? ??????????????????????? ??????????????? ??????????????? ???????");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \r \r \r ", (java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray8 = new char[] { '#', 'a', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence3, charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, a, 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n\nhi!\n", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", (java.lang.CharSequence) " \r \r \r   \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n,  , h, i, !, \n, \n, h, i, !, \n,  , h, i, !, \n, \n, h, i, !, \n,  , h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n,  , h, i, !, \n, \n, h, i, !, \n,  , h, i, !, \n, \n, h, i, !, \n,  , h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n,  , h, i, !, \n, \n, h, i, !, \n,  , h, i, !, \n, \n, h, i, !, \n,  , h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \r, h, i, !, \n, \n, h, i, !, \n,  , h, i, !, \n, \n, h, i, !, \n]");
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", (java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!", pattern1, "\nhi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!" + "'", str3, "hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!");
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", (-31), 615);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n   \n   \n   \n\r ", "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n", "hi!\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n   \n   \n   \n\r " + "'", str3, "\n   \n   \n   \n\r ");
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        char[] charArray11 = new char[] { ' ', '#', '4', 'a', '#', '\r' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " #4a#\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " #4a#\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , #, 4, a, #, \r]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\n", " \r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.Class<?> wildcardClass11 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\n", pattern1, "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n" + "'", str3, "hi!\n");
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n", pattern1, "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n" + "'", str3, "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n");
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!\rhi!", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\r]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        double[] doubleArray5 = new double[] { 10, (-4), (byte) 10, 10L, (byte) -1 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, -4.0, 10.0, 10.0, -1.0]");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", (java.lang.CharSequence) "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", (java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n", (java.lang.CharSequence) "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", (java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n", 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 23 + "'", int1 == 23);
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n   \n   \n   \n\r ", charArray3);
        java.lang.Class<?> wildcardClass6 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n,  ,  ,  ,  , h,  ,  ,  ,  , i,  ,  ,  ,  , !,  ,  ,  ,  , \n,  ,  ,  ,  , \n,  ,  ,  ,  , h,  ,  ,  ,  , i,  ,  ,  ,  , !,  ,  ,  ,  , \n,  ,  ,  ,  , \n,  ,  ,  ,  , h,  ,  ,  ,  , i,  ,  ,  ,  , !,  ,  ,  ,  , \n,  ,  ,  ,  , \n,  , \r,  ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r ", 47, 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }
}

