package com.guilherme.miguel;

import org.junit.Before;
import org.junit.Test;

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
        assertThat(fizzBuzz.checkNumber(3)).isEqualTo("fizz");
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
    public void testNumber15() throws Exception {
        assertThat(fizzBuzz.checkNumber(15)).isEqualTo("fizzbuzz");
    }

    @Test
    public void testRangeFizz() throws Exception {
        assertThat(fizzBuzz.range(1, 3)).isEqualTo("1 2 fizz");
    }

    @Test
    public void testRangeBuzz() throws Exception {
        assertThat(fizzBuzz.range(1, 5)).isEqualTo("1 2 fizz 4 buzz");
    }

    @Test
    public void testRangeFizzBuzz() throws Exception {
        assertThat(fizzBuzz.range(1, 15)).isEqualTo("1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz");
    }

    @Test
    public void testRangeTo20() throws Exception {
        assertThat(fizzBuzz.range(1, 20)).isEqualTo("1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz");
    }

}