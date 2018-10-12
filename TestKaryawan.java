public class TestKaryawan{
	public static void main(String[] args) {
	System.out.println("  ");
	System.out.println("Jabatan Project Manager");
	Pm p = new Pm();
	p.setNama("RIZALUDIN");
	p.setAlamat("Indramayu");
	p.setGaji(90);
	System.out.println(" ");

	System.out.println("Jabatan Programmer");
	Program pr = new Program();
	pr.setNama("RIZKAH");
	p.setAlamat("Cirebon");
	p.setGaji(60);
	System.out.println(" ");

	System.out.println("Jabatan Desainer");
	Desain d = new Desain();
	d.setNama("EGGI Fuji Pratama");
	d.setAlamat("Jakarta");
	d.setGaji(50);
	}
}