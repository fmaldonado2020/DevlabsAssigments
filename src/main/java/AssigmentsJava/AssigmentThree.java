package AssigmentsJava;

import java.util.Scanner;

public class AssigmentThree {
    public static void main(String[] args) {
        //1. Write a program to print the occurrence of each character in the String
        getOccuringChar("DevLabs Alliance Training");

        //2. Write a program to check if a given string is a palindrome or not.
        isPalindrome();

        //3. Write a program to check “brown” is present in the string: A brown fox ran away fast
        checkIfPressent("brown","A brown fox ran away fast");

        //4. Write a program to convert String to a character array and character array to String.
        convertString();

        //5. Write a program to throw NumberFormatException and handle it appropriately with a proper message.
        //6. Write a program where a method declares that it throws ArithmeticException.
        //7. Write a program with nested try blocks.
        //8. Write a program to re-throw an exception. (throw inside catch block)

        //this cover 5,6,7 and 8
        errorMessage();



    }

    public static void getOccuringChar(String str)
    {

        int count[] = new int[256];

        int len = str.length();

        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;

        char ch[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {

                if (str.charAt(i) == ch[j])
                    find++;
            }

            if (find == 1)
                System.out.println(
                        "Number of Occurrence of "
                                + str.charAt(i)
                                + " is:" + count[str.charAt(i)]);
        }
    }

    public static void isPalindrome(){
        String a, b = "";
        System.out.print("Enter the string you want to check:");
        a = "trurt";
        int n = a.length();
        for(int i = n - 1; i >= 0; i--)
        {
            b = b + a.charAt(i);
        }
        if(a.equalsIgnoreCase(b))
        {
            System.out.println("The string is palindrome.");
        }
        else
        {
            System.out.println("The string is not palindrome.");
        }
    }

    public static void checkIfPressent(String word, String sentence){
        if(sentence.contains(word)){
            System.out.println("Word is present");
        }else{
            System.out.println("Word is not present");
        }
    }

    public static void convertString(){
        String str = "My Current String";
        String newString ="";

        char[] ch = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }

        for (char c : ch) {
            newString = newString + c;
            System.out.println(c);
        }
        System.out.println("New String: " + newString);
    }

    public static void errorMessage(){
        try {
            try {
                int a = Integer.parseInt(null);
            } catch (Exception e) {
                System.out.println("check number format ");
            }
            throw new ArithmeticException("Calculation error");
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }


    }
}



