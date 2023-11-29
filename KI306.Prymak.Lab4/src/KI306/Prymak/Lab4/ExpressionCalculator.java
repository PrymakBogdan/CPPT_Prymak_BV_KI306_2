package KI306.Prymak.Lab4;

import javax.transaction.xa.XAException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExpressionCalculator {
    public static double calculateExpression(double x) throws ArithmeticException, X {
        double result;


        if (Math.sin(3 * x - 1) == 0) {
            throw new ArithmeticException("Ділення на нуль неможливе.");
        }





        result = (x - 4) / Math.sin(3 * x - 1);

        return result;
    }

    public static double Exception1 (double x)  throws X{

        if (x==3){
            throw  new X("x = 3, хз");
        }
        return (x - 4) / Math.sin(3 * x - 1);
    }


    public static class X extends Exception{
        public X(String m){
            super(m);
        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть х:");
        double x = scanner.nextDouble();
        try (FileWriter writer = new FileWriter("result.txt")) {

            double result = calculateExpression(x);
            double result1 = Exception1(x);
            System.out.println("Результат обчислення виразу для x = " + x + ": " + result);
            writer.write("Результат обчислення виразу для x = " + x + ": " + result1);
        } catch (IOException | X| ArithmeticException e) {
            System.err.println("Помилка: " + e.getMessage());
        }
    }








}


