import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Output Line
        System.out.println("Good morning, everybody!");
        System.out.print("This is first line...");
        System.out.println(" So i am...");
        System.out.println("But me is the second one...");
        System.out.print("Line 1\nLine 2\n");
        System.out.println("Line 3");


        // Declare and initialize variables
        int a = 10;
        int b = 20, c = 30;
        int d = 40;
        int e = 50;


        // Do some calculations/operations
        System.out.println("a = " + a);
        a = b + c;
        System.out.println("a = " + a);


        // Declare and initialize with calculations/operations
        int f = a * 100;
        System.out.println("f = " + f);

        // Strange result?
        // notes: string concatenation, the string + int converted to string except use parenthesis ()
        System.out.println("f + a = " + f + a);
        System.out.println("f + a = " + (f + a));


        // Correct result
        // Because multiplication has more priority than plus (math)
        System.out.println("f + a = " + f * a);


        // Input numeric data
        System.out.print("Please input an integer ");
        int number1 = new Scanner(System.in).nextInt();
        System.out.print("Please input another integer: ");
        int number2 = new Scanner(System.in).nextInt();
        System.out.print(number1 + " + " + number2 + " = " + (number1 + number2));


        // Input string data
        System.out.print("Please input your name: ");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Nice to meet you, " + name);


        // Input string data and convert it to numeric
        System.out.print("Please input an integer: ");
        String temp = new Scanner(System.in).nextLine();
        int first_number = Integer.parseInt(temp);
        System.out.print("Please input a real number: ");
        temp = new Scanner(System.in).nextLine();
        double second_number = Double.parseDouble(temp);
        System.out.print(first_number + " X " + second_number + " = " + first_number * second_number);
    }
}