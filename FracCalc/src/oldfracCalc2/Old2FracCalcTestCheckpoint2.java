package oldfracCalc2;

import org.junit.Test;

// Checkpoint 2-only tests
public class Old2FracCalcTestCheckpoint2
{
    @Test public void testCheckpoint2_1() {  Old2FracCalcTestALL.assertForEarlyCheckpoints(null, "whole:6 numerator:5 denominator:8", "12_3/8", OldFracCalc2.produceAnswer("5_3/4 + 6_5/8"));}
    @Test public void testCheckpoint2_2() {  Old2FracCalcTestALL.assertForEarlyCheckpoints(null, "whole:20 numerator:0 denominator:1", "-20_3/7", OldFracCalc2.produceAnswer("-3/7 - 20"));}
    @Test public void testCheckpoint2_3() {  Old2FracCalcTestALL.assertForEarlyCheckpoints(null, "whole:0 numerator:27 denominator:21", "-33_2/7", OldFracCalc2.produceAnswer("-32 - 27/21"));}


}
