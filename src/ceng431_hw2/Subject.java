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
public interface Subject {
    
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers(String location);
    
}
