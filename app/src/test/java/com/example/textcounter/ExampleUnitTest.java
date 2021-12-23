package com.example.textcounter;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.textcounter.utils.TextCounter;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void Test01GetCharsCount(){
        String inputString = "ABC";

        int expectedValue = 1;
        int actualValue = TextCounter.getCharsCount(inputString);

        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void Test02GetCharsCount(){
        String inputString = "";

        int expectedValue = 0;
        int actualValue = TextCounter.getCharsCount(inputString);

        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void Test03GetCharsCount(){
        String inputString = "Hello world!";

        int expectedValue = 2;
        int actualValue = TextCounter.getCharsCount(inputString);

        assertEquals(expectedValue,actualValue);
    }

}

