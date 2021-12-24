package javaTwo;


import java.util.ArrayList;
import java.util.List;

public class PrimeDirective {

    //create list of all prime numbers in an array

    //creates array of only prime numbers
    public static List<Integer> onlyPrimes(int[] s){

        List<Integer> arrToReturn = new ArrayList<>();

        //loop through each number in array & check if prime or not, if so add it to the array to return
        for(int numb : s){
            if(isPrime(numb)){
                arrToReturn.add(numb);
            }
        }

        return arrToReturn;

    }


    //checks if number is prime
    public static boolean isPrime(int number){

        //check if number is 2
        if(number == 2){
            return true;
        }

        //check if number is less than 2, if so not true prime number
        if(number < 2){
            return false;
        }

        //check if number is divisible by 2 to number -1 (bc prime numbs divisible only by 1 & number)
        for(int i = 2; i < number; i++){
            //if divisible by any of these numbers, return false bc not prime
            if(number % i == 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        PrimeDirective pd = new PrimeDirective();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

        System.out.println(onlyPrimes(numbers));


    }
}
