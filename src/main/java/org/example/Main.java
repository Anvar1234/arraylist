package org.example;

import org.example.gb.GBList;
import org.example.gb.list.GBArrayList;

public class Main {
    public static void main(String[] args) {


        GBList<Integer> integerGBList = new GBArrayList<>();
        integerGBList.add(8);
        integerGBList.add(35);
        integerGBList.add(1);
        integerGBList.add(10);
//        integerGBList.add(100);
//        integerGBList.add(12);

        System.out.println("Начальная коллекция:");
        for (Integer el : integerGBList) {

            System.out.print(el + " ");
        }
        System.out.println("\nДлина коллекции: " + integerGBList.size());

        integerGBList.remove(3);
        System.out.println("\nПосле удаления:");
        for (Integer el : integerGBList) {
            System.out.print(el + " ");
        }
        System.out.println("\nДлина коллекции: " + integerGBList.size());

        integerGBList.add(13);
        System.out.println("\nПосле добавления1:");
        for (Integer el : integerGBList) {
            System.out.print(el + " ");
        }
        System.out.println("\nДлина коллекции: " + integerGBList.size());

        integerGBList.add(1155);
        System.out.println("\nПосле добавления2:");
        for (Integer el : integerGBList) {
            System.out.print(el + " ");
        }
        System.out.println("\nДлина коллекции: " + integerGBList.size());
    }
}