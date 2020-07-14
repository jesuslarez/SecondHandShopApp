/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Luis Galindo
 */
public class Product {
    private float price; 
    private ProductID productId;
    private String description;
    private String image;
    public User owner;
    private String name;
    public Category cate;
    
    public Product(User user, String name, float price, String description, String image, Category cate){
        this.name = name;
        this.price = price;
        this.description = description;
        this.image = image;
        this.owner = user;
        this.cate = cate;
        this.productId = new ProductID(name, owner.getName());
    }

    public String getProductId(){
        return productId.getID();
    }

    public User getProductOwner(){
        return owner;
    }

    public Category getCategory(){
        return cate;
    }

    public void setCategory(Category cate){
        this.cate = cate;
    }
    public String getName(){
        return name;
    }

    public float getPrice(){
        return this.price;
    }

    public String getDescription(){
        return this.description;
    }

    public String getImage(){
        return this.image;
    }
}
