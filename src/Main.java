import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int leftSide;
        int rightSide;
        int compNumber;
        int userNumber;
        int countTries = 0;
        int attempts = 19;

        System.out.println("Игра - угадай число, надо угадать загаданное компом число. У тебя 20 попыток.");

        System.out.println("Введи нижние и верхние границы: ");
        leftSide = scanner.nextInt();
        rightSide = scanner.nextInt();

        compNumber = random.nextInt(rightSide - leftSide + 1) + leftSide;

        do {
            System.out.print("Выедите число от " +leftSide+ " до " +rightSide+": ");
            userNumber = scanner.nextInt();

            if (userNumber==0) {
                System.out.println("Ты активировал бота, но он еще не написан.");
            }

            countTries++;

            if (userNumber == 666) {
                System.out.println("А Люцифер в переводе с латыни – это тот, кто приносит свет.\n" +
                        "Этот свет выжигает всю мерзость на тысячи лет.");
            } else if (userNumber == 1024){
                System.out.println("в дверь постучали 1024 раза\n" +
                        "\"гигабайт\" - подумал Штирлиц\n" +
                        "\"долбаеб..\" - сказали 128 осьминогов");
            }

            if (userNumber > compNumber) {
                System.out.println("Введите поменьше ");
                rightSide = userNumber;
            } else if (userNumber < compNumber) {
                System.out.println("введите побольше ");
                leftSide = userNumber;
            }

            if (countTries>attempts) {
                 userNumber = compNumber;
                 System.out.print("Попытки кончились.");
            }

        } while (userNumber != compNumber);

        if (countTries<=attempts) {
            System.out.print("Возьми пиво и отпразнуй! У тебя на это ушло целых: " + countTries + " попыток.");
        }

        if (countTries <= 3) {
            System.out.println(" Я могу быстрее.");
        } else if (countTries >= 4 && countTries <= 6)
        {
            System.out.println(" Ты не сын маминой подруги.");
        } else if (countTries>=7 && countTries<=10) {
            System.out.println(" Кожаный слабак.");
        } else {
            System.out.println(" Ну пиздец...");
        }

    }
}