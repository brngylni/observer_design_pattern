/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceng431_hw2;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class Highway implements Subject{
    ArrayList<Observer> observers = new ArrayList<>();
    private boolean trafficFlows;
    
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String location) {
        observers.forEach((x) -> x.alarm(location));
    }
    
    public boolean isFlowing(){
        return trafficFlows;
    }
    
    public void changeFlow(boolean value, String location){
        trafficFlows = value;
        if(!trafficFlows){
        notifyObservers(location);
        }
    }
    
    
}
