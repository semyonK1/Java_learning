import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static String[] gameField;
    static Scanner input;
    static String turn;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        gameField = new String[9];
        turn = "X";
        String winner = null;
        emptyField();

        System.out.println("Добро пожаловать в крестики-нолики!");
        System.out.println("-------------------");
        printField();
        System.out.println("Игрок X ходит первый.");
        System.out.println("Введите номер клетки игрового поля");

        while (winner == null) {
            int numInput;

            try {
                numInput = input.nextInt();
                if (!(numInput > 0 && numInput <= 9)) {
                    System.out.println("Ошибка ввода! Введите корректный номер клетки");
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода! Введите заново номер клетки");
                continue;
            }
            if (gameField[numInput - 1].equals(String.valueOf(numInput))) {
                gameField[numInput - 1] = turn;
                if (turn.equals("X")) {
                    turn = "0";
                } else {
                    turn = "X";
                }
                printField();
                winner = checkWinner();
            } else {
                System.out.println("Эта клетка занята!");
                continue;
            }
        }
        if (winner.equalsIgnoreCase("draw")) {
            System.out.println("Ничья!");
        } else {
            System.out.println("Игрок " + winner + " победил!");
        }
    }

    static String checkWinner() {
        for (int i = 0; i < 8; i++) {
            String line = null;
            switch (i) {
                case 0:
                    line = gameField[0] + gameField[1] + gameField[2];
                    break;
                case 1:
                    line = gameField[3] + gameField[4] + gameField[5];
                    break;
                case 2:
                    line = gameField[6] + gameField[7] + gameField[8];
                    break;
                case 3:
                    line = gameField[0] + gameField[3] + gameField[6];
                    break;
                case 4:
                    line = gameField[1] + gameField[4] + gameField[7];
                    break;
                case 5:
                    line = gameField[2] + gameField[5] + gameField[8];
                    break;
                case 6:
                    line = gameField[6] + gameField[4] + gameField[2];
                    break;
                case 7:
                    line = gameField[0] + gameField[4] + gameField[8];
                    break;
            }
            if (line.equals("XXX")) {
                return "X";
            } else if (line.equals("000")){
                return "0";
            }
        }

        for (int i = 0; i < 9; i++) {
            if (Arrays.asList(gameField).contains(String.valueOf(i + 1))) {
                break;
            } else if (i == 8) {
                return "draw";
            }
        }
        System.out.println("Ход игрока " + turn + "! Введите номер клетки игрового поля");
        return null;
    }

    static void emptyField() {
        for (int i = 0; i < 9; i++) {
            gameField[i] = String.valueOf(i + 1);
        }
    }

    static void printField() {
        System.out.println("|---|---|---|");
        System.out.println("| " + gameField[0] + " | " + gameField[1] + " | " + gameField[2] + " | ");
        System.out.println("|---|---|---|");
        System.out.println("| " + gameField[3] + " | " + gameField[4] + " | " + gameField[5] + " | ");
        System.out.println("|---|---|---|");
        System.out.println("| " + gameField[6] + " | " + gameField[7] + " | " + gameField[8] + " | ");
        System.out.println("|---|---|---|");
    }
}