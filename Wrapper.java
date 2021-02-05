public class Wrapper {
    public static void main(String[] args) {
        int x=2;
        Integer y=Integer.valueOf(x);
        int z=y.intValue();
        System.out.println(y);
        System.out.println(z);
    }
}
