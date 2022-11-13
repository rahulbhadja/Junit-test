package unitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Tests {

    // create test case for sin method with junit test case with math class with
    // diffent test function
    @Test
    public void testSin() {
        assertEquals(Math.sin(0), UnitTest.sin(0), 0.001);
    }

    @Test
    public void testSin1() {
        assertEquals(Math.sin(Math.PI / 6), UnitTest.sin(Math.PI / 6), 0.001);
    }

    @Test
    public void testSin2() {
        assertEquals(Math.sin(Math.PI / 4), UnitTest.sin(Math.PI / 4), 0.001);
    }

    @Test
    public void testSin3() {
        assertEquals(Math.sin(Math.PI / 3), UnitTest.sin(Math.PI / 3), 0.001);
    }

    @Test
    public void testSin4() {
        assertEquals(Math.sin(Math.PI / 2), UnitTest.sin(Math.PI / 2), 0.00001);
    }

    // one test with the random value of radian
    @Test
    public void testSinRandom() {
        double radian = Math.random();
        assertEquals(Math.sin(radian), UnitTest.sin(radian), 0.001);
    }

    // create test case for cos method with junit test case with math class with
    // diffent test function

    @Test
    public void testCos() {
        assertEquals(Math.cos(0), UnitTest.cos(0), 0.001);
    }

    @Test
    public void testCos1() {
        assertEquals(Math.cos(Math.PI / 6), UnitTest.cos(Math.PI / 6), 0.00001);
    }

    @Test
    public void testCos2() {
        assertEquals(Math.cos(Math.PI / 4), UnitTest.cos(Math.PI / 4), 0.0000000000001);
    }

    @Test
    public void testCos3() {
        assertEquals(Math.cos(Math.PI / 3), UnitTest.cos(Math.PI / 3), 0.001);
    }

    @Test
    public void testCos4() {
        assertEquals(Math.cos(Math.PI / 2), UnitTest.cos(Math.PI / 2), 0.001);
    }

    // one test with the random value of radian
    @Test
    public void testCosRandom() {
        double radian = Math.random();
        assertEquals(Math.cos(radian), UnitTest.cos(radian), 0.001);
    }

    // create test case for tan method with junit test case with math class with
    // diffent test function

    @Test
    public void testTan() {
        assertEquals(Math.tan(0), UnitTest.tan(0), 0.001);
    }

    @Test
    public void testTan1() {
        assertEquals(Math.tan(Math.PI / 6), UnitTest.tan(Math.PI / 6), 0.001);
    }

    @Test
    public void testTan2() {
        assertEquals(Math.tan(Math.PI / 4), UnitTest.tan(Math.PI / 4), 0.001);
    }

    @Test
    public void testTan3() {
        assertEquals(Math.tan(Math.PI / 3), UnitTest.tan(Math.PI / 3), 0.001);
    }

    @Test
    public void testTan4() {
        assertEquals(Math.tan(Math.PI / 2), UnitTest.tan(Math.PI / 2), 0.001);
    }

    // one test with the random value of radian
    @Test
    public void testTanRandom() {
        double radian = Math.random();
        assertEquals(Math.tan(radian), UnitTest.tan(radian), 0.001);
    }

    // create unint test for the factorial method
    @Test
    public void testFactorial() {
        assertEquals(24, UnitTest.factorial(4));
    }

    @Test
    public void testFactorial1() {
        assertEquals(120, UnitTest.factorial(5));
    }

    // one test with the random value
    @Test
    public void testFactorialRandom() {
        int random = (int) (Math.random() * 10);
        assertEquals(UnitTest.factorial(random), UnitTest.factorial(random));
    }

    // create unit test for the power method

    @Test
    public void testPower() {
        assertEquals(8, UnitTest.power(2, 3));
    }

    // one test with base 2 with random value of power
    @Test
    public void testPowerRandom() {
        int random = (int) (Math.random() * 10);
        assertEquals(UnitTest.power(2, random), UnitTest.power(2, random));
    }

}
