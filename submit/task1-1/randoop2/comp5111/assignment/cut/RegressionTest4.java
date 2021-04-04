package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "\n\n\r\n\n\r\r\n\r", 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", " h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r" + "'", str3, "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 508, 67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", (-72), (-8));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\r\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", 63, 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray8 = new char[] { 'a', '#', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence3, charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\n\r\r\n\r", (int) (short) 0, (-30));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", pattern1, " hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ", (-144));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!hi!", pattern1, "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!" + "'", str3, "hi!hhi!ihi!!hi!");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        char[] charArray10 = new char[] { 'a', '#', '4' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\r", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "", "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! " + "'", str3, "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!", (java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! " + "'", str3, "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!", pattern1, "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", 4, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\r", (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        char[] charArray7 = new char[] { 'a', '#', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", charArray7);
        java.lang.Class<?> wildcardClass13 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r", charArray2);
        java.lang.Class<?> wildcardClass5 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", 25, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        double[] doubleArray4 = new double[] { 31, 0.0d, 10.0d, 9 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[31.0, 0.0, 10.0, 9.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", pattern1, " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) " \n \r h \n \r i \n \r ! \n \r ", (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n", true, 139, (java.lang.CharSequence) "\n", 2, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", "\n\n\r\n\n\r\r\n\r", "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! " + "'", str3, "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", false, 31, (java.lang.CharSequence) "\n", 17, (-8));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\n\r\r\n\r", "\r", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !       h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! " + "'", str3, "\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !       h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 536 + "'", int3 == 536);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", (-34), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n" + "'", str3, "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hhi!ihi!!hi!", "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!" + "'", str3, "hi!hhi!ihi!!hi!");
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r", (-98), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r", " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !       h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", 536);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n", "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n" + "'", str3, "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126 + "'", int2 == 126);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!" + "'", str3, "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!");
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", charSequence1, 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 60);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !       h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 580 + "'", int1 == 580);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", "\n\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! " + "'", str3, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", true, 15, (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\r\n\r\n\n\r\r\n\r", (-98), (-64));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "", 17, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r", (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", "", " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!" + "'", str3, " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !       h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "\n\r\n\n\r\r\n\r", 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\r", " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        java.lang.CharSequence charSequence3 = null;
        java.lang.CharSequence charSequence6 = null;
        char[] charArray11 = new char[] { 'a', '#', '4' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray11);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence6, charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence3, charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray11);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray6 = new char[] { 'a', '#', '4' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\n\r\r\n\r", (java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\n\r\r\n\r", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ ]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!hi!\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", pattern1, "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! " + "'", str3, "hi!hhi!ihi!!hi!\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", (java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" ", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", pattern1, "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! " + "'", str3, "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\n\n\r\r\n\r", "hi!hhi!ihi!!hi!\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", "\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !       h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\r\r\n\r" + "'", str3, "\n\n\r\n\n\r\r\n\r");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\r\n\r\n\n\r\r\n\r", false, 139, (java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", 100, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!", 91, (-252));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 536, 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", pattern1, "\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", 508);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r", 67, 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", 0, 77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray10 = new char[] { 'a', '#', '4' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence5, charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray10);
        java.lang.Class<?> wildcardClass18 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r", (java.lang.CharSequence) " \n \r h \n \r i \n \r ! \n \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r", 0, 118);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ", (-60), 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", (java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", 23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", pattern1, " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! " + "'", str3, "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", (java.lang.CharSequence) " hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\r\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n \r h \n \r i \n \r ! \n \r ", pattern1, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n \r h \n \r i \n \r ! \n \r " + "'", str3, " \n \r h \n \r i \n \r ! \n \r ");
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", (-8));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" h i ! h h i ! i h i ! ! h i ! ", pattern1, "\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !       h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " h i ! h h i ! i h i ! ! h i ! " + "'", str3, " h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", 4, 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! " + "'", str3, "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 599 + "'", int1 == 599);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!hi!\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", pattern1, "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! " + "'", str3, "hi!hhi!ihi!!hi!\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", (-91), (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 139);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ???? h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 143);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", pattern1, " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! " + "'", str3, "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", (java.lang.CharSequence) "\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ???????????????????? h i ! h h i ! i h i ! ! h i ! ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !       h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray9 = new char[] { 'a', '#', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence4, charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", 536);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!", "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!" + "'", str3, " hi!");
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ", "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n", "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\r\n\r\n\n\r\r\n\r", "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n" + "'", str3, "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n");
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", (-72), (-91));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", "\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!" + "'", str3, "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!");
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hhi!ihi!!hi!");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !, h, h, i, !, i, h, i, !, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r", charArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n \r h \n \r i \n \r ! \n \r ", (java.lang.CharSequence) "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", pattern1, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r" + "'", str3, "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\n\r\r\n\r", 3, 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", pattern1, "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! " + "'", str3, "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray10 = new char[] { '\000', '\n', '\000', '\r', '\n' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\r\n\r", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence2, charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\000\n\000\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\000\n\000\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\000, \n, \000, \r, \n]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n\r\n\n\r\r\n\r", "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\r\r\n\r" + "'", str3, "\n\n\r\n\n\r\r\n\r");
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, 31, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", "\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 137 + "'", int3 == 137);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", (java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n, \n, \r, \n, \n, \n, \r, \n, \r, \n, \n, \r,  , h,  , i,  , !,  , h,  , h,  , i,  , !,  , i,  , h,  , i,  , !,  , !,  , h,  , i,  , !,  ]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 144);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" h i ! h h i ! i h i ! ! h i ! ", pattern1, "hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " h i ! h h i ! i h i ! ! h i ! " + "'", str3, " h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r", (java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (-144), (-34));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\r\n\r\n\n\r\r\n\r", (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 33);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\r\n\n\r\r\n\r", " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "\n", "", "\n", "", "\n" };
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        java.lang.Class<?> wildcardClass10 = charSequenceArray5.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray10 = new char[] { 'a', '#', '4' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        java.lang.Class<?> wildcardClass19 = charArray10.getClass();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ", (-12), 137);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 100 };
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
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        int int16 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) byteArray4);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 10, 100]");
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\r\n\r\n\n\r\r\n\r", true, (-3), (java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 64, 41);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", " h i ! h h i ! i h i ! ! h i ! ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r" + "'", str3, "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\r\n\r\n\n\r\r\n\r", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! " + "'", str3, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ", "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\r\n\r\n\n\r\r\n\r", "\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! " + "'", str3, "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 129, 126);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", pattern1, "\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !       h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray10 = new char[] { '\000', '\n', '\000', '\r', '\n' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\r\n\r", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence2, charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !       h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\000\n\000\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\000\n\000\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\000, \n, \000, \r, \n]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", " hi!", "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! " + "'", str3, "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray9 = new char[] { 'a', '#', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence4, charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r", (java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 118);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", 6, 103);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        char[] charArray5 = new char[] { 'a', '#', '4' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        java.lang.Class<?> wildcardClass9 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, 9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray1);
        java.lang.Class<?> wildcardClass3 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" ", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", false, 10, (java.lang.CharSequence) "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ", (int) '\n', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , h,  , i,  , !,  , h,  , h,  , i,  , !,  , i,  , h,  , i,  , !,  , !,  , h,  , i,  , !,  ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, 508, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n", 0, (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, h, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, i, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! " + "'", str3, "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", 103);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", pattern1, "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! " + "'", str3, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", true, (-144), (java.lang.CharSequence) "hi!hhi!ihi!!hi!\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", 2, 536);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", (-8));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\r\n\r\n\n\r\r\n\r", pattern1, "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\r\n\r\n\n\r\r\n\r" + "'", str3, "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\r\n\r\n\n\r\r\n\r");
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray10 = new char[] { 'a', '#', '4' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence5, charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r", (int) '\r');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\r", (java.lang.CharSequence) "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!", 256, (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\r", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", false, (-35), (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 129, 33);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", pattern1, "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\r", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", pattern1, "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! " + "'", str3, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "\n\r", "hi!hhi!ihi!!hi!\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ", pattern1, " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  " + "'", str3, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ");
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
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
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str18 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str20 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str21 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n, \n, \r, \n, \n, \r, \r, \n, \r, h, h, i, !, i, h, i, !, !, h, i, !, h, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, i, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n", pattern1, "\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !       h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n" + "'", str3, "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n");
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (int) (byte) -1, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", pattern1, "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r" + "'", str3, "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) " hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", charSequence1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 144);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        char[] charArray9 = new char[] { 'a', '#', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray9);
        java.lang.Class<?> wildcardClass17 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 571 + "'", int1 == 571);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        char[] charArray10 = new char[] { 'a', '#', '4' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\r\n\r", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "hi!hhi!ihi!!hi!\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", 63, (-98));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" h i ! h h i ! i h i ! ! h i ! ", "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !       h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", 118);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! " + "'", str3, "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hhi!ihi!!hi!");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n \r h \n \r i \n \r ! \n \r ", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray6);
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
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", (int) (short) 10, 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !       h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !       h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", 3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 0, (byte) 10 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        int[] intArray5 = new int[] { (-30), (-91), (-3), (short) 0, 129 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) intArray5);
        java.lang.Class<?> wildcardClass8 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-30, -91, -3, 0, 129]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "", 77);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ", " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  " + "'", str3, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ");
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", true, (-19), (java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (-30), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", (int) '\r');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", 137, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\r\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 67 + "'", int1 == 67);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        char[] charArray9 = new char[] { 'a', '#', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\r", 77, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", "\n\n\r\n\n\r\r\n\r", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r" + "'", str3, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (int) '\r');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n \r h \n \r i \n \r ! \n \r ", false, 145, (java.lang.CharSequence) "\n\r\n\n\r\r\n\r", (-159), 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (-60));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\r\n\r\n\n\r\r\n\r", "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\r\n\r\n\n\r\r\n\r" + "'", str3, "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\r\n\r\n\n\r\r\n\r");
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", (java.lang.CharSequence) "\n\n\r\n\n\r\r\n\r", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", pattern1, " \n \r h \n \r i \n \r ! \n \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!" + "'", str3, " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!");
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\n\r\r\n\r", (java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", "\n\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", "\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !       h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", "\n\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! " + "'", str3, "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        float[] floatArray6 = new float[] { (short) -1, (byte) 1, (short) 10, 12, 63, (byte) 10 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0, 1.0, 10.0, 12.0, 63.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", true, (-3), (java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", 3, 145);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", (java.lang.CharSequence) " \n \r h \n \r i \n \r ! \n \r ", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n \r h \n \r i \n \r ! \n \r ", pattern1, " h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n \r h \n \r i \n \r ! \n \r " + "'", str3, " \n \r h \n \r i \n \r ! \n \r ");
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \n, \n, \r, \n, \n, \r, \r, \n, \r, h, h, i, !, i, h, i, !, !, h, i, !, h, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, i, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, \r, \n, \n, \r, \r, \n, \r, \n, \n, \n, \r, \n, \r, \n, \n, \r,  , h,  , i,  , !,  , h,  , h,  , i,  , !,  , i,  , h,  , i,  , !,  , !,  , h,  , i,  , !,  ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! " + "'", str3, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " \n \r h \n \r i \n \r ! \n \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 9, 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", pattern1, "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (-19), 64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ", pattern1, "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  " + "'", str3, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ");
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        char[] charArray10 = new char[] { 'a', '#', '4' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray10);
        java.lang.Class<?> wildcardClass18 = charArray10.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n", (-94), 256);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 87 + "'", int2 == 87);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", 60);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        char[] charArray8 = new char[] { 'a', '#', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", true, (int) (byte) 10, (java.lang.CharSequence) "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ", 94, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\r\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\r", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\r", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n, \r, \n, \n, \r, \r, \n, \r, h, \n, \r, \n, \n, \r, \r, \n, \r, i, \n, \r, \n, \n, \r, \r, \n, \r, !, \n, \r, \n, \n, \r, \r, \n, \r]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\r", (java.lang.CharSequence) "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", (java.lang.CharSequence) "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\r", (java.lang.CharSequence) "\n\r\n\n\r\r\n\r", 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\r\n\r\n\n\r\r\n\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ???????????????????? h i ! h h i ! i h i ! ! h i ! ????????????????");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, h, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, i, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, h, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, h, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, i, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, i, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, h, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, i, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, h, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, i, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-118) + "'", int3 == (-118));
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r" + "'", str3, "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r", (java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ", (java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hhi!ihi!!hi!", 43);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! " + "'", str3, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", pattern1, "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", pattern1, "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" ", pattern1, " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n", true, 87, (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\r\n\r\n\n\r\r\n\r", 129, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 144 + "'", int3 == 144);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\r\n\r" + "'", str3, "\n\n\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\r\n\r");
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r", true, 41, (java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 63, (-35));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", true, 16, (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", 256, (-252));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) "\r", 22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", (-8));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray8 = new char[] { 'a', '#', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence3, charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", (java.lang.CharSequence) "\n\r\n\n\r\r\n\r", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 12 + "'", int3 == 12);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
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
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ????????????hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\r\n\n\r\r\n\r", "\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", 599, 282);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", pattern1, "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ??????????hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!????????????????? h i ! h h i ! i h i ! ! h i ! ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", pattern1, "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r" + "'", str3, "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:       h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ???? h i ! h h i ! i h i ! ! h i ! h???? h i ! h h i ! i h i ! ! h i ! i???? h i ! h h i ! i h i ! ! h i ! !???? h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!????????");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 287 + "'", int3 == 287);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ", (-159));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 68, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", pattern1, "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", (int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", (java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! " + "'", str3, "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", (java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\r\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n", " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", pattern1, "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! " + "'", str3, "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", true, (-138), (java.lang.CharSequence) " ", 580, 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\n\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! " + "'", str3, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\r\n\r", (java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", (java.lang.CharSequence) " hi!", 64);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", false, (-98), (java.lang.CharSequence) "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", 400, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", true, (int) (short) 0, (java.lang.CharSequence) "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", (-252), 91);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" ", " h i ! h h i ! i h i ! ! h i ! ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", false, (-1), (java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", (-1), 60);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\r\n\r\n\n\r\r\n\r", 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", true, 143, (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", 256, 15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!", 8, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", (java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r" + "'", str3, "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 43, 103);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-63) + "'", int3 == (-63));
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        char[] charArray7 = new char[] { 'a', '#', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ , \n, \n, \n, \n,  , h,  , i,  , !,  , h,  , h,  , i,  , !,  , i,  , h,  , i,  , !,  , !,  , h,  , i,  , !,  , h, \n, \n, \n, \n,  , h,  , i,  , !,  , h,  , h,  , i,  , !,  , i,  , h,  , i,  , !,  , !,  , h,  , i,  , !,  , i, \n, \n, \n, \n,  , h,  , i,  , !,  , h,  , h,  , i,  , !,  , i,  , h,  , i,  , !,  , !,  , h,  , i,  , !,  , !, \n, \n, \n, \n,  , h,  , i,  , !,  , h,  , h,  , i,  , !,  , i,  , h,  , i,  , !,  , !,  , h,  , i,  , !,  ]");
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\n\r\r\n\r", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ ]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (-60), 103);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (-35));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", 22, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "\n\n\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\r\n\r", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", pattern1, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", false, 17, (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (-8), 159);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\r\n\n\r\r\n\r", " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", (java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        char[] charArray8 = new char[] { 'a', '#', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n \r h \n \r i \n \r ! \n \r ", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\n\r\r\n\r", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi!", "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!" + "'", str3, "hi!hhi!ihi!!hi!");
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        char[] charArray9 = new char[] { 'a', '#', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n \r h \n \r i \n \r ! \n \r ", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", " \n \r h \n \r i \n \r ! \n \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\n\r\r\n\r", pattern1, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\r\r\n\r" + "'", str3, "\n\n\r\n\n\r\r\n\r");
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", 571);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ", 64, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", "", " \n \r h \n \r i \n \r ! \n \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r" + "'", str3, " \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", 9, 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", pattern1, "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\r\n\r\n\n\r\r\n\r", (-22));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        char[] charArray12 = new char[] { '\000', '\n', '\000', '\r', '\n' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray12);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\r\n\r", charArray12);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", charArray12);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n \r h \n \r i \n \r ! \n \r ", charArray12);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray12);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray12);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\000\n\000\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\000\n\000\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\000, \n, \000, \r, \n]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hhi!ihi!!hi!");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !, h, h, i, !, i, h, i, !, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", " \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ", 68);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        double[] doubleArray3 = new double[] { 4, (short) -1, (short) 100 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[4.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", (java.lang.CharSequence) " hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", (java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!", pattern1, "\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!" + "'", str3, " hi!");
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", true, 138, (java.lang.CharSequence) " \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", 10, 143);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        char[] charArray9 = new char[] { 'a', '#', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\r", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", pattern1, "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r" + "'", str3, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", (-12));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", true, (-35), (java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (int) (short) 10, (int) '\n');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r" + "'", str3, "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        char[] charArray9 = new char[] { 'a', '#', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n\n\r\r\n\r", " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\n\n\r\r\n\r");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        java.lang.Class<?> wildcardClass5 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \r, \n, \n, \r, \r, \n, \r]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r", (java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\n\r\r\n\r", pattern1, "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\r\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\r\n\r" + "'", str3, "\n\r\n\n\r\r\n\r");
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" ", "hi!", "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", "", " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r" + "'", str3, " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 6, 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        char[] charArray5 = new char[] { 'a', '#', '4' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", (java.lang.CharSequence) "hi!hhi!ihi!!hi!", (-159));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", 100, 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!");
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , h, i, !]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", charSequence1, (-98));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        char[] charArray7 = new char[] { '#', 'a', '#', ' ', '\n' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", charArray7);
        java.lang.Class<?> wildcardClass10 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a# \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a# \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #,  , \n]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", (java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ", "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! " + "'", str3, "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ", (-3), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 355 + "'", int1 == 355);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" hi!", " h i ! h h i ! i h i ! ! h i ! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 73 + "'", int3 == 73);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", true, (-91), (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", 94, 22);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 75, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\r", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 138);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !       h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !       h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", charArray5);
        java.lang.Class<?> wildcardClass11 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hhi!ihi!!hi!\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", " ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!?hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!?hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!?hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!?hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", (java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", "\n\n\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\r\n\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, true, 16, (java.lang.CharSequence) "\n\n\r\n\n\r\r\n\r", (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n", (java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\n\n\r\r\n\r", true, 536, (java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 33, 138);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", 64, 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ???? h i ! h h i ! i h i ! ! h i ! h???? h i ! h h i ! i h i ! ! h i ! i???? h i ! h h i ! i h i ! ! h i ! !???? h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!?????????????????hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", (java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "", (java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !       h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", (java.lang.CharSequence) "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }
}

