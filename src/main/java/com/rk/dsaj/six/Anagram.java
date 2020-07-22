package com.rk.dsaj.six;

import java.util.ArrayList;

public class Anagram {

    private char[] charArray;
    private int size;
    ArrayList<String> anagramOutput;

    public ArrayList<String> findAnagrams(String input) {
        if (input == null || input.length() == 0) {
            this.anagramOutput.add("");
        } else {
            this.size = input.length();
            charArray = input.toCharArray();
            this.anagramOutput = new ArrayList<>();
            if (this.size == 1) {
                this.anagramOutput.add(input);
            } else {
                doAnagram(this.size);
            }
        }
        return anagramOutput;
    }

    private void doAnagram(int size) {
        if (size != 1 && size != 0) {
            for (int i = 0; i < size; i++) {
                doAnagram(size - 1);
                if (size == 2) {
                    printWord();
                }
                rotate(size);
            }
        }
    }

    private void printWord() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int j = 0; j < this.size; j++) {
            stringBuilder.append(charArray[j]);
        }
        if (!anagramOutput.contains(stringBuilder.toString())) {
            anagramOutput.add(stringBuilder.toString());
        }
    }

    private void rotate(int size) {
        int position = this.size - size;
        char temp = this.charArray[position];
        int i;
        for (i = position + 1; i < this.size; i++) {
            this.charArray[i - 1] = this.charArray[i];
        }
        this.charArray [i - 1] = temp;
    }
}
