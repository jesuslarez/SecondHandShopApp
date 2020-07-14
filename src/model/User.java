/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.util.ArrayList;
/**
 *
 * @author Jesus Larez
 */
public class User {
    private UserID userID;
    private String firstName;
    private String surName;
    private String email;
    private Address address;
    private String password;
    private ArrayList<CardDetails> cardList;
    private ArrayList<Purchase> purchaseHist;
    private ArrayList<Product> products;
    private ArrayList<Selled> sellHist;
    
    
    User(String firstName, String surName, String email, String password,
        String street, int houseNumber, String city, String ZIPCode, String country){
        this.firstName=firstName;
        this.surName=surName;
        address = new Address(street, houseNumber, city, ZIPCode, country);
        setEmail(email);
        setPassword(password);
        this.userID = new UserID(email);
        this.cardList = new ArrayList<CardDetails>();
        this.products = new ArrayList<Product>();
        this.purchaseHist = new ArrayList<Purchase>();
        this.sellHist = new ArrayList<Selled>();
        
    }
    public Purchase purchaseProduct(Product prod){
        Purchase pur = new Purchase(this.userID, prod, this.address);
        purchaseHist.add(pur);
        return pur;
    }

    public Product pay(CardDetails card, Purchase pur){
        Purchase toPay = purchaseHist.get(purchaseHist.indexOf(pur));
        toPay.paid(card);
        return toPay.getProduct();
    }

    public void addSelledHist(Purchase pur){
        Selled sell = new Selled(this.userID, pur.getBuyer(), pur.getAddress(), pur.getProduct());
        sellHist.add(sell);
    }

    public void sellPaid(Product prod){
        Selled paid=null;
        for (Selled x : sellHist) {
            Product product = x.getProduct();
            if(product.getProductId() == prod.getProductId()){
                paid = x;
                paid.pay();
            }
        }

    }
    
    //Setters
    void setEmail(String email){
        this.email=email;
    }
    void setPassword(String password){
        this.password=password;
    }

    public String getPassword(){
        return this.password;
    }

    public String getName(){
        return firstName+" "+surName;
    }
    
    public String getEmail(){
        return email;
    }

    public boolean correctPassword(String pass){
        return this.password.equals(pass);
    }

    public String getUserId(){
        return userID.getID();
    }
    
    public void addCard(String cardNo, String expDate){
        CardDetails newCard=new CardDetails(cardNo, expDate);
        cardList.add(newCard);
    }

    public Product offerProduct(String name, float price, String description, String image, Category cate){
        Product newProduct= new Product(this, name, price, description, image, cate);
        products.add(newProduct);
        return newProduct;
    }

    public ArrayList getProducts(){
        return (ArrayList<Product>)this.products.clone();
    }
    public Address getAddress(){
        return this.address;
    }
    
    public ArrayList getCards(){
        return this.cardList;
    }

    public void removeProduct(Product prod){
        products.remove(prod);
    }
    public ArrayList getSoldProducts(){
        return (ArrayList<Selled>)this.sellHist.clone();
    }
    public ArrayList getPurchasHist(){
        return (ArrayList<Purchase>)this.purchaseHist.clone();
    }
}
