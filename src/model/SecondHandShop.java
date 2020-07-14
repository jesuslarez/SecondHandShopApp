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
import java.util.ArrayList;

public class SecondHandShop {
    public ArrayList<User> userList;
    public ArrayList<Product> productList;
    public ArrayList<Category> categoryList;

        // CONSTRUCTOR OF SecondHandShop
    public SecondHandShop(){
        userList = new ArrayList<User>();
        productList = new ArrayList<Product>();
        categoryList = new ArrayList<Category>();
    }

    public void addUser(String firstName, String surName, String email, 
            String password, String street, int houseNumber, String city, 
            String ZIPCode, String country){
        
        User newUser = new User(firstName, surName, email, password,street, 
                houseNumber,city, ZIPCode, country);
        userList.add(newUser);
    }

    public void addCategory(String name, Category dad){
        Category newCategory = new Category(name, dad);
        categoryList.add(newCategory);
    }

    public boolean logIn(String user, String pass){
        User actUser;
        for (int i = 0; i < userList.size(); i++) {
            actUser = userList.get(i);
            if (actUser.getEmail().equals(user)) {
                return actUser.correctPassword(pass);
            }
        }
        return false;
    }
    public void addProduct(Product prod){
        this.productList.add(prod);
    }

    public void removeProduct(Product prod){
        User remUser = prod.getProductOwner();
        remUser.removeProduct(prod);
        productList.remove(prod);
    }

    public void removeUser(User user){
        userList.remove(user);
        ArrayList<Product> prod = user.getProducts();
        for (Product x : prod) {
            productList.remove(x);
        }
    }

    public ArrayList getByCate(Category cate){
        ArrayList<Product> prodCat = new ArrayList<Product>();
        for (Product x : productList) {
            Category aux = x.getCategory();
            if (x.getCategory() == cate) {
                prodCat.add(x);
            }else if (aux.getTop() != null) {
                while(aux.getTop() != null){
                    aux = aux.getTop();
                    if (aux == cate) {
                        prodCat.add(x);
                        break;
                    } 
                }
            }
        }
        return prodCat;
    }

    public ArrayList getProducts(){
        return (ArrayList<Product>)this.productList.clone();
    }

    public ArrayList getCategorys(){
        return (ArrayList<Category>)this.categoryList.clone();
    }

    public ArrayList getUsers(){
        return (ArrayList<User>)this.userList.clone();
    }
}
