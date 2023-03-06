package task2;

import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;

public class Lottery implements Shop {
    // Список призовых игрушек
    ArrayList<Toys> listWinToys = new ArrayList<>();

    public void getWinToys() {
        Random rnd = new Random();
        int count = 0;
        while (count == 0) {
            for (int i = 0; i < listToys.size(); i++) {
                if (listToys.get(i).getPercent() == rnd.nextInt(0, 100)) {
                    listWinToys.add(listToys.get(i));
                    System.out.println(listToys.remove(i));
                    count++;
                }

            }
        }

    }

    public void getListWinToys(){
        System.out.println(listWinToys);
    }

    public void writeTxt() {
        try (PrintStream printStream = new PrintStream("text.txt")) {
            for (Toys toys : listWinToys) {
                printStream.println(toys);
            }
            System.out.println("Запись в файл произведена");
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

}