package stack;

public class Stack {
	private int max;// ���ÿ뷮
	private int ptr;// ���� ������
	private int[] stk;// ����

	public Stack(int capacity) {// ���ÿ뷮 �޾ƿ�&���� �ʱ⼳��
		stk = new int[capacity];
		max = capacity;
		ptr = 0;

	}

	public int push(int n) { 
		if(max<=ptr) {
			System.out.println("�뷮 �ʰ�");
			return -1;
		}
		stk[ptr]=n;
		return ptr++;
	}

	public int pop() {
		if(ptr<=0) {
			System.out.println("�� �����Դϴ�.");
			return -1;
		}
		return stk[--ptr];

	}
	public void search(int n) {// �˻�
		boolean find=false;
		int i;
		for(i=0;i<ptr;i++) {
			if(n==stk[i]) {
				find=true;
				
			}
		}
		if(find) {
			System.out.println(i+"��°�� ����");
		}else {
			System.out.println("�˻���� ����");
		}
		
	}

	public void clear() {// �ʱ�ȭ
		ptr=0;
	}

	public void peak() {// ���� �� �����ֱ�
		System.out.println(stk[--ptr]);
	}

	public void dump() {// ������ ��簪 �����ֱ�
		for(int i=0;i<ptr;i++) {
			System.out.print(stk[i]+" ");
			}
		System.out.println();

	}

	

}
