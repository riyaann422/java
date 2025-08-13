package java_project;
import java.util.Scanner;
public class Gradecalculator {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the mark");
		int mark=sc.nextInt();
		if(mark>=90) {
			System.out.println("Grade A");
		}
		else if(mark>=80) {
			System.out.println("Grade B");
			
		}
		else if(mark>=70) {
			System.out.println("Grade c");
			
		}else if (mark>=60) {
			System.out.println("Grade D");
		}
		else
			System.out.println("fail");
	}
	

		
	}

}
