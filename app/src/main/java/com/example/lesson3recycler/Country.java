package com.example.lesson3recycler;

public class Country {

    private int image;
    private String name_country;
    private String name_capital;

    public Country(String name_country, String name_capital , int image) {

        this.name_country = name_country;
        this.name_capital = name_capital;
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName_country() {
        return name_country;
    }

    public void setName_country(String name_country) {
        this.name_country = name_country;
    }

    public String getName_capital() {
        return name_capital;
    }

    public void setName_capital(String name_capital) {
        this.name_capital = name_capital;
    }
}
