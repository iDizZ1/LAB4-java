import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();

        try {
            validateAge(age);
            System.out.println("Ваш возраст: " + age + " лет.");
        } catch (CustomAgeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void validateAge(int age) throws CustomAgeException {
        if (age < 0 || age > 120) {
            throw new CustomAgeException("Возраст должен быть в диапазоне от 0 до 120.");
        }
    }
}
class CustomAgeException extends Exception {
    public CustomAgeException() {
        super();
    }

    public CustomAgeException(String e) {
        super(e);
        info(e);
    }

    private void info(String log) {
        String message = LocalDate.now() + " " + LocalTime.now() + " - " + log + '\n';
        try (FileWriter w = new FileWriter("log.txt", true)) {
            w.write(message);
        } catch (IOException e) {
            System.out.println("Не удается записать логи: " + e.getMessage());
        }
    }
}



