package oldfracCalc2;

import org.junit.Test;

// Checkpoint 3-only tests
public class Old2FracCalcTestCheckpoint3
{
    @Test public void testCheckpoint3_AdditionSimple3() {Old2FracCalcTestALL.assertForEarlyCheckpoints(null, null, "4_3/7", OldFracCalc2.produceAnswer("1_1/7 + 3_2/7"));}
    @Test public void testCheckpoint3_AdditionWholeNumbers2() {Old2FracCalcTestALL.assertForEarlyCheckpoints(null, null, "1", OldFracCalc2.produceAnswer("2/3 + 1/3"));}
    @Test public void testCheckpoint3_AdditionWholeNumbers7() {Old2FracCalcTestALL.assertForEarlyCheckpoints(null, null, "1021778", OldFracCalc2.produceAnswer("124543 + 897235"));}
    @Test public void testCheckpoint3_AdditionWithNegatives4() {Old2FracCalcTestALL.assertForEarlyCheckpoints(null, null, "-1_1/4", OldFracCalc2.produceAnswer("-3_3/4 + 2_2/4"));}
    @Test public void testCheckpoint3_AdditionImproperFractionsAndReductions2() {Old2FracCalcTestALL.assertForEarlyCheckpoints(null, null, "1_1/20", OldFracCalc2.produceAnswer("4/5 + 2/8"));}
    @Test public void testCheckpoint3_AdditionCombined4() { Old2FracCalcTestALL.assertForEarlyCheckpoints(null, null, "62_11/19", OldFracCalc2.produceAnswer("0 + 34_543/19"));}
    @Test public void testCheckpoint3_SubtractionSimple3() {Old2FracCalcTestALL.assertForEarlyCheckpoints(null, null, "0", OldFracCalc2.produceAnswer("4_1/2 - 4_1/2"));}
    @Test public void testCheckpoint3_SubtractionWithNegatives3() {Old2FracCalcTestALL.assertForEarlyCheckpoints(null, null, "-1_1/4", OldFracCalc2.produceAnswer("-3_3/4 - -2_2/4"));}
    @Test public void testCheckpoint3_SubtractionCombined2() {Old2FracCalcTestALL.assertForEarlyCheckpoints(null, null, "8_5/21", OldFracCalc2.produceAnswer("-12_3/7 - -20_2/3"));}
    @Test public void testCheckpoint3_MultiplicationBasic1() {  Old2FracCalcTestALL.assertForEarlyCheckpoints(null, null, "3", OldFracCalc2.produceAnswer("1_1/2 * 2"));}
    @Test public void testCheckpoint3_MultiplicationBasic10() {Old2FracCalcTestALL.assertForEarlyCheckpoints(null, null, "378/943", OldFracCalc2.produceAnswer("27/41 * 14/23"));}
    @Test public void testCheckpoint3_MultiplicationBasic3() {Old2FracCalcTestALL.assertForEarlyCheckpoints(null, null, "164268", OldFracCalc2.produceAnswer("234 * 702"));}
    @Test public void testCheckpoint3_MultiplicationWithNegatives2() {Old2FracCalcTestALL.assertForEarlyCheckpoints(null, null, "-8", OldFracCalc2.produceAnswer("-12/3 * 2/1"));}
    @Test public void testCheckpoint3_MultiplicationWithNegatives6() {Old2FracCalcTestALL.assertForEarlyCheckpoints(null, null, "15_5/7", OldFracCalc2.produceAnswer("-3_2/3 * -4_2/7"));}
    @Test public void testCheckpoint3_MultiplicationByZero2() {Old2FracCalcTestALL.assertForEarlyCheckpoints(null, null, "0", OldFracCalc2.produceAnswer("0 * 0"));}
    @Test public void testCheckpoint3_MultiplicationByZero3() {Old2FracCalcTestALL.assertForEarlyCheckpoints(null, null, "0", OldFracCalc2.produceAnswer("0 * 9321"));}
    @Test public void testCheckpoint3_MultiplicationByZero4() {Old2FracCalcTestALL.assertForEarlyCheckpoints(null, null, "0", OldFracCalc2.produceAnswer("0 * -5902"));}
    @Test public void testCheckpoint3_MultiplicationCombined1() {   Old2FracCalcTestALL.assertForEarlyCheckpoints(null, null, "1065_115/168", OldFracCalc2.produceAnswer("-32_75/16 * -27_43/21"));}
    @Test public void testCheckpoint3_MultiplicationCombined2() {Old2FracCalcTestALL.assertForEarlyCheckpoints(null, null, "-15_67/943", OldFracCalc2.produceAnswer("1_27/41 * -3_140/23"));}
    @Test public void testCheckpoint3_DivisionBasic1() {Old2FracCalcTestALL.assertForEarlyCheckpoints(null, null, "9/16", OldFracCalc2.produceAnswer("3/4 / 4/3"));}
    @Test public void testCheckpoint3_DivisionBasic2() {Old2FracCalcTestALL.assertForEarlyCheckpoints(null, null, "2_1/4", OldFracCalc2.produceAnswer("3/2 / 2/3"));}
    @Test public void testCheckpoint3_DivisionWithNegatives5() {Old2FracCalcTestALL.assertForEarlyCheckpoints(null, null, "-2_6/7", OldFracCalc2.produceAnswer("-20 / 7"));}
    @Test public void testCheckpoint3_DivisionWithNegatives6() {Old2FracCalcTestALL.assertForEarlyCheckpoints(null, null, "1_13/32", OldFracCalc2.produceAnswer("-3_3/4 / -2_2/3"));}
    @Test public void testCheckpoint3_DivisionWithZero5() { Old2FracCalcTestALL.assertForEarlyCheckpoints(null, null, "0", OldFracCalc2.produceAnswer("0 / 46/27"));}
    @Test public void testCheckpoint3_DivisionWithZero6() {Old2FracCalcTestALL.assertForEarlyCheckpoints(null, null, "0", OldFracCalc2.produceAnswer("0/24 / 1/46"));}
    @Test public void testCheckpoint3_DivisionCombined2() {Old2FracCalcTestALL.assertForEarlyCheckpoints(null, null, "-2_2/3", OldFracCalc2.produceAnswer("16/4 / -3/2"));}
    @Test public void testCheckpoint3_DivisionCombined3() {Old2FracCalcTestALL.assertForEarlyCheckpoints(null, null, "6_661/5520", OldFracCalc2.produceAnswer("-38_3/72 / -4_82/37"));}
}
