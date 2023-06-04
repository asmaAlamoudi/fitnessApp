/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro251;

import java.util.Scanner;

public class Project251 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();
        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter your gender "
                + "M: for male"
                + "F: for female"
                + "(M/F): ");
        String gender = scanner.next();
        System.out.print("Enter your rate of physical activity (1.25 for low activity || 1.725 for high activity): ");
        double rate = scanner.nextDouble();
        
        UserInformation user = new UserInformation(name, age, height, weight, gender, rate);
        System.out.println();
        System.out.println("User information recorded:");
        System.out.println(user);
        
        int calori = user.calories();
        
        System.out.println("Daily calories need: " + calori);
        System.out.println("Daily need for water: " + Math.round(user.water()) + "Litres");
        
        dietPlan plans = new dietPlan(calori);
       
        int result = plans.Generate_Plan(calori);
        
        
        Service service = new Service();
        
        String serviceNum= "";
       
            System.out.println("-------------------------------");
            System.out.println("1. Add workout");
            System.out.println("2. Remove workout");
            System.out.println("3. Display workouts");
            System.out.println("4. Display a selected workout");
            System.out.println("5. Display a diet plan");
            System.out.println("6. Quit");

            

            while(!serviceNum.equals("6")){
                System.out.println("-------------------------------");
                System.out.print("Enter the number of the service you want: ");
                
                serviceNum = scanner.next();
            switch (serviceNum) {
                case "1":
                    System.out.print("Enter workout name: ");
                    String workoutName = scanner.next();
                    System.out.print("Enter workout description: ");
                    String description = scanner.next();
                    Workout workout = new Workout(workoutName, description);
                    service.addWorkout(workout);
                    System.out.println("Workout added.");
                    break;
                case "2":
                    System.out.print("Enter workout name: ");
                    workoutName = scanner.next();
                    for (Workout w : service.getWorkouts()) {
                        if (w.getName().equals(workoutName)) {
                            service.removeWorkout(w);
                            System.out.println("Workout removed.");
                            break;
                        }
                    }
                    break;
                case "3":
                    service.displayAllWorkouts();
                    break;
                case "4":
                    System.out.print("Enter workout name: ");
                    workoutName = scanner.next();
                    for (Workout w : service.getWorkouts()) {
                        if (w.getName().equals(workoutName)) {
                            service.displayWorkout(w);
                            break;
                        }
                    }
                    break;                    
                case "5":
                    diet_Plans(result);

                    break;

                case "6":
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
            
            }
            
            

    
            
            
            
    }
    public static void diet_Plans(int result){
        
        if (result == 0){
            System.out.println("Diet Plan Type : "
                    + "\nketo");
            System.out.println("Description :");
            System.out.println("One of the crash diets for rapid weight loss is low-carbohydrate and high-fat keto diet.");
        }else {
            System.out.println("Diet Plan Type :"
                    + "\nIntermittent Fasting");
            System.out.println("Description :");
            System.out.println("Intermittent fasting diet involves fasting for some period of time in a day");
        }
    }
}


