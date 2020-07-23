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
}
