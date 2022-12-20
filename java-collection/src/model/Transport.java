package model;

import java.util.StringJoiner;

public class Transport {
    private int id;
    private String Jenis;
    private String Brand;
    private int Wheels;

    public Transport(int id, String jenis, String brand, int wheels) {
        this.id = id;
        Jenis = jenis;
        Brand = brand;
        Wheels = wheels;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJenis() {
        return Jenis;
    }

    public void setJenis(String jenis) {
        Jenis = jenis;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public int getWheels() {
        return Wheels;
    }

    public void setWheels(int wheels) {
        Wheels = wheels;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Transport.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("Jenis='" + Jenis + "'")
                .add("Brand='" + Brand + "'")
                .add("Wheels=" + Wheels)
                .toString();
    }
}
