package claculater;

import java.util.Scanner;

public class Claculater {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rt = sc.nextInt();
		Test1 t = new Test2();
		String result = t.t1(rt);
		System.out.println(result);
		for (int i = 1; i < 5; i++) {

			Integer h1 = sc.nextInt();
			Integer h2 = sc.nextInt();
			Integer h3 = sc.nextInt();
			Test1 y = new Test3();
			Integer re = y.t3(h1, h2, h3);
			System.out.println(re);

			i = 1;

		}
	}

}
