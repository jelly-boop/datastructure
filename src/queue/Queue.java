package queue;

public class Queue {
	private int max;
	private int front;
	private int rear;
	private int num;
	private int[] que;

	// ����� ����: ť�� ����� ���
	public class EmptyQueueException extends RuntimeException {
		public EmptyQueueException() {
		}
	}

	// ����� ����: ť�� ���� á�� ���
	public class OverflowQueueException extends RuntimeException {
		public OverflowQueueException() {
		}
	}

	public Queue(int capacity) {// ������
		que = new int[capacity];
		num = front = rear = 0;
		max = capacity;

	}

	public void enque(int x) {// rear�� �ִ°���!
		if (num >= max) {
			System.out.println("���� ��!!");
		} else {
			que[rear++] = x;
			num++;
			if (rear == max) {// �� ��
				rear = 0;
			}
		}
	}

	public int dequeue() {// front���� ���� ����!
		if (num == 0) {
			System.out.println("�����!!");
			throw new EmptyQueueException();
		} else {
			num--;
			int x = que[front++];
			// �ٵ� ���� front�� max�� �ʰ��ϸ� �ȵ�
			if (front == max) {
				front = 0;
			}
			return x;
		}

	}

	public int peek() {
		if (num <= 0) {
			throw new EmptyQueueException();
		}
		return que[front];
	}

	public int indexOf(int x) {// �˻�..
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % max;
			if (que[idx] == x) {
				return idx;
			}
		}
		return -1;
	}

	public void clear() {
		front = rear = num = 0;
	}

	public int capacity() {
		return max;
	}

	public int size() {
		return num;
	}

	public void dump() {// front-->rear
		if (num <= 0) {
			System.out.println("ť�� ����ֽ��ϴ�."); 
		} else {
			for (int i = 0; i < num; i++) {
				System.out.print(que[(i + front) % max] + " ");
			}
			System.out.println();
		}

	}

}
