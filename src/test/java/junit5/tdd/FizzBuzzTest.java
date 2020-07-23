package junit5.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void should_return_1_when_count_off_given_1() {
        //Given
        int inputNumber = 1;

        //When
        String result = fizzBuzz.play(inputNumber);

        //Then
        assertEquals("1",result);
    }

    @Test
    void should_return_fizz_when_count_off_given_3() {
        //Given
        int inputNumber = 3;

        //When
        String result = fizzBuzz.play(inputNumber);

        //Then
        assertEquals("Fizz",result);
    }

    @Test
    void should_return_buzz_when_count_off_given_5() {
        //Given
        int inputNumber = 5;

        //When
        String result = fizzBuzz.play(inputNumber);

        //Then
        assertEquals("Buzz",result);
    }

    @Test
    void should_return_fizzbuzz_when_count_off_given_15() {
        //Given
        int inputNumber = 15;

        //When
        String result = fizzBuzz.play(inputNumber);

        //Then
        assertEquals("FizzBuzz",result);
    }

    @Test
    void should_return_whizz_when_count_off_given_7() {
        //Given
        int inputNumber = 7;

        //When
        String result = fizzBuzz.play(inputNumber);

        //Then
        assertEquals("Whizz",result);
    }

    @Test
    void should_return_fizzbuzzwhizz_when_count_off_given_105() {
        //Given
        int inputNumber = 105;

        //When
        String result = fizzBuzz.play(inputNumber);

        //Then
        assertEquals("FizzBuzzWhizz",result);
    }

    @Test
    void should_return_fizzbuzz_when_count_off_given_21() {
        //Given
        int inputNumber = 21;

        //When
        String result = fizzBuzz.play(inputNumber);

        //Then
        assertEquals("FizzBuzz",result);
    }

    @Test
    void should_return_fizzbuzz_when_count_off_given_35() {
        //Given
        int inputNumber = 35;

        //When
        String result = fizzBuzz.play(inputNumber);

        //Then
        assertEquals("FizzBuzz",result);
    }
}
