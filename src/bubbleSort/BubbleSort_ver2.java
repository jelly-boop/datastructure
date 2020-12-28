package bubbleSort;

import java.util.Scanner;

public class BubbleSort_ver2 {
	
	
	private static void bubbleSort(int[] a, int n) {
		int k=0;//a[k]���� ������ ������ ��ģ ����
		while(k<n-1) {
			int last=n-1;//���������� ��Ҹ� ��ȯ�� ��ġ
			for(int j=n-1;j>k;j--) {
				if(a[j-1]>a[j]) {
					swap(a,j-1,j);
					last=j;
				}
			}
			k=last;
		}
		
	}

	private static void swap(int[] a, int i, int j) {
		int t=a[i];
		a[i]=a[j];
		a[j]=t;
		
	}

	public static void main(String[] args) {
		// ��ȯȸ��0�ϰ��&���ʿ��� ��ȯȸ��0�ϰ�� ����
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("==���� ���� ����2==");
		System.out.println("��� ��: ");
		int n=scanner.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=(int)(Math.random()*100);
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		bubbleSort(a,n);
		System.out.println("::���� �������� ����::");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}

	}

	

}
