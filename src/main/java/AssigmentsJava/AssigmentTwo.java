package AssigmentsJava;

import java.util.Scanner;

public class AssigmentTwo {
    public static void main(String[] args) {
        //1. Java Program to Calculate average of numbers using Array
        calculateAverageArray();

        //2. Find all the odd numbers from 79 to 187
        oddNumbers();

        //3. Is 13 a prime number?
        isPrimeNumber();

        //4. Find the sum of digits
        //sumOfDigits();

        //5. Reverse a number 123
        reverseNumber();

        //6. Find the duplicates in an array 12, 32, 12, 45, 65, 93, 0, 23, 45, 6
        findDuplicate();
    }


    public static void calculateAverageArray(){
        double[] arr = {19, 12.89, 16.5, 200, 13.7};
        double total = 0;

        for(int i=0; i<arr.length; i++){
            total = total + arr[i];
        }
        double average = total / arr.length;
        System.out.format("The average is: %.3f", average);
    }

    public static void oddNumbers(){
        int number=187;
        System.out.println("List of odd numbers from 79 to 187");
        for (int i=79; i<=number; i++)
        {
            if (i%2!=0)
            {
                System.out.println(i + " ");
            }
        }
    }

    public static void isPrimeNumber(){
        int num = 13;
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }

    public static void sumOfDigits(){
        int m, n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        m = s.nextInt();
        while(m > 0)
        {
            n = m % 10;
            sum = sum + n;
            m = m / 10;
        }
        System.out.println("Sum of Digits:"+sum);
    }

    public static void reverseNumber(){
        int num = 123, reversed = 0;

        while(num != 0) {

            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }

    public static void findDuplicate(){
        int [] arr = new int [] {12, 32, 12, 45, 65, 93, 0, 23, 45, 6};

        System.out.println("Duplicate elements in given array: ");
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}



