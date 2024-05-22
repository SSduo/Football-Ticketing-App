/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.footbal;

/**
 *
 * @author Admin
 */
public class Match {
    private String venue;
    private int seats;
    private String date;
    private String teams;
    private String time;
    private double mainStandPrice, awayStandPrice, sideStandPrice;
    
    
    public void setVenue(String v){
        venue = v;
    }
      
    public void setSeats(int s){
        seats = s;
    }
    
    public void setDate(String d){
        date = d;
    }
    
    public void setTeams(String t){
        teams = t;
    }
    
    public void setTime(String kickoff){
        time = kickoff;
    }
    
    public void setMainStandPrice(double main){
        mainStandPrice = main;
    }
    
    public void setAwayStandPrice(double away){
        awayStandPrice = away;
    }
    
    public void setSideStandPrice(double side){
        sideStandPrice = side;
    }
     
    public String getVenue(){
        return venue;
    }
    
    public int getSeats(){
        return seats;
    }
    
    public String getDate(){
        return date;
    }
    
    public String getTeams(){
        return teams;
    }
    
    public String getTime(){
        return time;
    }
    
    public double getMainStandPrice(){
        return mainStandPrice;
    }
    
    public double getAwayStandPrice(){
        return awayStandPrice;
    }
    
    public double getSideStandPrice(){
        return sideStandPrice;
    }
}
