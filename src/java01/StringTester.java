package java01;

public class StringTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "ABC";
		String s2 = "XYZ";
		System.out.println("���ڿ� s1�� " + s1 + "�Դϴ�."); //ABC
		System.out.println("���ڿ� s2�� " + s2 + "�Դϴ�."); //XYZ
		
		s1 = "FBI"; // ���ڿ��� ������ �����ϴ� ���� �ƴ� ���� ��ġ�� �����ϴ� ��.
		System.out.println("���ڿ� s1�� " + s1 + "�Դϴ�."); //FBI
		System.out.println("���ڿ� s2�� " + s2 + "�Դϴ�."); //XYZ
		
		s1 = s2;
		System.out.println(s1); //XYZ
		System.out.println(s2); //XYZ
	}

}
