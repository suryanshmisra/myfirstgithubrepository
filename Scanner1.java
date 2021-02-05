import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter integer");
        int num=Integer.parseInt(sc.next());
        sc.close();
        System.out.println(num);
    }
}
