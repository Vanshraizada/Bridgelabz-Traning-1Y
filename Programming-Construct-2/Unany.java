import java.util.Scanner;
class Unany{
     public static void main(String args[]){
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter The Numbers:-");
	 int a=s.nextInt();
	 System.out.println("Post Increment="+a++);
	 System.out.println("Pre Increment="+ ++a);
	 System.out.println("Post Decrement="+a--);
	 System.out.println("Pre Decrement="+ --a);
}
}