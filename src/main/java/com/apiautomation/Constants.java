package com.apiautomation;

public enum Constants {
    BASE_URL_PRODUCTS("https://dummyjson.com/products/");

    private String value;

    Constants(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
};