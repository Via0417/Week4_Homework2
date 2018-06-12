package com.thoughtworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();

    public void start(int count) {
        for (int i = 1; i <= count; i++){
            String result = judge(i);
            results.add(result);
        }
    }

    public List<String> getResults() {
        return results;
    }

    public String judge(int i) {
        String result = "";
        if (3 == (i % 10) || 3 == (i / 10)) {
            result = "Fizz";
        }else{
            if (3 == i || 0 == (i%3))
                result = result + "Fizz";
            if (0 == (i%5))
                result = result + "Buzz";
            if (7 == i || 0 == (i%7))
                result = result + "Whizz";
        }

        if (result == "")
            result = String.valueOf(i);
        return result;
    }
}


