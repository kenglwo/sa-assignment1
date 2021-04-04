package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", (-138));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", pattern1, "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \r]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\r", 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n", "\n\n\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\r\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", 400);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\n\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\r\n\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ???? hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!????????????");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
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
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str20 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (-30));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r", " hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", "\n\r\n\n\r\r\n\r", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\r\n\r\n\n\r\n h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r" + "'", str3, "\n\n\r\n\n\n\r\n\r\n\n\r\n h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\r\n\r\n\n\r\r\n\r", 144, 144);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", (java.lang.CharSequence) "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!", pattern1, "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\r\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!" + "'", str3, " hi!");
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\r\n\r\n\n\r\r\n\r", (java.lang.CharSequence) "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", 428);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        float[] floatArray3 = new float[] { 0, (byte) 1, (-12) };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0, 1.0, -12.0]");
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
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
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
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int22 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str23 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int24 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray4);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", "hi!hhi!ihi!!hi!\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "\n\n\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ");
        java.lang.Class<?> wildcardClass2 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ , h,  , i,  , !,  , h,  , h,  , i,  , !,  , i,  , h,  , i,  , !,  , !,  , h,  , i,  , !,  ]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!", (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, 98);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", false, (int) (byte) 0, (java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (int) (byte) 0, (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\r\n\r", (java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\r", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", charArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charSequence1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (int) '4', 75);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray7 = new char[] { 'a', '#', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !       h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "\n\r", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", "\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !       h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! " + "'", str3, "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", false, (int) (short) 100, (java.lang.CharSequence) "hi!\nhi!\rhi!hhi!\nhi!\rhi!ihi!\nhi!\rhi!!hi!\nhi!\rhi!\n\nhi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", 87, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.Class<?> wildcardClass12 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-144) + "'", int3 == (-144));
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\n\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n\r\n\n\r\r\n\r", " \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 662 + "'", int1 == 662);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 100 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        java.lang.Class<?> wildcardClass11 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", pattern1, "hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, " \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", 139, 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", (java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", (java.lang.CharSequence) " ", 77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\r\n\n\r\r\n\r", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (-138));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!", "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n", charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        char[] charArray7 = new char[] { 'a', '#', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\r\n\n\n\r\n\r\n\n\r\n h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 129);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\r\n\r", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!", pattern1, "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str17 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", 31, (-91));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 281 + "'", int1 == 281);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str16 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hhi!ihi!!hi!");
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\r", charArray8);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[h, i, !, h, h, i, !, i, h, i, !, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", (-19));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\r\n\r", true, 571, (java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", (int) '4', (-94));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r", "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray11 = new char[] { '\000', '\n', '\000', '\r', '\n' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray11);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\r\n\r", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence3, charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\000\n\000\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\000\n\000\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\000, \n, \000, \r, \n]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", " \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\r\n\r" + "'", str3, "\n\r\n\n\r\r\n\r");
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!", pattern1, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", pattern1, "\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!", pattern1, "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!" + "'", str3, " hi!");
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "", 75);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 75 + "'", int3 == 75);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", 282, (-42));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", pattern1, "hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) " \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!\nhi!\rhi!hhi!\nhi!\rhi!ihi!\nhi!\rhi!!hi!\nhi!\rhi!\n\nhi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", pattern1, "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!" + "'", str3, " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!");
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        char[] charArray8 = new char[] { 'a', '#', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\r", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", pattern1, "\n\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" ", "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\n\r\n\n\r\r\n\r", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray7 = new char[] { 'a', '#', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence2, charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray7);
        java.lang.Class<?> wildcardClass12 = charArray7.getClass();
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !       h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\r\n\r\n\n\r\r\n\r", "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hhi!ihi!!hi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, h, h, i, !, i, h, i, !, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 580, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\r\n\r\n\n\r\r\n\r", "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\r\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", false, 94, (java.lang.CharSequence) "\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 0, 126);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray9 = new char[] { '\000', '\n', '\000', '\r', '\n' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\r\n\r", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence1, charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", charArray9);
        java.lang.Class<?> wildcardClass14 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\000\n\000\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\000\n\000\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\000, \n, \000, \r, \n]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", (java.lang.CharSequence) " \n \r h \n \r i \n \r ! \n \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        short[] shortArray6 = new short[] { (byte) -1, (byte) 1, (short) 0, (short) 0, (byte) 10, (byte) -1 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 1, 0, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", 281);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", "hi!hhi!ihi!!hi!\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\r\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r" + "'", str3, " \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", false, (int) (byte) 1, (java.lang.CharSequence) "\r", 33, (int) '\000');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
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
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", pattern1, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r" + "'", str3, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        char[] charArray7 = new char[] { '#', 'a', '\n', 'a', '\n' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a\na\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a\na\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, \n, a, \n]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-128) + "'", int3 == (-128));
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", (-22), 118);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ", "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "", true, (-1), (java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", 6, 34);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        java.lang.Class<?> wildcardClass5 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \n, \n, \n,  , h,  , i,  , !,  , h,  , h,  , i,  , !,  , i,  , h,  , i,  , !,  , !,  , h,  , i,  , !,  ]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", " \n \r h \n \r i \n \r ! \n \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, " \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", pattern1, "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!\rhi!hhi!\nhi!\rhi!ihi!\nhi!\rhi!!hi!\nhi!\rhi!\n\nhi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", (-64), 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", (java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", (-30));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\r", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\r", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\n\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "\n\n\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ", 19, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!\rhi!hhi!\nhi!\rhi!ihi!\nhi!\rhi!!hi!\nhi!\rhi!\n\nhi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", (java.lang.CharSequence) "\n", 355);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !       h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\r\n\r\n\n\r\r\n\r", pattern1, " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\r\n\r\n\n\r\r\n\r" + "'", str3, "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\r\n\r\n\n\r\r\n\r");
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\n\n\r\r\n\r", pattern1, "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\r\r\n\r" + "'", str3, "\n\n\r\n\n\r\r\n\r");
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", 136);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, false, (int) (byte) -1, (java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 33, 400);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", (int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        double[] doubleArray4 = new double[] { 100.0f, 580, 118, 12 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[100.0, 580.0, 118.0, 12.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !       h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", charSequence1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", 65, 137);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        char[] charArray8 = new char[] { '\000', '\n', '\000', '\r', '\n' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray8);
        java.lang.Class<?> wildcardClass14 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\000\n\000\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\000\n\000\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\000, \n, \000, \r, \n]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", pattern1, "\n\n\r\n\n\n\r\n\r\n\n\r\n h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! " + "'", str3, "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\r\n\r", pattern1, "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\r\n\r" + "'", str3, "\n\n\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\r\n\r");
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charSequence1, (-91));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", pattern1, "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!" + "'", str3, " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!");
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 242 + "'", int1 == 242);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hhi!ihi!!hi!", "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", " ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", pattern1, "hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
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
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int22 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str23 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int24 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean25 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int26 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int27 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray4);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, h, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, i, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n, \r, \n, \n, \r, \r, \n, \r,  , h,  , i,  , !,  , h,  , h,  , i,  , !,  , i,  , h,  , i,  , !,  , !,  , h,  , i,  , !,  ]");
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        char[] charArray5 = new char[] { 'a', '#', '4' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        java.lang.Class<?> wildcardClass9 = charArray5.getClass();
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", 126);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", pattern1, "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", true, 118, (java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", 428, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! " + "'", str3, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        long[] longArray6 = new long[] { '#', (-94), (-1L), (byte) 1, (short) 100, 100 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        java.lang.Class<?> wildcardClass8 = longArray6.getClass();
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[35, -94, -1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", (java.lang.CharSequence) "\n\n\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , h,  , i,  , !,  , h,  , h,  , i,  , !,  , i,  , h,  , i,  , !,  , !,  , h,  , i,  , !,  ]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        char[] charArray5 = new char[] { 'a', '#', '4' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        java.lang.Class<?> wildcardClass10 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\nhi!\rhi!hhi!\nhi!\rhi!ihi!\nhi!\rhi!!hi!\nhi!\rhi!\n\nhi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", 63, (-35));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", pattern1, "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "", " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", "\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n\n\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 145 + "'", int1 == 145);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (-138));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r", (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", (-94));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r" + "'", str3, " \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", 0, 256);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\r\n\r", (-64));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charSequence1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hhi!ihi!!hi!");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !, h, h, i, !, i, h, i, !, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \n \r h \n \r i \n \r ! \n \r ", " ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (-72), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", (-94));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\r", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\r", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, "\n\n\r\n\n\n\r\n\r\n\n\r\n h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", 137, 75);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" h i ! h h i ! i h i ! ! h i ! ", "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " h i ! h h i ! i h i ! ! h i ! " + "'", str3, " h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", pattern1, "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\r\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" ", pattern1, "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (-19), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\r\n\r", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        long[] longArray2 = new long[] { (-159), (byte) 0 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        java.lang.Class<?> wildcardClass8 = longArray2.getClass();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-159, 0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\r", 65);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!\nhi!\rhi!hhi!\nhi!\rhi!ihi!\nhi!\rhi!!hi!\nhi!\rhi!\n\nhi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!?hi!?hi!hhi!?hi!?hi!ihi!?hi!?hi!!hi!?hi!?hi!??hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!??????");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", pattern1, "\n\n\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", " \n \r h \n \r i \n \r ! \n \r ", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r" + "'", str3, "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\r\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", (java.lang.CharSequence) "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", (-159));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hhi!ihi!!hi!");
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[h, i, !, h, h, i, !, i, h, i, !, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 10, 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", (java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", pattern1, "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r" + "'", str3, " \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\r\n\r\n\n\r\r\n\r", pattern1, "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\r\n\r\n\n\r\r\n\r" + "'", str3, "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\r\n\r\n\n\r\r\n\r");
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" h i ! h h i ! i h i ! ! h i ! ", "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!", charArray5);
        java.lang.Class<?> wildcardClass10 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , h, i, !]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        char[] charArray10 = new char[] { 'a', '#', '4' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\r", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray10);
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
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 475 + "'", int1 == 475);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        char[] charArray8 = new char[] { 'a', '#', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\r", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray8);
        java.lang.Class<?> wildcardClass15 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 662 + "'", int3 == 662);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", (-30), 325);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", charArray4);
        java.lang.Class<?> wildcardClass8 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", (java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) str10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !       h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        boolean[] booleanArray1 = new boolean[] { true };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        java.lang.Class<?> wildcardClass6 = booleanArray1.getClass();
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray1), "[true]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", 39);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
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
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", (-98));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        short[] shortArray3 = new short[] { (short) 100, (byte) 1, (short) -1 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        java.lang.Class<?> wildcardClass5 = shortArray3.getClass();
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[100, 1, -1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", 571, (-91));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ???? h i ! h h i ! i h i ! ! h i ! h???? h i ! h h i ! i h i ! ! h i ! i???? h i ! h h i ! i h i ! ! h i ! !???? h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!?????????????????hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", 39, 75);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", "", "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r" + "'", str3, "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r");
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\n\n\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126 + "'", int2 == 126);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 1, 0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 73);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (-91), (-138));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", false, 2, (java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (-72), 103);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \n, \r, \n, \n, \n, \r, \n, \r, \n, \n, \r,  , h,  , i,  , !,  , h,  , h,  , i,  , !,  , i,  , h,  , i,  , !,  , !,  , h,  , i,  , !,  ]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\n\n\r\r\n\r", "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\r\r\n\r" + "'", str3, "\n\n\r\n\n\r\r\n\r");
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\n\n\r\n\r\n\n\r\n h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", pattern1, " \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\r\n\r\n\n\r\n h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r" + "'", str3, "\n\n\r\n\n\n\r\n\r\n\n\r\n h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", (java.lang.CharSequence) "", 65);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 65 + "'", int3 == 65);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", (-159), 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", 129, (-91));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !       h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", pattern1, "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !       h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! " + "'", str3, "\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !       h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        char[] charArray7 = new char[] { 'a', '#', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!\rhi!hhi!\nhi!\rhi!ihi!\nhi!\rhi!!hi!\nhi!\rhi!\n\nhi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", (java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 77, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!", "\n\r\n\n\r\r\n\r", "\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ", " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  " + "'", str3, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ");
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !       h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (-252));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", " \n \r h \n \r i \n \r ! \n \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r" + "'", str3, "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r");
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", 139);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", "\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !       h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r" + "'", str3, " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \n, \r, \n, \n, \r, \r, \n, \r, h, h, i, !, i, h, i, !, !, h, i, !, h, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, i, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", 34, 430);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        char[] charArray11 = new char[] { 'a', '#', '4' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray11);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\r", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray11);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", charArray11);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhi!\rhi!hhi!\nhi!\rhi!ihi!\nhi!\rhi!!hi!\nhi!\rhi!\n\nhi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", pattern1, " \n \r h \n \r i \n \r ! \n \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!\rhi!hhi!\nhi!\rhi!ihi!\nhi!\rhi!!hi!\nhi!\rhi!\n\nhi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r" + "'", str3, "hi!\nhi!\rhi!hhi!\nhi!\rhi!ihi!\nhi!\rhi!!hi!\nhi!\rhi!\n\nhi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" h i ! h h i ! i h i ! ! h i ! ", pattern1, "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " h i ! h h i ! i h i ! ! h i ! " + "'", str3, " h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", 0, (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        java.lang.CharSequence charSequence3 = null;
        java.lang.CharSequence charSequence6 = null;
        char[] charArray11 = new char[] { 'a', '#', '4' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray11);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence6, charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence3, charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray11);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ", charArray11);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", charArray11);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\r", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\r", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        java.lang.Class<?> wildcardClass8 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!\rhi!hhi!\nhi!\rhi!ihi!\nhi!\rhi!!hi!\nhi!\rhi!\n\nhi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-137) + "'", int3 == (-137));
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", "\n\n\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        char[] charArray9 = new char[] { 'a', '#', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\r", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", 571);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ", "", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r \r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \rh\r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \ri\r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \r!\r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \r \r" + "'", str3, "\r \r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \rh\r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \ri\r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \r!\r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \r \r");
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", (java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\n\n\r\n\r\n\n\r\n h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", " h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\r\n\r\n\n\r\n h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r" + "'", str3, "\n\n\r\n\n\n\r\n\r\n\n\r\n h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", pattern1, "\r \r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \rh\r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \ri\r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \r!\r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \r \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! " + "'", str3, "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, \n, \n, \n, \n, \r, \n, \n, \n, \n, \n, \r, \n, \r, \n, \n, \n, \r, \n, h, \n, h, \n, i, \n, !, \n, i, \n, h, \n, i, \n, !, \n, !, \n, h, \n, i, \n, !, \n, h, \n, h, \n, i, \n, !, \n, h, \n, h, \n, i, \n, !, \n, i, \n, h, \n, i, \n, !, \n, !, \n, h, \n, i, \n, !, \n, i, \n, h, \n, i, \n, !, \n, h, \n, h, \n, i, \n, !, \n, i, \n, h, \n, i, \n, !, \n, !, \n, h, \n, i, \n, !, \n, !, \n, h, \n, i, \n, !, \n, h, \n, h, \n, i, \n, !, \n, i, \n, h, \n, i, \n, !, \n, !, \n, h, \n, i, \n, !, \n]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !       h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", 22, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ", 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n\n\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) (-252));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        char[] charArray7 = new char[] { 'a', '#', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", (java.lang.CharSequence) "\n\n\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\r\n\r", (-138));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (-42));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", (-35));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 144 + "'", int3 == 144);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", false, (-72), (java.lang.CharSequence) "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", (-60), 94);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", charArray5);
        java.lang.Class<?> wildcardClass13 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray1);
        java.lang.Class<?> wildcardClass3 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!\rhi!hhi!\nhi!\rhi!ihi!\nhi!\rhi!!hi!\nhi!\rhi!\n\nhi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\n, \n,  , h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, h, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, i, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !,  ,  , h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, h, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, i, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, \n, \r, \r, \n, \r]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 137 + "'", int7 == 137);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (-400));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", false, (int) '\n', (java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 25, 137);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        char[] charArray9 = new char[] { 'a', '#', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", charArray9);
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
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ", pattern1, " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  " + "'", str3, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ");
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", (int) (short) 0, 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 508, 599);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", (java.lang.CharSequence) " \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\n\r\r\n\r", (int) ' ', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", pattern1, "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\r \r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \rh\r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \ri\r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \r!\r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \r \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hhi!ihi!!hi!");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !, h, h, i, !, i, h, i, !, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, " \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\r\n\n\r\r\n\r", " \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 73);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!" + "'", str3, "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!");
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, " \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", (java.lang.CharSequence) "\n\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 939 + "'", int1 == 939);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", (int) '#', 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, \n, \n, \n,  , h,  , i,  , !,  , h,  , h,  , i,  , !,  , i,  , h,  , i,  , !,  , !,  , h,  , i,  , !,  ]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        char[] charArray5 = new char[] { 'a', '#', '4' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", pattern1, "\n\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\n\n\r\n\n\r\r\n\r", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" hi!", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", "hi!hhi!ihi!!hi!\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!" + "'", str3, " hi!");
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 100 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        java.lang.Class<?> wildcardClass7 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !       h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !       h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! " + "'", str3, "\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !       h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 31);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  ", true, (-144), (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", 325, 536);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
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
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str17 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.Class<?> wildcardClass18 = strArray4.getClass();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n", 282, 137);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\r", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", false, (-98), (java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 0, (-159));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", 144);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\r\n\r", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", "\r \r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \rh\r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \ri\r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \r!\r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \r \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\r\n\r", "\n\r\n\n\r\r\n\r", "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r" + "'", str3, "\n\n\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 400);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", (int) (byte) -1, 325);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , h,  , i,  , !,  , h,  , h,  , i,  , !,  , i,  , h,  , i,  , !,  , !,  , h,  , i,  , !,  ]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", pattern1, "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! " + "'", str3, "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, \n, \n, \n, \n, \r, \n, \n, \n, \n, \n, \r, \n, \r, \n, \n, \n, \r, \n, h, \n, h, \n, i, \n, !, \n, i, \n, h, \n, i, \n, !, \n, !, \n, h, \n, i, \n, !, \n, h, \n, h, \n, i, \n, !, \n, h, \n, h, \n, i, \n, !, \n, i, \n, h, \n, i, \n, !, \n, !, \n, h, \n, i, \n, !, \n, i, \n, h, \n, i, \n, !, \n, h, \n, h, \n, i, \n, !, \n, i, \n, h, \n, i, \n, !, \n, !, \n, h, \n, i, \n, !, \n, !, \n, h, \n, i, \n, !, \n, h, \n, h, \n, i, \n, !, \n, i, \n, h, \n, i, \n, !, \n, !, \n, h, \n, i, \n, !, \n]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        java.lang.Class<?> wildcardClass5 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , h, i, !]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        long[] longArray2 = new long[] { 139, 19 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        java.lang.Class<?> wildcardClass4 = longArray2.getClass();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[139, 19]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r", 144, (-94));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-137) + "'", int3 == (-137));
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", pattern1, "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\r", " \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "\n \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \n \r h \n \r i \n \r ! \n \r ", "\r \r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \rh\r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \ri\r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \r!\r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \r \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", 242, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        char[] charArray11 = new char[] { '\000', '\n', '\000', '\r', '\n' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray11);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\000\n\000\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\000\n\000\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\000, \n, \000, \r, \n]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\n\r\n\n\n\r\n\r\n\n\r\n h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", pattern1, "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n\n\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n\n\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n, \n, \n, \n,  , h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, h, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, i, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !,  ,  , h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, h, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, i, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, \n, \r, \r, \n, \n, \r, \n, \n, \r, \r, \n, \r, h, h, i, !, i, h, i, !, !, h, i, !, h, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, i, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, \r, \n, \n, \r, \r, \n, \r]");
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", true, 136, (java.lang.CharSequence) " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 91, (-128));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "", 159, 355);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", " hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r" + "'", str3, "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!", (java.lang.CharSequence) " \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (-22));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", (-12));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        char[] charArray9 = new char[] { 'a', '#', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray9);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", true, (-118), charSequence3, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 39);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", 281);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", 242);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r \r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \rh\r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \ri\r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \r!\r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \r \r", (-144), (-138));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n", (java.lang.CharSequence) "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", charArray3);
        java.lang.Class<?> wildcardClass6 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, \n,  , h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, h, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, i, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !,  ,  , h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, h, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, i, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, \n, \r, \r, \n, \r]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r \r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \rh\r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \ri\r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \r!\r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \r \r", "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\r\n\n\r\r\n\r\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r \r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \rh\r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \ri\r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \r!\r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \r \r" + "'", str3, "\r \r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \rh\r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \ri\r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \r!\r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \r \r");
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hhi!ihi!!hi!");
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", charArray7);
        java.lang.Class<?> wildcardClass14 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[h, i, !, h, h, i, !, i, h, i, !, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "\n\r", "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\r\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "\n\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\r\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", pattern1, "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! " + "'", str3, "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray7 = new char[] { 'a', '#', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence2, charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", charArray7);
        java.lang.Class<?> wildcardClass13 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hhi!ihi!!hi!", " h i ! h h i ! i h i ! ! h i ! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", pattern1, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, " \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", "\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", "\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! " + "'", str3, "\r\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", (java.lang.CharSequence) "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charSequence1, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n", " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence4 = null;
        char[] charArray9 = new char[] { 'a', '#', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence4, charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\n\r\r\n\r", charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray9);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", pattern1, "\r \r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \rh\r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \ri\r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \r!\r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \r \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! " + "'", str3, "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ");
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\r \r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \rh\r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \ri\r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \r!\r \r \r \r \r \rh\r \ri\r \r!\r \rh\r \rh\r \ri\r \r!\r \ri\r \rh\r \ri\r \r!\r \r!\r \rh\r \ri\r \r!\r \r \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", 0, 67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (-60));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, 97, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", false, (int) '\n', (java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 0, 138);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", pattern1, "hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, "\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", "\n\n\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\r\n\r", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        short[] shortArray0 = new short[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n\n\r\r\n\r", pattern1, " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\r\n\r" + "'", str3, "\n\r\n\n\r\r\n\r");
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray10 = new char[] { 'a', '#', '4' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence5, charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\r\n\rh\n\r\n\n\r\r\n\ri\n\r\n\n\r\r\n\r!\n\r\n\n\r\r\n\r", charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" h i ! h h i ! i h i ! ! h i ! ", " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        char[] charArray13 = new char[] { 'a', '#', '4' };
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray13);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", charArray13);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray13);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r", charArray13);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\r\n\r", charArray13);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray13);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\n\n\r\n\n\n\n\n\r\n\r\n\n\n\r\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\ni\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n!\nh\ni\n!\nh\nh\ni\n!\ni\nh\ni\n!\n!\nh\ni\n!\n", charArray13);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray13);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray13);
        int int23 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray13);
        boolean boolean24 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", 662, 87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", pattern1, "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r" + "'", str3, " \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r");
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", false, 599, (java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r\n h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", 4, 256);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\r\n\r", " h i ! h h i ! i h i ! ! h i ! ", " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\r\n\r" + "'", str3, "\n\n\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\r\n\r");
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", true, (int) 'a', charSequence3, 94, (-60));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\r\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! \n\n\n\n\n h i ! h h i ! i h i ! ! h i ! \r\n\n\n\n h i ! h h i ! i h i ! ! h i !  h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", 129);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", charArray5);
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
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!", "\n\r", " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!" + "'", str3, "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!");
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", pattern1, "      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i !  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\n h i ! h h i ! i h i ! ! h i ! ", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n \r h \n \r i \n \r ! \n \r ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", false, 77, (java.lang.CharSequence) "hi!hhi!ihi!!hi!\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! ", 0, 31);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " h i ! h h i ! i h i ! ! h i ! ", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\r", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", 136);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", "\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\r\n\n\r\n\n\n\r\n\r\n\n\r\n\r\n\n\r\r\n\r h i ! h h i ! i h i ! ! h i ! \n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\r", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", pattern1, "\n\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!" + "'", str3, " hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\r \n \r h \n \r i \n \r ! \n \r \n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\r\n\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\n\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\r h i ! h h i ! i h i ! ! h i ! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\n\n\r\r\n\r", (java.lang.CharSequence) "\n\n\n\n hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!  hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\n\r\r\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!\n\n\r\n\n\r\r\n\rhhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hi!\nhi!\rhi!\nhi!\nhi!\rhi!\rhi!\nhi!\rhi! hi!hhi! hi!ihi! hi!!hi! hi!hhi! hi!hhi! hi!ihi! hi!!hi! hi!ihi! hi!hhi! hi!ihi! hi!!hi! hi!!hi! hi!hhi! hi!ihi! hi!!hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\r\n\r", (java.lang.CharSequence) "\n      h i ! h h i ! i h i ! ! h i ! h     h i ! h h i ! i h i ! ! h i ! i     h i ! h h i ! i h i ! ! h i ! !     h i ! h h i ! i h i ! ! h i ! \n\n\n\n h i ! h h i ! i h i ! ! h i ! h\n\n\n\n h i ! h h i ! i h i ! ! h i ! i\n\n\n\n h i ! h h i ! i h i ! ! h i ! !\n\n\n\n h i ! h h i ! i h i ! ! h i ! hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\n\r\n\n\r\r\n\r\n\n\n\r\n\r\n\n\rhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }
}

