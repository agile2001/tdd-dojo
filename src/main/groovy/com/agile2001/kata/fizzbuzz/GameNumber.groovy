package com.agile2001.kata.fizzbuzz

class GameNumber {
    private final int number

    GameNumber(int number) {
        this.number = number
    }

    String execute() {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz"
        }
        if (number % 3 == 0) {
            return "Fizz"
        }
        if (number % 5 == 0) {
            return "Buzz"
        }
        "$number"
    }
}
