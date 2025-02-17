package com.example;

import java.util.List;
import java.util.Map;

public class LionAlex extends Lion {

    private Feline feline;


    public LionAlex(String sex, Feline feline) throws Exception {
        super(sex, feline);
    }

    public Map<String, String> getFriends(){
        return  Map.of("Зебра", "Марти",
                "Бегемотиха", "Глория",
                "Жираф", "Мелман");
    }

    public String getPlaceOfLiving(){
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() {
        return 0;
    }

}
