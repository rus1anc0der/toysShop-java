package task2;

import java.util.Random;
import java.util.Scanner;

public class Toys implements Shop {
    // id игрушки
    private int id;
    // текстовое название
    private String name;
    // количество
    private int quantity;
    // частота выпадения игрушки (вес в % от 100)
    private int percent;

    // Конструктор
    public Toys() {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Введите данные");
        int id = rnd.nextInt(1000000);
        System.out.println("текстовое название: \n");
        String name = in.next();
        System.out.println("количество: \n");
        int quantity = in.nextInt();
        System.out.println("частота выпадения игрушки (вес в % от 100)");
        int percent = in.nextInt();
        for (int i = 0; i < quantity; i++) {
            id = rnd.nextInt(1000000);
            listToys.add(new Toys(id, name, percent));
        }
    }

    // получить частоту выпадения
    public void setPercent(int percent) {
        this.percent = percent;
    }

    // получение частоты выпадения
    public int getPercent() {
        return percent;
    }

    // получение id игрушки
    public int getId() {
        return id;
    }

    // конструктор
    public Toys(int id, String name, int percent) {
        this.id = id;
        this.name = name;
        this.percent = percent;
        for (int i = 0; i < quantity; i++) {
            listToys.add(new Toys(id, name, percent));
        }
    }

    @Override
    public String toString() {
        return "Toys [id игрушки = " + id + ", текстовое название = " + name
                + ", частота выпадения игрушки (вес в % от 100) = " + percent + "]\n";
    }

}
