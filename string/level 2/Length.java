
import java.util.Scanner;

public class Length {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int c=0;
        int i=0;
        String a = s.nextLine();
        while(i < a.length()){
                c++;
            i++;
        }
        System.out.println("Length "+c);
        System.out.println("Length using length()"+ a.length());
    }
}