package calculation;

import java.util.Objects;

public class Calculation {
    private final int x;
    private final int y;


    public Calculation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calculation that = (Calculation) o;
        return x == that.x && y == that.y || x == that.y && y == that.x;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(x) + Objects.hashCode(y);
    }

    @Override
    public String toString() {
        return String.format("\n %s * %s = ? ", getX(), getY());
    }
}

