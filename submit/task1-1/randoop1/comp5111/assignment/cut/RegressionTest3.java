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
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!", "hi!hi!hi!", "hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.Class<?> wildcardClass8 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 18 + "'", int1 == 18);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " hi!", 91);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hi!hi!hi!hi!hi!", "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "hi!hi!hi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-21) + "'", int3 == (-21));
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!\n", " hi!hi!hi!hi!hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\n" + "'", str3, "hi!hi!hi!\n");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!", false, 72, (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", 1, 20);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!", (java.lang.CharSequence) "hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        char[] charArray6 = new char[] { ' ', ' ', '4' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!", (-19), (-21));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        char[] charArray10 = new char[] { ' ', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray10);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray10);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\n", (java.lang.CharSequence) "hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", (java.lang.CharSequence) "", (-15));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\n", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        char[] charArray7 = new char[] { 'a', ' ', ' ', ' ' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!\nhi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!hi!hi!hi!hi!hi!", "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!hi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!hi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !, h, i, !, h, i, !, \n, h, i, !, h, i, !]");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!", true, 15, (java.lang.CharSequence) "\r", 20, 849);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", 100, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! ", "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!hi!", "hi!hi!", "hi!hi!hi!hi!" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hi!" + "'", str4, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!hi!" + "'", str5, "hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!\n", 24, 84);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        java.lang.Class<?> wildcardClass2 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\r]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" ", "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!hi!hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", 849);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!", (java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!\n", 699, 694);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "", "hi!hi!", "", "", "hi!hi!", "hi!hi!" };
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray6);
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        double[] doubleArray4 = new double[] { 10.0d, 100L, 0.0f, (-1) };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 100.0, 0.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        boolean[] booleanArray6 = new boolean[] { false, false, true, false, false, true };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        java.lang.Class<?> wildcardClass9 = booleanArray6.getClass();
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[false, false, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, 124, 43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", pattern1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!hi!");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "hi!hi!hi!hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", " hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", (-21));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) " hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " " + "'", str8, " ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " " + "'", str10, " ");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! ", (java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi!hi!hi!hi!", (int) '4', 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", 625, (-22));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" hi!hi!", "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", (java.lang.CharSequence) "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\n", 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", 20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!hi!hi!\nhi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!hi!hi!?hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi!hi! hi!hi!hi! hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi! hi!hi!hi! hi!hi!hi!" + "'", str3, " hi!hi!hi! hi!hi!hi! hi!hi!hi!");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!", pattern1, "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!" + "'", str3, "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n", (-840));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray8 = new char[] { '4', ' ', '#' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence4, charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!", charArray8);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", pattern1, "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!hi!", " hi!hi!hi! hi!hi!hi! hi!hi!hi!", " hi!hi!hi!" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        char[] charArray4 = new char[] {};
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! ", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!", 20, (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", " hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        char[] charArray7 = new char[] { 'a', ' ', ' ', ' ' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray7);
        java.lang.Class<?> wildcardClass12 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", pattern1, "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n" + "'", str3, "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!" + "'", str3, "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 691 + "'", int3 == 691);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!", 72);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!", (-3), (-12));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi!hi!hi!hi!", "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi!hi!hi!" + "'", str3, " hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\n", (-91));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence3, charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n", (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!hi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray3);
        java.lang.Class<?> wildcardClass6 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", 691);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, 7, 129);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 69 + "'", int3 == 69);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!\nhi!hi!", "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhi!hi!" + "'", str3, "hi!hi!hi!\nhi!hi!");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\n");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "hi!hi!hi!\n\rhi!hi!hi!\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!hi!hi!\n\rhi!hi!hi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!hi!hi!\n\rhi!hi!hi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !, h, i, !, h, i, !, \n, \r, h, i, !, h, i, !, h, i, !, \n]");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        char[] charArray7 = new char[] { ' ', ' ', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray7);
        java.lang.Class<?> wildcardClass14 = charArray7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! ", "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! " + "'", str3, "hi! ");
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", " hi!hi!hi! hi!hi!hi! hi!hi!hi!", "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charSequence1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", (int) (short) 10, (-120));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!hi!", true, 15, (java.lang.CharSequence) " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", 16, 48);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!", 694, (-91));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n", "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!\n\rhi!hi!hi!\n", pattern1, "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\n\rhi!hi!hi!\n" + "'", str3, "hi!hi!hi!\n\rhi!hi!hi!\n");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi!hi!hi!hi!", "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi!hi!hi!" + "'", str3, " hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\n", (java.lang.CharSequence) " hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" hi!hi!", "hi!hi!hi!\n\rhi!hi!hi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.Class<?> wildcardClass11 = strArray2.getClass();
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " " + "'", str10, " ");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n");
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!hi!hi!");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" hi!hi!hi! hi!hi!hi! hi!hi!hi!", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30 + "'", int3 == 30);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        char[] charArray1 = new char[] {};
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi!", charArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        java.lang.Class<?> wildcardClass4 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!\nhi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", " hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!", (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 643 + "'", int3 == 643);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (-7));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!hi!hi!", " ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!", "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        short[] shortArray5 = new short[] { (byte) 10, (short) -1, (byte) 0, (byte) 0, (short) 0 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, -1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!", (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray2);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 805 + "'", int1 == 805);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "hi!hi!hi!\n\rhi!hi!hi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-21) + "'", int3 == (-21));
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !]");
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "", (java.lang.CharSequence) " hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, charSequence1, (-94));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!", "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", pattern1, "hi!hi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!" + "'", str3, " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!", false, (int) (byte) 10, (java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (-694), 24);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", 15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        char[] charArray10 = new char[] { ' ', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi!hi!hi!", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", 6, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, true, 2, (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 691, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (-694));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " hi!hi!hi!hi!hi!", (java.lang.CharSequence) " hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! ", 3, 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r", 129);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!", 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 90 + "'", int3 == 90);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi!hi!hi!" + "'", str3, " hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 643);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!\n", false, (-91), (java.lang.CharSequence) " ", 24, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", (int) '\n', 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!", (java.lang.CharSequence) " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!hi!hi!?hhi!hi!hi!?ihi!hi!hi!?!hi!hi!hi!?hhi!hi!hi!?ihi!hi!hi!?!hi!hi!hi!?hhi!hi!hi!?ihi!hi!hi!?!hi!hi!hi!??hi!hi!hi!?hhi!hi!hi!?ihi!hi!hi!?!hi!hi!hi!?hhi!hi!hi!?ihi!hi!hi!?!hi!hi!hi!?hhi!hi!hi!?ihi!hi!hi!?!hi!hi!hi!??hi!hi!hi!?hhi!hi!hi!?ihi!hi!hi!?!hi!hi!hi!?hhi!hi!hi!?ihi!hi!hi!?!hi!hi!hi!?hhi!hi!hi!?ihi!hi!hi!?!hi!hi!hi!??hi!hi!hi!?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        java.lang.Object obj1 = new java.lang.Object();
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!", charArray8);
        char[] charArray19 = new char[] { ' ', ' ', '4' };
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray19);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray19);
        int int22 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray19);
        int int23 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray19);
        boolean boolean24 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray19);
        byte[] byteArray25 = new byte[] {};
        boolean boolean26 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray25);
        boolean boolean27 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray25);
        boolean boolean28 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray25);
        boolean boolean29 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray25);
        java.lang.Object[] objArray30 = new java.lang.Object[] { '\000', obj1, 3, charArray8, boolean24, byteArray25 };
        boolean boolean31 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(objArray30);
        boolean boolean32 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(objArray30);
        boolean boolean33 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(objArray30);
        boolean boolean34 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(objArray30);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n");
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray10 = new char[] { ' ', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence3, charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray10);
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
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n", (java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", 805);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 45 + "'", int3 == 45);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n", " hi!hi!hi!hi!hi!", " hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray8);
        java.lang.Class<?> wildcardClass15 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi!hi! hi!hi!hi! hi!hi!hi!", pattern1, " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi! hi!hi!hi! hi!hi!hi!" + "'", str3, " hi!hi!hi! hi!hi!hi! hi!hi!hi!");
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray8 = new char[] { '4', ' ', '#' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence4, charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!hi!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4,  , #]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray7 = new char[] { '4', ' ', '#' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence3, charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        java.lang.Class<?> wildcardClass13 = charArray7.getClass();
        int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4,  , #]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", " hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray7 = new char[] { ' ', ' ', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray7);
        java.lang.Class<?> wildcardClass13 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " hi!", (java.lang.CharSequence) " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 90, 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "hi!hi!hi!hi!hi!", "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!" + "'", str3, "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        char[] charArray7 = new char[] { ' ', ' ', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!", true, (-91), (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (-12), 694);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi!hi! hi!hi!hi! hi!hi!hi!", pattern1, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi! hi!hi!hi! hi!hi!hi!" + "'", str3, " hi!hi!hi! hi!hi!hi! hi!hi!hi!");
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi!hi!hi!hi!hi!hi!hi!", " hi!", "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n", "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", " hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n" + "'", str3, "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n");
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi!", pattern1, "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!" + "'", str3, " hi!hi!");
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", false, (-94), (java.lang.CharSequence) "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (-72), 340);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        char[] charArray9 = new char[] { ' ', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int18 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hi!hi!hi!", "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray8 = new char[] { '4', ' ', '#' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence4, charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4,  , #]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!" + "'", str3, " hi!");
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " ", 24, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, " hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!", (int) '\r');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!\n", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (int) (short) -1, (-833));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!", 4, (-94));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray12 = new char[] { ' ', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray12);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!", charArray12);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence5, charArray12);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!", charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", charArray12);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray12);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi!", charArray12);
        int int22 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!", charArray12);
        java.lang.Class<?> wildcardClass23 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (-72), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) "hi!hi!hi!hi!", 45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        char[] charArray9 = new char[] { 'a', ' ', ' ', ' ' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!\n", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 24 + "'", int13 == 24);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", " hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        char[] charArray7 = new char[] { ' ', ' ', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (int) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (-21), (-26));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", pattern1, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!" + "'", str3, " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!\n", (int) '4', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi!\n", "hi!hi!hi!hi!hi!hi!hi!", "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\n" + "'", str3, "hi!hi!hi!\n");
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!hi!", false, 625, (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", 625, 84);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        java.lang.Class<?> wildcardClass16 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", true, (int) ' ', (java.lang.CharSequence) "hi!hi!", 66, (-849));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray10 = new char[] { '4', ' ', '#' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence6, charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi!hi!hi!", charArray10);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4,  , #]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!", true, (-94), (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 43, (-849));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", 0, (-120));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, 0, 45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!hi!hi!", 7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 699);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!\nhi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (-7));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        char[] charArray7 = new char[] { ' ', ' ', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi!hi!hi!", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!", (int) (byte) 10, 66);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 69);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence1);
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, " hi!hi!hi! hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!", 805, 682);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", (java.lang.CharSequence) "", (-849));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", 693);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n", "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n" + "'", str3, "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n");
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", " hi!", " hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", false, (int) (byte) 0, (java.lang.CharSequence) " hi!hi!hi!hi!hi!", 45, (-20));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) booleanArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!", "hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!" + "'", str3, "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!");
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-15) + "'", int3 == (-15));
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", 24, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence0, charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        java.lang.Object obj1 = new java.lang.Object();
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!", charArray8);
        char[] charArray19 = new char[] { ' ', ' ', '4' };
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray19);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray19);
        int int22 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray19);
        int int23 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray19);
        boolean boolean24 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray19);
        byte[] byteArray25 = new byte[] {};
        boolean boolean26 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray25);
        boolean boolean27 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray25);
        boolean boolean28 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray25);
        boolean boolean29 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray25);
        java.lang.Object[] objArray30 = new java.lang.Object[] { '\000', obj1, 3, charArray8, boolean24, byteArray25 };
        boolean boolean31 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(objArray30);
        java.lang.Class<?> wildcardClass32 = objArray30.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi!hi!hi!hi!", 5, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", 1, 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r", (-7));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " hi!", (java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!", 91, (-91));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", 39);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        java.lang.Class<?> wildcardClass3 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! ", pattern1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! " + "'", str3, "hi! ");
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" ", "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        char[] charArray9 = new char[] { ' ', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi!", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", (-20));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (-9), (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 33 + "'", int1 == 33);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!", "hi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", false, 710, (java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!", 45, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (int) '4', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi!\n", "\n", "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 694);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!hi!hi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!", false, 84, (java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!", 0, 27);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 4, 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        float[] floatArray4 = new float[] { 10.0f, 0.0f, '#', 0L };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0, 0.0, 35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, (-26));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray2);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.Class<?> wildcardClass11 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " " + "'", str10, " ");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!\n\rhi!hi!hi!\n", "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (-22));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence1, charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\n", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" ", " ", " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!" + "'", str3, " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 49 + "'", int3 == 49);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        char[] charArray7 = new char[] { ' ', ' ', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (-26));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (-26), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charSequence1, 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (-124));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! ", (java.lang.CharSequence) " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", (-84), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        int[] intArray0 = new int[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        java.lang.Class<?> wildcardClass7 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        boolean[] booleanArray1 = new boolean[] { true };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        java.lang.Class<?> wildcardClass7 = booleanArray1.getClass();
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray1), "[true]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        char[] charArray9 = new char[] { ' ', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, 805, 682);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (int) (byte) 0, 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n", (-22), 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!", false, 94, (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", (-849), 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! ", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!", 45, 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!", " hi!", "hi!hi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.Class<?> wildcardClass8 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", " hi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (-120), 91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "hi!hi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence3, charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! ", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 696 + "'", int3 == 696);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" hi!hi!", " ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!hi!", " hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", pattern1, "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!" + "'", str3, "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!hi!", " hi!hi!hi! hi!hi!hi! hi!hi!hi!", " hi!hi!hi!" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 100 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-48) + "'", int3 == (-48));
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi!hi!hi!hi!", pattern1, " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi!hi!hi!" + "'", str3, " hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!", "hi!hi!hi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!hi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\n", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "\r", "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!" + "'", str3, "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        char[] charArray9 = new char[] { ' ', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        java.lang.Class<?> wildcardClass18 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!", 696);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!", charArray8);
        java.lang.Class<?> wildcardClass15 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, charSequence1, 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", " hi!hi!hi! hi!hi!hi! hi!hi!hi!", "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " ", 69);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!\n", 94, 849);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        char[] charArray10 = new char[] { ' ', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi!hi!hi!", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "", 27, 40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", false, 0, (java.lang.CharSequence) "hi!hi!hi!hi!", 15, (-72));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray10 = new char[] { ' ', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray10);
        int int19 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray10);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence0, charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!hi!hi!?hi!hi!hi!?hi!hi!hi!?hi!hhi!hi!hi!?hi!hi!hi!?hi!hi!hi!?hi!ihi!hi!hi!?hi!hi!hi!?hi!hi!hi!?hi!!hi!hi!hi!?hi!hi!hi!?hi!hi!hi!?hi!hhi!hi!hi!?hi!hi!hi!?hi!hi!hi!?hi!ihi!hi!hi!?hi!hi!hi!?hi!hi!hi!?hi!!hi!hi!hi!?hi!hi!hi!?hi!hi!hi!?hi!hhi!hi!hi!?hi!hi!hi!?hi!hi!hi!?hi!ihi!hi!hi!?hi!hi!hi!?hi!hi!hi!?hi!!hi!hi!hi!?hi!hi!hi!?hi!hi!hi!?hi!hhi!hi!hi!?hi!hi!hi!?hi!hi!hi!?hi!ihi!hi!hi!?hi!hi!hi!?hi!hi!hi!?hi!!hi!hi!hi!?hi!hi!hi!?hi!hi!hi!?hi!hhi!hi!hi!?hi!hi!hi!?hi!hi!hi!?hi!ihi!hi!hi!?hi!hi!hi!?hi!hi!hi!?hi!!hi!hi!hi!?hi!hi!hi!?hi!hi!hi!?hi!hhi!hi!hi!?hi!hi!hi!?hi!hi!hi!?hi!ihi!hi!hi!?hi!hi!hi!?hi!hi!hi!?hi!!hi!hi!hi!?hi!hi!hi!?hi!hi!hi!?hi!hhi!hi!hi!?hi!hi!hi!?hi!hi!hi!?hi!ihi!hi!hi!?hi!hi!hi!?hi!hi!hi!?hi!!hi!hi!hi!?hi!hi!hi!?hi!hi!hi!?hi!hhi!hi!hi!?hi!hi!hi!?hi!hi!hi!?hi!ihi!hi!hi!?hi!hi!hi!?hi!hi!hi!?hi!!hi!hi!hi!?hi!hi!hi!?hi!hi!hi!?hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "hi!hi!hi!\n\rhi!hi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!" + "'", str3, "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!", "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!\n", "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        char[] charArray4 = new char[] {};
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "hi!hi!hi!hi!hi!hi!hi!hi!");
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!", "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!" + "'", str3, "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!", true, 0, (java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", (int) (short) 1, 693);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" ", pattern1, "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", 710, 45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray2);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (int) (short) 0, 849);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi!", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        char[] charArray9 = new char[] { 'a', ' ', ' ', ' ' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\n", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!", charArray9);
        java.lang.Class<?> wildcardClass16 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!", "hi! ", "hi!hi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", true, 710, (java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!", 1, 625);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", true, (-12), (java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", (-15), 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! ", (java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n", (java.lang.CharSequence) "hi!hi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        char[] charArray7 = new char[] { ' ', ' ', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, 16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\n", (java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!hi!hi!", "hi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!", 682);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!", false, 849, (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 49, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        char[] charArray4 = new char[] {};
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 879 + "'", int1 == 879);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", pattern1, "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!" + "'", str3, "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! ", (java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", (java.lang.CharSequence) " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        short[] shortArray4 = new short[] { (short) -1, (byte) -1, (short) 1, (byte) -1 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        java.lang.Class<?> wildcardClass6 = shortArray4.getClass();
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, -1, 1, -1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi! ", 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", pattern1, "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n");
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
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
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r", pattern1, "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!", (java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (-91));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 805);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!hi!", " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!hi!", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!\nhi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhi!hi!" + "'", str3, "hi!hi!hi!\nhi!hi!");
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi!hi!", (-694), (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!", (int) (byte) -1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 132 + "'", int1 == 132);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!\nhi!hi!", "hi!hi!hi!hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhi!hi!" + "'", str3, "hi!hi!hi!\nhi!hi!");
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", " hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray6 = new char[] { '4', ' ', '#' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence2, charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! ", charArray6);
        java.lang.Class<?> wildcardClass11 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4,  , #]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 694 + "'", int3 == 694);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 1, (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!", 9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\nhi!hi!", 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n", false, 0, (java.lang.CharSequence) "\r", 7, (-9));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray2);
        java.lang.Class<?> wildcardClass5 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!", (-6), 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 713 + "'", int1 == 713);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!", pattern1, " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!" + "'", str3, "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!");
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!hi!hi!hi!hi!", " ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!");
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!" + "'", str3, "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        byte[] byteArray0 = new byte[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        char[] charArray9 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!hi!");
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray9);
        java.lang.Object[] objArray15 = new java.lang.Object[] { boolean3, int13, (-1.0d) };
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(objArray15);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[h, i, !, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[true, 0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[true, 0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        byte[] byteArray0 = new byte[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi!", (int) (short) -1, 682);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!", 132, 713);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (-84));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 43, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }
}

