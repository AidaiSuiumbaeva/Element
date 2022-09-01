package main.enums;

public enum Elements {
    Au("Gold", 2),
    Li("Lithium", 5),
    Cu("Cuprum", 3);

    private String name;
    private int num;

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    Elements(String name, int num) {
        this.name = name;
        this.num = num;
    }
}
