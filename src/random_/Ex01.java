package random_;

import java.util.Random;

public class Ex01 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println(Math.random());
		}
		System.out.println("-------------------");
		for (int i = 0; i < 5; i++) {
			double dou = Math.random() * 3;
			System.out.println((int) dou);
		}
		System.out.println("-------------------");
		Random ran = new Random();
		for (int i = 0; i < 5; i++) {
			int r = ran.nextInt(3); // 0~2
			System.out.println(r + 10);
		}
	}
}