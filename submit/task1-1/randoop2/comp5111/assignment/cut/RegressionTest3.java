package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", " hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! " + "'", str3, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", pattern1, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r" + "'", str3, "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", (java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r", (-35));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", "hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!" + "'", str3, "hi!hhi!ihi!!hi!");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!", " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", 64, (-60));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", 64);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! " + "'", str3, "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", pattern1, "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! " + "'", str3, "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", pattern1, "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r" + "'", str3, "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\r", (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \n \r h \n \r i \n \r ! \n \r ", 98);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n\n\r\r\n\r", "\n\r\n\n\r\r\n\r", "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r" + "'", str3, "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n \r h \n \r i \n \r ! \n \r ", pattern1, "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n \r h \n \r i \n \r ! \n \r " + "'", str3, " \n \r h \n \r i \n \r ! \n \r ");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        java.lang.CharSequence charSequence2 = null;
        java.lang.CharSequence charSequence5 = null;
        char[] charArray10 = new char[] { 'a', '#', '4' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence5, charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence2, charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r", charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\n\r\r\n\r", (int) (byte) 10, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:       h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", pattern1, "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", " \n \r h \n \r i \n \r ! \n \r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n\r\n\n\r\r\n\r", "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", false, 256, (java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", 5, 129);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        long[] longArray4 = new long[] { 100L, 1, 1, 100L };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        java.lang.Class<?> wildcardClass8 = longArray4.getClass();
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[100, 1, 1, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", 22, (-30));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", pattern1, "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" hi!", " ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" h i ! h h i ! i h i ! ! h i ! ", "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", "\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " h i ! h h i ! i h i ! ! h i ! " + "'", str3, " h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n\r\n\n\r\r\n\r", "hi!hhi!ihi!!hi!", "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\r\r\n\r" + "'", str3, "\n\n\r\n\n\r\r\n\r");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, 0, (int) '\r');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n", true, 17, (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", 2, 144);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", (java.lang.CharSequence) "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" ", "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", (-12), (-94));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) "\n\r\n\n\r\r\n\r", 159);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", " \n \r h \n \r i \n \r ! \n \r ", "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! " + "'", str3, "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", 15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ", (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! " + "'", str3, "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n", false, 12, (java.lang.CharSequence) " hi!", 23, (-94));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 68, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", (int) (byte) 0, 159);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r", (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 159);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        float[] floatArray0 = null;
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", true, 63, (java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ", 37, 23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" hi!", "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", true, (-72), (java.lang.CharSequence) "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", (-8), 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray10 = new char[] { 'a', '#', '4' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence5, charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hhi!ihi!!hi!");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray3);
        java.lang.Class<?> wildcardClass6 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, h, h, i, !, i, h, i, !, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        char[] charArray10 = new char[] { 'a', '#', '4' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\r", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n \r h \n \r i \n \r ! \n \r ", charArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) " \n \r h \n \r i \n \r ! \n \r ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, 41, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hhi!ihi!!hi!");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\n\r\r\n\r", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !, h, h, i, !, i, h, i, !, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", "\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r" + "'", str3, "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", true, 34, (java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", (-22), (-91));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", " h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r", true, (-3), (java.lang.CharSequence) "\n\r", 23, 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", " \n \r h \n \r i \n \r ! \n \r ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", true, 0, (java.lang.CharSequence) "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", 0, 72);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ ,  ,  ,  ,  ,  , h,  , i,  , !,  , h,  , h,  , i,  , !,  , i,  , h,  , i,  , !,  , !,  , h,  , i,  , !,  , h,  ,  ,  ,  ,  , h,  , i,  , !,  , h,  , h,  , i,  , !,  , i,  , h,  , i,  , !,  , !,  , h,  , i,  , !,  , i,  ,  ,  ,  ,  , h,  , i,  , !,  , h,  , h,  , i,  , !,  , i,  , h,  , i,  , !,  , !,  , h,  , i,  , !,  , !,  ,  ,  ,  ,  , h,  , i,  , !,  , h,  , h,  , i,  , !,  , i,  , h,  , i,  , !,  , !,  , h,  , i,  , !,  ]");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", false, 39, (java.lang.CharSequence) "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", 12, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!", "hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n", (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", (int) (byte) -1, 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", 23, 77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.Class<?> wildcardClass15 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 63 + "'", int3 == 63);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", (-34), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r", (-8));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", pattern1, " h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", "\n\r", "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! " + "'", str3, "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\n\n\r\r\n\r", true, 159, (java.lang.CharSequence) "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", (int) (byte) 100, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n", "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\r\n\n\r\r\n\r", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ", "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  " + "'", str3, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! " + "'", str3, "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" hi!", " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-252) + "'", int3 == (-252));
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        float[] floatArray3 = new float[] { 0, (byte) 1, (-12) };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) floatArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        java.lang.Class<?> wildcardClass9 = floatArray3.getClass();
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0, 1.0, -12.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r", charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", pattern1, " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", pattern1, "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r" + "'", str3, "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! " + "'", str3, "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", 137, 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", 138, 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        char[] charArray7 = new char[] { 'a', '#', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\n\r\r\n\r", charArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", (int) (byte) 100, 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (-3), 256);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r", charArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! " + "'", str3, " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", false, (int) '\000', charSequence3, 63, 94);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", false, (-252), (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 41, 43);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", true, 256, charSequence3, 9, 39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ", "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  " + "'", str3, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ");
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 75 + "'", int1 == 75);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! " + "'", str3, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r", (java.lang.CharSequence) "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", pattern1, "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\n\r\r\n\r", (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", 139);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r", pattern1, "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" ", "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 143 + "'", int3 == 143);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!", pattern1, "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 103 + "'", int1 == 103);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\r");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \n, \r, \n, \n, \r, \r, \n, \r]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 2, (-34));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", "\n\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 33 + "'", int3 == 33);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence4 = null;
        char[] charArray9 = new char[] { 'a', '#', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence4, charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\r\n\n\r\r\n\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ????????");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!", 143, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, 31);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", 64, 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", pattern1, " hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r" + "'", str3, "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!" + "'", str3, "hi!hhi!ihi!!hi!");
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\n\n\r\r\n\r");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \r, \n, \n, \r, \r, \n, \r]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r", (java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", "hi!hhi!ihi!!hi!", "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n", false, 31, (java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", 4, 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charSequence1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", (int) (short) 1, 77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!", (java.lang.CharSequence) "\r", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ", pattern1, "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  " + "'", str3, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ");
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \n \r h \n \r i \n \r ! \n \r ", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n \r h \n \r i \n \r ! \n \r " + "'", str3, " \n \r h \n \r i \n \r ! \n \r ");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        java.lang.CharSequence charSequence2 = null;
        java.lang.CharSequence charSequence5 = null;
        char[] charArray10 = new char[] { 'a', '#', '4' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence5, charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence2, charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) "\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r", " \n \r h \n \r i \n \r ! \n \r ", " hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r" + "'", str3, "\n\r");
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" ", "\n", "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "", (java.lang.CharSequence) "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ", (-34));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", false, (int) (short) -1, (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", (-3), (-30));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n", "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n", "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", (java.lang.CharSequence) " hi!", 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        short[] shortArray2 = new short[] { (short) -1, (byte) -1 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        java.lang.Class<?> wildcardClass8 = shortArray2.getClass();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", " ", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! " + "'", str3, " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n, \n, \r, \n, \n, \r, \r, \n, \r, h, h, i, !, i, h, i, !, !, h, i, !, h, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, i, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, \r, \n, \n, \r, \r, \n, \r]");
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) " ", 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n" + "'", str3, "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n");
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.Class<?> wildcardClass16 = strArray4.getClass();
        int int17 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 256 + "'", int1 == 256);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", " \n \r h \n \r i \n \r ! \n \r ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", false, (-30), (java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", 3, 98);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\n\r\n\n\r\r\n\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?????????");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! " + "'", str3, "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", 256);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!", false, 33, (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (-35), (-19));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n", false, 35, (java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 22, 51);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hhi!ihi!!hi!", 138);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        float[] floatArray3 = new float[] { 0, (byte) 1, (-12) };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) floatArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0, 1.0, -12.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ", (int) (byte) 0, (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\r\n\r", (java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", (int) '#', (-12));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hhi!ihi!!hi!");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, h, h, i, !, i, h, i, !, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r" + "'", str3, "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! " + "'", str3, " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "hi!hhi!ihi!!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", (java.lang.CharSequence) " hi!", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!hi!", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!" + "'", str3, "hi!hhi!ihi!!hi!");
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ", "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  " + "'", str3, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ");
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r" + "'", str3, "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", (java.lang.CharSequence) " \n \r h \n \r i \n \r ! \n \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (int) (short) 100, 63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!", "\n\r\n\n\r\r\n\r", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", (-144));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ", (int) (short) 10, 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\r", (java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ", "hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", (int) (short) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", 9, 256);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (int) (byte) 100, (-252));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n\n\r\r\n\r", " \n \r h \n \r i \n \r ! \n \r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ", "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! " + "'", str3, "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", "\n\n\r\n\n\r\r\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r", (java.lang.CharSequence) "\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        float[] floatArray3 = new float[] { 0.0f, 94, (short) 1 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) floatArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0, 94.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n, \n, \r, \n, \n, \r, \r, \n, \r, h, h, i, !, i, h, i, !, !, h, i, !, h, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, i, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, false, 2, charSequence3, (int) '\n', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", (-94));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 63);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n", "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", 67);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 43, (-159));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", "\n\r", "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! " + "'", str3, "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 118 + "'", int3 == 118);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" h i ! h h i ! i h i ! ! h i ! ", "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", (-60), (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ???????????????????? h i ! h h i ! i h i ! ! h i ! ?????????hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!????????");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", true, 118, (java.lang.CharSequence) "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", 23, (-30));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "\n\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" hi!", "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", " hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!" + "'", str3, " hi!");
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) " \n \r h \n \r i \n \r ! \n \r ", (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", (java.lang.CharSequence) "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 282 + "'", int1 == 282);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!", 16, 145);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        int[] intArray6 = new int[] { '\r', '\n', (short) 10, (-94), (short) 0, (byte) 100 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        java.lang.Class<?> wildcardClass13 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[13, 10, 10, -94, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        boolean[] booleanArray3 = new boolean[] { false, false, true };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray3), "[false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.Class<?> wildcardClass12 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 41);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        char[] charArray6 = new char[] { 'a', '#', '4' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n \r h \n \r i \n \r ! \n \r ", charArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) " \n \r h \n \r i \n \r ! \n \r ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", "\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!", true, (int) '\000', (java.lang.CharSequence) "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", 77, 91);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", (-144), 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", pattern1, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! " + "'", str3, " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        char[] charArray10 = new char[] { 'a', '#', '4' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" h i ! h h i ! i h i ! ! h i ! ", "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", (-144), (-30));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", (-144), 143);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! " + "'", str3, "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        float[] floatArray0 = new float[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        java.lang.Class<?> wildcardClass9 = floatArray0.getClass();
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", pattern1, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", 22, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", pattern1, "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! " + "'", str3, "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", (-34), (-60));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", (-144), 68);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\n\n\r\r\n\r", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray8 = new char[] { 'a', '#', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence3, charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", pattern1, " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", (java.lang.CharSequence) "", 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", (-3), 159);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r" + "'", str3, "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r");
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        boolean[] booleanArray6 = new boolean[] { true, true, false, true, false, true };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        java.lang.Class<?> wildcardClass9 = booleanArray6.getClass();
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, true, false, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", pattern1, " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! " + "'", str3, "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", pattern1, " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! " + "'", str3, "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r", (java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (-72), 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", 22, 256);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "\r", 64);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\r\n\r", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , h, i, !]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        long[] longArray1 = new long[] { (byte) -1 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) " \n \r h \n \r i \n \r ! \n \r ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \n \r h \n \r i \n \r ! \n \r ", 68);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 103, 144);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! " + "'", str3, "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) " ", 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 34 + "'", int3 == 34);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\r", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\r", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", charArray5);
        java.lang.Class<?> wildcardClass11 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n \r h \n \r i \n \r ! \n \r ", (java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" hi!", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n", "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! " + "'", str3, "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", pattern1, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! " + "'", str3, "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!", 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n \r h \n \r i \n \r ! \n \r ", pattern1, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n \r h \n \r i \n \r ! \n \r " + "'", str3, " \n \r h \n \r i \n \r ! \n \r ");
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n\n\r\r\n\r", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!", " \n \r h \n \r i \n \r ! \n \r ", "\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! " + "'", str3, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        int[] intArray0 = new int[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        java.lang.Class<?> wildcardClass4 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r" + "'", str3, "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\n\r\r\n\r", pattern1, "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\r\r\n\r" + "'", str3, "\n\n\r\n\n\r\r\n\r");
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\n\n\r\r\n\r", "\n\r\n\n\r\r\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        char[] charArray10 = new char[] { '\000', '\n', '\000', '\r', '\n' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\000\n\000\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\000\n\000\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\000, \n, \000, \r, \n]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", false, 8, (java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 143, 37);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r" + "'", str3, "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", true, 63, (java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 0, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray11 = new char[] { '\000', '\n', '\000', '\r', '\n' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray11);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\000\n\000\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\000\n\000\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\000, \n, \000, \r, \n]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "", 145, 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" h i ! h h i ! i h i ! ! h i ! ", pattern1, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " h i ! h h i ! i h i ! ! h i ! " + "'", str3, " h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence4 = null;
        char[] charArray9 = new char[] { 'a', '#', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence4, charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\n\r\r\n\r", charArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n", pattern1, "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n" + "'", str3, "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n");
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\r", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray3);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n", (int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", (int) '\n', 400);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, false, (-98), (java.lang.CharSequence) " hi!", 68, (-72));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.Class<?> wildcardClass11 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", (java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\r", (java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, \r]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\r", (-19), 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" h i ! h h i ! i h i ! ! h i ! ", "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\n", 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", " hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r" + "'", str3, "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", pattern1, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r" + "'", str3, "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", pattern1, "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r" + "'", str3, "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ", pattern1, "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! " + "'", str3, "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hhi!ihi!!hi!", "\n\r\n\n\r\r\n\r", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!" + "'", str3, "hi!hhi!ihi!!hi!");
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n", true, (-30), (java.lang.CharSequence) " hi!", (-60), 12);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!", pattern1, "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", 20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r", " \n \r h \n \r i \n \r ! \n \r ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 508 + "'", int2 == 508);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 77 + "'", int1 == 77);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" h i ! h h i ! i h i ! ! h i ! ", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", 103);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ", 15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r" + "'", str3, "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " ", (java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ", "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  " + "'", str3, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ");
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", true, 63, (java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 0, 34);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        short[] shortArray2 = new short[] { (short) 1, (byte) 1 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ????? h i ! h h i ! i h i ! ! h i ! ?????? h i ! h h i ! i h i ! ! h i ! ???? h i ! h h i ! i h i ! ! h i ! ????? h i ! h h i ! i h i ! ! h i ! ???? h i ! h h i ! i h i ! ! h i ! ????? h i ! h h i ! i h i ! ! h i ! ????? h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", false, 37, (java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", 103, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", " hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! " + "'", str3, "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", 19, 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ????hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!??????");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n\r\n\n\r\r\n\r", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", " \n \r h \n \r i \n \r ! \n \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\r\r\n\r" + "'", str3, "\n\n\r\n\n\r\r\n\r");
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", "\n", "hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! " + "'", str3, "hi!hhi!ihi!!hi!\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n \r h \n \r i \n \r ! \n \r ", pattern1, "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n \r h \n \r i \n \r ! \n \r " + "'", str3, " \n \r h \n \r i \n \r ! \n \r ");
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ", "hi!hhi!ihi!!hi!\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", "\n\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  " + "'", str3, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ");
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str18 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.Class<?> wildcardClass19 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 9, 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        char[] charArray8 = new char[] { 'a', '#', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\r\n\r\n\n\r\r\n\r" + "'", str3, "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\r\n\r\n\n\r\r\n\r");
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\n\r\r\n\r", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\r", charArray6);
        java.lang.Class<?> wildcardClass12 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        char[] charArray11 = new char[] { 'a', '#', '4' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray11);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\r", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray11);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray3);
        java.lang.Class<?> wildcardClass6 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, h, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, i, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray8 = new char[] { 'a', '#', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence3, charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n \r h \n \r i \n \r ! \n \r ", charArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", (-144));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! " + "'", str3, "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", 68, 77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 0, (-91));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", false, 64, (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (-8), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r" + "'", str3, "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", (java.lang.CharSequence) "", 144);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 137 + "'", int3 == 137);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", (java.lang.CharSequence) "hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" ", "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!", pattern1, "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!" + "'", str3, " hi!");
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", pattern1, " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! " + "'", str3, " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-138) + "'", int3 == (-138));
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\n\r\n\n\r\r\n\r", (-63));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " ", 0, 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ", "hi!hhi!ihi!!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 118 + "'", int1 == 118);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        int[] intArray6 = new int[] { '\r', '\n', (short) 10, (-94), (short) 0, (byte) 100 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[13, 10, 10, -94, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n \r h \n \r i \n \r ! \n \r ", 68, (-60));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n, \n, \n, \r, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, h, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, i, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !,  ,  , h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, h, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, i, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, \n, \r, \r, \n, \r]");
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r" + "'", str3, "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, \n, \n, \n,  , h,  , i,  , !,  , h,  , h,  , i,  , !,  , i,  , h,  , i,  , !,  , !,  , h,  , i,  , !,  ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\r", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r", (java.lang.CharSequence) "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n" + "'", str3, "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n");
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ", pattern1, " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  " + "'", str3, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ");
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\r\n\n\r\r\n\r", "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\r\n\r" + "'", str3, "\n\r\n\n\r\r\n\r");
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!hhi!ihi!!hi!\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!hhi!ihi!!hi!\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, \r, \n, \n, \n, \r, \n, \r, \n, \n, \r, \n, \r, \n, \n, \r, \r, \n, \r,  , h,  , i,  , !,  , h,  , h,  , i,  , !,  , i,  , h,  , i,  , !,  , !,  , h,  , i,  , !,  ]");
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", pattern1, "\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! " + "'", str3, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, h, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, i, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ", "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! " + "'", str3, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", (java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (int) (byte) 1, (-64));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", "\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", pattern1, " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! " + "'", str3, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hhi!ihi!!hi!");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !, h, h, i, !, i, h, i, !, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", (-19));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (-159), (-144));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\n\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        char[] charArray9 = new char[] { '\000', '\n', '\000', '\r', '\n' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\000\n\000\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\000\n\000\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\000, \n, \000, \r, \n]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 12 + "'", int13 == 12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        long[] longArray4 = new long[] { 100L, 1, 1, 100L };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        java.lang.Class<?> wildcardClass9 = longArray4.getClass();
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[100, 1, 1, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r", pattern1, "\n\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r" + "'", str3, "\n\r");
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", " ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", 43, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", (java.lang.CharSequence) "", 68);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", pattern1, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n, \n, \r, \n, \n, \r, \r, \n, \r, h, h, i, !, i, h, i, !, !, h, i, !, h, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, i, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", pattern1, " \n \r h \n \r i \n \r ! \n \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! " + "'", str3, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", pattern1, "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n h i ! h h i ! i h i ! ! h i ! " + "'", str3, "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\r", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n \r h \n \r i \n \r ! \n \r ", (java.lang.CharSequence) "", 144);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 23 + "'", int3 == 23);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\r\n\n\r\r\n\r", "\n\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }
}

