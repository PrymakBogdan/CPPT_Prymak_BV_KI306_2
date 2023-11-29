package KI306.Prymak.Lab6;
import javax.lang.model.element.Name;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;





// Приклад класу-елементу, який можна помістити в кошик

public class Main {
    public static void main(String[] args){
        Basket<Product> productBasket=new Basket<>();
        Basket<Toy> toyBasket=new Basket<>();


        /*int f=1;
        while (f!=0)
        {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Добавити в корзину з продуктами - 1\n Добавити в корзину з іграшками - 2\n Вийти - 0");
            f=scanner1.nextInt();
            switch (f)
            {
                case (1):
                {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("\n Введіть назву:");
                    String name = scanner.nextLine();



                    System.out.println("\n Введіть ціну:");
                    double price = scanner.nextDouble();

                    productBasket.addItem(new Product(name,price));
                    break;
                }
                case (2):
                {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("\n Введіть назву:");
                    String name;
                    name = scanner.nextLine();

                    System.out.println("\n Введіть мінімальний вік:");
                    int age;
                    age = scanner.nextInt();

                    toyBasket.addItem(new Toy(name,age));
                    break;
                }
                default:
                    break;
            }


        }
        */


        productBasket.addItem(new Product("Хліб",12));
        productBasket.addItem(new Product("Молоко",32));
        productBasket.addItem(new Product("Сіль",15));

        productBasket.addItem(new Product());
        productBasket.addItem(new Product());
        productBasket.addItem(new Product());



        System.out.println("\nПар:");
        productBasket.GetP1();
        System.out.println("\nБез пар:");
        productBasket.GetP2();


        // Пошук та виведення максимального продукту
        /*Product maxProduct=productBasket.findMaxItem();
        if(maxProduct!=null){
            System.out.println("Максимальний продукт: "+maxProduct);
        }else{
            System.out.println("Кошик продуктів порожній.");
        }

        // Пошук та виведення максимального мінімального віку для іграшки
        Toy maxToy=toyBasket.findMaxItem();
        if(maxToy!=null){
            System.out.println("Максимальний вік для іграшок: "+maxToy);
        }else{
            System.out.println("Кошик іграшок порожній.");
        }*/
    }
}


