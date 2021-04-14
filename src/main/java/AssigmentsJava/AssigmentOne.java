package AssigmentsJava;

import javax.sound.midi.SysexMessage;
import java.util.Arrays;
import java.util.Scanner;

public class AssigmentOne {
    public static void main(String[] args) {
        //1. Write a program to calculate the factorial of a number using a while loop.
        calculateFactorial();

        //2. Write a program to print fibonacci series (10 values).
        fibonacci();

        //3. Write a program to sort the elements of an array in ascending order.
        orderArray();

        //4. Write a program to check whether the current year is leap year or not. Users will enter a year value
        //checkYear();

        //5. Write a program to print the first 10 prime numbers.
        printPrimeNumbers();

        //6. Write a program to calculate the area of a triangle. Users will enter the values for base and height of the triangle
        //calculateAreaOfTriangle();

        //7. Write a program to print the sum of the first 20 natural numbers.
        printSumNaturalNumbers();

        //8. Write a program to reverse the elements of an array where the array size as well as the array values are entered by the user.
        rvereseArray(new int[]{1, 2, 3, 5, 6, 7});

        //9. Write a program to print only even numbers till 50.
        printEvenNumbers(50);

        //10. Write a program to print this output using a two-dimensional array.
        //i had some troubles here, so i searched for examples and info, and i went for pascal triangle
        pascalTriangle();
    }

    public static void calculateFactorial(){
        int i,fact=1;
        int number=5;
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }

    public static void fibonacci (){
            int n = 10, t1 = 0, t2 = 1;
            System.out.print("First " + n + " terms: ");
            for (int i = 1; i <= n; ++i)
            {
                System.out.print(t1 + " + ");
                int sum = t1 + t2;
                t1 = t2;
                t2 = sum;
            }
        }

    public static void orderArray(){
        int [] arr = new int [] {5, 2, 8, 7, 1, 9, 3, 11};
        int temp = 0;
        System.out.println("Elements of original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void checkYear(){
        int year;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any Year:");
        year = scan.nextInt();
        scan.close();
        boolean isLeap = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            }
            else
                isLeap = true;
        }
        else {
            isLeap = false;
        }

        if(isLeap==true)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");
        }

        public static void printPrimeNumbers(){
            int ct=0,n=0,i=1,j=1;
            while(n<10)
            {
                j=1;
                ct=0;
                while(j<=i)
                {
                    if(i%j==0)
                        ct++;
                    j++;
                }
                if(ct==2)
                {
                    System.out.printf("%d ",i);
                    n++;
                }
                i++;
            }
        }


        public static void calculateAreaOfTriangle(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the width of the Triangle:");
            double base = scanner.nextDouble();
            System.out.println("Enter the height of the Triangle:");
            double height = scanner.nextDouble();
            double area = (base* height)/2;
            System.out.println("Area of Triangle is: " + area);
        }

        public static void printSumNaturalNumbers(){
            int num = 20, count = 1, total = 0;

            while(count <= num)
            {
                total = total + count;
                count++;
            }

            System.out.println("Sum of first 20 natural numbers is: "+total);
        }

    static void rvereseArray(int arr[])
    {
        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Array in reverse order: ");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    static void printEvenNumbers(int n){
        System.out.print("Even Numbers from 1 to "+n+" are: ");
        for (int i = 1; i <= n; i++) {
            //if number%2 == 0 it means its an even number
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void pascalTriangle() {

        int n,i,j,a[][];
        //taking user's input.
        n= 10;
        a=new int[n][n];
        //filling the 2D matrix.
        for(i=0;i<n;i++){
            for(j=0;j<=i;j++)
                if(j==0 || j==i)
                    a[i][j]=1;
                else
                    a[i][j]=a[i-1][j-1]+a[i-1][j];
        }
        System.out.println("\nOUTPUT:\n");
        for(i=0;i<n;i++)
        {
            for(j=0;j<=i;j++)
                System.out.print("0"+"\t");

            System.out.println();
        }
    }
}



