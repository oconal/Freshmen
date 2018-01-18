package test;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int chooseRole = 0;
        int chooseGroup = 0;
        int chooseOption = 0;
        Group[] groups = {new Group("ОТГК 21"), new Group("ОТМ 13"), new Group("НЛО 47"),
                new Group("ГРП 14"), new Group("АКМ 8")};
        System.out.println("Пожалуйста, уточните, кто вы:");
        System.out.println("1. Студент");
        System.out.println("2. Профессор");
        chooseRole = select(2);
        System.out.println("- - - - - - - - - - -");
        System.out.println("Выберите группу");
        printGrp(groups);
        chooseGroup = select(groups.length);
        System.out.println("- - - - - - - - - - -");
        System.out.println("Вы можете:");
        switch (chooseRole) {
            case 1:
                System.out.println("1. Вывести информацию о старосте группы \"" + groups[chooseGroup - 1].getName() + "\".");
                chooseOption = select(1);
                if (chooseOption == 1)
                    System.out.println("Староста группы \"" + groups[chooseGroup - 1].getName() + "\" - " + groups[chooseGroup - 1].getStarosta().getName());
                break;
            case 2:
                System.out.println("1. Вывести информацию о старосте группы \"" + groups[chooseGroup - 1].getName() + "\".");
                System.out.println("2. Проверить, все ли студенты из группы \"" + groups[chooseGroup - 1].getName() + "\" присутствуют в аудитории.");
                chooseOption = select(2);
                if (chooseOption == 1)
                    System.out.println("Староста группы \"" + groups[chooseGroup - 1].getName() + "\" - " + groups[chooseGroup - 1].getStarosta().getName());
                if (chooseOption == 2) Professor.checkGroup(groups[chooseGroup - 1]);
                break;
        }
    }

    private static void printGrp(Group[] groups) {
        for (int i = 0; i < groups.length; i++) {
            System.out.println(i + 1 + ". " + groups[i].getName() + ";");
        }
    }

    private static int select(int k) {
        int n = 0;
        do {
            System.out.print("Введите число: ");
            Scanner sc = new Scanner(System.in);
            try {
                n = sc.nextInt();
                if (n > k || n < 1) System.out.println("Некорретный ввод. Повторрите попытку.");
            } catch (Exception InputMismatchException) {
                System.out.println("Некорретный ввод. Повторрите попытку.");
            }
        }
        while (n > k || n < 1);
        return n;
    }
}
