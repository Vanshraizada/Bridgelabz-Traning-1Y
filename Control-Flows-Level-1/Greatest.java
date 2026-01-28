import java.util.Scanner;
class Greatest{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your 3 numbers");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(a>b && a>c){
            System.out.println(a + " is Greatest");
        }
        else if(b>a && b>c){
            System.out.println(b + " is Greatest ");

        }
        else if(c>a && c>b){
            System.out.println(c + " is Greatest ");

        }
    }
}