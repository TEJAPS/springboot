package org.dpoint.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

@FunctionalInterface //optional
interface Addable {
    int add(int a, int b);
}

@FunctionalInterface
interface Sayable {
    String say(String expression);
}

public class LambdaExpressionExample {
    public void examples() {
        // lambda expression with return keyword
        Addable a1 = (int a, int b) -> {
            return (a + b);
        };
        System.out.println("### Lambda result with return: " + a1.add(10, 20));

        // lambda expression without return keyword
        Addable a2 = (a, b) -> (a + b);
        System.out.println("### Lambda result without return " + a2.add(10, 20));

        // for each using lambda
        System.out.println("For each using lambda : ");
        List<String> list = new ArrayList<>();
        list.add("name1");
        list.add("name2");
        list.add("name3");
        list.add("name4");
        // here foreach is a functional interface
        // s1: Consumer<T> interface - represents operation on single argument
        // s2: inside definition is lambda expression
        // s3: foreach will iterate and applies lambda expression for each element
        list.forEach((n) -> System.out.print(n + ""));

        // multiple statements in lambda expression
        Sayable s1 = (message) -> {
            String str1 = "welcome ";
            String str2 = str1 + message;
            return str2;
        };
        System.out.println("\n### Lamda example using multiple statement: "
                + s1.say("dpoint"));
    }

    public void lambdaThreadExample() {
        // RUnnable is functional interface
        // Below is thread implementation without Lambda
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running - without lambda expression");
            }
        };
        Thread t1 = new Thread(r1);
        t1.run();

        //Below is thread implementaiton with Lambda
        // no arguments means it is mapped with run correctly
        Runnable r2 = () -> {
            System.out.println("Thread is running- with lambda expression");
        };
        Thread t2 = new Thread(r2);
        t2.run();
    }

    public void lambdaComparatorExample() {
        List<Product> list = new ArrayList<Product>();
        //Adding Products
        list.add(new Product(1, "HP Laptop", 25000f));
        list.add(new Product(3, "Keyboard", 300f));
        list.add(new Product(2, "Dell Mouse", 150f));

        // Without Lambda - below is the code
        // logic1: sort
        System.out.println("### Sorting and printing logic without using lambda");
        Collections.sort(list, new Comparator<Product>() {
                    @Override
                    public int compare(Product p1, Product p2) {
                        return p1.name.compareTo(p2.name);
                    }
                }
        );
        //logic2: print
        for (Product p : list) {
            System.out.println(p.id + " " + p.name + " " + p.price);
        }

        // With Lambda - below is the code
        // logic1: sort
        System.out.println("### Sorting and printing logic using lambda");
        Collections.sort(list, (p1, p2) -> p1.name.compareTo(p2.name));
        // logic2: print
        list.forEach((p) -> System.out.println(p.id + " " + p.name + " " + p.price));
    }

    public void lambdaFilterCollectionData() {
        List<Product> list = new ArrayList<Product>();
        list.add(new Product(1, "Samsung A5", 17000f));
        list.add(new Product(3, "Iphone 6S", 65000f));
        list.add(new Product(2, "Sony Xperia", 25000f));
        list.add(new Product(4, "Nokia Lumia", 15000f));
        list.add(new Product(5, "Redmi4 ", 26000f));
        list.add(new Product(6, "Lenevo Vibe", 19000f));

        // using lambda to filter data
        // here filter expects PREDICATE which is a functional interface
        // meaning we can write lambda implementation for it
        System.out.println("### Filter Data using Lambda implementation");
        Stream<Product> productStream = list.stream().filter(p -> p.price > 20000);
        productStream.forEach(product -> System.out.println(product.name + ": " + product.price));
    }
}
