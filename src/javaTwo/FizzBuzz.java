package javaTwo;

public class FizzBuzz {

   //print out numbers 1-100, if value is mulitple of 3 print fizz, if value is multiple of 5
        //print buzz, if both print fizzbuzz

    public static void main(String[] args) {

        //loop through numbers
        for (int i = 1; i <= 100; i++) {

            //check if multiple of 3 && 5
            if((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("FizzBuzz");
            }

            //else check if multiple of 3
            else if(i % 3 == 0){
                System.out.println("Fizz");
            }

            //else check if multiple of 5
            else if (i % 5 == 0){
                System.out.println("Buzz");
            }

            //else
            else{
                System.out.println(i);
            }
        }
    }

}
