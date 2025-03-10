import java.util.Arrays;
import java.util.Scanner;

public class BasicSyntaxProblemsSheet {
    Scanner scanner;

    public BasicSyntaxProblemsSheet() {
        this.scanner = new Scanner(System.in);
    }

    public void solutions(){

        System.out.println("Sheet [basic syntax problems]");

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
        System.out.println("#5");
        problem5();
        System.out.println("\n_____________");

    }

    void problem1(){
        System.out.println("Hello, World!");
    }

    void problem2(){

        int a = 5, b=10,c;
        //باستخدام الجمع والطرح
        a= a+b;
        b= a-b;
        a= a-b;
        System.out.printf("a=%d , b=%d", a,b);

        //باستخدام الضرب والقسمة
        a= a*b;
        b= a/b;
        a= a/b;

        System.out.printf("\na=%d , b=%d", a,b);

    }

    void problem3(){

        System.out.println("Please enter Number to check whether Even or Odd?");
        int num = scanner.nextInt();

        if(num%2==0){
            System.out.printf("The Number %d is => Even", num);
        }else{
            System.out.printf("The Number %d is => Odd", num);
        }
    }

    void problem4(){

        System.out.println("Please enter The First Number ?");
        int num1 = scanner.nextInt();

        System.out.println("Please enter The Second Number ?");
        int num2 = scanner.nextInt();

        System.out.println("Please enter The Third Number ?");
        int num3 = scanner.nextInt();

        if(num1>num2 && num1>num3){
            System.out.printf("The Largest Number is => %d", num1);
        }else if(num2>num1 && num2>num3){
            System.out.printf("The Largest Number is => %d", num2);
        }else{
            System.out.printf("The Largest Number is => %d", num3);
        }

    }

    void problem5(){
        System.out.println("Please enter The Number?");
        int numberDigits = scanner.nextInt();

        int[] digits = Arrays.stream(String.valueOf(numberDigits).split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
//        System.out.println("Array: " + Arrays.toString(digits));

        int result = 0;
        for(int digit:digits){
            result += digit;
        }
        System.out.printf("Sum of Digits (%d) => %d", numberDigits, result);

    }
}
