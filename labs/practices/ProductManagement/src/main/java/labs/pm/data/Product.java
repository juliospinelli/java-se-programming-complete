package labs.pm.data;

import static java.math.RoundingMode.HALF_UP;

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

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(final int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(final BigDecimal price) {
        this.price = price;
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
}
