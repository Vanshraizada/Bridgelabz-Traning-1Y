import java.util.Scanner;
class Smallest{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your 3 numbers");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(a<b && a<c){
            System.out.println(a + " is smallest");
        }
        else if(b<a && b<c){
            System.out.println(b + " is smallest ");

        }
        else if(c<a && c<b){
            System.out.println(c + " is smallest ");

        }
    }
}