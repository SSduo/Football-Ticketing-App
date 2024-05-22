/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.footbal;

/**
 *
 * @author Admin
 */
public class Booking {
    private int matchNum;
    private int custIndex;
    private String date;
    private double price;
    private String stand;

    public void setMatchNum(int matchNumber){
        matchNum = matchNumber;
    }
    
    public void setCustIndex(int index){
        custIndex =index;
    }
    
    public void setDate(String d){
        date = d;
    }
    
    public void setPrice(double p){
        price = p;
    }
    
    public void setStand(String s){
        stand = s;
    }
    
    public int getMatchNum(){
        return matchNum;
    }
    
    public int getCustIndex(){
        return custIndex;
    }
    
    public String getDate(){
        return date;
    }
    
    public double getPrice(){
        return price;
    }
    
    public String getStand(){
        return stand;
    }
    
}
