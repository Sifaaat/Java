public class Teacher{
    public void facultyskill(String quality){
        System.out.println("Faculty skill: "+ quality);
    }
    
    public void age (int age){
        System.out.println("Faculty age: "+ age);
    }
    
    public void Experience(String Experience){
        System.out.println("Faculty Experience: "+ Experience);
    }
    
public static void main(String[] args){
    Teacher faculty=new Teacher();
    faculty.facultyskill("Top class");
    faculty.age(42);
    faculty.Experience("6 years of experience in both education sector and marketplace");
         }
    }
