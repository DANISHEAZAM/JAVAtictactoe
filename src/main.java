import java.util.Scanner;
public class main {
	public static void main (String args[]){
		Scanner b=new Scanner(System.in);
		boolean isDone=false;
		
		System.out.println("\t_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-►►►►►►WELCOME◄◄◄◄◄◄_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
		while(isDone!=true){
			System.out.println("Do you wanna play(Y/N)");
			char ch=b.next().charAt(0);
		switch(ch){
		case 'Y':LAB obj=new LAB();
		obj.call();
		break;
		case 'N':isDone=true;
		break;
			default:isDone=true;
			break;
		
		}}
	}

}
