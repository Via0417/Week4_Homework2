package com.thoughtworks;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class FizzBuzzGameTest {
    @Test
    public void should_return_Fizz_when_have_3() {
        FizzBuzzGame fbg = new FizzBuzzGame();
        String result = "Fizz";
        assertThat(fbg.judge(3), equalTo(result));
    }

    @Test
    public void shoul_return_Buzz_when_have_5(){
        FizzBuzzGame fbg = new FizzBuzzGame();
        String result = "Buzz";
        assertThat(fbg.judge(5), equalTo(result));
    }

    @Test
    public void should_return_Whizz_when_have_7(){
        FizzBuzzGame fbg = new FizzBuzzGame();
        String result = "Whizz";
        assertThat(fbg.judge(7), equalTo(result));
    }

    @Test
    public void should_return_Fizz_when_have_9(){
        FizzBuzzGame fbg = new FizzBuzzGame();
        String result = "Fizz";
        assertThat(fbg.judge(9), equalTo(result));
    }

    @Test
    public void should_return_Buzz_when_have_10(){
        FizzBuzzGame fbg = new FizzBuzzGame();
        String result = "Buzz";
        assertThat(fbg.judge(10), equalTo(result));
    }
    @Test
    public void should_return_Whizz_when_have_14(){
        FizzBuzzGame fbg = new FizzBuzzGame();
        String result = "Whizz";
        assertThat(fbg.judge(14), equalTo(result));
    }

    @Test
    public void should_return_FizzWhizz_when_have_21(){
        FizzBuzzGame fbg = new FizzBuzzGame();
        String result = "FizzWhizz";
        assertThat(fbg.judge(21), equalTo(result));
    }

    @Test
    public void should_return_Fizz_when_have_13(){
        FizzBuzzGame fbg = new FizzBuzzGame();
        String result = "Fizz";
        assertThat(fbg.judge(13), equalTo(result));
    }

    @Test
    public void should_return_Fizz_when_have_35(){
        FizzBuzzGame fbg = new FizzBuzzGame();
        String result = "Fizz";
        assertThat(fbg.judge(35), equalTo(result));
    }
}
