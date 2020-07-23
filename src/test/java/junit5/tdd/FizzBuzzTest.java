package junit5.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_return_1_when_count_off_given_1() {
        //Given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 1;

        //When
        String result = fizzBuzz.play(inputNumber);

        //Then
        assertEquals("1",result);
    }

    @Test
    void should_return_fizz_when_count_off_given_3() {
        //Given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 3;

        //When
        String result = fizzBuzz.play(inputNumber);

        //Then
        assertEquals("Fizz",result);
    }

    @Test
    void should_return_buzz_when_count_off_given_5() {
        //Given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 5;

        //When
        String result = fizzBuzz.play(inputNumber);

        //Then
        assertEquals("Buzz",result);
    }

    @Test
    void should_return_fizzbuzz_when_count_off_given_15() {
        //Given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 15;

        //When
        String result = fizzBuzz.play(inputNumber);

        //Then
        assertEquals("FizzBuzz",result);
    }

    @Test
    void should_return_whizz_when_count_off_given_7() {
        //Given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 7;

        //When
        String result = fizzBuzz.play(inputNumber);

        //Then
        assertEquals("Whizz",result);
    }
}
