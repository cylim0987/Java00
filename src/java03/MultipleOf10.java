package java03;

import java.util.Scanner;

public class MultipleOf10 {

	public static void main(String[] args) {
	
	//if�� else if else�� �ڸ��� Ȯ���ϰ� ����ִ��� {}�� ����
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("������: ");
		int x = stdIn.nextInt();
	if(x > 0) {
		
		if(x%10 == 0) { 
			System.out.println("�� ���� 10�� ����̴�");
		}else { 
		System.out.println("�� ���� 10�� ����� �ƴϴ�.");
		}
	}
	else if (x == 0){ 
		System.out.println("�������� 0���� �Է��Ͽ���. ");
	}else {
		System.out.println("�������� ������ �Է���.");
	}
		/* �ȵȴ� �̷��� ���ʿ��� �ɾ���� ��
		}else if(x == 0) {
			System.out.println("0�� ���� �Է��Ͽ���");
		*/	
	}
		
}


