import java.util.Scanner;

class Reverse {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:-");
        int a = s.nextInt();

        int[] b = new int[10];
        int c= 0;

        while (a>0 && c<10) {
            b[c] = a%10;
            a/= 10;
            c++;
        }
        int e=c;
        int[] d=new int[e];
        for (int i=0; i<c; i++) {
            System.out.print(b[i]);
        }
    }
}