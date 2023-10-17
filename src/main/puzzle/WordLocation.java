package main.puzzle;

import main.puzzle.Pair;

import java.util.Objects;

public class WordLocation {

    private final Pair startCoord;

    private final Pair endCoord;

    public WordLocation(final Pair startCoord, final Pair endCoord) {
        this.startCoord = startCoord;
        this.endCoord = endCoord;
    }

    public Pair getStartCoord() {
        return startCoord;
    }

    public Pair getEndCoord() {
        return endCoord;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        WordLocation that = (WordLocation) o;

        return Objects.equals(startCoord, that.startCoord) &&
                Objects.equals(endCoord, that.endCoord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startCoord, endCoord);
    }

}