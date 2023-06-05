//sara 111
package pro251;


public class dietPlan {

    public dietPlan(int plan) {
        
    }

        
public static int Generate_Plan(int calori){

if (calori < 1500 && calori > 900){
   return 0;  
  
}else {
    
    return 1;
}  

}

        public String diet_Plans(int result){
        
        if (result == 0){
            return 
            "Diet Plan Type : "+ "\nketo"+"\nDescription :"+
          "\nOne of the crash diets for rapid weight loss is low-carbohydrate and high-fat keto diet";
        }else {
            return 
            "Diet Plan Type :"+"\nIntermittent Fasting"+"\nDescription :"+
            "\nIntermittent fasting diet involves fasting for some period of time in a day";
        }
    }
}

