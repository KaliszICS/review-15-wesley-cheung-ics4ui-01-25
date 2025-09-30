public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(goodString("pqr"));
	}
	public static int goodString(String input) {
		int min = 10000;
		for (int i = 0;i<input.length();i++) {
			int get = input.charAt(i);
			for(int j = 0;j<(input.length()-i);j++) {
				if((input.charAt(input.length()-1-j))==(get) && input.length()-j-i>=2) {
					min = Math.min(min, i+j);
				}
			}
		}
		if (min == 10000) {
			return -1;
		} else {
			return min;
		}
	}

}
