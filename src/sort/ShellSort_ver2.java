package sort;

import java.util.Scanner;

public class ShellSort_ver2 {
	
	private static void shellSort(int[] a, int n) {
		int h;
		for(h=1;h<n/9; h=h*3+1) 
			;
		for(; h>0;h/=3) {
			for (int i=h;i<n; i++) {
				int j;
				int tmp=a[i];
				for(j=i-h;j>=0&&a[j]>tmp;j-=h) {
					a[j+h]=a[j];
				}
				a[j+h]=tmp;
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("¿ä¼Ú ¼ö: ");
		int n=scanner.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=(int)(Math.random()*100);
			System.out.print(a[i]+" ");
		}
		System.out.println();
		shellSort(a,n);
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}

	}

	

}
