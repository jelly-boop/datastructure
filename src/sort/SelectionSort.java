package sort;

public class SelectionSort {
	static void selectionSort(int[]a, int n) {
		for(int i=0;i<n-1;i++) {
			int min=i; //���� ���ĵ��� ���� �κп��� ���� ���� ����� �ε����� ����Ѵ�.
			for(int j=i+1;j<n;j++) {
				if(a[j]<a[min]) {
					min=j;
					
				}
			}
			swap(a,i,min);
		}
	}

	private static void swap(int[] a, int i, int min) {
		int t=a[i];
		a[i]=a[min];
		a[min]=t;
		
	}

	public static void main(String[] args) {
		int []a= {3,4,2,3,1};
		selectionSort(a,5);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
		

	}

}
