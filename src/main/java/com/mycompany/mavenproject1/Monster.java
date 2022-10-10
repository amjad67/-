/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author USER-Q
 */
public class Monster implements GameInterface {
    @Override
    public void render() {
        System.out.println("Monster rendered");
    }
    
    @Override
    public void move() {
        System.out.println("Monster moved");
    }
    
    @Override
    public void makeNoise() {
        System.out.println("Monster made noise");
    }
}
