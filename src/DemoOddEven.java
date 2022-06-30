
public class DemoOddEven {

	public static void main(String[] args) {
		int num = 12345;
		int odd_count=0;
		int even_count=0;
		int rem=0;
		
		while(num>0) {
			rem = num % 10;
			if(rem%2 == 0) {
				even_count=even_count+1;
			}else {
				odd_count=odd_count+1;
			}
			num = num/10;
		}
		
		System.out.println(even_count);
		System.out.println(odd_count);

	}

}
