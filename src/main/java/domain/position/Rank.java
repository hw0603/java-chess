package domain.position;

public enum Rank {
    ONE(7),
    TWO(6),
    THREE(5),
    FOUR(4),
    FIVE(3),
    SIX(2),
    SEVEN(1),
    EIGHT(0);

    private final int index;

    Rank(final int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
