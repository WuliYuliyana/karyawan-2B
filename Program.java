public class Program extends Karyawan{
	public void setGaji(int uang){
		if(uang<=90){
			System.out.println("Selamat Gaji Anda Bulan Ini = "+uang);
		}else{
			System.out.println("Maaf Gaji anda melebihi batas :(");
		}
	}
}