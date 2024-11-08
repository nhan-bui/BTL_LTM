package model;

import java.io.Serializable;

public class ProductModel implements Serializable {
    private static final long serialVersionUID = 1L;

    private String productName;
    private float price;
    private String imageUrl;

    public ProductModel() {
        super();
        this.productName = "";
        this.price = 0;
        this.imageUrl = "";
    }

    public ProductModel(String productName, float price, String imageUrl) {
        super();
        this.productName = productName;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}