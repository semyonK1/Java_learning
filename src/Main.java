import java.util.Scanner;

/*
Компьютер должен загадать число от 0 до 9
Пользователю нужно угадать это число
В программе должен вестись подсчет количества попыток угадывания
*/
public class Main {

    public static void solutionSingleNum() {
        int userNum;
        int count = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("ЗАДАЧА: угадай число (от 0 до 9)");

        int num = (int)Math.floor(Math.random() * 10);

        do {
            count++;
            System.out.println("Введите ваше число: ");
            userNum = input.nextInt();

            if (userNum > num) {
                System.out.println("Мое число меньше");
            } else if (userNum < num) {
                System.out.println("Мое число больше");
            } else {
                System.out.println("Вы угадали число");
                System.out.println("Мое число, действительно" +
                        " равно " + userNum);
            }
        } while(userNum != num);

        System.out.println("Число затраченных попыток " + count);
    }

    public static void solutionDoubleNums() {

        int userNum1 = -1;
        int userNum2 = -1;
        int count = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("ЗАДАЧА: Угадать два числа (от 1 до 15 и от" +
                " 0 до 5");

        int num1 = (int)Math.floor(Math.random() * 15 + 1);
        int num2 = (int)Math.floor(Math.random() * 6);

        do {
            count++;
            if (userNum1 != num1) {
                System.out.println("Введите ваше первое число: ");
                userNum1 = input.nextInt();
                if (userNum1 > num1) {
                    System.out.println("Число 1 меньше ");
                } else if (userNum1 < num1) {
                    System.out.println("Число 1 больше ");
                } else {
                    System.out.println("Первое число компьютера" +
                            " действительно равно: " + userNum1);
                }
            }
            if (userNum2 != num2) {
                System.out.println("Введите ваше второе число: ");
                userNum2 = input.nextInt();

                if (userNum2 > num2) {
                    System.out.println("Число 2 меньше ");
                } else if (userNum2 < num2) {
                    System.out.println("Число 2 больше ");
                } else {
                    System.out.println("Второе число компьютера" +
                            " действительно равно: " + userNum2);
                }
            }
        } while (userNum2 != num2 || userNum1 != num1);
        System.out.println("Число затраченных попыток " + count);
    }

    public static void main(String[] args) {
        System.out.println("Выберите вариант решения \n" +
                " ('1' - угадывание одного числа) \n" +
                " ('2' - угадывание двух чисел)");
        Scanner input = new Scanner(System.in);
        int solN = input.nextInt();
        if (solN == 1) {
            solutionSingleNum(); // ф-ция с угадыванием одного
        } else if (solN == 2) {
            solutionDoubleNums(); // ф-ция с угадыванием двух
        } else {
            System.out.println("Такого я не знаю!");
        }
    }
}
