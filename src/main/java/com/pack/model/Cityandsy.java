package com.pack.model;

public class Cityandsy {
    private String city;
    private String sys;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSys() {
        return sys;
    }

    public void setSys(String sys) {
        this.sys = sys;
    }

    @Override
    public String toString() {
        return "Cityandsy{" +
                "city='" + city + '\'' +
                ", sys='" + sys + '\'' +
                '}';
    }
}
