package edu.realemj.Exercises_11;

public enum WagonPace {
    SLOW(7),
    NORMAL(15),
    FAST(18);

    private double miles;

    private WagonPace(double miles) {
        this.miles = miles;
    }

    public double getMiles() {
        return miles;
    }
}
