package homework_week5.Programme_1_calculate;

public class Calculator {

    // 1. addition method
    public void addition(int a, int b)
    {
        System.out.println(a + b);
    }

    // 2. subtraction method
    public void subtraction(int a, int b)
    {
        System.out.println( a - b);
    }

    // 3. division method
    public void division(int a, int b)
    {
        System.out.println(a / b);
    }

    // 4. multiplication method
    public void multiplication(int a, int b)
    {
        System.out.println(a * b);
    }

    // 5. calculateResult method
    public void calculateResult(int a, int b, char symbol)
    {
        if (symbol == '+') {
            System.out.println(a + "+" + b + "=" + (a + b));
        } else if (symbol == '-') {
            System.out.println(a + "-" + b + "=" + (a - b));
        } else if (symbol == '/') {
            System.out.println(a + "/" + b + "=" + (a / b));
        } else if (symbol == '*') {
            System.out.println(a + "*" + b + "=" + (a * b));
        } else {
            System.out.println("Please enter correct symbol");
        }
    }
}
