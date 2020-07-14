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
public class Selled {
    private UserID seller;
    private UserID buyer;
    private float price;
    private Address shippingAddress;
    private OperationState opState;
    private Product sellProduct;

    public Selled(UserID seller, UserID buyer, Address shippingAddress, Product sellProduct){
    	this.seller = seller;
    	this.buyer = buyer;
    	this.price = sellProduct.getPrice();
    	this.shippingAddress = shippingAddress;
    	this.sellProduct = sellProduct;
    	opState = new OperationState();
    }

    public void pay(){
    	opState.paid();
    }

    public boolean getState(){
        return opState.isPaid();
    }
    
    public Product getProduct(){
        return this.sellProduct;
    }

    public Address getAddress(){
        return this.shippingAddress;
    }

    public UserID getBuyer(){
        return this.buyer;
    }

    public UserID getSeller(){
        return this.seller;
    }
}
