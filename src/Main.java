import java.util.*;
public class Main {

    public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String x;
	char a,b;
	x=in.nextLine();
	a=in.next().charAt(0);
        b=in.next().charAt(0);
        System.out.println(x.replace(a,b));



    }
}
