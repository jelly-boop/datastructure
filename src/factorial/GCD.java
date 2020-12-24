package factorial;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("두 수를 입력하세요");
		
		int n1=scanner.nextInt();
		int n2=scanner.nextInt();
		System.out.println("최대 공약수는 "+gcd(n1,n2));

	}

	private static int  gcd(int n1, int n2) {
		if(n2==0) {
			return n1;
		}else {
			return gcd(n2,n1%n2);
		}
		
	}

}
