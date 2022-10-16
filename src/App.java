import java.util.Scanner; // импорт библиотеки для работы с вводом

public class App {
    // однострочный комментарий

    /*
        многострочный комментарий
     */
    public static void main(String[] args) {
        // вывод в консоль
        // System.out.println("Hello world!");

        /*  ввод с клавиатуры
            Scanner input = new Scanner(System.in);
            int age = input.nextInt();
        */

        /*  Задача 1
            >, <, ==, <=, >=
            1. Если меньше или равен 18 -> молодой
            2. Если меньше 65 и больше 18 -> взрослый
            3. Если больше или равен 65 -> пенсионер
         */

        System.out.println("Введите возраст: ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        if (age <= 18) {
            System.out.println("Молодой");
        } else if (age < 65) {
            System.out.println("Взрослый");
        } else {
            System.out.println("Пенсионер");
        }

        /*
        вводится два числа.
        в консоль выводится либо.
        1. первое число больше второго
        2. второе число больше первого
        3. числа равны
         */
        System.out.println("---------");
        System.out.println("Введите 1-ое число: ");
        int a = input.nextInt();
        System.out.println("Введите 2-ое число: ");
        int b = input.nextInt();

        if (a > b) {
            System.out.println("Первое число больше второго");
        } else if (b > a) {
            System.out.println("Второе число больше первого");
        } else {
            System.out.println("Числа равны");
        }
        // test
    }
}