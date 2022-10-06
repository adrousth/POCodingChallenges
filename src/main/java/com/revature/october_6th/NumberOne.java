package com.revature.october_6th;

import java.util.regex.Pattern;

public class NumberOne {
    // (i)Create a function that will test if a string is a valid PIN or not via a regular expression.
    //
    //A valid PIN has:
    //  Exactly 4 or 6 characters.
    //  Only numeric characters (0-9).
    //  No whitespace.
    public static void main(String[] args) {
        validate("121317");
        validate("1234");
        validate("45135");
        validate("89abc1");
        validate("900876");
        validate(" 4983");
        validate("");
    }

    public static void validate(String pin) {
        Pattern pattern = Pattern.compile("^([0-9]{4}|[0-9]{6})$");
        System.out.println("\"" + pin + "\": " + pattern.matcher(pin).find());

    }
}
