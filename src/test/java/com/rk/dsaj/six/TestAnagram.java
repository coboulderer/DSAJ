package com.rk.dsaj.six;

import com.rk.dsaj.BaseTest;
import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestAnagram extends BaseTest {

    private Anagram anagram;

    @BeforeEach
    public void setup() {
        anagram = new Anagram();
    }

    @Test
    public void testfindAnagramSingleLetter() {
        String input = "a";
        ArrayList<String> output = anagram.findAnagrams(input);
        output.forEach(System.out::println);
        Assertions.assertEquals(1, output.size());
    }

    @Test
    public void testfindAnagramTwoLetters() {
        String input = "ab";
        ArrayList<String> output = anagram.findAnagrams(input);
        output.forEach(System.out::println);
        Assertions.assertEquals(2, output.size());
    }

    @Test
    public void testfindAnagramThreeLetters() {
        String input = "cat";
        ArrayList<String> output = anagram.findAnagrams(input);
        output.forEach(System.out::println);
        Assertions.assertEquals(6, output.size());
    }

    @Test
    public void testfindAnagramFourLetters() {
        String input = "goal";
        ArrayList<String> output = anagram.findAnagrams(input);
        output.forEach(System.out::println);
        Assertions.assertEquals(24, output.size());
    }

}
