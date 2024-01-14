package org.dpoint.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public void filterCollectExample() {
        List<Product> productsList = new ArrayList<Product>();

        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));
        List<Float> productPriceList = new ArrayList<Float>();
        // Filtering without streams
        System.out.println("### Filtering without streams");
        for (Product product : productsList) {
            if (product.price < 30000) {
                productPriceList.add(product.price);
            }
        }
        System.out.println(productPriceList);

        // Filter with streams
        System.out.println("### Filtering with streams");
        List<Float> productPriceList2 = productsList.stream()
                .filter(p -> p.price > 30000)// filtering data
                .map(p -> p.price)        // fetching price
                .collect(Collectors.toList()); // collecting as list
        System.out.println(productPriceList2);
    }

    public void iterationExample() {
        // first element 2, and uses lambda expression to generate next element in infinite series
        Stream.iterate(2, element -> element + 1)
                .filter(element -> element % 5 == 0)
                .limit(5)
                .forEach(System.out::println);
    }

    public void reduceExample() {

    }
}

class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
