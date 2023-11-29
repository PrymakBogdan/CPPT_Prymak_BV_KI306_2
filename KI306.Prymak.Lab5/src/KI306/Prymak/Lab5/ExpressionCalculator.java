package KI306.Prymak.Lab5;

import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class ExpressionCalculator {
    public static double calculateExpression(double x) throws ArithmeticException {
        double result;


        if (Math.sin(3 * x - 1) == 0) {
            throw new ArithmeticException("Ділення на нуль неможливе.");
        }

        result = (x - 4) / Math.sin(3 * x - 1);

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Введіть х:");
        //double x = scanner.nextDouble();
        double x=0;

        try{
            RandomAccessFile f = new RandomAccessFile ("num.txt","r");
            //f.seek(0);
            x = f.readDouble();

            System.out.println(x);
            f.close();
        }
        catch (Exception e) {
            System.err.println("Помилкаfff: " + e.getMessage());
        }


        try {



            //x = ResultSerializer.deserializeFromTextFile("num.txt");




            // Запис у текстовий файл
            ResultSerializer.serializeToTextFile("result.txt", calculateExpression(x));
            System.out.println("Результат записано у текстовий.");

            // Зчитування з текстового файлу
            double deserializedResult = ResultSerializer.deserializeFromTextFile("result.txt");
            System.out.println("Зчитано з текстового файлу: " + deserializedResult);

            // Запис у двійковий файл
            ResultSerializer.serializeToBinaryFile("result.dat", calculateExpression(x));
            System.out.println("Результат записано у двійковий.");

            // Зчитування з двійкового файлу
            double deserializedBinaryResult = ResultSerializer.deserializeFromBinaryFile("result.dat");
            System.out.println("Зчитано з двійкового:" + deserializedBinaryResult);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Помилка: " + e.getMessage());
        }










        /*try (FileWriter writer = new FileWriter("result.txt")) {

            double result = calculateExpression(x);
            System.out.println("Результат обчислення виразу для x = " + x + ": " + result);
            writer.write("Результат обчислення виразу для x = " + x + ": " + result);
        } catch (ArithmeticException e) {
            System.err.println("Помилка: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Помилка запису в файл: " + e.getMessage());
        }*/
    }
}
