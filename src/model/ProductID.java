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
public class ProductID {
    private String id;
    
    public ProductID(String prod, String owner){
        this.id = prod + owner;
    }

    public String getID(){
    	return id;
    }
}
