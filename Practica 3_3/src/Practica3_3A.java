import java.util.Scanner;

public class Practica3_3A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		System.out.println("Dime un numero");
		input = scanner.nextInt();
		
		for(int i = 1; i<=input; i++) {
			for(int x = 1; x<=input;x++) {
				if (i==1) {
					System.out.print("*");
				}else if(i<input) {
					
					if(x == 1 || x == input) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}else {
					System.out.print("*");
				}
				
			}
			System.out.println("");
		}

	}

}
