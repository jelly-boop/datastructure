package stack;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Stack stack=new Stack(7);
		boolean finish=false;
		Scanner scanner=new Scanner(System.in);
		int a=0;
		
		while(!finish) {
			System.out.print("=====(1)push (2)pop (3)search (4)dump (5)clear (6)peak (7)finish====");
			a=scanner.nextInt();
			System.out.println();
			
			switch(a) {
			case 1:
				System.out.println("push 할 데이터: ");
				int n=scanner.nextInt();
				stack.push(n);
				break;
			case 2:
				System.out.println(stack.pop());
				break;
			case 3:
				System.out.println("search 할 데이터: ");
				int n1=scanner.nextInt();
				stack.search(n1);
				break;
			case 4:
				stack.dump();
				break;
			case 5:
				stack.clear();
				break;
			case 6:
				stack.peak();
				break;
			case 7:
				finish=true;
				break;
			}
		}

	}

}
