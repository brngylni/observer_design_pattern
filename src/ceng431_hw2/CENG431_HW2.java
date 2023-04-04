/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceng431_hw2;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author hp
 */
public class CENG431_HW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var roadmans = generateRoadmans(5);
        var cops = generateCops(5);
        var firstAiders = generateFirstAiders(5);
        Highway highway = new Highway();
        
        PoliceDepartment policeDepartment = new PoliceDepartment(highway, cops);
        AmbulanceService ambulanceService = new AmbulanceService(highway, firstAiders);
        HighwayMaintanenceCrew highwayMaintanenceCrew = new HighwayMaintanenceCrew(highway, roadmans);
        
        highway.changeFlow(false, "Around ring road, 5km ahead of box offices");
        
        
    }
    
    
    static ArrayList<Officer> generateCops(int count){
        ArrayList<Officer> officers = new ArrayList<>();
        for(int i=0; i<count; i++){
            officers.add(new Cop(generateOfficerId()));
        }
        return officers;
    }
    static ArrayList<Officer> generateFirstAiders(int count){
        ArrayList<Officer> officers = new ArrayList<>();
        for(int i=0; i<count; i++){
            officers.add(new FirstAider(generateOfficerId()));
        }
        return officers;
    }
    static ArrayList<Officer> generateRoadmans(int count){
        ArrayList<Officer> officers = new ArrayList<>();
        for(int i=0; i<count; i++){
            officers.add(new Roadman(generateOfficerId()));
        }
        return officers;
    }
    
    
    static String generateOfficerId(){
    int leftLimit = 48; // numeral '0'
    int rightLimit = 122; // letter 'z'
    int targetStringLength = 10;
    Random random = new Random();

    String generatedString = random.ints(leftLimit, rightLimit + 1)
      .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
      .limit(targetStringLength)
      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
      .toString();

    return(generatedString);
    }
}
