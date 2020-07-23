package junit5.tdd;

public class FizzBuzz {

    public static final String BUZZ = "Buzz";
    private static final String FIZZ = "Fizz";
    public static final String WHIZZ = "Whizz";

    public String play(int inputNumber) {
        if(inputNumber % 3 == 0 && inputNumber % 5 == 0 && inputNumber % 7 == 0){
            return String.format("%s%s%s", FIZZ, BUZZ, WHIZZ);
        }
        if(inputNumber % 3 == 0 && inputNumber % 5 == 0){
            return String.format("%s%s", FIZZ, BUZZ);
        }
        if(inputNumber % 3 == 0 && inputNumber % 7 == 0){
            return String.format("%s%s", FIZZ, BUZZ);
        }
        if(inputNumber % 5 == 0 && inputNumber % 7 == 0){
            return String.format("%s%s", FIZZ, BUZZ);
        }
        if(inputNumber % 3 == 0){
            return FIZZ;
        }
        if(inputNumber % 5 == 0){
            return BUZZ;
        }
        if(inputNumber % 7 == 0){
            return WHIZZ;
        }
        return String.valueOf(inputNumber);
    }
}
