package com.company;
//The task is a sequence of Catalan numbers
public class  NumbersOfBrackets {

    public int determineTheNumber(int N){ //method for determining Catalan number

        int c = 0; //assign an initial value of 0 to the Catalan number

        // according to the formula
        if (N == 0) {
            return 1;
        }
        // Calculating a number from the Catalan series
        for (int i = 0; i < N; i++) {
           c += determineTheNumber(i) * determineTheNumber((N - 1) - i);//use recursion to calculate
              }
        return c;
    }
}
