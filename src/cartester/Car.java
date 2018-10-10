/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cartester;

/**
 *
 * @author Andrew Archer 
 * This program 
 */
public class Car {
   //variables for abributes for the cars

  private String carbrand, carmodel, coluor, transmission;
  private int year, price;
  private int horn =(int) (Math.random() * 5+3);
  
  private String sound;
   
  //constructors
  public Car() {
    carbrand = "Tesla";
    carmodel = "X";
    coluor = "Red";
    transmission = "Automatic";
    year = 2017;
    price = 103000;
    
  }

  public Car(String dgName, String dgBreed, String dbmission,String colour, int agg, int hung  ) {
    carbrand = dgName;
    carmodel = dgBreed;
    coluor = colour;
    year = agg;
    price = hung;
    
   transmission = dbmission;
   
    
  }

  //Alternate constructor
  public Car(String dgName, String dgBreed) {
   
    //Set the year and price to random #s

    carbrand = dgName;
    carmodel = dgBreed;
    year = (int) (Math.random() * 2000 + 2018);
    price = (int) (Math.random() * 2000+ 5000);
    int power =(int) (Math.random() * 5+3);
    
    if(power>4){
        transmission = "Automatic";
    }else{
        transmission = "Standard";
    }
    int win = (int) (Math.random() * 5+3);
    if(win>4){
        coluor = "Red";
    }else{
        coluor = "Black";
    }
     
  }

  public void honkHorn (){
      
    if(horn>3){
        sound ="beep-beep";
    }else{
        sound = "honk-honk";
    }
  }
  

  //displays the abributes to the screen 
  public String toString() {
    String output = "Name: " + carbrand + "\n";
    output += "Model: " + carmodel + "\n";
    output += "Colour: " + coluor + "\n";
    output += "Transmission: " + transmission + "\n";
    output += "Year: " + year + "\n";
    output += "Price: " + price + "\n";
    output += "Horn: " + sound;
    //output string is complete, return it
    return output;
  }
}
