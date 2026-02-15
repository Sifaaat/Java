public class Math{
    
    public void sum(int a,int b){
        int result=a+b;
        System.out.println("The sum is: "+ result);
        
    }
    public static void main(String[] args){
        Math ob = new Math();
        ob.sum(5,10);
    }
}
