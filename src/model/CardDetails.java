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
public class CardDetails {
    private String cardNo;
    private String expDate;
    
    public CardDetails(String cardNo, String expDate) {
        this.cardNo = cardNo;
        this.expDate = expDate;
    }
    public String getCard(){
        return this.cardNo.substring(0,4);
    }
}
