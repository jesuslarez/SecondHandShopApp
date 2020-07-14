/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Jesus Larez
 */
public class UserID {
    private String id;
    private int value = 123; 
    
    public UserID(String user){
        this.id = user + value;
    }

    public String getID(){
    	return id;
    }
}
