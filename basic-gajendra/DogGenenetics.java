/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assessment.basic_programming;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author rhythm
 */
public class DogGenenetics {
    public static void main(String[] args){
         Scanner inputReader = new Scanner(System.in);
         //Random Generation
        Random r = new Random();

        String dogName;
        int startPercent = 100;
        int breedPercent = 0;
        
        String[] breeds = {"St. Bernard","Chihuahua","Dramatic RedNosed Asian Pug","Common Cur","King Doberman"};

        System.out.println("What is your doggies name?");
        dogName = inputReader.nextLine();

        

        System.out.println("Well then, I have this highly reliable report on Sir Fluffy McFlufferkins Esquire's prestigious background right here");
        //next line print
           System.out.println("");
           
        System.out.println("Sir Fluffy McFlufferkins Esquire is:");
        System.out.println("");
       
        
        for (int i = 0; i <=4; i++) {
            String breed = "";
            breed = breeds[i];
            if (i != 4) {
                //Random Percent Generation
                breedPercent = r.nextInt(startPercent);
                startPercent =startPercent-breedPercent;
            } else {
                breedPercent = startPercent;

            }
            
           
        
            System.out.println(breedPercent + "%"+ breed   );
          

        }
        
        //new line
        System.out.println("");
        System.out.println("WOW, that is QUITE the dog!!");
    }
        
       
    
}
