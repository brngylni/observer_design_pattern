/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceng431_hw2;

/**
 *
 * @author hp
 */
public class FirstAider implements Officer{
    String id;

    public FirstAider(String name) {
        this.id = name;
    }
    
    
    
    @Override
    public void intervene(String location) {
        System.out.println(String.format("First Aider '%s' is on the way to '%s'", id, location));
    }
    
}
