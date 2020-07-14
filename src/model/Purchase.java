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
public class Purchase {
    private OperationState operationState;
    private Address shippingAddress;
    private UserID userId;
    private float price;
    private Product product;
    private CardDetails creditCard;
    
        public Purchase(UserID buyer, Product boughtProduct, Address shippingAddress){
        this.price = boughtProduct.getPrice();
        this.shippingAddress = shippingAddress;
        this.product = boughtProduct;
        this.operationState = new OperationState();
        this.userId = buyer;
    }
        
        public void paid(CardDetails card){
            creditCard = card;
            operationState.paid();
        }

        public boolean getState(){
            return operationState.isPaid();
        }

        public UserID getBuyer(){
            return this.userId;
        }

        public Address getAddress(){
            return this.shippingAddress;
        }

        public Product getProduct(){
            return this.product;
        }

}
