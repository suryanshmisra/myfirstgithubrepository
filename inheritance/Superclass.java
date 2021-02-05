package inheritance;

public class Superclass {
    int x;
    public Superclass(){
        System.out.println("No Arg super class constructor");
    }
    public Superclass(int x)
    {
        this();
        this.x=x;
        System.out.println("Arg superclass constructor");
    }
}
