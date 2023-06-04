/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro251;

import java.util.ArrayList;
//hii
public class Service {
    
   private ArrayList<Workout> workouts;

    public Service() {
        workouts = new ArrayList<>();
    }

    public void setWorkouts(ArrayList<Workout> workouts) {
        this.workouts = workouts;
    }

    public ArrayList<Workout> getWorkouts() {
        return workouts;
    }
    
    

    public void addWorkout(Workout workout) {
        workouts.add(workout);
    }

    public void removeWorkout(Workout workout) {
        workouts.remove(workout);
    }

    public void displayAllWorkouts() {
        for (Workout workout : workouts) {
            System.out.println(workout);
        }
    }

    public void displayWorkout(Workout workout) {
        System.out.println(workout);
    }

    
}
