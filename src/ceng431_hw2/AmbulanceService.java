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
public class AmbulanceService implements Observer{
    ArrayList<Officer> officers;
    Subject alarmSource;

    public AmbulanceService(Subject alarmSource, ArrayList<Officer> officers) {
        this.alarmSource = alarmSource;
        this.officers = officers;
        this.alarmSource.addObserver(this);
    }
    
    
    @Override
    public void alarm(String location) {
        officers.forEach((x) -> x.intervene(location));
    }
    
}
