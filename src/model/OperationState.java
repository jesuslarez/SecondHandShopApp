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
public class OperationState {
    private boolean onGoing;
    private boolean pay;
    
    public OperationState(){
    	onGoing = true;
    	pay = false;
    }

    public void paid(){
    	onGoing = false;
    	pay = true;
    }

    public boolean isPaid(){
    	if (pay) {
    		return true;
    	}else{
    		return false;
    	}
    }
}
