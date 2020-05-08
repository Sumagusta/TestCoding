package exception;

public class IfElse {
	
	public void kondisi(int angka) {
		if (angka == 1) {
			System.out.println("ini angka 1");
		} else {
			System.out.println("Ini bukan angka 1");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IfElse obj = new IfElse();
		obj.kondisi(1);
		
	}

}
