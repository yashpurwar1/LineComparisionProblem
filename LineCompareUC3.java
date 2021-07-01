package lineComparsion;
import java.util.Scanner;
public class LineCompareUC3 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Welcome to Line Comparison Computation Program");
		System.out.println("Enter x1,y1 and x2,y2 respectively of line 1");
		int x1= obj.nextInt();
		int y1= obj.nextInt();
		int x2= obj.nextInt();
		int y2= obj.nextInt();
		System.out.println("Enter a1,b1 and a2,b2 respectively of line 2");
		int a1= obj.nextInt();
		int b1= obj.nextInt();
		int a2= obj.nextInt();
		int b2= obj.nextInt();
		
		double len1=Math.sqrt(((x2-x1)^2)+((y2-y1)^2));
		double len2=Math.sqrt(((a2-a1)^2)+((b2-b1)^2));
		int temp = Double.compare(len1,len2);
		if (temp==0) {
			System.out.println("Both the lines are equal");
		}
		else if (temp < 0){
			System.out.println("Line1 is less than line2");
		}
		else {
			System.out.println("Line1 is greater than line2");
		}
		System.out.println("Length of line1 is "+len1);
		System.out.println("Length of line2 is "+len2);
		obj.close();
	
	}

}
