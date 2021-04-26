package labs.pm.app;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Comparator;

import labs.pm.data.Product;
import labs.pm.data.ProductManager;
import labs.pm.data.Rating;

/**
 * {@code Shop} class represents an application that manages Products
 * 
 * @version 4.0
 * @author oracle
 */
public class Shop {
    public static void main(String[] args) {
        ProductManager pm = new ProductManager("en-GB");

        // pm.createProduct(101, "Tea", BigDecimal.valueOf(1.99), Rating.NOT_RATED);
        pm.parseProduct("D,101,Tea,1.99,0,2021-04-26");
        pm.printProductReport(101);

        // pm.reviewProduct(101, Rating.FOUR_STAR, "Nice hot cup of tea");
        // pm.reviewProduct(101, Rating.TWO_STAR, "Tather weak tea");
        // pm.reviewProduct(101, Rating.FOUR_STAR, "Fine tea");
        // pm.reviewProduct(101, Rating.FOUR_STAR, "Good tea");
        // pm.reviewProduct(101, Rating.FIVE_STAR, "Perfect tea");
        // pm.reviewProduct(101, Rating.THREE_STAR, "Just add some lemon");
        pm.parseReview("101,4,Nice hot cup of tea");
        pm.parseReview("101,2,Tather weak tea");
        pm.parseReview("101,4,Fine tea");
        pm.parseReview("101,4,Good tea");
        pm.parseReview("101,5,Perfect tea");
        pm.parseReview("101,3,Just add some lemon");
        pm.printProductReport(101);
        
        pm.parseProduct("F,103,Cake,3.99,0,2021-04-28");
        pm.printProductReport(103);

        // pm.changeLocale("pt-BR");

        // pm.createProduct(102, "Cofee", BigDecimal.valueOf(1.99), Rating.NOT_RATED);
        // pm.reviewProduct(102, Rating.THREE_STAR, "Cofee was ok");
        // pm.reviewProduct(102, Rating.ONE_STAR, "Where is the milk?");
        // pm.reviewProduct(102, Rating.FIVE_STAR, "It's perfect with ten spoons of
        // sugar!");
        // // pm.printProductReport(102);

        // pm.createProduct(103, "Cake", BigDecimal.valueOf(3.99), Rating.NOT_RATED,
        // LocalDate.now().plusDays(2));
        // pm.reviewProduct(103, Rating.FIVE_STAR, "Very nice cake");
        // pm.reviewProduct(103, Rating.FOUR_STAR, "It's goo, but I've expected more
        // chocolate");
        // pm.reviewProduct(103, Rating.FIVE_STAR, "This cake is perfect!");
        // // pm.printProductReport(103);

        // pm.createProduct(104, "Cookie", BigDecimal.valueOf(2.99), Rating.NOT_RATED,
        // LocalDate.now());
        // pm.reviewProduct(104, Rating.THREE_STAR, "Just another cookie");
        // pm.reviewProduct(104, Rating.THREE_STAR, "Ok");
        // // pm.printProductReport(104);

        // pm.createProduct(105, "Hot Chocolate", BigDecimal.valueOf(2.50),
        // Rating.NOT_RATED);
        // pm.reviewProduct(105, Rating.FOUR_STAR, "Tasty!");
        // pm.reviewProduct(105, Rating.FOUR_STAR, "Not bad at all");
        // // pm.printProductReport(105);

        // pm.createProduct(106, "Chocolate", BigDecimal.valueOf(2.50),
        // Rating.NOT_RATED, LocalDate.now().plusDays(3));
        // pm.reviewProduct(106, Rating.TWO_STAR, "Too sweet");
        // pm.reviewProduct(106, Rating.THREE_STAR, "Better then cookie");
        // pm.reviewProduct(106, Rating.TWO_STAR, "Too bitter");
        // pm.reviewProduct(106, Rating.ONE_STAR, "I don't get it!");
        // pm.printProductReport(106);

        // Comparator<Product> ratingSorter = (p1, p2) -> p2.getRating().ordinal() -
        // p1.getRating().ordinal();
        // pm.printProducts(p -> p.getPrice().floatValue() < 2, ratingSorter);

        // pm.getDiscounts().forEach(
        // (rating, discount) -> System.out.println(rating + '\t' + discount)
        // );

        // Comparator<Product> priceSorter = (p1, p2) ->
        // p2.getPrice().compareTo(p1.getPrice());
        // pm.printProducts(priceSorter);

        // pm.printProducts(ratingSorter.thenComparing(priceSorter));
        // pm.printProducts(ratingSorter.thenComparing(priceSorter).reversed());
    }
}
