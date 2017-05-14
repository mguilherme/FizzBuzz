package com.guilherme.miguel;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Miguel Guilherme
 */
public class FizzBuzz {

    /**
     * Replace a number with a string
     *
     * @param num number to be replaced
     * @return fizz, buzz, fizzbuzz, lucky or the number itself
     */
    public String checkNumber(int num) {
        if (String.valueOf(num).contains("3")) return "lucky";

        String output = "";
        if (num % 3 == 0) output = "fizz";
        if (num % 5 == 0) output += "buzz";

        return output.isEmpty() ? String.valueOf(num) : output;
    }

    /**
     * Parse a range of numbers
     *
     * @param start start number
     * @param end   end number
     * @return a string with the multiples of 3, 5 or 15
     * replaced with fizz, buzz, fizzbuzz, lucky or the number itself
     */
    public String range(int start, int end) {
        return IntStream.rangeClosed(start, end)
                .mapToObj(this::checkNumber)
                .collect(Collectors.joining(" "));
    }

}
