package com.example.waspro;

public class person {

    private String name;
    private String desc;
    private String preference;

    public person(String name,String desc, String preference) {
        this.name = name;
        this.desc = desc;
        this.preference = preference;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPreference() {
        return preference;
    }

    public void setPreference(String preference) {
        this.preference = preference;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String surname) {
        this.desc = surname;
    }
}
