
package teacher; 
public class Teacher{
String name,gender;
int age;


Teacher(){
    System.out.println("No information");
}

Teacher(String name,String gender){
    
    this.name=name;
    this.gender=gender;
}

Teacher(String name,String gender,int age){
    
    this.name=name;
    this.gender=gender;
    this.age=age;
  }

void displayInformation(){
    System.out.println("Name: "+ name);
    System.out.println("Gender: "+ gender);
    System.out.println("Age: "+ age);
 }
}
