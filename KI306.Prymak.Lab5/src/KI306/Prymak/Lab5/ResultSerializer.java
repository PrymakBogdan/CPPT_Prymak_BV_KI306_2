package KI306.Prymak.Lab5;

import java.io.*;
public class ResultSerializer {
    public static void serializeToTextFile(String fileName, double result) throws IOException {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(String.valueOf(result));
        }
    }

    public static double deserializeFromTextFile(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName)) ) {
            String line = reader.readLine();
            return Double.parseDouble(line);
        }
    }

    public static void serializeToBinaryFile(String fileName, double result) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(fileName);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeDouble(result);
        }
    }

    public static double deserializeFromBinaryFile(String fileName) throws IOException, ClassNotFoundException {
        try (FileInputStream fis = new FileInputStream(fileName);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            return ois.readDouble();
        }
    }
}
