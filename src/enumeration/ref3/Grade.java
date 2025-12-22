package enumeration.ref3;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);

    private final int doscountPercent;

    Grade(int doscountPercent) {
        this.doscountPercent = doscountPercent;
    }

    public int getDoscountPercent() {
        return doscountPercent;
    }

    //추가
    public int discount(int price) {
        return price * doscountPercent / 100;
    }
}
