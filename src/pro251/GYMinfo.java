/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro251;


public class GYMinfo {
    
    String gymName;
    String gymDescription;
    String gymLocation;
    int gymPrice;

    GYMinfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        return   "Name= " + gymName + ",\tDescription= " + gymDescription + ",\tLocation= " + gymLocation +" city"+ ",\tPrice= " + gymPrice +" SR";
    }
    
    
    
}
