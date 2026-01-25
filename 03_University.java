package university;

public class University {
    String Department,Student;
    int faculty;
    
    
    public static void main(String[] args ) {
        University Daffodil_International_University = new University(); //create object
        Daffodil_International_University.Department = "Software,CSE,Civil,EEE";
                Daffodil_International_University.Student = "Thirty thousand ";
                     
                Daffodil_International_University.faculty = 500;
                
                
               System.out.println("Department:"+Daffodil_International_University.Department  );
               System.out.println("Student :"+Daffodil_International_University.Student  );
               System.out.println("faculty :"+Daffodil_International_University.faculty  );
    }
}
