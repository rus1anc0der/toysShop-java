package task2;

import java.util.ArrayList;

public interface Shop {
    // Список игрушек в автомате
    ArrayList<Toys> listToys = new ArrayList<>();

    default void printList() {
        for (Toys toys : listToys) {
            System.out.println(toys);
        }
    }

}
