package claculater;

public class Test3 implements Test1 {

	@Override
	public String t1(int a) {
		// TODO Auto-generated method stub

		return null;
	}

	@Override
	public void t2(int a) {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer t3(Integer b, Integer a, Integer c) {
		// TODO Auto-generated method stub

		Integer re = 0;
		if (b == 1) {
			re = a + c;
			System.out.println(a + "+" + c + "ตัวเลข=  ");
		}
		if (b == 2) {
			re = a - c;
			System.out.println(a + "-" + c + "ตัวเลข=  ");
		}
		if (b == 3) {
			re = a * c;
			System.out.println(a + "*" + c + "ตัวเลข=  ");
		}
		if (b == 4) {

			re = a / c;
			System.out.println(a + "/" + c + "ตัวเลข=  ");
		}
		return re;

	}

}
