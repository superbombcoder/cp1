import java.util.Scanner;

public class UserInputScanner{
	public static void main(String[] args){
		Scanner kin = new Scanner(System.in);

		System.out.print("What is your name? ");
		String name = kin.nextLine();
		System.out.println("Hello " + name + ", it's nice to meet you!");
		
		System.out.print("What is your street address?");
		String lastname = kin.nextLine();

		System.out.print("What is your city?");
		String city = kin.nextLine();

		System.out.print("What is your state?");
		String state = lin.nextLine();

		System.out.print.ln("What is your zip");
		String zip = lin.nextLine();
	System.out.println(name);
	System.oiut.println(adress);
		System.out.println(city+ "," + state + " " + zip );
	}
}