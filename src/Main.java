import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		int[] ArrayA = {1,2,3,4,5};
		
		List<Integer> ArrayB = new ArrayList<Integer>();
		ArrayB.add(1);
		ArrayB.add(3);
		ArrayB.add(5);
		ArrayB.add(7);
		ArrayB.add(9);
		
		ArrayList Result =new ArrayList();
		
		for(int i = 0; i< ArrayA.length; i++) {
			if (ArrayB.contains(ArrayA[i]) && ArrayA[i] != 5) {
				Result.add(ArrayA[i]);
			}
		}
		
		
		System.out.print(Result);
	}

}
