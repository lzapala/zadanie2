package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @BeforeEach
    void printBeforeTest() {
        System.out.println("Test will be launched");

    }

    @AfterEach
    void printAfterTest() {
        System.out.println("Test has been finished");
    }

    @Test
    void isTheNumberPositive() {
        //given3

        //when
        double sprawdzenie = Main.positiveNegativeZero(10);

        //then
        assertTrue(sprawdzenie < 0);
    }



}