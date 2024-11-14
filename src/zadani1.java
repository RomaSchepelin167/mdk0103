import java.util.Scanner;

public class zadani1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] voprosi = {
                "1. Какой океан самый большой?\n 1) Тихий\n 2) Атлантический",
                "2. Какой язык программирования является самым популярным?\n 1) Python\n 2) Java",
                "3. Какой континент самый населенный?\n 1) Азия\n 2) Европа",
                "4. Кто написал 'Гарри Поттера'?\n 1) Лев Толстой\n 2) Джоан Роулинг",
                "5. Какого цвета апельсин?\n 1) Желтый\n 2) Оранжевый",
                "6. Какой планетой считается Красная планета?\n 1) Венера\n 2) Марс",
                "7. Какой элемент имеет химический символ 'O'?\n 1) Золото\n 2) Кислород",
                "8. Какой газ составляет большую часть атмосферы Земли?\n 1) Углекислый газ\n 2) Азот",
                "9. Кто был первым человеком на Луне?\n 1) Юрий Гагарин\n 2) Нил Армстронг",
                "10. Какой фильм выиграл Оскар за лучший фильм в 2020 году?\n 1) Паразиты\n 2)1917"
        };

        int[] otveti = {1, 2, 1, 2, 2, 2, 2, 2, 2, 1}; // 1 - это правильный ответ, 2 - второй вариант
        int pravilnieotveti = 0;

        for (int i = 0; i < voprosi.length; i++) {
            System.out.println(voprosi[i]);
            System.out.print("Выберите номер варианта: ");
            int userotveti = scanner.nextInt();

            if (userotveti == otveti[i]) {
                pravilnieotveti++;
                System.out.println("Правильно!");
            } else {
                System.out.println("Неправильно. Правильный ответ: " + otveti[i]);
            }

            System.out.println();
        }

        System.out.println("Вы ответили правильно на " + pravilnieotveti + " из " + voprosi.length + " вопросов.");
    }
}