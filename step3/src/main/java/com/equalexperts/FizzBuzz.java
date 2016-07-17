package com.equalexperts;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.System.lineSeparator;

/**
 * Created by Miguel Guilherme on 16/07/2016.
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
        String output = IntStream.rangeClosed(start, end)
                .mapToObj(this::checkNumber)
                .collect(Collectors.joining(" "));

        return output + getReport(output);
    }

    /**
     * Generate a report with counts for each fizz, buzz, fizzbuzz, lucky and integers
     *
     * @param range range previously created
     * @return the report counts
     */
    private String getReport(String range) {
        int fizzCount = 0;
        int buzzCount = 0;
        int fizzBuzzCount = 0;
        int luckyCount = 0;
        int integerCount = 0;

        String[] items = range.split(" ");
        for (String item : items) {
            switch (item) {
                case "fizz":
                    fizzCount++;
                    break;
                case "buzz":
                    buzzCount++;
                    break;
                case "fizzbuzz":
                    fizzBuzzCount++;
                    break;
                case "lucky":
                    luckyCount++;
                    break;
                default:
                    integerCount++;
            }
        }

        String output = "";
        output += lineSeparator() + "fizz: " + fizzCount;
        output += lineSeparator() + "buzz: " + buzzCount;
        output += lineSeparator() + "fizzbuzz: " + fizzBuzzCount;
        output += lineSeparator() + "lucky: " + luckyCount;
        output += lineSeparator() + "integer: " + integerCount;

        return lineSeparator() + output.trim();
    }

}
