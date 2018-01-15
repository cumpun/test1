package claculater;

public class Test2 implements Test1 {

	@Override
	public String t1(int a) {
		String result = "";
		if (a >= 80) {
			result = "A";
		} else if (a >= 75) {
			result = "B+";
		} else if (a >= 70) {
			result = "B";
		} else if (a >= 65) {
			result = "C+";
		} else if (a >= 60) {
			result = "C";
		} else if (a >= 55) {
			result = "D+";

		} else if (a >= 50) {

			result = "D";
		}

		return result;
	}

	@Override
	public void t2(int a) {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer t3(Integer a, Integer b, Integer c) {
		// TODO Auto-generated method stub
		return null;
	}

}
