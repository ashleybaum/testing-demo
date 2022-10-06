package com.example.testingdemo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ValueTests {

    @Autowired
    private HomeController homeController;

    @Test
    public void returnVal() throws Exception {
        assertThat(homeController.TestOne() == 1);
    }

    @Test
    public void additionTest() throws Exception{
        assertThat(homeController.addition(2,5)).isEqualTo(7);
    }

    @Test
    public void MultiplicationTest() throws Exception{
        assertThat(homeController.multiply(2, 5)).isEqualTo(10);
    }

    @Test
    public void SubtractionTest() throws Exception {
        assertThat(homeController.subtract(2, 5)).isEqualTo(-3);
    }

    @Test
    public void MathTest() throws Exception {
        assertThat(homeController.math(2, 5)).contains(7, 10, -3);
        assertThat(homeController.math(10, 10)).contains(20, 100, 0);
    }
    @Test
    public void classValTest() throws Exception {
        assertThat(homeController.testClassValues(2, 5).addition).isEqualTo(7);
        assertThat(homeController.testClassValues(100, 52).subtraction).isEqualTo(48);
        assertThat(homeController.testClassValues(5,5).multiplication).isEqualTo(25);
    }
}