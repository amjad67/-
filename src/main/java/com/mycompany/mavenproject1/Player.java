/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author USER-Q
 */
public class Player implements GameInterface {
    @Override
    public void render() {
        System.out.println("Player rendered");
    }
    
    @Override
    public void move() {
        System.out.println("Player moved");
    }
    
    @Override
    public void makeNoise() {
        System.out.println("Player made noise");
    }
}
