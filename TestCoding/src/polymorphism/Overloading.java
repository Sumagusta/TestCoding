package polymorphism;

public class Overloading {

	public void handphone(int harga, String merk) {
		String Deskripsi = merk+" "+harga;
		System.out.println(Deskripsi);
	}
	
	public void handphone(String toko, String alamat) {
		String Deskripsi = toko+" "+alamat;
		System.out.println(Deskripsi);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading over = new Overloading();
		over.handphone(5000000, "Pocophone F1");
		over.handphone("PStore", "Jakarta");
	}

}
