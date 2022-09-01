package main.enums;

public enum Elements {
    Au("Gold", 2),
    O("Oxygenium", 5),
    Be("beryllium", 5),
    H("Helium",56),
    Ra("Radium",23),
    Zn("Radium", 45),
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
