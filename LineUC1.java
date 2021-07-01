package lineComparsion;
import java.util.Scanner;

public class LineUC1 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Welcome to Line Comparison Computation Program");
		System.out.println("Enter x1,y1 and x2,y2 respectively");
		int x1= obj.nextInt();
		int y1= obj.nextInt();
		int x2= obj.nextInt();
		int y2= obj.nextInt();
		double len=Math.sqrt(((x2-x1)^2)+((y2-y1)^2));
		System.out.println("Length of line is "+len);
		obj.close();
	
	}

}
