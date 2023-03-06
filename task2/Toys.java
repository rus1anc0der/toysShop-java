package task2;

import java.util.Scanner;

public class Toys implements Shop {
    // id игрушки
    private String id;
    // текстовое название
    private String name;
    // количество
    private int quantity;
    // частота выпадения игрушки (вес в % от 100)
    private int percent;

    public int getPercent() {
        return percent;
    }

    public Toys(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите данные");
        System.out.println("id игрушки: \n");
        String id = in.next();
        System.out.println("текстовое название: \n");
        String name = in.next();
        System.out.println("количество: \n");
        int quantity = in.nextInt();
        System.out.println("частота выпадения игрушки (вес в % от 100)");
        int percent = in.nextInt();
        for (int i = 0; i < quantity; i++) {
            listToys.add(new Toys(id, name, percent));
        }
    }
    
    public Toys(String id, String name, int percent) {
        this.id = id;
        this.name = name;
        this.percent = percent;
        for (int i = 0; i < quantity; i++) {
            listToys.add(new Toys(id, name, percent));
        }
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }
    @Override
    public String toString() {
        return "Toys [id игрушки=" + id + ", текстовое название=" + name + ", частота выпадения игрушки (вес в % от 100)=" + percent + "]";
    }

}
