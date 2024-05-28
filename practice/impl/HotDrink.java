package less1.practice.impl;

import less1.practice.Product;

import java.time.LocalDate;

public class HotDrink extends BottleOfWater {
    private int temperature;

    public HotDrink(String name, double price, LocalDate releaseDate, boolean spark, String pack, float volume, int temperature) {
        super(name, price, releaseDate, spark, pack, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public String toString() {
        return "HotDrink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                "volume=" + getVolume() +
                ", pack='" + getPack() + '\'' +
                ", isSpark=" + isSpark() +
                ", temperature=" + temperature +
                '}';
    }
}
