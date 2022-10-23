import java.util.Scanner;

/*
Компьютер должен загадать число от 0 до 9
Пользователю нужно угадать это число
В программе должен вестись подсчет количества попыток угадывания
*/
public class Main {
    public static void main(String[] args) {

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
}
