package com.example.textcounter.utils;

public class TextCounter {
    static final int OUT = 0;
    static final int IN = 1;
    public static int getCharsCount(String phrase){
        int state = OUT;
        int wc = 0;  // word count
        int i = 0;

        // Scan all characters one by one
        while (i < phrase.length())
        {
            // If next character is a separator, set the
            // state as OUT
            if (phrase.charAt(i) == ' ' || phrase.charAt(i) == ',' || phrase.charAt(i) == '.' || phrase.charAt(i) == '\n'
                    || phrase.charAt(i) == '\t')
                state = OUT;


                // If next character is not a word separator
                // and state is OUT, then set the state as IN
                // and increment word count
            else if (state == OUT)
            {
                state = IN;
                ++wc;
            }

            // Move to next character
            ++i;
        }
        return wc;
    }
}
