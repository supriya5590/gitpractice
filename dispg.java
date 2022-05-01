package day1class;
import java.util.Scanner;

public class dispg {

	public static void main(String[] args) {
		String PName;
		int Price;
		float discount;
		Scanner a = new Scanner(System.in);
		System.out.println("enter a product name");
		PName=a.next();
		System.out.println("enter a product price");
		Price=a.nextInt();
		if(Price>2000)
			discount=(Price*10)/100;
		else
			discount=Price*.07f;
		
			System.out.println(PName+" "+Price+" "+discount);
			System.out.println("amount after discount="+(Price-discount));
}

}
