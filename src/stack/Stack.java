package stack;

public class Stack {
	private int max;// 스택용량
	private int ptr;// 스택 포인터
	private int[] stk;// 스택

	public Stack(int capacity) {// 스택용량 받아옴&스택 초기설정
		stk = new int[capacity];
		max = capacity;
		ptr = 0;

	}

	public int push(int n) { 
		if(max<=ptr) {
			System.out.println("용량 초과");
			return -1;
		}
		stk[ptr]=n;
		return ptr++;
	}

	public int pop() {
		if(ptr<=0) {
			System.out.println("빈 스택입니다.");
			return -1;
		}
		return stk[--ptr];

	}
	public void search(int n) {// 검색
		boolean find=false;
		int i;
		for(i=0;i<ptr;i++) {
			if(n==stk[i]) {
				find=true;
				
			}
		}
		if(find) {
			System.out.println(i+"번째에 있음");
		}else {
			System.out.println("검색결과 없음");
		}
		
	}

	public void clear() {// 초기화
		ptr=0;
	}

	public void peak() {// 팝할 값 보여주기
		System.out.println(stk[--ptr]);
	}

	public void dump() {// 스택의 모든값 보여주기
		for(int i=0;i<ptr;i++) {
			System.out.print(stk[i]+" ");
			}
		System.out.println();

	}

	

}
