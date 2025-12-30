/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.guild.roles;

/**
 *
 * @author User
 */
public class Role {
    //Encapsulated Instance Variables
    private String name;
    private Integer age;
    private String race;
    private double mana;
    
    //No-Argument Constructor
    public Role(){
        this.name = "Unknown";
        this.age = null;
        this.race = "Unknown";
        this.mana = 0.0;
    }
    
    //Parameterized Constructor
    public Role(String name, Integer age, String race, double mana){
        this.name = name;
        this.age = age;
        this.race = race;
        this.mana = mana;
    }
    
    //Setter
    public void setName(String name){
        this.name=name;
    }
    
    public void setAge(Integer age){
        this.age = age;
    }
    
    public void setRace(String race){
        this.race = race;
    }
    
    public void setMana(double mana){
        this.mana = mana;
    }
    
    //Getter
    public String getName(){
        return name;
    }
    
    public Integer getAge(){
        return age;
    }
    
    public String getRace(){
        return race;
    }
    
    public double getMana(){
        return mana;
    }
    
    //Method
    public void performAction(){
        System.out.println(name + " is performing a magical action.");
    }
}
