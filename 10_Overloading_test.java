
package teacher;
public class Overloading_test {

    public static void main(String[] args) {
        Teacher teacher1=new Teacher();
        
        
        Teacher teacher2=new Teacher("UKD","male",42);
        teacher2.displayInformation();
        
        
        Teacher teacher3=new Teacher("Nuruzzaman Faruqi","male");
        teacher3.displayInformation();
        
      }
    }

