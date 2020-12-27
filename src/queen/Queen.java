package queen;

public class Queen {
	static boolean[] flagA=new boolean[8];//�� �࿡ ���� ��ġ�ߴ���
	static boolean[] flagB=new boolean[15];// /�밢�� üũ
	static boolean[] flagC=new boolean[15];// \�밢�� üũ
	static int[] pos=new int[8];// �� ���� �� ��ġ

	static int n=0;
	
	private static void set(int i) {
		for(int j=0;j<8;j++) {
			if(flagA[j]==false&&
					flagB[i+j]==false&&
					flagC[i-j+7]==false) {
				pos[i]=j;//���� j�� ��ġ
				if(i==7) {
					print();
				}
				else {
					flagA[j]=flagB[i+j]=flagC[i-j+7]=true;
					set(i+1);
					flagA[j]=flagB[i+j]=flagC[i-j+7]=false;
				}
			}
		}
		
	}
	private static void print() {
		n++;
		for(int i=0;i<8;i++) {
			System.out.printf("%2d",pos[i]);
		}
		System.out.println();
	
	}
	public static void main(String[] args) {
		set(0);
		System.out.println("�� ������: "+n);

	}

	

}
