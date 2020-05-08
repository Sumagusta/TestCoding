package exception;

public class ExceptionHandiling {

	public static void main(String[] args) {
		int[] arrData = {2,4,6,8};
		
		int dataArr = ambilArr(arrData);
		System.out.printf("datanya adalah %d ", dataArr);
		
		int dataArr2=0;
		
		try {
			dataArr2 = comotArr(arrData);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println();
		}
		System.out.printf("data2 nya adalah %d \n", dataArr2);
		
	}
	
	public static int ambilArr(int[] array) {
		int hasil=0;
		
		try {
			hasil = array[2];
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e);
		}
		
		return hasil;
	}
	
	public static int comotArr(int[] arrmeth)throws Exception {
		int hasil = arrmeth[5];
		return hasil;
	}
	
	
}
