package factorial;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("수를 입력하세요: ");
		int n=scanner.nextInt();
		System.out.println(factorail(n));
	}

	private static int factorail(int n) {
		if(n>0) {
			return n*factorail(n-1);
		}
		else {
			return 1;
		}
		
	}

}
