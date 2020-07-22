package com.rk.dsaj.six;

import java.util.ArrayList;

public class Knapsack {

    private ArrayList<Integer> knapsack;
    private int[] input;

    public ArrayList<Integer> fillKnapsack(int[] input, int target) {
        knapsack = new ArrayList<>();
        this.input = input;
        tryToFill(target, 0);
        return knapsack;
    }

    private void tryToFill(int target, int index) {
        //check index for array boundary
        //if current index = target, add to knapsack and return
        //else if less than target add to knapsack, make recursive call for next index and new target
        //else if greater than target, skip that index and make recursive call for next index and current target

        //if no match found on current starting index and less than array boundary, empty knapsack and try again starting
        //with next

        if (index < input.length) {
            if (input[index] == target) {
                knapsack.add(input[index]);
                return;
            } else if (input[index] < target) {
                knapsack.add(input[index]);
                tryToFill(target - input[index], index + 1);
            } else {
                tryToFill(target, index + 1);
            }
        }

        if (index < input.length) {
            //if we get here a solution was not found for a given starting index. Empty knapsack and start over
            knapsack.clear();
            tryToFill(target, index + 1);
        }
    }
}
