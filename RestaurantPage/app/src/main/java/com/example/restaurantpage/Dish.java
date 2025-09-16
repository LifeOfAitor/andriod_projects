package com.example.restaurantpage;

import androidx.annotation.NonNull;

public class Dish {
    String name;
    String description;
    int prize;

    Dish(String name, String description, int prize) {
        this.name = name;
        this.description = description;
        this.prize = prize;
    }

    @NonNull
    @Override
    public String toString() {
        return name;
    }
}
