package inheritance;
//contructor chaining
public class Childclass {
   public Childclass(){
        this(10);
        System.out.println("No Arg child class constructor");
    }
   public Childclass(int x){
    
        System.out.println("Arg child class constructor");
    }
    public static void main(String[] args) {
        // Childclass c=new Childclass();

    }
}
