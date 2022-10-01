package com.agile2001.kata.fizzbuzz

import spock.lang.Specification
import static org.junit.jupiter.api.Assertions.*;

class GameNumberTest extends Specification {
    def "should_return_数字_given_数字_when_计算"() {

        given:
        def gameNumber = new GameNumber(1)
        when:
        def result = gameNumber.execute()
        then:
        "1" == result
    }

    def "should_return_Fizz_given_被3整除_when_计算"() {

        given:
        def gameNumber = new GameNumber(3)
        when:
        def result = gameNumber.execute()
        then:
        "Fizz" == result
    }


    def "should_return_Buzz_given_被5整除_when_计算"() {

        given:
        def gameNumber = new GameNumber(5)
        when:
        def result = gameNumber.execute()
        then:
        "Buzz" == result
    }

    def "should_return_FizzBuzz_given_同时被3和5整除_when_计算"() {

        given:
        def gameNumber = new GameNumber(15)
        when:
        def result = gameNumber.execute()
        then:
        "FizzBuzz" == result
    }
}
