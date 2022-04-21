package java01;

public class StringTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "ABC";
		String s2 = "XYZ";
		System.out.println("문자열 s1은 " + s1 + "입니다."); //ABC
		System.out.println("문자열 s2은 " + s2 + "입니다."); //XYZ
		
		s1 = "FBI"; // 문자열의 내용을 변경하는 것이 아닌 참조 위치를 변경하는 것.
		System.out.println("문자열 s1은 " + s1 + "입니다."); //FBI
		System.out.println("문자열 s2은 " + s2 + "입니다."); //XYZ
		
		s1 = s2;
		System.out.println(s1); //XYZ
		System.out.println(s2); //XYZ
	}

}
