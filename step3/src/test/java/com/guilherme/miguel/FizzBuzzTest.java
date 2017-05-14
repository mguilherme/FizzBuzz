package com.guilherme.miguel;

import org.junit.Before;
import org.junit.Test;

import static java.lang.System.lineSeparator;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Miguel Guilherme
 */
public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void testNumber1() throws Exception {
        assertThat(fizzBuzz.checkNumber(1)).isEqualTo("1");
    }

    @Test
    public void testNumber2() throws Exception {
        assertThat(fizzBuzz.checkNumber(2)).isEqualTo("2");
    }

    @Test
    public void testNumber3() throws Exception {
        assertThat(fizzBuzz.checkNumber(3)).isEqualTo("lucky");
    }

    @Test
    public void testNumber4() throws Exception {
        assertThat(fizzBuzz.checkNumber(4)).isEqualTo("4");
    }

    @Test
    public void testNumber5() throws Exception {
        assertThat(fizzBuzz.checkNumber(5)).isEqualTo("buzz");
    }

    @Test
    public void testNumber6() throws Exception {
        assertThat(fizzBuzz.checkNumber(6)).isEqualTo("fizz");
    }

    @Test
    public void testNumber7() throws Exception {
        assertThat(fizzBuzz.checkNumber(7)).isEqualTo("7");
    }

    @Test
    public void testNumber8() throws Exception {
        assertThat(fizzBuzz.checkNumber(8)).isEqualTo("8");
    }

    @Test
    public void testNumber9() throws Exception {
        assertThat(fizzBuzz.checkNumber(9)).isEqualTo("fizz");
    }

    @Test
    public void testNumber10() throws Exception {
        assertThat(fizzBuzz.checkNumber(10)).isEqualTo("buzz");
    }

    @Test
    public void testNumber13() throws Exception {
        assertThat(fizzBuzz.checkNumber(13)).isEqualTo("lucky");
    }

    @Test
    public void testNumber15() throws Exception {
        assertThat(fizzBuzz.checkNumber(15)).isEqualTo("fizzbuzz");
    }

    @Test
    public void testNumber333() throws Exception {
        assertThat(fizzBuzz.checkNumber(333)).isEqualTo("lucky");
    }

    @Test
    public void testReport() throws Exception {
        String range = "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz";
        String report = fizzBuzz.getReport(range);
        String expectedReport = lineSeparator() + "fizz: 3"
                + lineSeparator() + "buzz: 2"
                + lineSeparator() + "fizzbuzz: 1"
                + lineSeparator() + "lucky: 2"
                + lineSeparator() + "integer: 7";

        assertThat(report).isEqualTo(expectedReport);
    }

    @Test
    public void testRangeFizzLucky() throws Exception {
        String report = "fizz: 0"
                + lineSeparator() + "buzz: 0"
                + lineSeparator() + "fizzbuzz: 0"
                + lineSeparator() + "lucky: 1"
                + lineSeparator() + "integer: 2";

        assertThat(fizzBuzz.range(1, 3)).isEqualTo("1 2 lucky" + lineSeparator() + report);
    }

    @Test
    public void testRangeBuzzLucky() throws Exception {
        String report = "fizz: 0"
                + lineSeparator() + "buzz: 1"
                + lineSeparator() + "fizzbuzz: 0"
                + lineSeparator() + "lucky: 1"
                + lineSeparator() + "integer: 3";

        assertThat(fizzBuzz.range(1, 5)).isEqualTo("1 2 lucky 4 buzz" + lineSeparator() + report);
    }

    @Test
    public void testRangeFizzBuzz() throws Exception {
        String report = "fizz: 3"
                + lineSeparator() + "buzz: 2"
                + lineSeparator() + "fizzbuzz: 1"
                + lineSeparator() + "lucky: 2"
                + lineSeparator() + "integer: 7";

        assertThat(fizzBuzz.range(1, 15)).isEqualTo("1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz"
                + lineSeparator() + report);
    }

    @Test
    public void testRangeTo20() throws Exception {
        String report = "fizz: 4"
                + lineSeparator() + "buzz: 3"
                + lineSeparator() + "fizzbuzz: 1"
                + lineSeparator() + "lucky: 2"
                + lineSeparator() + "integer: 10";

        assertThat(fizzBuzz.range(1, 20)).isEqualTo("1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz"
                + lineSeparator() + report);
    }

    @Test
    public void testRange20To30() throws Exception {
        String report = "fizz: 3"
                + lineSeparator() + "buzz: 2"
                + lineSeparator() + "fizzbuzz: 0"
                + lineSeparator() + "lucky: 2"
                + lineSeparator() + "integer: 4";

        assertThat(fizzBuzz.range(20, 30)).isEqualTo("buzz fizz 22 lucky fizz buzz 26 fizz 28 29 lucky" + lineSeparator() + report);
    }

}