package inventaris;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IO extends model implements identitas{
	int a,b,steker=0,LCD=0,lampu=0,kipas=0,AC=0,CCTV=0;
	IO inven;
	Scanner in = new Scanner(System.in);
	//control out = new control();
	//private String kondisi_kabelLCD;

	public IO(int jml_steker, String kondisi_steker, String posisi_steker,
	int jml_kabelLCD, String kondisi_kabelL, String posisi_kabelLCD,
	int Jml_lampu, String kondisi_lampu, String posisi_lampu,
	int Jml_kipas, String kondisi_kipas, String posisi_kipas,
	int Jml_AC, String kondisi_AC, String posisi_AC, String bandwitdth,
	String login, int jml_CCTV, String kondisi_CCTV,
	String posisi_CCTV, String kondisi_lantai, String kondisi_dinding,
	String kondisi_atap, String kondisi_pintu, String kondisi_jendela,
	String sirkulasi_udara, float nilai_pencahayaan, float kelembapan,
	float suhu, String kebisingan, String bau, String kebocoran,
	String kerusakan, String keausan, String kekokohan,
	int kunci_pintujendela, String bahaya) {
		super.setJml_steker(jml_steker);
		super.setJml_steker(jml_steker);
		super.setKondisi_steker(kondisi_steker);
		super.setPosisi_steker(posisi_steker);
		super.setJml_kabelLCD(jml_kabelLCD);
		super.setKondisi_kabelLCD(kondisi_kabelL);
		super.setPosisi_kabelLCD(posisi_kabelLCD);
		super.setJml_lampu(Jml_lampu);
		super.setKondisi_lampu(kondisi_lampu);
		super.setPosisi_lampu(posisi_lampu);
		super.setJml_kipas(Jml_kipas);
		super.setKondisi_kipas(kondisi_kipas);
		super.setPosisi_kipas(posisi_kipas);
		super.setJml_AC(Jml_AC);
		super.setKondisi_AC(kondisi_AC);
		super.setPosisi_AC(posisi_AC);
		super.setBandwitdth(bandwitdth);
		super.setLogin(login);
		super.setJml_CCTV(jml_CCTV);
		super.setKondisi_CCTV(kondisi_CCTV);
		super.setPosisi_CCTV(posisi_CCTV);
		super.setKondisi_lantai(kondisi_lantai);
		super.setKondisi_dinding(kondisi_dinding);
		super.setKondisi_atap(kondisi_atap);
		super.setKondisi_pintu(kondisi_pintu);
		super.setKondisi_jendela(kondisi_jendela);
		super.setSirkulasi_udara(sirkulasi_udara);
		super.setNilai_pencahayaan(nilai_pencahayaan);
		super.setKelembapan(kelembapan);
		super.setSuhu(suhu);
		super.setKebisingan(kebisingan);
		super.setBau(bau);
		super.setKebocoran(kebocoran);
		super.setKerusakan(kerusakan);
		super.setKeausan(keausan);
		super.setKekokohan(kekokohan);
		super.setKunci_pintujendela(kunci_pintujendela);
		super.setBahaya(bahaya);
	}
	public IO(double panjang_ruang, double lebar_ruang, int jml_kursi,int jml_pintu, int jml_jendela) {
		super.setPanjang_ruang(panjang_ruang);
		super.setLebar_ruang(lebar_ruang);
		super.setJml_kursi(jml_kursi);
		super.setJml_pintu(jml_pintu);
		super.setJml_jendela(jml_jendela);
		// TODO Auto-generated constructor stub
	}
	public IO(String kondisi_lantai, String kondisi_dinding,
			String kondisi_atap, String kondisi_pintu, String kondisi_jendela) {
		super.setKondisi_lantai(kondisi_lantai);
		super.setKondisi_dinding(kondisi_dinding);
		super.setKondisi_atap(kondisi_atap);
		super.setKondisi_pintu(kondisi_pintu);
		super.setKondisi_jendela(kondisi_jendela);
		// TODO Auto-generated constructor stub
	}
	public IO(String sirkulasi_udara, float nilai_pencahayaan,
			float kelembapan, float suhu) {
		super.setSirkulasi_udara(sirkulasi_udara);
		super.setNilai_pencahayaan(nilai_pencahayaan);
		super.setKelembapan(kelembapan);
		super.setSuhu(suhu);
		// TODO Auto-generated constructor stub
	}
	
	public IO(String kekokohan, int kunci_pintujendela, String bahaya) {
		super.setKekokohan(kekokohan);
		super.setKunci_pintujendela(kunci_pintujendela);
		super.setBahaya(bahaya);
		// TODO Auto-generated constructor stub
	}
	public IO(){
		
	}
	@Override
	public void identitas(){
		System.out.println('\n'+"------------------- IDENTITAS RUANG KELAS --------------------"+'\n');
		Scanner in = new Scanner (System.in);
		System.out.print("Masukkan nama ruang : ");
		setNama_ruang(in.next());
		System.out.print("Masukkan lokasi ruang : ");
		setLokasi_ruang(in.next());
		System.out.print("Masukkan fakultas : ");
		setFakultas(in.next());
	}
	public void inputKondisi_ruang(){
		System.out.println('\n'+"-------------------- KONDISI RUANG KELAS ---------------------"+'\n');
		System.out.print(" Masukkan panjang ruang : ");
		setPanjang_ruang(in.nextDouble());
		System.out.print(" Masukkan lebar ruang : ");
		setLebar_ruang(in.nextDouble());
		System.out.print(" Masukkan jumlah kursi : ");
		setJml_kursi(in.nextInt());
		System.out.print(" Masukkan jumlah pintu : ");
		setJml_pintu(in.nextInt());
		System.out.print(" Masukkan jumlah jendela : ");
		setJml_jendela(in.nextInt());
		inven = new IO(getPanjang_ruang(),getLebar_ruang(),getJml_kursi(),getJml_pintu(),getJml_jendela()); 
		System.out.println("\n========================HASIL ANALISIS========================");
		System.out.println("Luas ruangan : "+super.hitung_luas(getPanjang_ruang(), getLebar_ruang()));
		System.out.println("Bentuk Ruang : "+super.hitung_bentuk(getPanjang_ruang(), getLebar_ruang()));
		if (super.hitung_rasio(getPanjang_ruang(), getLebar_ruang(), getJml_kursi()) >= 0.5) {
			System.out.println("Rasio Luas : "+ super.hitung_rasio(getPanjang_ruang(), getLebar_ruang(), getJml_kursi()) + " [Sesuai]");
		} else {
			System.out.println("Rasio Luas : "+super.hitung_rasio(getPanjang_ruang(), getLebar_ruang(), getJml_kursi()) + " [Tidak sesuai]");
		}
		System.out.println("Pintu dan Jendela : "+super.analisis_pintu_dan_jendela(getJml_pintu(), getJml_jendela()));
	}
	public void inputLingkungan_ruang(){
		System.out.println('\n'+"------------------- LINGKUNGAN RUANG KELAS -------------------"+'\n');
		JOptionPane.showMessageDialog(null, "MASUKKAN KOTOR ATAU BERSIH");
		System.out.print("Masukkan kondisi lantai  : ");
		setKondisi_lantai(in.next());
		System.out.print("Masukkan kondisi dinding  : ");
		setKondisi_dinding(in.next());
		System.out.print("Masukkan kondisi atap  : ");
		setKondisi_atap(in.next());
		System.out.print("Masukkan kondisi pintu  : ");
		setKondisi_pintu(in.next());
		System.out.print("Masukkan kondisi jendela  : ");
		setKondisi_jendela(in.next());
		inven = new IO(getKondisi_lantai(),getKondisi_dinding(),getKondisi_atap(),getKondisi_pintu(),getKondisi_jendela());
		System.out.println("\n========================HASIL ANALISIS========================");
		System.out.println("Kebersihan : "+super.analisis_kebersihan(getKondisi_lantai(), getKondisi_dinding(), getKondisi_atap(), getKondisi_pintu(), getKondisi_jendela()));
	}
	public void inputKebersihan_ruang(){
		System.out.println('\n'+"------------------- KEBERSIHAN RUANG KELAS -------------------"+'\n');
		JOptionPane.showMessageDialog(null, "PILIHAN SIRKULASI UDARA"+'\n'+"a. Lancar"+'\n'+"b. Tidak Lancar");
		System.out.print("Masukkan sirkulasi udara : ");
		setSirkulasi_udara(in.next());
		System.out.print("Masukkan nilai pencahayaan : ");
		setNilai_pencahayaan(in.nextFloat());
		System.out.print("Masukkan kelembapan : ");
		setKelembapan(in.nextFloat());
		System.out.print("Masukkan suhu [celcius] : ");
		setSuhu(in.nextFloat());
		inven = new IO(getSirkulasi_udara(),getNilai_pencahayaan(),getKelembapan(),getSuhu());
		System.out.println("\n========================HASIL ANALISIS========================");
		System.out.println("Sirkulasi Udara : "+super.analisis_sirkulasi_udara(getSirkulasi_udara()));
		System.out.println("Pencahayaan : "+super.analisis_pencahayaan(getNilai_pencahayaan()));
		System.out.println("Kelembapan : "+super.analisis_kelembapan(getKelembapan()));
		System.out.println("Suhu : "+super.analisis_suhu(getKelembapan()));
	}
	public void kenyamanan_ruang(){
		System.out.println('\n'+"------------------- KENYAMANAN RUANG KELAS -------------------"+'\n');
		System.out.print("Masukkan kebisingan [Bising/Tidak] : ");
		setKebisingan(in.next());
		System.out.print("Masukkan bau [Bau/Tidak] : ");
		setBau(in.next());
		System.out.print("Masukkan kebocoran [Bocor/Tidak] : ");
		setKebocoran(in.next());
		System.out.print("Masukkan kerusakan [Rusak/tidak] : ");
		setKerusakan(in.next());
		System.out.print("Masukkan keausan [Aus/tidak] : ");
		setKeausan(in.next());
		inven = new IO(getKebisingan(),getBau(),getKebocoran(),getKerusakan(),getKeausan());
		System.out.println("\n========================HASIL ANALISIS========================");
		System.out.println("Kebisingan : "+super.analisis_kebisingan(getKebisingan()));
		System.out.println("Bau : "+super.analisis_bau(getBau()));
		System.out.println("Kebocoran : "+super.analisis_kebocoran(getKebocoran()));
		System.out.println("Kerusakan : "+super.analisis_kerusakan(getKerusakan()));
		System.out.println("Keausan : "+super.analisis_keausan(getKeausan()));
	}
	public void keamanan_ruang(){
		System.out.println('\n'+"-------------------- KEAMANAN RUANG KELAS --------------------"+'\n');
		JOptionPane.showMessageDialog(null, "MASUKKAN KOKOH ATAU TIDAK");
		System.out.print("Masukkan kekokohan ruang : ");
		setKekokohan(in.next());
		System.out.print("Jumlah kunci pintu : ");
		setKunci_pintujendela(in.nextInt());
		System.out.print("Jumlah kunci jendela : ");
		setKunci_pintujendela(in.nextInt());
		JOptionPane.showMessageDialog(null, "MASUKKAN AMAN ATAU BAHAYA");
		System.out.print("Masukkan bahaya [Aman/Tidak] : ");
		setBahaya(in.next());
		inven = new IO(getKekokohan(),getKunci_pintujendela(),getBahaya());
		System.out.println("\n========================HASIL ANALISIS========================");
		System.out.println("Kekokohan : "+super.analisis_kekokohan(getKekokohan()));
		System.out.println("Kunci Pintu dan Jendela : "+super.analisis_kuncipintu_dan_jendela(getKunci_pintujendela(), getJml_jendela()));
		System.out.println("keamanan Ruang : "+super.analisis_keamanan_ruang(getBahaya()));
	}
	public void jml_kondisi_dan_posisi() {
		
		System.out.print("Masukkan jumlah steker : ");
		setJml_steker(in.nextInt());
		for (a = 0; a < getJml_steker(); a++) {
			b = a + 1;
			System.out.print(" " + b
			+ ". Kondisi steker [Rusak/Baik] : ");
			setKondisi_steker(in.next());
			if (getKondisi_steker().equalsIgnoreCase("baik")) {
				steker++;
			}
		}
		JOptionPane.showMessageDialog(null,"PILIHAN POSISI STEKER \na. Dipojok Ruang & Dekat Dosen \nb. Dipojok Ruang \nc. Dipojok Dekat Pintu \nd. Disamping \ne. Didepan \nf. Dibelakang");
		System.out.print("Pilih posisi steker [ketik huruf] : ");
		setPosisi_steker(in.next());
		System.out.print("\nJumlah kabel LCD : ");
		setJml_kabelLCD(in.nextInt());
		for (a = 0; a < getJml_kabelLCD(); a++) {
			b = a + 1;
			System.out.print(" " + b + ". Kondisi kabel LCD [Berfungsi/Rusak] : ");
			setKondisi_kabelLCD(in.next());
			if (getKondisi_kabelLCD().equalsIgnoreCase("berfungsi")) {
				LCD++;
			}
		
		}
		JOptionPane.showMessageDialog(null,"PILIHAN POSISI KABEL LCD \na. Dekat Dosen \nb. Dekat Pintu");
		System.out.print("Pilih posisi kabel LCD [ketik huruf] : ");
		setPosisi_kabelLCD(in.next());
		System.out.print("\nMasukkan jumlah lampu : ");
		setJml_lampu(in.nextInt());
		for (a = 0; a < getJml_lampu(); a++) {
			b = a + 1;
			System.out.print(" " + b + ". Masukkan kondisi lampu [Rusak/Baik] : ");
			setKondisi_lampu(in.next());
			if (getKondisi_lampu().equalsIgnoreCase("baik")) {
				lampu++;
			}
		}
		JOptionPane.showMessageDialog(null,"PILIHAN POSISI LAMPU \na. Diatap \nb. Dipojok \nc. Disamping \nd. Didepan \ne. Dibelakang");
		System.out.print("Pilih posisi lampu [ketik huruf] : ");
		setPosisi_lampu(in.next());
		System.out.print("\nMasukkan jumlah kipas : ");
		setJml_kipas(in.nextInt());
		for (a = 0; a < getJml_kipas(); a++) {
			b = a + 1;
			System.out.print(" " + b + ". Masukkan kondisi kipas [Rusak/baik] : ");
			setKondisi_kipas(in.next());
			if (getKondisi_kipas().equalsIgnoreCase("baik")) {
				kipas++;
			}
		}
		JOptionPane.showMessageDialog(null,"PILIHAN POSISI KIPAS \na. Diatap \nb. Dipojok \nc. Disamping \nd. Didepan \ne. Dibelakang");
		System.out.print("Pilih posisi kipas [ketik huruf] : ");
		setPosisi_kipas(in.next());
		System.out.print("\nMasukkan jumlah AC : ");
		setJml_AC(in.nextInt());
		for (a = 0; a < getJml_AC(); a++) {
			b = a + 1;
			System.out.print(" " + b + ". Masukkan kondisi AC [Rusak/baik] : ");
			setKondisi_AC(in.next());
			if (getKondisi_AC().equalsIgnoreCase("baik")) {
				AC++;
			}
		}
		JOptionPane.showMessageDialog(null,"PILIHAN POSISI AC \na. Dibelakang \nb. Disamping \nc. Didepan");
		System.out.print("Pilih posisi AC [ketik huruf] : ");
		setPosisi_AC(in.next());
		
		JOptionPane.showMessageDialog(null,"PILIHAN SSID \na. UMMHotspot \nb. Lab.Informatika");
		System.out.print("Pilih bandwidth(SSID) [ketik huruf] : ");
		setBandwitdth(in.next());
		System.out.print("Login [Bisa/Tidak] : ");
		setLogin(in.next());
		
		System.out.print("\nMasukkan jumlah CCTV : ");
		setJml_CCTV(in.nextInt());
		for (a = 0; a < getJml_CCTV(); a++) {
			b = a + 1;
			System.out.print(" " + b + ". Masukkan kondisi CCTV [Rusak/baik] : ");
			setKondisi_CCTV(in.next());
			if (getKondisi_CCTV().equalsIgnoreCase("baik")) {
				CCTV++;
			}
		}
		JOptionPane.showMessageDialog(null,	"PILIHAN POSISI CCTV \na. Depan & Belakang \nb. Belakang saja \nc. Depan saja");
		System.out.print("Pilih posisi CCTV [ketik huruf] : ");
		setPosisi_CCTV(in.next());
		System.out.println("\n========================HASIL ANALISIS========================");
		System.out.println("Kelistrikan : "+super.analisis_kelistrikan(getPosisi_steker(), getJml_steker()));
		System.out.println("LCD : "+super.analisis_LCD(getJml_kabelLCD(), getKondisi_kabelLCD(), getPosisi_kabelLCD()));
		System.out.println("Lampu : "+super.analisis_lampu(getJml_lampu(), getPosisi_lampu()));
		System.out.println("Kipas Angin : "+super.analisis_kipas_angin(getJml_kipas(), getPosisi_kipas()));
		System.out.println("AC : "+super.analisis_AC(getJml_AC(), getPosisi_AC()));
		System.out.println("Internet : "+super.analisis_internet(getBandwitdth(), getLogin()));
		System.out.println("CCTV : "+super.analisis_CCTV(getJml_CCTV(), getPosisi_CCTV()));
	}
	
}
