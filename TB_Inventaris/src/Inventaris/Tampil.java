package inventaris;


public class tampil {
	public static void main(String[] args){
		IO panggil = new IO();
		//Model a;
		System.out.println("==============================================================");
		System.out.println(" 			INVENTARIS KAMPUS");
		System.out.println("==============================================================");
		panggil.identitas();
		
		panggil.inputKondisi_ruang();
		panggil.jml_kondisi_dan_posisi();
		panggil.inputLingkungan_ruang();
		panggil.inputKebersihan_ruang();
		panggil.kenyamanan_ruang();
		System.out.println("==============================================================");
		}

}
