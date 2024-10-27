package string_;

public class Ex01 {
	public static void main(String[] args) {
		String str1;
		String str2 = new String();
		String str3 = "test";
		String str4 = new String("aaaa");
		// System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		System.out.println("str4 : " + str4);

		str4 = "Kim"; // kim, KIM
		System.out.println(str4.equals("kim"));
		System.out.println(str4.toUpperCase()); // 대문자로 변환
		System.out.println(str4.toLowerCase()); // 소문자로 변환

		String s = str4.toUpperCase();
		// if (s.equals("KIM")) {
		if (str4.toUpperCase().equals("KIM")) {
			System.out.println("김씨!");
		} else {
			System.out.println("아니군");
		}
	}
}