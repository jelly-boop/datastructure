package sort;

import java.util.Scanner;

public class MergeSort {
	private static void mergeSort(int[]arr) {
		int[]tmp=new int[arr.length];
		mergeSort(arr,tmp,0,arr.length-1);//�迭,�ӽ������,���۰� �� �ε��� �Ѱ���
	}

	private static void mergeSort(int[] arr, int[] tmp, int start, int end) {//����Լ�
		if(start<end) {
			int mid=(start+end)/2;//�迭�� ���
			mergeSort(arr,tmp,start,mid);//�迭 �պκ�
			mergeSort(arr,tmp,mid+1,end);//�迭 �ںκ�
			merge(arr,tmp,start,mid,end);//�迭 ����
		}
		
		
	}

	private static void merge(int[] arr, int[] tmp, int start, int mid, int end) {
		for(int i=start;i<=end;i++) {//�迭 ����
			tmp[i]=arr[i];
		}
		int part1=start;
		int part2=mid+1;
		int index=start;
		while(part1<=mid&&part2<=end) {//�Ѵ� ������ �� ������.
			if(tmp[part1]<=tmp[part2]) {
				arr[index]=tmp[part1];
				part1++;
			}else {
				arr[index]=tmp[part2];
				part2++;
			}
			index++;
			
		}
		for(int i=0;i<=mid-part1;i++) {//�迭�� ������� ���,, 
			 arr[index+i]=tmp[part1+i];//���� �� �ٿ���
			
		}
		
	}
	private static void printArray(int[]arr) {
		for(int data:arr) {
			System.out.print(data+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("��� ��: ");
		int n=scanner.nextInt();
		int[]arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=(int)(Math.random()*100);
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		mergeSort(arr);
		printArray(arr);

	}

}
