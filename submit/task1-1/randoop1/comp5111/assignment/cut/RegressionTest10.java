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
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", true, 9, (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 333, (-120));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi!hi!hi!hi!\n", (java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        char[] charArray7 = new char[] { 'a', ' ', ' ', ' ' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!", pattern1, "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!" + "'", str3, " hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", true, (int) (short) 0, (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 39, 22);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!\rhi!hi!hi!\rhi!hi!hi!\rhi!hi!", "hi! hi!hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!", " hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\rhi!hi!hi!\rhi!hi!hi!\rhi!hi!" + "'", str3, "hi!hi!hi!\rhi!hi!hi!\rhi!hi!hi!\rhi!hi!");
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        char[] charArray7 = new char[] { ' ', ' ', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!", pattern1, "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!", false, 849, (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\n", 6, (-84));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\r", (java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", 11, (-94));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!", "hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", (java.lang.CharSequence) "hi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", "hi!hi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!" + "'", str3, "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\nhi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " hi!hi!hi!hi!\nhi!hi!h hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!hi!", "hi!hi!", "hi!hi!hi!hi!" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hi!" + "'", str4, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!hi!" + "'", str5, "hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!" + "'", str7, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!hi!" + "'", str8, "hi!hi!");
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        double[] doubleArray0 = new double[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) doubleArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray8 = new char[] { '4', ' ', '#' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence4, charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4,  , #]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!", pattern1, "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!" + "'", str3, " hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r", pattern1, "hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  hi!hi!hi!hi!hi!hi!hi!hi!?hhi!hi!hi!hi!hi!hi!hi!hi!?ihi!hi!hi!hi!hi!hi!hi!hi!?!hi!hi!hi!hi!hi!hi!hi!hi!?hhi!hi!hi!hi!hi!hi!hi!hi!?ihi!hi!hi!hi!hi!hi!hi!hi!?!hi!hi!hi!hi!hi!hi!hi!hi!?hhi!hi!hi!hi!hi!hi!hi!hi!?ihi!hi!hi!hi!hi!hi!hi!hi!?!hi!hi!hi!hi!hi!hi!hi!hi!??hi!hi!hi!hi!hi!hi!hi!hi!?hhi!hi!hi!hi!hi!hi!hi!hi!?ihi!hi!hi!hi!hi!hi!hi!hi!?!hi!hi!hi!hi!hi!hi!hi!hi!?hhi!hi!hi!hi!hi!hi!hi!hi!?ihi!hi!hi!hi!hi!hi!hi!hi!?!hi!hi!hi!hi!hi!hi!hi!hi!?hhi!hi!hi!hi!hi!hi!hi!hi!?ihi!hi!hi!hi!hi!hi!hi!hi!?!hi!hi!hi!hi!hi!hi!hi!hi!??hi!hi!hi!hi!hi!hi!hi!hi!?hhi!hi!hi!hi!hi!hi!hi!hi!?ihi!hi!hi!hi!hi!hi!hi!hi!?!hi!hi!hi!hi!hi!hi!hi!hi!?hhi!hi!hi!hi!hi!hi!hi!hi!?ihi!hi!hi!hi!hi!hi!hi!hi!?!hi!hi!hi!hi!hi!hi!hi!hi!?hhi!hi!hi!hi!hi!hi!hi!hi!?ihi!hi!hi!hi!hi!hi!hi!hi!?!hi!hi!hi!hi!hi!hi!hi!hi!??hi!hi!hi!hi!hi!hi!hi!hi!? hi!hi!hi! hi!hi!hi!hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", " hi!hi!hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!" + "'", str3, "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\n", "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!\nhi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\n" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\n");
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", (java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        char[] charArray10 = new char[] { ' ', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\n", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\n", "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\n" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\n");
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!", pattern1, " hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!\n hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!" + "'", str3, " hi!");
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!", (-9));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        char[] charArray11 = new char[] { ' ', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\n", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", charArray11);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!", charArray11);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray11);
        int int21 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", (-27));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        boolean[] booleanArray3 = new boolean[] { false, false, true };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        java.lang.Class<?> wildcardClass17 = booleanArray3.getClass();
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray3), "[false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 1 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 1]");
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
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " " + "'", str10, " ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray9 = new char[] { ' ', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence1, charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!\rhi!hi!hi!\rhi!hi!hi!\rhi!hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\n", (java.lang.CharSequence) " hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        char[] charArray5 = new char[] { '\n', '#', ' ' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\n# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\n# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\n, #,  ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str16 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        long[] longArray5 = new long[] { '\n', 693, 1L, (-9), (-6) };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        java.lang.Class<?> wildcardClass11 = longArray5.getClass();
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[10, 693, 1, -9, -6]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\nhi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 949 + "'", int1 == 949);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " " + "'", str8, " ");
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! \rhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        char[] charArray4 = new char[] {};
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, false, 66, (java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!", 7, 879);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! ", "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", " hi!hi!hi!hi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! " + "'", str3, "hi! ");
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\n", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray8);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", true, (-27), (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", 694, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!hi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray6 = new char[] { '4', ' ', '#' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence2, charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4,  , #]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "  hi!hi!hi! hi!hi!hi!hi!hi!", 787);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!hi!hi!hi!hi!", "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", false, (-840), (java.lang.CharSequence) "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", 339, 352);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", (java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (-15), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! \rhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! ", (java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\n", 766);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hhi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!ihi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence1 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! ", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!hi!hi!hi!hi!\r", pattern1, "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!\r" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!\r");
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        char[] charArray9 = new char[] { ' ', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\n", charArray9);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        char[] charArray9 = new char[] { ' ', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\n", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        char[] charArray7 = new char[] { ' ', ' ', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        java.lang.CharSequence charSequence2 = null;
        java.lang.CharSequence charSequence3 = null;
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!hi!");
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence3, charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence2, charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[h, i, !, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi!hi!hi!\nhi!hi!h hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!", 54, (-27));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        long[] longArray1 = new long[] { (-1L) };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
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
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi!", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        java.lang.Class<?> wildcardClass8 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "\nhi! hi!hhi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", 9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        char[] charArray11 = new char[] { ' ', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray11);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi! hi!hhi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "", (java.lang.CharSequence) "  hi!hi!hi! hi!hi!hi!hi!hi!", (-33));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\n", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi!hi!hi!", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi!\n", "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\n" + "'", str3, "hi!hi!hi!\n");
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", " hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!", " hi!hi!hi!hi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray2);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " " + "'", str11, " ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " " + "'", str13, " ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " " + "'", str14, " ");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        char[] charArray9 = new char[] { ' ', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\n", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "  hi!hi!hi! hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (-22));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  hi!hi!hi! hi!hi!hi!hi!hi!", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", true, 19, (java.lang.CharSequence) "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hhi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!ihi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", 21, 67);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n", (-18), 44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", pattern1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!" + "'", str3, " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!", (java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        boolean[] booleanArray1 = new boolean[] { true };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray1), "[true]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
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
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "", 4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " " + "'", str8, " ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 339, (-604));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hhi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!ihi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi!", 699, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "", false, 36, (java.lang.CharSequence) "hi!hi!hi!\r", 0, (-27));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!hi!hi!");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!", (-849), 787);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", (java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\r", true, (-682), (java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", 44, (-54));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        char[] charArray5 = new char[] { ' ', ' ', '4' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (-840));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\rhi!hi!hi!\rhi!hi!hi!\rhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (int) ' ', (-63));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!", " hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!\n hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!" + "'", str3, " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hhi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!ihi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray8 = new char[] { '4', ' ', '#' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence4, charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!hi!", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", charArray8);
        java.lang.Class<?> wildcardClass15 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4,  , #]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        short[] shortArray3 = new short[] { (short) 100, (short) 100, (short) 1 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) shortArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[100, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        java.lang.CharSequence charSequence7 = null;
        char[] charArray11 = new char[] { '4', ' ', '#' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence7, charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray11);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi!hi!hi!", charArray11);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", charArray11);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  , #]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\r", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n", pattern1, "hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! \rhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!", (-618));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, false, (-840), (java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 249, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi! ", 84);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\n", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.Class<?> wildcardClass11 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi! hi!hhi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! ", true, 879, (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\n", 50, 124);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!\n\rhi!hi!hi!\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!\n", pattern1, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!\n" + "'", str3, " hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!\n");
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence3, charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!\n hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!", charArray8);
        java.lang.Class<?> wildcardClass15 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (-19), 696);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi!hi!hi!hi!hi!hi!hi!", "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!\n", (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!hi!hi!?hhi!hi!hi!?ihi!hi!hi!?!hi!hi!hi!?hhi!hi!hi!?ihi!hi!hi!?!hi!hi!hi!?hhi!hi!hi!?ihi!hi!hi!?!hi!hi!hi!??hi!hi!hi!?hhi!hi!hi!?ihi!hi!hi!?!hi!hi!hi!?hhi!hi!hi!?ihi!hi!hi!?!hi!hi!hi!?hhi!hi!hi!?ihi!hi!hi!?!hi!hi!hi!??hi!hi!hi!?hhi!hi!hi!?ihi!hi!hi!?!hi!hi!hi!?hhi!hi!hi!?ihi!hi!hi!?!hi!hi!hi!?hhi!hi!hi!?ihi!hi!hi!?!hi!hi!hi!??hi!hi!hi!?hi!hi!hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\n", 696, (-94));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        char[] charArray5 = new char[] { '\n', '#', ' ' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\n# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\n# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\n, #,  ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (java.lang.CharSequence) "\r", (-697));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", pattern1, "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!" + "'", str3, "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (-22), 682);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!", "hi!hi!hi!\rhi!hi!hi!\rhi!hi!hi!\rhi!hi!", "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!" + "'", str3, " hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " " + "'", str11, " ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " " + "'", str12, " ");
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", pattern1, " hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!" + "'", str3, "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", false, (int) '\n', (java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", 214, (-697));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray12 = new char[] { ' ', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray12);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray12);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi!", charArray12);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!", charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray12);
        int int22 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray12);
        int int23 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!", charArray12);
        int int24 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\rhi!hi!hi!\rhi!hi!hi!\rhi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!\r", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " " + "'", str11, " ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " " + "'", str13, " ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " " + "'", str14, " ");
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!\n\rhi!hi!hi!\n", "hi! hi!hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!\n\rhi!hi!hi!\n" + "'", str3, "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!\n\rhi!hi!hi!\n");
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!hi!hi!\n\rhi!hi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!", 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi! hi!hhi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray6);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!\n", true, 90, (java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!", 74, 339);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" ", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str16 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " " + "'", str10, " ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " " + "'", str14, " ");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " " + "'", str16, " ");
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        char[] charArray11 = new char[] { ' ', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi!hi!hi!", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", charArray11);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        boolean[] booleanArray6 = new boolean[] { false, false, true, false, false, true };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) booleanArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[false, false, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", " hi!", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!\nhi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, " hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!\nhi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (-73));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        char[] charArray10 = new char[] { ' ', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray10);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray2);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", " hi!hi!hi!hi!hi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        char[] charArray10 = new char[] { ' ', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray10);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!\n\rhi!hi!hi!\n", (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 347 + "'", int2 == 347);
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!\n", 22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        boolean[] booleanArray6 = new boolean[] { false, false, true, false, false, true };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[false, false, true, false, false, true]");
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
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray9 = new char[] { '4', ' ', '#' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence5, charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  , #]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hi!\n", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\r", false, 17, (java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (-15), 17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "  hi!hi!hi! hi!hi!hi!hi!hi!", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!hi!", " hi!hi!hi! hi!hi!hi! hi!hi!hi!", " hi!hi!hi!" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", 15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ? hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!\nhi!hi!hi!hi!hi!hi!", pattern1, "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hhi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!ihi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!\nhi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", (java.lang.CharSequence) "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        char[] charArray11 = new char[] { ' ', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\n", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", charArray11);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!", charArray11);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\r", (int) 'a', (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! ", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!hi!", "hi!hi!", "hi!hi!hi!hi!" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hi!" + "'", str4, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!hi!" + "'", str5, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!" + "'", str6, "hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!" + "'", str9, "hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!hi!" + "'", str11, "hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!\n\rhi!hi!hi!\n", "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 70 + "'", int3 == 70);
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        char[] charArray9 = new char[] { ' ', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!hi!hi!\rhi!hi!hi!\rhi!hi!hi!\rhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\r", (-333));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi! hi!hhi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! ", "hi!hi!hi!\nhi!hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!", (-124), 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 44);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) " hi!hi!hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        int[] intArray5 = new int[] { (short) 10, 91, (short) 0, (short) 100, (byte) 10 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) intArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 91, 0, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", (java.lang.CharSequence) "\nhi! hi!hhi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", " hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!\n", "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!", (-48), 352);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!\r", "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str16 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " " + "'", str10, " ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " " + "'", str11, " ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " " + "'", str14, " ");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " " + "'", str16, " ");
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        long[] longArray4 = new long[] { 649, (byte) 10, 48, 879 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[649, 10, 48, 879]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", pattern1, "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!" + "'", str3, "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r", 849, 116);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence1 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence1, charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (-32), (-27));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!hi!hi!hi!", charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, h, i, !, h, i, !, \n, \r, h, i, !, h, i, !, h, i, !, \n, h, i, !,  , h, i, !, h, i, !, h, i, !, \n, \r, h, i, !, h, i, !, h, i, !, \n, h, i, !, h, h, i, !, h, i, !, h, i, !, \n, \r, h, i, !, h, i, !, h, i, !, \n, h, i, !, i, h, i, !, h, i, !, h, i, !, \n, \r, h, i, !, h, i, !, h, i, !, \n, h, i, !, !, h, i, !, h, i, !, h, i, !, \n, \r, h, i, !, h, i, !, h, i, !, \n, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray8 = new char[] { '4', ' ', '#' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence4, charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4,  , #]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "", (-20), (-333));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\r", (java.lang.CharSequence) " hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!\n hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!\n", 643);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!", " hi!hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!" + "'", str3, "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "hi!hi!hi!\n\rhi!hi!hi!\n", "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!" + "'", str3, "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str16 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" ", pattern1, "hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!hi!hi!hi!hi!hi!\r", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 25 + "'", int3 == 25);
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!", (java.lang.CharSequence) " hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!", 17, 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) " hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence1 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!hi!hi!hi!hi!\n", true, 634, (java.lang.CharSequence) "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hhi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!ihi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", (-63), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!", pattern1, " hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!\n hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", pattern1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!" + "'", str3, "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!", 349, (-6));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, \n, h, i, !, h, i, !, h, i, !, \n, h, i, !, h, i, !, h, i, !, \n]");
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        char[] charArray11 = new char[] { ' ', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray11);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray11);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray11);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hhi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!ihi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hhi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!ihi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray10 = new char[] { '4', ' ', '#' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence6, charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray10);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4,  , #]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!\n\rhi!hi!hi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! \rhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! ", "hi!hi!hi!\n\rhi!hi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\nhi!hi!hi!hi!", true, (-20), (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 705, (-9));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray8 = new char[] { '4', ' ', '#' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence4, charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!", charArray8);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!\n\rhi!hi!hi!\n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4,  , #]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hhi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!ihi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "\r", "\nhi! hi!hhi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        char[] charArray7 = new char[] { ' ', ' ', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        float[] floatArray3 = new float[] { (-1.0f), '\n', (byte) -1 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) floatArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        char[] charArray6 = new char[] { ' ', ' ', '4' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi! hi!hhi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, " hi!hi!hi! hi!hi!hi! hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" ", "hi!hi!hi!hi!hi!hi!hi!hi!\r", "\nhi! hi!hhi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray9 = new char[] { '4', ' ', '#' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence5, charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi!hi!hi!", charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        java.lang.Class<?> wildcardClass18 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  , #]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", false, 129, (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (int) (byte) -1, (-20));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray6 = new char[] { '4', ' ', '#' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence2, charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4,  , #]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int18 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\n", true, (int) '\000', (java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!", 14, (-18));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! \rhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! ", "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        char[] charArray4 = new char[] {};
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!hi!hi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 154 + "'", int1 == 154);
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!", "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
        char[] charArray6 = new char[] {};
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi!", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! ", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", charArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, " hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 538 + "'", int1 == 538);
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! \rhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! ", " ", "hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!hi!hi!\rhi!hi!hi!\rhi!hi!hi!\rhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray2);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi!", (int) ' ', (-33));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", true, 5, (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (int) '#', 7);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!", false, (-51), (java.lang.CharSequence) "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", 699, 42);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!", false, (-10), (java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 710, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ , h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !, h, i, !, h, i, !]");
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! ", "hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! " + "'", str3, "hi! ");
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, h, i, !, h, i, !, h, h, i, !, h, i, !, h, i, !, i, h, i, !, h, i, !, h, i, !, !, h, i, !, h, i, !, h, i, !, h, h, i, !, h, i, !, h, i, !, i, h, i, !, h, i, !, h, i, !, !, h, i, !, h, i, !, h, i, !, h, h, i, !, h, i, !, h, i, !, i, h, i, !, h, i, !, h, i, !, !, h, i, !, h, i, !, h, i, !, h, h, i, !, h, i, !, h, i, !, i, h, i, !, h, i, !, h, i, !, !, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", " ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
        float[] floatArray4 = new float[] { 10.0f, 0.0f, '#', 0L };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0, 0.0, 35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", true, 24, (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (-9), 21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!\r", 643);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence2, charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hhi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!ihi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!hi!", "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi!hi!hi!", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        java.lang.CharSequence charSequence7 = null;
        char[] charArray11 = new char[] { '4', ' ', '#' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence7, charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!hi!", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!\n hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!", charArray11);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", charArray11);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  , #]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hhi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!ihi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hi!hi!hi!hi!hi!\r", " hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!", "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!\r" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!\r");
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
        char[] charArray7 = new char[] { ' ', ' ', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", charArray7);
        java.lang.Class<?> wildcardClass13 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!", pattern1, "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!");
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r", "hi!hi!hi!\r", "hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray2);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " " + "'", str12, " ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " hi!hi!hi!", 91);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence2, charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!\n\rhi!hi!hi!\n", (java.lang.CharSequence) "hi!hi!hi!\rhi!hi!hi!\rhi!hi!hi!\rhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" hi!hi!hi! hi!hi!hi! hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r", (java.lang.CharSequence) " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
        char[] charArray12 = new char[] { ' ', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray12);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!", charArray12);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\n", charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", charArray12);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray12);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray12);
        int int22 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", 90, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", 74, 214);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray9 = new char[] { '4', ' ', '#' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence5, charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  , #]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
        char[] charArray7 = new char[] { ' ', ' ', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray10 = new char[] { ' ', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence5, charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\n", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!", charArray10);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", (java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! ", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi!", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!\n", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!", charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray9 = new char[] { ' ', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence4, charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!\n hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!", "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!\n\rhi!hi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!" + "'", str3, " hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!", charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" hi!hi!hi!", " hi!hi!hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-700) + "'", int3 == (-700));
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!hi!hi!\n\rhi!hi!hi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", " hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n");
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", false, 46, (java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 340, (-849));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hhi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!ihi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", (java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", 519);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\n");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!hi!hi!\n\rhi!hi!hi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!hi!hi!\n\rhi!hi!hi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, h, i, !, h, i, !, \n, \r, h, i, !, h, i, !, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", " hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!\n", "hi!hi!hi!\nhi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5361");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!hi!", " hi!hi!hi! hi!hi!hi! hi!hi!hi!", " hi!hi!hi!" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5363");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!", "hi! ", "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!" + "'", str3, "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5364");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5365");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!\rhi!hi!hi!\rhi!hi!hi!\rhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!" + "'", str3, " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5367");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\n", 124);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5368");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5369");
        char[] charArray9 = new char[] { ' ', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5370");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, " hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5372");
        boolean[] booleanArray3 = new boolean[] { false, false, true };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) booleanArray3);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean18);
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5373");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
        java.lang.CharSequence charSequence7 = null;
        char[] charArray11 = new char[] { '4', ' ', '#' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence7, charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray11);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray11);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!", charArray11);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  , #]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5375");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5376");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (-831), (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!\r", "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5378");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5379");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! ", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5381");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!\n\rhi!hi!hi!\n", (java.lang.CharSequence) " hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5382");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5383");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi!hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", " hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, " hi!hi!hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5384");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi! hi!hhi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! ", (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray2);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " " + "'", str11, " ");
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5386");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi! hi!hhi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! ", (-700), 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5387");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!\n", false, 0, (java.lang.CharSequence) " hi!", 19, 12);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5388");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!hi!", "hi!hi!", "hi!hi!hi!hi!" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hi!" + "'", str4, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!hi!" + "'", str5, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!" + "'", str6, "hi!hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!hi!" + "'", str8, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!" + "'", str9, "hi!hi!");
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5390");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n", " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!", pattern1, "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!" + "'", str3, " hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5392");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", "hi! ", "hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n" + "'", str3, "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n");
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5393");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5394");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, " hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5395");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi!hi!\nhi!hi!h hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5396");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " " + "'", str10, " ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5398");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5399");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5401");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!hi!hi!", pattern1, "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5403");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!", " hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5404");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5405");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", true, (int) (short) 0, (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", 17, 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5406");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi! hi!hhi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! ", (java.lang.CharSequence) "\n", (-94));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5407");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!\n", "hi!hi!hi!hi!hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5409");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\n", "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\n" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\n");
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "hi!hi!hi!\nhi!hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5411");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!", pattern1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!");
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5412");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("  hi!hi!hi! hi!hi!hi!hi!hi!", "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hhi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!ihi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!hi!hi! hi!hi!hi!hi!hi!" + "'", str3, "  hi!hi!hi! hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5413");
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!hi!hi!hi!", charArray8);
        java.lang.Class<?> wildcardClass15 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5414");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 33);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5415");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str16 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " " + "'", str11, " ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " " + "'", str13, " ");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " " + "'", str16, " ");
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5416");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence4 = null;
        char[] charArray8 = new char[] { '4', ' ', '#' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence4, charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        java.lang.Class<?> wildcardClass16 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4,  , #]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", 538);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5418");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 716 + "'", int1 == 716);
    }

    @Test
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5419");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5420");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", 6, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.Class<?> wildcardClass12 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5422");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" hi!hi!hi!hi!hi!", " hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!\n hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi!hi!hi!" + "'", str3, " hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5423");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!\r", " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5424");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi!hi! hi!hi!hi! hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi! hi!hi!hi! hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, " hi!hi!hi! hi!hi!hi! hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5425");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!", (-51), 705);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5426");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5427");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5428");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", 12, 691);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5429");
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi!hi!hi!", charArray8);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5430");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5431");
        java.lang.CharSequence charSequence7 = null;
        char[] charArray11 = new char[] { '4', ' ', '#' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence7, charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!hi!", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!\n hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!", charArray11);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", charArray11);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  , #]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5432");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence1 = null;
        char[] charArray12 = new char[] { ' ', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray12);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray12);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray12);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray12);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence1, charArray12);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5433");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!", (java.lang.CharSequence) "hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! \rhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! ", (-91));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5434");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", 20, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5435");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5436");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!\nhi!hi!", pattern1, "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhi!hi!" + "'", str3, "hi!hi!hi!\nhi!hi!");
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5437");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 20, 201);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5438");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5439");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!", "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5440");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!\nhi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!?hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5441");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str16 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5442");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray10 = new char[] { ' ', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence3, charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray10);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5443");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 849, 154);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5444");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5445");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! \rhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! ", " hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!\n hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! \rhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! " + "'", str3, "hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! \rhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! ");
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5446");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 333, 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5447");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  hi!hi!hi!hi!hi!hi!hi!hi!?hhi!hi!hi!hi!hi!hi!hi!hi!?ihi!hi!hi!hi!hi!hi!hi!hi!?!hi!hi!hi!hi!hi!hi!hi!hi!?hhi!hi!hi!hi!hi!hi!hi!hi!?ihi!hi!hi!hi!hi!hi!hi!hi!?!hi!hi!hi!hi!hi!hi!hi!hi!?hhi!hi!hi!hi!hi!hi!hi!hi!?ihi!hi!hi!hi!hi!hi!hi!hi!?!hi!hi!hi!hi!hi!hi!hi!hi!??hi!hi!hi!hi!hi!hi!hi!hi!?hhi!hi!hi!hi!hi!hi!hi!hi!?ihi!hi!hi!hi!hi!hi!hi!hi!?!hi!hi!hi!hi!hi!hi!hi!hi!?hhi!hi!hi!hi!hi!hi!hi!hi!?ihi!hi!hi!hi!hi!hi!hi!hi!?!hi!hi!hi!hi!hi!hi!hi!hi!?hhi!hi!hi!hi!hi!hi!hi!hi!?ihi!hi!hi!hi!hi!hi!hi!hi!?!hi!hi!hi!hi!hi!hi!hi!hi!??hi!hi!hi!hi!hi!hi!hi!hi!?hhi!hi!hi!hi!hi!hi!hi!hi!?ihi!hi!hi!hi!hi!hi!hi!hi!?!hi!hi!hi!hi!hi!hi!hi!hi!?hhi!hi!hi!hi!hi!hi!hi!hi!?ihi!hi!hi!hi!hi!hi!hi!hi!?!hi!hi!hi!hi!hi!hi!hi!hi!?hhi!hi!hi!hi!hi!hi!hi!hi!?ihi!hi!hi!hi!hi!hi!hi!hi!?!hi!hi!hi!hi!hi!hi!hi!hi!??hi!hi!hi!hi!hi!hi!hi!hi!? hi!hi!hi! hi!hi!hi!hi!hi!?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5448");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!", "hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! \rhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! ", "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!" + "'", str3, " hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5449");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 100 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 1, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5450");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5451");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", " ", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!\nhi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!" + "'", str3, "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!\nhi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
    }

    @Test
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5452");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", pattern1, "hi!hi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!" + "'", str3, "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
    }

    @Test
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5453");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5454");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!", 759);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5455");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5456");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!\n\rhi!hi!hi!\nhi!hi!hi!hi!", pattern1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\n\rhi!hi!hi!\nhi!hi!hi!hi!" + "'", str3, "hi!hi!hi!\n\rhi!hi!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5457");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\nhi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5458");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", " hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!\n hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-231) + "'", int3 == (-231));
    }

    @Test
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5459");
        int[] intArray1 = new int[] { 670 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[670]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5460");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!", true, 670, (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", 0, (-831));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5461");
        char[] charArray11 = new char[] { ' ', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi!hi!hi!", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", charArray11);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5462");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi!hi! hi!hi!hi! hi!hi!hi!", pattern1, "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi! hi!hi!hi! hi!hi!hi!" + "'", str3, " hi!hi!hi! hi!hi!hi! hi!hi!hi!");
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5463");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5464");
        char[] charArray9 = new char[] { 'a', ' ', ' ', ' ' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!\n", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\n", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5465");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5466");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!", 20, (-840));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5467");
        char[] charArray10 = new char[] { ' ', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n", charArray10);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", charArray10);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5468");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", " hi!hi!", "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5469");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray10 = new char[] { '4', ' ', '#' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence6, charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!hi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!hi!hi!hi!", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! ", charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4,  , #]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5470");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!\n\rhi!hi!hi!\n", (-91));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5471");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 670);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5472");
        long[] longArray4 = new long[] { (-663), (-694), 10, 44 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[-663, -694, 10, 44]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5473");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\nhi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5474");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!hi!hi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5475");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5476");
        int[] intArray5 = new int[] { '#', 10, '#', (short) -1, (byte) 1 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) intArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 10, 35, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5477");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", (int) '#', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5478");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! ", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test5479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5479");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray9 = new char[] { ' ', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence1, charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!hi!hi!hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5480");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!", false, (-618), (java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\n", 44, (-32));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5481");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!hi!");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 12 + "'", int4 == 12);
    }

    @Test
    public void test5482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5482");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! ", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
    }

    @Test
    public void test5483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5483");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, " hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5484");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " hi!hi!hi!hi!hi!\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 17 + "'", int1 == 17);
    }

    @Test
    public void test5485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5485");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) " hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5486");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 713 + "'", int1 == 713);
    }

    @Test
    public void test5487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5487");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!");
    }
}

