package junit5.tdd;

public class FizzBuzz {
    public String play(int inputNumber) {
        if(inputNumber % 3 == 0 && inputNumber % 5 == 0 && inputNumber % 7 == 0){
            return "FizzBuzzWhizz";
        }
        if(inputNumber % 3 == 0 && inputNumber % 5 == 0){
            return "FizzBuzz";
        }
        if(inputNumber % 3 == 0 && inputNumber % 7 == 0){
            return "FizzBuzz";
        }
        if(inputNumber % 5 == 0 && inputNumber % 7 == 0){
            return "FizzBuzz";
        }
        if(inputNumber % 3 == 0){
            return "Fizz";
        }
        if(inputNumber % 5 == 0){
            return "Buzz";
        }
        if(inputNumber % 7 == 0){
            return "Whizz";
        }
        return String.valueOf(inputNumber);
    }
}
