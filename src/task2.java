import java.util.Random;
import java.util.Scanner;

public class task2 {
    private static final int max = 9;
    private static final int time = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int code = random.nextInt(max + 1);
        int chislo;
        int orbits = 0;

        System.out.println("Ракета запущена в космос! Чтобы вернуть её на Землю, угадайте код от 0 до " + max + ".");

        while (true) {
            System.out.print("Введите ваш код: ");
            chislo = scanner.nextInt();

            if (chislo < 0 || chislo > max) {
                System.out.println("Код должен быть в диапазоне от 0 до " + max + ". Попробуйте снова.");
                continue;
            }

            if (chislo == code) {
                System.out.println("Поздравляем! Вы угадали код: " + code + ". Ракета возвращается на Землю.");
                break;
            } else {
                System.out.println("Неправильно. Попробуйте снова.");

                orbits++;

                if (orbits % time == 0) {
                    code = random.nextInt(max + 1);
                    System.out.println("Код обновлен! Новый код от 0 до " + max + ".");
                }
            }
        }
    }
}