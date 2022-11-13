package unitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UnitTest {

    @Test
    public void JuintMethod() {
        System.out.print("executing Junit Test Cases");
    }

    // create fractial method
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // create power method with double type
    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * power(x, n - 1);
        }
    }

    // global variable PI value
    public static final double PI = 3.141592653589793;

    // create trignometric method sin without using math class which takes radian or
    // degree as input and return sin value
    public static double sin(double radian) {
        // check if value is in radian or degree
        if (radian > 2 * PI) {
            double rad = (PI / 180) * radian;
            // create sin value
            double sinValue = 0;

            for (int i = 0; i < 10; i++) {
                sinValue = sinValue + power(-1, i) * power(rad, 2 * i + 1) / factorial(2 * i + 1);
            }
            return sinValue;
        } else {
            // create sin value
            double sinValue = 0;

            for (int i = 0; i < 10; i++) {
                sinValue = sinValue + power(-1, i) * power(radian, 2 * i + 1) / factorial(2 * i + 1);
            }
            return sinValue;
        }
    }

    // trignometric method cos without using math class which takes radian or degree
    // as input and return cos value
    public static double cos(double radian) {
        // check if value is in radian or degree
        if (radian > 2 * PI) {
            double rad = (PI / 180) * radian;
            // create cos value
            double cosValue = 0;

            for (int i = 0; i < 10; i++) {
                cosValue = cosValue + power(-1, i) * power(rad, 2 * i) / factorial(2 * i);
            }
            return cosValue;
        } else {
            // create cos value
            double cosValue = 0;

            for (int i = 0; i < 10; i++) {
                cosValue = cosValue + power(-1, i) * power(radian, 2 * i) / factorial(2 * i);
            }
            return cosValue;
        }
    }

    // create trignometric method tan without using math class which takes radian as
    // input and return tan value

    public static double tan(double radian) {
        // check if value is in radian or degree
        double tanValue = 0;

        if (radian > 2 * PI) {
            double rad = (PI / 180) * radian;
            // create tan value

            tanValue = sin(rad) / cos(rad);
            return tanValue;
        } else {
            // create tan value
            tanValue = sin(radian) / cos(radian);
            return tanValue;
        }
    }

    public static void main(String[] args) {

        // print this is unit test class
        System.out.println("This is main trignometric method class");
    }

}