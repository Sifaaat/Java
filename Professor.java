package professor;

public class Professor{
    String name;
    int age;


Professor(String n,int a)
{
name=n;
age=a;
}

public static void main(String[] args)
{
    Professor p1=new Professor("UKD",40);
    System.out.println("Professor Name: " + p1.name);
    System.out.println("Professor Age: " + p1.age);
}
}
