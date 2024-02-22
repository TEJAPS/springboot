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
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));
        Float totalPrice = productsList.stream()
                .map(product -> product.price)
                .reduce(0.0f, (sum, price) -> sum + price);
        System.out.println("### sum using reduce is " + totalPrice);
    }

    // to collect data into single result or data structure
    public void collectExample() {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));
        List<Float> productpricelist = productsList.stream()
                .filter(product -> product.price > 30000)
                .map(product -> product.price)
                .collect(Collectors.toList());
        System.out.println("### Collect Example using streams - prices is : " + productpricelist);

        // max() method to get max Product price
        Product productA = productsList.stream().max((product1, product2) -> product1.price > product2.price ? 1 : -1).get();
        System.out.println(productA.price);
        // min() method to get min Product price
        Product productB = productsList.stream().min((product1, product2) -> product1.price > product2.price ? 1 : -1).get();
        System.out.println(productB.price);
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
