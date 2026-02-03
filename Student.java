
package student;

public class Student {
 String name,department;
 int age;
 static String uniName = "DIU";
 
 Student(String n,String d,int a)
 {
  this.name =n;
  this.department=d;
  this.age=a;
 }

 void displayInformation()
 {
     System.out.println("Name : "+ name);
     System.out.println("Department : "+ department);
     System.out.println("Age : "+ age);     
 }
}
   
