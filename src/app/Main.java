package app;package lesson5;

import java.awt.*;
import java.util.Scanner;

public class ML5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int myNumber = scanner.nextInt();
//мы хоть с  вами гоорилии о том что бы не использовать варки..... просто пробую.
        var firstPercentage = 2.5;
        var secondPercentage = 4.3;
        var thirdPercentage = 6.7;

        if (myNumber <= 10000) {
            var howMuch = myNumber / 100 / firstPercentage;
            System.out.printf("I need pay %.2f %s ", howMuch, "UAH"); // я не знаю почему я сидел тут целый день, но
        } else if (myNumber <= 10000.01 || myNumber <= 25000) {       // кажется я закончил. Ощущение что моя Java глючила
            var howMuch = myNumber / 100 / secondPercentage;          // + мышка сломалась . Хорошего вечера4ч
            System.out.printf("I need pay %.2f %s ", howMuch, "UAH");
        } else if (myNumber >= 25000.01) {
            var howMuch = myNumber / 100 / thirdPercentage;
            System.out.printf("I need pay %.2f %s ", howMuch, "UAH");
        }


    }

}


