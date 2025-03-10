import java.util.Arrays;
import java.util.Scanner;

public class ControlFlowProblemsSheet {
    Scanner scanner;

    public ControlFlowProblemsSheet() {
        this.scanner = new Scanner(System.in);
    }

    public void solutions(){

        System.out.println("Sheet [control flow problems]");

        // #1
        System.out.println("#1");
        problem1();
        System.out.println("\n_____________");


        // #2
        System.out.println("#2");
        problem2();
        System.out.println("\n_____________");


        // #3
        System.out.println("#3");
        problem3();
        System.out.println("\n_____________");


        // #4
        System.out.println("#4");
        problem4();
        System.out.println("\n_____________");


        // #5
//        System.out.println("#5");
//        problem5();
//        System.out.println("\n_____________");

    }

    void problem1(){
        System.out.println("Please enter num to check is prime or not?");
        int num = scanner.nextInt();
        System.out.printf("The number %d is %s", num, isPrime(num)?"Prime":"Not Prime");
    }

    void problem2(){
        System.out.printf(" The first 10 numbers of the Fibonacci sequence => %s", Arrays.toString(fibonacciSeries(10)));
    }

    void problem3(){
        System.out.println("Please enter Number to Recursive It ?");
        int num = scanner.nextInt();
        long result = numberRecursion(num);
        if(result != -1){
            System.out.printf("The Recursion of ( %d ) => %d", num, result);
        }else{
            System.out.print("The value should be positive integer.");
        }
    }

    void problem4(){
        System.out.println("Please enter the Number to Reverse It ?");
        int num = scanner.nextInt();
        // First Convert Number to String
        String str = String.valueOf(num);

        // Second Reverse String
        String reversed = "";

        for(int i=str.length()-1; i>=0;i--){
            reversed += str.charAt(i);
        }
        // Third Convert reversed string to Number
        int result = Integer.parseInt(reversed);

        System.out.printf("The Reversed Number of ( %d ) => ( %d )", num, result);

    }

    void problem5(){

    }

    /*   Helper Functions   */

    public boolean isPrime(int num) {

        // Numbers less than 2 are not prime
        if (num < 2) {
            return false;
        }

        // 2 and 3 are prime numbers
        if (num == 2 || num == 3) {
            return true;
        }

        // All even numbers greater than 2 are not prime
        if (num % 2 == 0) {
            return false;
        }

        // Check divisibility only for odd numbers from 3 to the square root of num
        for (int i = 3; i * i <= num; i += 2) { // Note: Use i+=2 instead of num+=2
            if (num % i == 0) {
                return false; // If num is divisible, it's not prime
            }
        }

        return true; // If no divisor was found, the number is prime
    }

    public int[] fibonacciSeries(int size){
        int[] fibonacciSeries = new int[size];

        if(size > 0) fibonacciSeries[0]=0;
        if(size > 1) fibonacciSeries[1]=1;

        for (int i=2; i<size; i++){
            //0+1=1    1+1=2     2+1=3   3+2=5   5+3=8
            fibonacciSeries[i] = fibonacciSeries[i-1] + fibonacciSeries[i-2];
        }
        // List of fibonacci series
        return fibonacciSeries;
    }

    public long numberRecursion(int num){
        if(num < 0){
            return -1;
        } else if (num == 0 || num ==1) {
            return 1;
        }

        return num*numberRecursion(num-1);
    }
}
