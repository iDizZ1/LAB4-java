import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        String inputFilePath = "in.txt";
        String outputFilePath = "out.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath));
             FileWriter fw = new FileWriter(outputFilePath)) {

            String line;

            while ((line = br.readLine()) != null) {
                fw.write(line + '\n');
            }

            System.out.println("Копирование завершено успешно.");

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e.getMessage());
        } catch (SecurityException e) {
            System.out.println("Нет необходимых разрешений: " + e.getMessage());
        }

    }
}