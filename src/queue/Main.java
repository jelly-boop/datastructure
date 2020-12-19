package queue;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Queue q=new Queue(10);
		boolean exit=false;
		Scanner scanner=new Scanner(System.in);
		while(!exit) {
			System.out.println("=====(1)enque (2)deque (3)dump (4)indexOf (5)peak (6)clear (7)exit====");
			int a=scanner.nextInt();
			switch(a) {
			case 1:
				System.out.println("enque할 데이터: ");
				int x=scanner.nextInt();
				q.enque(x);
				break;
			case 2:
				System.out.println(q.dequeue());
				break;
			case 3:
				q.dump();
				break;
			case 4:
				System.out.println("검색 할 데이터: ");
				int x1=scanner.nextInt();
				System.out.println(q.indexOf(x1)+"번째");
				break;
			case 5:
				System.out.println(q.peek());
				break;
				
			case 6: 
				q.clear(); 
				break;
			case 7:
				exit=true;
				break;
			}
		}
		

	}

}
