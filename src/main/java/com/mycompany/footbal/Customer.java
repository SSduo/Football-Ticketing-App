/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.footbal;

/**
 *
 * @author Admin
 */
public class Customer {
    private String custNic;
    private String custAge;
    private String custName;
    private String custAddress;
    private String custPhone;
    
    public void setCustNic(String n){
        custNic = n;
    }
    
    public void setCustAge(String a){
        custAge = a;
    }
    
    public void setCustName(String n){
        custName = n;
    }
    
    public void setCustAddress(String add){
        custAddress = add;
    }
    
    public void setCustPhone(String phone){
        custPhone = phone;
    }
    
    public String getCustNic(){
        return custNic;
    }
    
    public String getCustAge(){
        return custAge;
    }
    
    public String getCustName(){
        return custName;
    }
    
    public String getCustAddress(){
        return custAddress;
    }
    
    public String getCustPhone(){
        return custPhone;
    }
}
