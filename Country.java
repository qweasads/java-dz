package org.example;

public enum Country {
    RU("Россия"), CN("Китай"), US("США");

    private String countryName;

    Country(String countryName){
        this.countryName = countryName;
    }

    public String getCountryName(){
        return countryName;
    }
}
