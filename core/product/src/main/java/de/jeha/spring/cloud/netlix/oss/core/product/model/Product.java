package de.jeha.spring.cloud.netlix.oss.core.product.model;

/**
 * @author jenshadlich@googlemail.com
 */
public class Product {

    private final String id;
    private final String name;

    public Product(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
