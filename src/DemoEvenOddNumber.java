import java.util.ArrayList;

public class DemoEvenOddNumber {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		ArrayList<Integer> even = new ArrayList<>();
		ArrayList<Integer> odd = new ArrayList<>();

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0 ? even.add(a[i]) : odd.add(a[i]));
		}
		System.out.println("Even elements are => " + even);
		System.out.println("Odd elements are => " + odd);
	}

}
