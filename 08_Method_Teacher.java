public class Teacher{
    String name,department;
    int age;
    
    public void fullInformation(){
        System.out.println("Name: "+ name);
        System.out.println("Department: "+department );
        System.out.println("Age: "+ age);
    }
    
    
public static void main(String[] args){
    Teacher t1=new Teacher();
    t1.name="UKD";
    t1.department="SWE";
    t1.age=42;

    t1.fullInformation();
    
    
    Teacher t2=new Teacher();
    t2.name="Nuruzzaman Faruki";
    t2.department="SWE";
    t2.age=38;
    
    t2.fullInformation();
   }
}
