package polymorphism;

public class Overriding extends Overloading{
	
	public void handphone(String pemilik) {
		System.out.println("Terjual HP merk dan sekarang dimiliki oleh "+pemilik);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overloading ovr = new Overriding();
		ovr.handphone(200000, "Samsung");
		ovr.handphone("SUTANJUNG");
		
	}

}
