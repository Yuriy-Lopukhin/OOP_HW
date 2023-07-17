package Seminar1;

class Product{
    private String name; 
    private double price;
    private int count;

    public Product(String name, double price, int count){
        this.name = name;
        this.price = price;
        this.count = count;
    }
    
    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getCount(){
        return count;
    }

    public void setCount(int count){
        this.count = count;  
    }
}

class HotDrink extends Product{
    
    private int temperature;
    
    public HotDrink(String name, double price, int count, int temperature) {
        super(name, price, count);
        this.temperature = temperature;
    }


    public String toString(){
        return "HotDrink{" + "name = " + super.getName() + ",price = " + super.getPrice() + ",count = " + super.getCount() + ",temperature =" + temperature + "}"; 
    }
    
}

public class seminar1{
    public static void main(String[] args) {
        HotDrink coffee = new HotDrink("Кофе", 5.50, 10, 80);
        HotDrink tea = new HotDrink("Чай", 4.50, 15, 70);
        HotDrink hotChocolate = new HotDrink("Горячий шоколад", 4.00, 8, 85);

        System.out.println(coffee.toString());
        System.out.println(tea.toString());
        System.out.println(hotChocolate.toString());

    }
}