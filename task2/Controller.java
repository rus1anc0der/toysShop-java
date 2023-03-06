package task2;

import java.util.Scanner;

public class Controller implements Shop{  

    public void start(){
        Lottery shop = new Lottery();
        boolean stop = true;
        Scanner in = new Scanner(System.in);
        while (stop == true) {
            System.out.println("Контроллер\n" 
                + "1 - Добавить игрушку\n"
                + "2 - Разыграть игрушку\n"
                + "3 - Посмотреть список выйграшных игрушек\n"
                + "4 - Забрать игрушки"
                + "\n5 - завершить\n");
            System.out.print("Введите какую команду выполнить - ");
            String key = in.next();
            switch (key) {
                case "1":
                    new Toys();
                    break;
                case "2":
                    shop.getWinToys();
                    break;
                case "3":
                    shop.getListWinToys();
                    break;
                case "4":
                    shop.writeTxt();
                    break;
                case "5":
                    stop = false;
                    break;
                default:
                    break;
            }
        }
    }
}
