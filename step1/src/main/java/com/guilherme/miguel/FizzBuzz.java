package com.guilherme.miguel;

/**
 * Created by Miguel Guilherme on 16/07/2016.
 */
public class FizzBuzz {

    /**
     * Replace a number with a string
     *
     * @param num number to be replaced
     * @return fizz, buzz, fizzbuzz or the number itself
     */
    public String checkNumber(int num) {
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
     * replaced with fizz, buzz, fizzbuzz or the number itself
     */
    public String range(int start, int end) {
        String output = "";
        for (int i = start; i <= end; i++) {
            output += checkNumber(i) + " ";
        }

        return output.trim();
    }
}
