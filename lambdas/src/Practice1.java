@FunctionalInterface
interface Add {
	int add(int a, int b);
}


class AddImp implements Add {
	
	
	@Override
	public int add(int a, int b) {
		return a + b;
	}
}


public class Practice1 {
	public static void main(String[] args) {
		Add obj = (a,b) -> a + b;
		int result = obj.add(1,2);
		System.out.println(result);
	}
}
