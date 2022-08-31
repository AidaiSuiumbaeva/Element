package main;

import main.enums.Elements;

public class Main {
    public static void main(String[] args) {

        for (Elements item: Elements.values()){
            System.out.println(item.getName());
            System.out.println(item.getNum());
        }

    }
}
