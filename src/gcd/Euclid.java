package gcd;

import java.util.Scanner;

public class Euclid {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Indtast de to tal der skal findes sfd for");
		int r1 = in.nextInt();
		System.out.println("-------");
		int r2 = in.nextInt();
		System.out.println("Indtast det tal ligningen er lig med");
		int x = in.nextInt();
		
		in.close();
		
		Choop choop = new Choop();
		choop.euclidWithSolution(r1, r2, x);
	}
}
