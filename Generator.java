import java.util.Scanner;


public class Generator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a;
		
do{
		int length;
		int width;
		int area;
		int perimeter;
		
		Scanner input = new Scanner(System.in);
		
		//Print out Welcome
		System.out.println("Welcome to Grand Circus' Detail Generator");
		
		//Get Length from user
		System.out.println("Enter Length: ");
			length = input.nextInt();
		
		//Get Width from user
		System.out.println("Enter Width: ");
			width = input.nextInt();
			
			
		//Calculate Area
		area = length * width;
		System.out.println("Area: " + area);
		
		//Calculate Perimeter
		perimeter = length + width;
		System.out.println("Perimeter: " + perimeter);
		
		System.out.println("Continue(Y/N)");
		a = input.nextLine();
		a = input.nextLine();
		
		
}
while ( a.equals("Y") || a.equals("y"));

		if(a.equals("N") || a.equals("n")){
			
			System.out.println("Come back soon!");
		}
		
	}

}
