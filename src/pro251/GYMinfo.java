/*
 Reema
 */
package pro251;


public class GYMinfo {
    
    String gymName;
    String gymDescription;
    String gymLocation;
    int gymPrice;

    
      static String DisplayGYM(GYMinfo GYM) {
      
        return GYM+ "";
    }
      

    public String getGymName() {
        return gymName;
    }

    public String getGymDescription() {
        return gymDescription;
    }

    public String getGymLocation() {
        return gymLocation;
    }

    public int getGymPrice() {
        return gymPrice;
    }

    public void setGymName(String gymName) {
        this.gymName = gymName;
    }

    public void setGymDescription(String gymDescription) {
        this.gymDescription = gymDescription;
    }

    public void setGymLocation(String gymLocation) {
        this.gymLocation = gymLocation;
    }

    public void setGymPrice(int gymPrice) {
        this.gymPrice = gymPrice;
    }

    public GYMinfo(String gymName, String gymDescription, String gymLocation, int gymPrice) {
        this.gymName = gymName;
        this.gymDescription = gymDescription;
        this.gymLocation = gymLocation;
        this.gymPrice = gymPrice;
    }

    
//    public void getBestPrice() {
//       
//        
//    }

    @Override
    public String toString() {
        return   "Name= " + gymName + " GYM,\tDescription= " + gymDescription + ",\tLocation= " + gymLocation +" city"+ ",\tPrice= " + gymPrice +" SAR";
    }
    
    
    
}
