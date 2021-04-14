package labs.pm.data;

import static java.math.RoundingMode.HALF_UP;
import static labs.pm.data.Rating.*;

import java.math.BigDecimal;

/**
 * {@code Product} class represents properties and behaviours of product objects
 * in the Product Management System. <br>
 * Each product has an id, name and price <br>
 * Each product can have a discount, calculated based on a {@link DISCOUNT_RATE
 * discount rate}
 * 
 * @version 4.0
 * @author oracle
 */
public class Product {
    /**
     * A constant that defines a {@link java.math.BigDecimal BigDecimal} value of
     * the discount rate <br>
     * Discount rate is 10%
     */
    public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);

    private int id;
    private String name;
    private BigDecimal price;
    private Rating rating;

    public Product() {
        this(0, "No name", BigDecimal.ZERO);
    }

    public Product(int id, String name, BigDecimal price, Rating rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public Product(int id, String name, BigDecimal price) {
        this(id, name, price, NOT_RATED);
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * @return the rating
     */
    public Rating getRating() {
        return rating;
    }

    /**
     * Calculates discount based on a product price and {@link DISCOUNT_RATE
     * discount rate}
     * 
     * @return a {@link java.math.BigDecimal Bigdecimal} value of the discount
     */
    public BigDecimal getDiscount() {
        return this.price.multiply(DISCOUNT_RATE).setScale(2, HALF_UP);
    }

    public Product applyRating(Rating newRating) {
        return new Product(this.id, this.name, this.price, newRating);
    }
}
