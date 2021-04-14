package labs.pm.app;

import java.math.BigDecimal;
import labs.pm.data.Product;
import labs.pm.data.Rating;

/**
 * {@code Shop} class represents an application that manages Products
 * 
 * @version 4.0
 * @author oracle
 */
public class Shop {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Tea", BigDecimal.valueOf(1.99));
        Product p2 = new Product(102, "Cofee", BigDecimal.valueOf(1.99), Rating.FOUR_STAR);
        Product p3 = new Product(103, "Cake", BigDecimal.valueOf(3.99), Rating.FIVE_STAR);
        Product p4 = new Product();
        Product p5 = p3.applyRating(Rating.THREE_STAR);

        printProduct(p1);
        printProduct(p2);
        printProduct(p3);
        printProduct(p4);
        printProduct(p5);
    }

    private static void printProduct(Product product) {
        System.out.println(product.getId() + " " + product.getName() + " " + product.getPrice() + " " + product.getDiscount() + " "
                + product.getRating().getStars());
    }
}
