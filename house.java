package ru.maximov.houses;

public class house {
    private final int fl;

    public house(int fl){
        if(fl<=0){
            throw new IllegalArgumentException("Неверный ввод: количество этажей не может быть отрицательным.");
        }
        this.fl=fl;
    }

    public String tosrt(){
        if (fl%10==1)
            return "Дом с "+fl+" этажем";
        else
            return "Дом с "+fl+" этажами";
    }
}
