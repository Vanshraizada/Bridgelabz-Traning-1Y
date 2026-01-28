import java.util.Scanner;
class sumtill0{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
		int a,b,c=0,d;
        a=s.nextInt();
		while(a!=0){
		c=a+c;
		a=s.nextInt();
		}
		System.out.println("The sum of the digits are= "+c);
		}
		}
		