package KI306.Prymak.Lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Параметризований клас "Кошик"
public class Basket<T extends Comparable<T>> {
    private List<T> items;
    public static int p1=0;
    public static int p2=0;


    public void GetP1()
    {
        System.out.println(p1);

    }

    public int GetP2()
    {
        System.out.println(p2);
        return p2;
    }
    public Basket() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item);
    }

    public T findMaxItem() {
        if (items.isEmpty()) {
            return null;
        }

        return Collections.max(items);
    }

    public List<T> getItems() {
        return items;
    }
}




class Product implements Comparable<Product> {
    private String name;
    private double price;




    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        Basket.p1++;
    }

    public Product(){
        this.name = "Щось";
        this.price = 0;
        Basket.p2++;
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Product otherProduct) {
        return Double.compare(this.price, otherProduct.price);
    }

    @Override
    public String toString() {
        return name + " - " + price+" грн";
    }
}

// Приклад класу-елементу, який можна помістити в кошик
class Toy implements Comparable<Toy> {
    private String name;
    private int age;

    public Toy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Toy otherToy) {
        return Integer.compare(this.age, otherToy.age);
    }

    @Override
    public String toString() {
        return name + " - " + age + "+";
    }
}