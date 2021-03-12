package test;

public class Task5 {
	public String repeatEnd(String str, int n) {
		StringBuilder res = new StringBuilder();
		String subst = str.substring(str.length() - n, str.length());
		while (n > 0) {
			res.append(subst);
			n--;
		}
		return res.toString();
	}

	public static void main(String[] args) {
		Task5 task = new Task5();
		System.out.println(task.repeatEnd("Hello",2));
	}
}
	


