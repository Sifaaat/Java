package car;  
 
//Class Created(Car Class)
public class Car{
    public void fullspeed()                //Create 1st method 
    {
        System.out.println("This Car is going so fast!");
    }
    
    public void speed(int maxSpeed)        //Create 2nd method 
    {
        System.out.println("Max speed is: " + maxSpeed);
    }        
    
    
public static void main(String[] args){
    Car myCar = new Car();                 //Create an Object
    
    myCar.fullspeed();                     //Called method using object
    myCar.speed(200);                      //Called method using object          
   }    
 }
