package com.example.testingdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
public class HomeController {

    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello, World";
    }
    public int TestOne() {
        return 1;
    }
    public int addition(int x, int y) {
        return x + y;
    }
    public int multiply(int x, int y) {
        return x * y;
    }
    public int subtract(int x, int y) {
        return x - y;
    }
    public List<Integer> math(int x, int y) {
        List<Integer> mathValues = new ArrayList<>();
        mathValues.add(addition(x,y));
        mathValues.add(multiply(x,y));
        mathValues.add(subtract(x,y));

        return mathValues;
        }
        public mathVals testClassValues(int x, int y) {
            mathVals values = new mathVals();
            values.addition = addition(x, y);
            values.multiplication = multiply(x, y);
            values.subtraction = subtract(x, y);

            return values;
        }
    }