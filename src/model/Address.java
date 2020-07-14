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
public class Address {
    String street;
    int houseNumber;
    String city;
    String ZIPCode;
    String country;
    
    
    public Address(String street, int number, String city, String ZIPCode, String country) {
        this.street = street;
        this.houseNumber = number;
        this.city = city;
        this.ZIPCode = ZIPCode;
        this.country = country;
    }
    
    @Override
    public String toString(){
        String result = street+" "+ houseNumber+" "+city+" "+ZIPCode+" "+country;
        return result;
    }
}

