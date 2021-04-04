package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", false, (-240), (java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 40, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!hi!", " hi!hi!hi! hi!hi!hi! hi!hi!hi!", " hi!hi!hi!" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!", pattern1, "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!" + "'", str3, "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence6 = null;
        char[] charArray10 = new char[] { '4', ' ', '#' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence6, charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray10);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray10);
        java.lang.Class<?> wildcardClass22 = charArray10.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!hi!hi!hi!\nhi!hi!h hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " hi!hi!hi!hi!\nhi!hi!h hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " hi!hi!hi!hi!\nhi!hi!h hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " " + "'", str8, " ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charSequence1, 54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!", "hi!hi!hi!\nhi!hi!hi!hi!hi!hi!", " hi!hi!hi! hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!" + "'", str3, "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", pattern1, "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n");
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "hi!hi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray10 = new char[] { '4', ' ', '#' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence6, charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!hi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!hi!hi!hi!", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!", charArray10);
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
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!", "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "  hi!hi!hi! hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27 + "'", int1 == 27);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", (-91));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray8 = new char[] { '4', ' ', '#' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence4, charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray8);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "hi! ", "hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!" + "'", str3, "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!\nhi!hi!hi!hi!hi!hi!", "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !, h, i, !, h, i, !, \n, \r, h, i, !, h, i, !, h, i, !, \n, h, i, !,  , h, i, !, h, i, !, h, i, !, \n, \r, h, i, !, h, i, !, h, i, !, \n, h, i, !, h, h, i, !, h, i, !, h, i, !, \n, \r, h, i, !, h, i, !, h, i, !, \n, h, i, !, i, h, i, !, h, i, !, h, i, !, \n, \r, h, i, !, h, i, !, h, i, !, \n, h, i, !, !, h, i, !, h, i, !, h, i, !, \n, \r, h, i, !, h, i, !, h, i, !, \n, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi!hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!\r", "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!\n\rhi!hi!hi!\n", " hi!hi!", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\n\rhi!hi!hi!\n" + "'", str3, "hi!hi!hi!\n\rhi!hi!hi!\n");
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (-94));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! ", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        int int2 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 42 + "'", int2 == 42);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (java.lang.CharSequence) "hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (-840));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!", "hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-6) + "'", int3 == (-6));
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        double[] doubleArray4 = new double[] { 10.0d, 100L, 0.0f, (-1) };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 100.0, 0.0, -1.0]");
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
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 705 + "'", int1 == 705);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        char[] charArray9 = new char[] { ' ', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!", charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", 693);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!hi!hi!hi!hi!", "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!", (java.lang.CharSequence) " hi!hi!hi!hi!\nhi!hi!h hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", 249, 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray10 = new char[] { ' ', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence5, charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!", charArray10);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", charArray10);
        java.lang.Class<?> wildcardClass19 = charArray10.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!", (java.lang.CharSequence) "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray10 = new char[] { '4', ' ', '#' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence6, charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray10);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray10);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        double[] doubleArray6 = new double[] { 100, (byte) 0, (byte) 10, 10, 10L, '4' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        java.lang.Class<?> wildcardClass11 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[100.0, 0.0, 10.0, 10.0, 10.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hhi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!ihi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hhi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!ihi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!" + "'", str3, "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hhi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!ihi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 54 + "'", int1 == 54);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!", " hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 29 + "'", int3 == 29);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " hi!hi!hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 805 + "'", int3 == 805);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        double[] doubleArray6 = new double[] { 100, (byte) 0, (byte) 10, 10, 10L, '4' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) doubleArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        java.lang.Class<?> wildcardClass16 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[100.0, 0.0, 10.0, 10.0, 10.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray7 = new char[] { '4', ' ', '#' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence3, charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4,  , #]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!\n\rhi!hi!hi!\n", "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!" + "'", str3, "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!\n", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", 649);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!\n hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!", "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", "hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!\n hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!" + "'", str3, " hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!\n hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!");
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 769 + "'", int1 == 769);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        double[] doubleArray1 = new double[] { (short) 1 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) doubleArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!\n\rhi!hi!hi!\n", 766);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!\n\rhi!hi!hi!\nhi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\n\rhi!hi!hi!\nhi!hi!hi!hi!" + "'", str3, "hi!hi!hi!\n\rhi!hi!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!\n\rhi!hi!hi!\nhi!hi!hi!hi!", "", "hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! \rhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! " + "'", str3, "hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! \rhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! ");
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! \rhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        float[] floatArray0 = new float[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
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
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        char[] charArray10 = new char[] { ' ', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", (-840), (-73));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", " hi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", (java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "hi!hi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", false, 69, (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (-694), 693);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r", (java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 10 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, -1, -1, 10]");
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
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!", 5, (-663));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!hi!", true, 339, (java.lang.CharSequence) " hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!", 12, (-9));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!", (java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " " + "'", str8, " ");
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!", (java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", (-849));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi!", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!\n", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!hi!hi!\nhi!hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!hi!hi!?hi!hi!hi!hi!hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !]");
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) " hi!hi!hi!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi!", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!\n", "  hi!hi!hi! hi!hi!hi!hi!hi!", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!\n" + "'", str3, " hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!\n");
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!", "hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!" + "'", str3, " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!\n\rhi!hi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!" + "'", str3, " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray2);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "", "hi!hi!hi!hi!hi!hi!hi!hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", (-20), 132);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! \rhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! ", (int) '\r', (-24));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 54 + "'", int3 == 54);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", "hi!hi!hi!\n", "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\n" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\n");
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", "\r", "hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n" + "'", str3, "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n");
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n", false, 352, (java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!", 670, 670);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", pattern1, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!" + "'", str3, " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!hi!");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray9 = new char[] { '4', ' ', '#' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence5, charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!hi!", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  , #]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\n", (java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", " hi!hi!hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", false, (-682), (java.lang.CharSequence) " hi!hi!hi!", (-24), 7);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!", "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!", true, (-14), (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!", (-6), 40);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
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
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) longArray0);
        java.lang.Class<?> wildcardClass12 = longArray0.getClass();
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", (-18), 201);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " " + "'", str4, " ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, "hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!" + "'", str3, "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" hi!hi!hi!hi!\nhi!hi!h hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray7 = new char[] { '4', ' ', '#' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence3, charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!hi!", charArray7);
        java.lang.Class<?> wildcardClass13 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4,  , #]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! \rhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", pattern1, "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!" + "'", str3, " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" hi!hi!hi!hi!hi!", "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi!hi!hi!" + "'", str3, " hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!\n", true, (-1), (java.lang.CharSequence) "  hi!hi!hi! hi!hi!hi!hi!hi!", (-3), 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! ", (java.lang.CharSequence) " hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!\n hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!", 349);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi!hi!hi!hi!", (-831), (-73));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        char[] charArray9 = new char[] { ' ', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi!hi!hi!", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", charArray9);
        java.lang.Class<?> wildcardClass17 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        char[] charArray10 = new char[] { ' ', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi!hi!hi!", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray10);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        float[] floatArray3 = new float[] { 91, (-1L), 6 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[91.0, -1.0, 6.0]");
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
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray7 = new char[] { ' ', ' ', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence2, charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! \rhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!", charArray8);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!hi!hi!hi!hi!", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 21 + "'", int3 == 21);
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  hi!hi!hi! hi!hi!hi!hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        java.lang.Class<?> wildcardClass10 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.Class<?> wildcardClass9 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " " + "'", str8, " ");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hi!hi!hi!hi!hi!\r", pattern1, " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!\r" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!\r");
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        float[] floatArray6 = new float[] { (byte) 1, 16, (byte) 1, (byte) 10, (byte) 0, 0.0f };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 16.0, 1.0, 10.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" ", "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", (-10));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.Class<?> wildcardClass12 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " " + "'", str10, " ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " " + "'", str11, " ");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!hi!", "hi!hi!", "hi!hi!hi!hi!" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hi!" + "'", str4, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!hi!" + "'", str5, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!" + "'", str6, "hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!hi!" + "'", str10, "hi!hi!");
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        short[] shortArray2 = new short[] { (byte) -1, (short) 0 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray10 = new char[] { '4', ' ', '#' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence6, charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray10);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray10);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, " hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("  hi!hi!hi! hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 879);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("  hi!hi!hi! hi!hi!hi!hi!hi!", "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        char[] charArray10 = new char[] { ' ', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!", charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!", charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hhi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!ihi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", charArray10);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!", "\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\n", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", 538);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", false, 28, (java.lang.CharSequence) "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hhi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!ihi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", (-6), 697);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", pattern1, " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!" + "'", str3, "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!hi!", " hi!hi!hi! hi!hi!hi! hi!hi!hi!", " hi!hi!hi!" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.Class<?> wildcardClass8 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" hi!hi!hi!", "hi!hi!hi!hi!", "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi!" + "'", str3, " hi!hi!hi!");
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!hi!", "hi!hi!", "hi!hi!hi!hi!" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hi!" + "'", str4, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!hi!" + "'", str5, "hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!" + "'", str7, "hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) "\nhi! hi!hhi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! ", 49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray2);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!\nhi!hi!hi!hi!hi!hi!", " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!\nhi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n", 649);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!\n", "hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", false, 214, (java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!\n\rhi!hi!hi!\n", 15, 84);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!hi!hi!");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", " hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        char[] charArray12 = new char[] { ' ', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\n", charArray12);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray12);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!", charArray12);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", charArray12);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", charArray12);
        boolean boolean23 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        float[] floatArray4 = new float[] { 10.0f, 0.0f, '#', 0L };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0, 0.0, 35.0, 0.0]");
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
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", 84, (-618));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", false, 16, (java.lang.CharSequence) " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", (-14), (-24));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!", (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!", " hi!", "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!" + "'", str3, "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!");
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi! hi!hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!", " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!hi!", " hi!hi!hi! hi!hi!hi! hi!hi!hi!", " hi!hi!hi!" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!\n\rhi!hi!hi!\n", "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        int[] intArray5 = new int[] { 100, 16, (byte) 1, 'a', '\000' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 16, 1, 97, 0]");
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
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray2);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " " + "'", str11, " ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi!", (java.lang.CharSequence) " hi!hi!", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence2, charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", 45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!hi!hi!hi!hi!");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ , h, i, !, h, i, !, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        float[] floatArray2 = new float[] { (short) 100, '4' };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[100.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!hi!", "hi!hi!", "hi!hi!hi!hi!" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hi!" + "'", str4, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!hi!" + "'", str5, "hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!" + "'", str7, "hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! \rhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! ", 3, (-48));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hi!", " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hhi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!ihi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!");
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi!\nhi!hi!", "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!\n\rhi!hi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhi!hi!" + "'", str3, "hi!hi!hi!\nhi!hi!");
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!" + "'", str3, "hi!hi!hi!");
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        long[] longArray4 = new long[] { (byte) -1, (-1), (short) 100, 27 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[-1, -1, 100, 27]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\rhi!hi!hi!\rhi!hi!hi!\rhi!hi!" + "'", str3, "hi!hi!hi!\rhi!hi!hi!\rhi!hi!hi!\rhi!hi!");
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 696, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!\r", " hi!hi!hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! \rhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! ", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! \rhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!", "hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!", 48, 46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!hi!hi!hi!hi!hi!hi!hi!?hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (-694));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray10 = new char[] { ' ', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence3, charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray10);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!", charArray10);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!hi!", "hi!hi!", "hi!hi!hi!hi!" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.Class<?> wildcardClass8 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hi!" + "'", str4, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!hi!" + "'", str5, "hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!" + "'", str7, "hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, false, (-694), (java.lang.CharSequence) "hi!hi!", (int) (byte) 0, 33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " " + "'", str4, " ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!hi!hi!hi!hi!hi!hi!hi!?hi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) " hi!hi!hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (-618));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", pattern1, "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!" + "'", str3, "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", " hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!\n hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence2, charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi! " };
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray1);
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi! " + "'", str2, "hi! ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence1, charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray3);
        java.lang.Class<?> wildcardClass6 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!hi!hi!hi!", 201, 69);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!\rhi!hi!hi!\rhi!hi!hi!\rhi!hi!", (java.lang.CharSequence) " hi!hi!hi!hi!\nhi!hi!h hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!", (-6));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", 713);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\rhi!hi!hi!\rhi!hi!hi!\rhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\n", "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!" + "'", str3, "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 634 + "'", int3 == 634);
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", pattern1, "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!" + "'", str3, "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi! hi!hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray9 = new char[] { '4', ' ', '#' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence5, charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", charArray9);
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
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi!hi!hi!hi!", 93, (-20));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) " hi!", (-694));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", true, 11, (java.lang.CharSequence) " hi!hi!hi!", 0, (-26));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\n", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!hi!");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        double[] doubleArray3 = new double[] { (-91), (-7), 3 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-91.0, -7.0, 3.0]");
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
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (-22));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!hi!", " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        char[] charArray9 = new char[] { ' ', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray9);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!" + "'", str3, "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!", charArray8);
        java.lang.Class<?> wildcardClass17 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!", false, 201, (java.lang.CharSequence) " hi!", 69, 18);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!", (-33), (-682));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!", 710);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray9 = new char[] { '4', ' ', '#' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence5, charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!", charArray9);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) " hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!\n", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray12 = new char[] { ' ', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray12);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence5, charArray12);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray12);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray12);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray12);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray12);
        int int22 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!\n\rhi!hi!hi!\n", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        long[] longArray3 = new long[] { 100, '4', (byte) -1 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) longArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        java.lang.Class<?> wildcardClass2 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", 90, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!", 0, 201);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r", (int) '\r', 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        double[] doubleArray1 = new double[] { (short) 1 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!\nhi!hi!", " ", "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhi!hi!" + "'", str3, "hi!hi!hi!\nhi!hi!");
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
        float[] floatArray3 = new float[] { (byte) 100, (short) 0, (byte) -1 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 0.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
        char[] charArray11 = new char[] { 'a', ' ', ' ', ' ' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray11);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray11);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (int) '\000', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!", pattern1, " hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!hi!hi!hi!hi!hi!\r", " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi!hi!", pattern1, "hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi!" + "'", str3, " hi!hi!hi!");
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!", " hi!hi!hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (java.lang.CharSequence) " hi!hi!hi!hi!\nhi!hi!h hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", " hi!hi!hi!hi!\nhi!hi!h hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!", " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "hi!hi!hi!\n", " hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", pattern1, "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
        float[] floatArray4 = new float[] { 1L, 100L, 132, (byte) -1 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[1.0, 100.0, 132.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        char[] charArray7 = new char[] { ' ', ' ', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", " hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!" + "'", str3, " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
        long[] longArray3 = new long[] { 94, (-694), 18 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[94, -694, 18]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
        boolean[] booleanArray6 = new boolean[] { false, false, true, false, false, true };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        java.lang.Class<?> wildcardClass14 = booleanArray6.getClass();
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[false, false, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!", "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", " hi!hi!hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!" + "'", str3, " hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray2);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " " + "'", str11, " ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " " + "'", str12, " ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
        float[] floatArray3 = new float[] { (-833), 0L, 246 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-833.0, 0.0, 246.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! ", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! ", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!\n hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!", pattern1, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!\n hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!" + "'", str3, " hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!\n hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!");
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\r", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
        boolean[] booleanArray6 = new boolean[] { false, false, false, false, true, true };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[false, false, false, false, true, true]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "", "hi!hi!", "", "", "hi!hi!", "hi!hi!" };
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray6);
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
        int[] intArray2 = new int[] { (byte) 100, (-84) };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, -84]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!\r", 246);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (int) (byte) 100, (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
        char[] charArray12 = new char[] { ' ', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray12);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!", charArray12);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\n", charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", charArray12);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!", charArray12);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray12);
        int int22 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray12);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
        char[] charArray7 = new char[] { ' ', ' ', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", charArray7);
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
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", 634, 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hhi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!ihi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
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
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", 67, (-26));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", 201);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\n", (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 696);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
        char[] charArray7 = new char[] { ' ', ' ', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (-46), (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4836");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!", true, 699, (java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!", (-120), (-10));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4837");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", 1, (-51));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4838");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4839");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4840");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!", (java.lang.CharSequence) " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4842");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4843");
        char[] charArray7 = new char[] { ' ', ' ', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!hi!", " hi!hi!hi! hi!hi!hi! hi!hi!hi!", " hi!hi!hi!" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4845");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "", " hi!hi!hi! hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi! hi!hi!hi! hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, " hi!hi!hi! hi!hi!hi! hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4846");
        short[] shortArray1 = new short[] { (byte) 0 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4848");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!", (-840));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4849");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4850");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4851");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4852");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! \rhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4853");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!" + "'", str3, "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4854");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4855");
        char[] charArray11 = new char[] { ' ', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\n", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", charArray11);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!", charArray11);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4856");
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\n", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4857");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4858");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", " hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4859");
        char[] charArray2 = new char[] {};
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi!", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4860");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hi!hi!hi!hi!", "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4861");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\r", (-682));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4862");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n", "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-12) + "'", int3 == (-12));
    }

    @Test
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4863");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 349);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4864");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!", 0, 696);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4865");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4866");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!\r", "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test4867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4867");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!hi!hi!hi!hi!hi!hi!hi!\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4868");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4869");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!hi!hi!hi!", "hi! hi!hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4870");
        char[] charArray12 = new char[] { ' ', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray12);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!", charArray12);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\n", charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\n", charArray12);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray12);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\n", charArray12);
        int int23 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", charArray12);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test4871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4871");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4872");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi!hi!hi!\nhi!hi!h hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!", " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi!hi!\nhi!hi!h hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!" + "'", str3, " hi!hi!hi!hi!\nhi!hi!h hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4873");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4874");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!", "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4875");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test4876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4876");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test4877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4877");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (-663), 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4878");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4879");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4880");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!hi!hi!\r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4881");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", "  hi!hi!hi! hi!hi!hi!hi!hi!", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n" + "'", str3, "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n");
    }

    @Test
    public void test4882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4882");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", 625);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4883");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (-618), (-20));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4884");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi!", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4885");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4886");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!\n\rhi!hi!hi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4887");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " ", (java.lang.CharSequence) " hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!\n hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4888");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! \rhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! ", (java.lang.CharSequence) " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4889");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!hi!", pattern1, "hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4890");
        char[] charArray4 = new char[] {};
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray4);
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
    public void test4891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4891");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4892");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!\r", (-240), (-840));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4893");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", "hi!hi!hi!\nhi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!" + "'", str3, " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4894");
        long[] longArray1 = new long[] { (-1L) };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4895");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! hi!hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!", pattern1, "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!" + "'", str3, "hi! hi!hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4896");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-18) + "'", int3 == (-18));
    }

    @Test
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4897");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4898");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi!", pattern1, " hi!hi!hi! hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!" + "'", str3, " hi!hi!");
    }

    @Test
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4899");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\r", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, h, i, !, h, i, !, \n, h, i, !, h, i, !, h, i, !, \n, h, i, !, h, i, !, h, i, !, \n, h, i, !, h, i, !, h, i, !, \n, h, i, !, h, i, !, h, i, !, \n, h, i, !, h, i, !, h, i, !, \n, h, i, !, h, i, !, h, i, !, \n, h, i, !, h, i, !, h, i, !, \n, h, i, !, h, i, !, h, i, !, \n, h, i, !, h, i, !, h, i, !, \n, h, i, !, h, i, !, h, i, !, \n, h, i, !, h, i, !, h, i, !, \n, h, i, !, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4900");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!\n\rhi!hi!hi!\nhi!hi!hi!hi!", " hi!hi!hi! hi!hi!hi! hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\n\rhi!hi!hi!\nhi!hi!hi!hi!" + "'", str3, "hi!hi!hi!\n\rhi!hi!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4901");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! \rhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! ?hi! ?hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! ?hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4902");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi!hi!hi!hi!", pattern1, "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi!hi!hi!" + "'", str3, " hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4903");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4904");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence3, charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray6);
        java.lang.Class<?> wildcardClass12 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4905");
        char[] charArray7 = new char[] { ' ', ' ', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4906");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (int) (short) 100, (-682));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4907");
        char[] charArray9 = new char[] { ' ', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray9);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4908");
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
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4909");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  hi!hi!hi! hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4910");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!", (java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (-32));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4911");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r", (java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4912");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi!\n\rhi!hi!hi!\nhi!hi!hi!hi!", "hi!hi!hi!\nhi!hi!hi!hi!hi!hi!", "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\n\rhi!hi!hi!\nhi!hi!hi!hi!" + "'", str3, "hi!hi!hi!\n\rhi!hi!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test4913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4913");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!\n", " ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 832 + "'", int3 == 832);
    }

    @Test
    public void test4914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4914");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!\n", " hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!", " hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi!hi!hi!\n" + "'", str3, " hi!hi!hi!hi!hi!\n");
    }

    @Test
    public void test4915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4915");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4916");
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray8);
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
    }

    @Test
    public void test4917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4917");
        char[] charArray9 = new char[] { ' ', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", charArray9);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4918");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\r", (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4919");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4920");
        double[] doubleArray4 = new double[] { 10.0d, 100L, 0.0f, (-1) };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) doubleArray4);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 100.0, 0.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4921");
        float[] floatArray3 = new float[] { 11, 713, (-10) };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[11.0, 713.0, -10.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4922");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray2);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " " + "'", str12, " ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4923");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!", "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test4924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4924");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!hi!hi!hi!hi!\r", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!\r" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!\r");
    }

    @Test
    public void test4925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4925");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n", pattern1, " hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test4926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4926");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!hi!", false, (-840), (java.lang.CharSequence) " hi!hi!", 634, 124);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4927");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4928");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " ", 9, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4929");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!hi!hi!hi!", pattern1, "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4930");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!\n\rhi!hi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!" + "'", str3, "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
    }

    @Test
    public void test4931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4931");
        int[] intArray0 = new int[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
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
    public void test4932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4932");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (java.lang.CharSequence) " hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4933");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hi!", " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!");
    }

    @Test
    public void test4934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4934");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (java.lang.CharSequence) "", 670);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 49 + "'", int3 == 49);
    }

    @Test
    public void test4935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4935");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 33 + "'", int1 == 33);
    }

    @Test
    public void test4936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4936");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (-833));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4937");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\n", "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\n" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\n");
    }

    @Test
    public void test4938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4938");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! ", pattern1, "hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! " + "'", str3, "hi! ");
    }

    @Test
    public void test4939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4939");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test4940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4940");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "", 849);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4941");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4942");
        char[] charArray7 = new char[] { ' ', ' ', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", charArray7);
        java.lang.Class<?> wildcardClass13 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4943");
        java.lang.CharSequence charSequence7 = null;
        char[] charArray11 = new char[] { '4', ' ', '#' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence7, charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray11);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray11);
        int int23 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!hi!", charArray11);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test4944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4944");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4945");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi!", (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4946");
        char[] charArray11 = new char[] { ' ', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\n", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\n", charArray11);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray11);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray11);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test4947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4947");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) str10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " " + "'", str10, " ");
    }

    @Test
    public void test4948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4948");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!\n", " hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!\n", "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!" + "'", str3, "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test4949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4949");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", (java.lang.CharSequence) "", 231);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 231 + "'", int3 == 231);
    }

    @Test
    public void test4950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4950");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (-15));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4951");
        char[] charArray11 = new char[] { ' ', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\n", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", charArray11);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray11);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int22 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray11);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test4952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4952");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) " hi!hi!", (int) '\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
    }

    @Test
    public void test4953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4953");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!\n hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4954");
        float[] floatArray5 = new float[] { (-19), (byte) 0, (short) -1, (-84), (-1.0f) };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[-19.0, 0.0, -1.0, -84.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4955");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!", (-20));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4956");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", (-3), (-120));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4957");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n", pattern1, "hi!hi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n" + "'", str3, "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n");
    }

    @Test
    public void test4958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4958");
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray8);
        java.lang.Class<?> wildcardClass15 = charArray8.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4959");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", pattern1, " hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!" + "'", str3, "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
    }

    @Test
    public void test4960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4960");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4961");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!\r", (-14), (-833));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4962");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi!\n\rhi!hi!hi!\n", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!\n\rhi!hi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\n\rhi!hi!hi!\n" + "'", str3, "hi!hi!hi!\n\rhi!hi!hi!\n");
    }

    @Test
    public void test4963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4963");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4964");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\nhi! hi!hhi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4965");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hhi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!ihi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test4966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4966");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4967");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!\r", "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4968");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!hi!", " hi!hi!hi! hi!hi!hi! hi!hi!hi!", " hi!hi!hi!" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4969");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4970");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (-48), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4971");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4972");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!hi!", "hi!hi!", "hi!hi!hi!hi!" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hi!" + "'", str4, "hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!" + "'", str6, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!" + "'", str7, "hi!hi!");
    }

    @Test
    public void test4973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4973");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 10, (byte) 1 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, 1, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4974");
        int[] intArray2 = new int[] { (-32), 1 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-32, 1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4975");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!", "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test4976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4976");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!", true, (-26), (java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (int) (short) 100, 7);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4977");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "hi!hi!hi!\rhi!hi!hi!\rhi!hi!hi!\rhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\rhi!hi!hi!\rhi!hi!hi!\rhi!hi!" + "'", str3, "hi!hi!hi!\rhi!hi!hi!\rhi!hi!hi!\rhi!hi!");
    }

    @Test
    public void test4978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4978");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4979");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!", " hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!\n hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!" + "'", str3, "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test4980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4980");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence2, charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4981");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "hi! hi!hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4982");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4983");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray2);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " " + "'", str10, " ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " " + "'", str12, " ");
    }

    @Test
    public void test4984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4984");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!", pattern1, "hi!hi!hi!\rhi!hi!hi!\rhi!hi!hi!\rhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!" + "'", str3, " hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n hi!hi!hi! hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4985");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4986");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4987");
        char[] charArray11 = new char[] { 'a', ' ', ' ', ' ' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", charArray11);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray11);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 17 + "'", int19 == 17);
    }

    @Test
    public void test4988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4988");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! \rhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! \nhi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! hhi! ihi! !hi! ", (java.lang.CharSequence) "hi!hi!hi!hi!", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4989");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray2);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.Class<?> wildcardClass8 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4990");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4991");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray9 = new char[] { ' ', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence4, charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!", charArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "hi!hi!hi!hi!hi!");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4992");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4993");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4994");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " hi!hi!hi!hi!\nhi!hi!h hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4995");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test4996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4996");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray7 = new char[] { '4', ' ', '#' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence3, charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4,  , #]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4997");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi!hi!hi!hi!\n", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!\n", "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi!hi!hi!\n" + "'", str3, " hi!hi!hi!hi!hi!\n");
    }

    @Test
    public void test4998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4998");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n", 12, 201);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4999");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test5000");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!", false, (-124), (java.lang.CharSequence) " hi!", (-697), 6);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }
}

