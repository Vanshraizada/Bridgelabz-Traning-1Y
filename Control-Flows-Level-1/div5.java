import java.util.Scanner;

class IFelse1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your Number:-");
        int a=sc.nextInt();
		if(a%5==0){
		System.out.println("your number is divisival by 5");
		}
		else{
		System.out.println("your number is not divisival by 5");
		}
	}
}