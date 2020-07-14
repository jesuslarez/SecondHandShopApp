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

public class Category {
    private String name;
    private Category top;
    private ArrayList<Category> sons;

    public Category(String name, Category dad){
    	this.name = name;
    	sons = new ArrayList<Category>();
    	top = dad;
    	if (dad != null) {
    		dad.addSon(this);
    	}
    }

    public ArrayList getSons(){
    	return (ArrayList<Category>)this.sons.clone();
    }

    public void addSon(Category son){
    	sons.add(son);
    }

    public Category getTop(){
    	return top;
    }
    public String getName(){
        return name;
    }
    
}
