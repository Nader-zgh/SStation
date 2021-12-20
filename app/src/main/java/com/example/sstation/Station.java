package com.example.sstation;

public class Station {
    private String Name;
    private String Temp;
    private String Hum;
    private String desc;

    public Station(String name, String temp, String hum, String desc) {
        Name = name;
        Temp = temp;
        Hum = hum;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Station{" +
                "Name='" + Name + '\'' +
                ", Temp='" + Temp + '\'' +
                ", Hum='" + Hum + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTemp() {
        return Temp;
    }

    public void setTemp(String temp) {
        Temp = temp;
    }

    public String getHum() {
        return Hum;
    }

    public void setHum(String hum) {
        Hum = hum;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
