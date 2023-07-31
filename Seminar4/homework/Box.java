package Seminar4.homework;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruct> {

    private List<T> fructs;
    public Object addFruct;

    public Box(){
        this.fructs = new ArrayList<>();
    }

    //Добавление фрукта в коробку
    public void addFruct(T fruct){
        fructs.add(fruct);
    }

   //Вычисление общего веса коробки 
    public float getWeight(){
        float totalWeight = 0.0f;
        for (T fruct : fructs){
            totalWeight += fruct.getWeight();
        }
        return totalWeight;
    }

    //Сравнение веса двух коробок
    public boolean compare(Box<?> otherBox){
        return Math.abs(this.getWeight() - otherBox.getWeight()) < 0.0001;
    }

    //Перекладывание фруктов из одной коробки в другую
    public void transfer(Box<T> otherBox){
        for(T fruct : fructs){
            otherBox.addFruct(fruct);
        }
        fructs.clear();
    }

    public void addFruct(float f) {
    }

}
