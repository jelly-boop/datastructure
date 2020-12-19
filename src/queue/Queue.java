package queue;

public class Queue {
	private int max;
	private int front;
	private int rear;
	private int num;
	private int[] que;

	// 실행시 예외: 큐가 비었을 경우
	public class EmptyQueueException extends RuntimeException {
		public EmptyQueueException() {
		}
	}

	// 실행시 예외: 큐가 가득 찼을 경우
	public class OverflowQueueException extends RuntimeException {
		public OverflowQueueException() {
		}
	}

	public Queue(int capacity) {// 생성자
		que = new int[capacity];
		num = front = rear = 0;
		max = capacity;

	}

	public void enque(int x) {// rear에 넣는거임!
		if (num >= max) {
			System.out.println("가득 참!!");
		} else {
			que[rear++] = x;
			num++;
			if (rear == max) {// 꽉 참
				rear = 0;
			}
		}
	}

	public int dequeue() {// front에서 빼는 거임!
		if (num == 0) {
			System.out.println("비었음!!");
			throw new EmptyQueueException();
		} else {
			num--;
			int x = que[front++];
			// 근데 이제 front가 max를 초과하면 안됨
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

	public int indexOf(int x) {// 검색..
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
			System.out.println("큐가 비어있습니다."); 
		} else {
			for (int i = 0; i < num; i++) {
				System.out.print(que[(i + front) % max] + " ");
			}
			System.out.println();
		}

	}

}
