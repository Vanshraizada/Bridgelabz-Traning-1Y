import java.util.Scanner;
class Count1{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
		int a,b,c=0,d;
        a=s.nextInt();
		while(a>0){
		b=a-1;
		if(b%10==0){
		    c++;
		}
		a=a/10;
		}
		System.out.println("The number of 1 Integer="+c);
	}
}