package tasks6_2.tasks6_2.model;

public class Currency {
    private final String abbreviation;
    private final String name;
    private final double toUSD;

    public Currency(String abbreviation, String name, double toUSD) {
        this.abbreviation = abbreviation;
        this.name = name;
        this.toUSD = toUSD;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getName() {
        return name;
    }

    public double getToUSD() {
        return toUSD;
    }

    @Override
    public String toString() {
        return abbreviation + " - " + name;
    }
}
