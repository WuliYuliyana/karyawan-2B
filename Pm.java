public class Pm extends Karyawan{
	public void setGaji(int gaji){
		if(gaji<=100){
			System.out.println("Selamat Gaji Anda Bulan Ini  = "+gaji);
		}else{
			System.out.println("Maaf Gaji anda melebihi batas");
		}
	}
}