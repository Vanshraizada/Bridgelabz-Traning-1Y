import java.util.Scanner;
class Plaindrom{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int c=0,d;
		int b=a;
		while(a>0){
		    d=a%10;
			c=(c+10)+d;
			a/=10;
			}
			if(c==b){
			    System.out.println(" Your number is Plaindrom ");
				}
			else{
			    System.out.println(" Your number is not Plaindrom ");
			    }
			}
		}	
			