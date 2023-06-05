
package pro251;

import java.util.Scanner;

public class Project251 {

    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your height in centimeters: ");
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
        
        GYMinfo[] GYMs = new GYMinfo[4];
        
        GYMs[0] = new GYMinfo("Golds","for women and men","Jeddah",1999 );
            
        GYMs[1] = new GYMinfo("BeFit","for women and men","Jeddah",1500 );
    
        GYMs[2] = new GYMinfo("Fitness","for women and men","Jeddah",2500 );
       
        GYMs[3] = new GYMinfo("Strength","for women and men","Riyadh",2000 );
        
        Service service = new Service();
        
        String serviceNum= "";
       
            System.out.println("===============================");
            System.out.println("        SERVICES MENU          ");
            System.out.println("===============================");
            System.out.println("1. Add workout");
            System.out.println("2. Remove workout");
            System.out.println("3. Display workouts");
            System.out.println("4. Display a selected workout");
            System.out.println("5. Display a diet plan");
            System.out.println("6. Subscribe a GYM");
            System.out.println("7. Quit");

            

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
                    
                    System.out.println(plans.diet_Plans(result));
                    break;

               case "6":
                    subscribe_GYM(result, scanner, GYMs);
                    break;
                
                
                case "7":
                     System.out.print("Thank you for using Fitness App, Bye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
            
            }
            
            

    
            
            
            
    }
 
    
     private static void subscribe_GYM(int result,Scanner scanner,GYMinfo[] GYMs) {
       
     // Display menu 
    System.out.println("===============================");
    System.out.println("      SUBSCRIBTION MENU        ");
    System.out.println("===============================");
    System.out.println("| 1. Display avalible GYMs     |");
    System.out.println("| 2. Display GYMs in my city   |");
    System.out.println("| 3. Compare GYMs' prices      |");
    System.out.println("| 4. Subscribe a GYM           |");
    System.out.println("-------------------------------");
    System.out.print(" Select option: ");
    
    
    int x=scanner.nextInt();
    switch(x) {
        
        case 1://display gyms
            
            DisplayGYMs(GYMs);
            
    
        break;
         
        case 2:
             Display_GYMs_inCity(GYMs, scanner) ;
           
   
          break;
                
       case 3:
           Compare_GYMs(GYMs, scanner);
          
           
           break;
           
        case 4:
            
           Subscribe_GYM(GYMs, scanner);
            
           break;
  default:
      System.out.println("Invalid choice. Try again.");
    } // code block
      
}
    
     private static void DisplayGYMs(GYMinfo[] GYMs) {
         
         System.out.println("-------------------------------");
         System.out.print("GYMs information  \n");
         for(int j=0; j<GYMs.length;j++){
         System.out.print( j+1 +"-"+GYMs[j] +"\n");    }
    }
    
    private static void Display_GYMs_inCity(GYMinfo[] GYMs, Scanner scanner) {
        
         System.out.println("-------------------------------");
         GYMinfo[] tmp = new GYMinfo[4];
         System.out.print("What's the name of your city? ");
         String city = scanner.next();
         
         
         if(checkThere(city,GYMs))
         {
             System.out.println();
             System.out.println( "Avaialbe GYMs at "+city+":");
             
             for(int j=0; j<GYMs.length;j++){
                
                if( GYMs[j].getGymLocation().equals(city)){ 
                      System.out.println( j+1 + "- " + GYMs[j].getGymName() + ", " + GYMs[j].getGymDescription()+", "+ GYMs[j].getGymPrice()+" SR" );
                 }
              }
          
            
         }else{
              
              System.out.println( "Sorry, currently we don't have any GYMs at your city. Have a look at our online courses!"); 
               
             
         }
              
        }
         
    
     private static void Compare_GYMs(GYMinfo[] GYMs, Scanner scanner) {
         

        
            System.out.println("-------------------------------");
   
            GYMinfo bestPrice = null;
               
            int compareFactor = 100000;
            for(int j=0; j<GYMs.length;j++){
                
                 if(GYMs[j].getGymPrice() < compareFactor){ 
                     
                    bestPrice = GYMs[j];
                    compareFactor = GYMs[j].getGymPrice();
                     
                 }
            }
            
            
            System.out.print(" Best price GYM at your city is:");
            System.out.println( bestPrice.getGymName() + "GYM,    which costs: "+ bestPrice.getGymPrice() + " SAR");

    }

   
    
    private static boolean checkThere(String city, GYMinfo[] GYMs) {
         boolean result = false;
         for(int j=0; j<GYMs.length;j++){
                
                if(!GYMs[j].getGymLocation().equals(city)){ 
                    result = false;
                }else{
                    result = true;
                    break;
                   
                }
          }
       
   return result;
 }
    
    
    private static void Subscribe_GYM(GYMinfo[] GYMs, Scanner scanner) {
        
        System.out.println("-------------------------------");
        DisplayGYMs(GYMs);
        System.out.println();
        System.out.print("Enter the name of the required GYM:");
        String requiredGYM = scanner.next();
        
        
        
         for(int j=0; j < GYMs.length;j++){
                
                if(GYMs[j].getGymName().equals(requiredGYM)){ 
                    
                    System.out.println("You are successfully subscribed at "+GYMs[j].getGymName()+" GYM");
                    break;
                }
       }
    
   }
}






