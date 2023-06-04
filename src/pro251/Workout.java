/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro251;



public class Workout {

    private String name;
    private String description;
    
   
    
    public Workout(String name, String description) {
        this.name = name;
        this.description = description;
    }
    
    
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        return "Workout name: " + name + "\nWorkout description: " + description;
    }
}