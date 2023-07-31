package Seminar4.homework;

public class Homework {

    /**
     * Задача:
     *
     * a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     * b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
     * поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     * c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     * d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
     * вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     * e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
     * подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
     * Можно сравнивать коробки с яблоками и апельсинами;
     * f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     * Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     * Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
     * g. Не забываем про метод добавления фрукта в коробку.
     **/


    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruct(new Apple());
        appleBox1.addFruct(new Apple());
        appleBox1.addFruct(new Apple());

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruct(new Apple());
        appleBox2.addFruct(new Apple());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruct(new Orange(0));
        orangeBox.addFruct(new Orange(0));
        orangeBox.addFruct(new Orange(0));

        System.out.println("Apple Box 1 weight: " + appleBox1.getWeight());
        System.out.println("Apple Box 2 weight: " + appleBox2.getWeight());
        System.out.println("Orange Box weight: " + orangeBox.getWeight());

        System.out.println("Is Apple Box 1 and Apple Box 2 weight equal? " + appleBox1.compare(appleBox2));
        System.out.println("Is Apple Box 1 and Orange Box weight equal? " + appleBox1.compare(orangeBox));

        appleBox1.transfer(appleBox2);

        System.out.println("Apple Box 1 weight after transfer: " + appleBox1.getWeight());
        System.out.println("Apple Box 2 weight after transfer: " + appleBox2.getWeight());
    }
}


