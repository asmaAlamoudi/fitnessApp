/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro251;

/**
 *
 * @author layan
 */
public class UserInformation {
    
     private String name;
    private int age;
    private double height;
    private double weight;
    private String gender;
    private double rate;

    public UserInformation(String name, int age, double height, double weight, String gender, double rate) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.rate = rate;
    }

    public int calories(){
         
        int caloriesRate = (int) ((weight * 10) + (height * 6.25) - (age * 5) - 161);
        if(rate == 1.25)
            return (int) (caloriesRate * 1.25);
        else return (int) (caloriesRate * 1.725);
      }
    
    public double water(){
        return (double) (weight * 0.033);
    }
        
    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }
    

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getGender() {
        return gender;
    }

    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nHeight: " + height + "\nWeight: " + weight + "\nGender: " + gender ;
}
}
