/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartify.strestservice.enumeration;

/**
 *
 * @author ajaafar
 */
public enum UserType {
    User (1),
    Client(2);
    
  private final int value;
    private UserType(int value) {
        this.value = value;
    } 
     public int getValue() {
        return value;
    }
}

