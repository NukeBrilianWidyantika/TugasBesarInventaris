package inventaris;

//import java.util.Scanner;

abstract public class model {
	//Scanner in = new Scanner(System.in);
	String hasil;
	int i,r,LCD=0,AC=0,lampu=0, kipas=0,steker=0,CCTV=0;
	private String nama_ruang;
	private String lokasi_ruang;
	private String fakultas;
	private double panjang_ruang;
	private double lebar_ruang;
	private int jml_kursi;
	private int jml_pintu;
	private int jml_jendela;
	private int jml_steker;
	private String kondisi_steker;
	private String posisi_steker;
	private int jml_kabelLCD;
	private String kondisi_kabelLCD;
	private String posisi_kabelLCD;
	private int Jml_lampu;
	private String kondisi_lampu;
	private String posisi_lampu;
	private int Jml_kipas;
	private String kondisi_kipas;
	private String posisi_kipas;
	private int Jml_AC;
	private String kondisi_AC;
	private String posisi_AC;
	private String bandwitdth;
	private String login;
	private int jml_CCTV;
	private String kondisi_CCTV;
	private String posisi_CCTV;
	private String kondisi_lantai;
	private String kondisi_dinding;
	private String kondisi_atap;
	private String kondisi_pintu;
	private String kondisi_jendela;
	private String sirkulasi_udara;
	private float nilai_pencahayaan;
	private float kelembapan;
	private float suhu;
	private String kebisingan;
	private String bau;
	private String kebocoran;
	private String kerusakan;
	private String keausan;
	private String kekokohan;
	private int kunci_pintujendela;
	private String bahaya;
	
	
	public String getNama_ruang() {
	return nama_ruang;
	}
	public String getLokasi_ruang() {
	return lokasi_ruang;
	}
	public String getFakultas() {
	return fakultas;
	}
	public double getPanjang_ruang() {
	return panjang_ruang;
	}
	public double getLebar_ruang() {
	return lebar_ruang;
	}
	public int getJml_kursi() {
	return jml_kursi;
	}
	public int getJml_pintu() {
	return jml_pintu;
	}
	public int getJml_jendela() {
	return jml_jendela;
	}
	public int getJml_steker() {
	return jml_steker;
	}
	public String getKondisi_steker() {
	return kondisi_steker;
	}
	public String getPosisi_steker() {
	return posisi_steker;
	}
	public int getJml_kabelLCD() {
	return jml_kabelLCD;
	}
	public String getKondisi_kabelLCD() {
	return kondisi_kabelLCD;
	}
	public String getPosisi_kabelLCD() {
	return posisi_kabelLCD;
	}
	public int getJml_lampu() {
	return Jml_lampu;
	}
	public String getKondisi_lampu() {
	return kondisi_lampu;
	}
	public String getPosisi_lampu() {
	return posisi_lampu;
	}
	public int getJml_kipas() {
	return Jml_kipas;
	}
	public String getKondisi_kipas() {
	return kondisi_kipas;
	}
	public String getPosisi_kipas() {
	return posisi_kipas;
	}
	public int getJml_AC() {
	return Jml_AC;
	}
	public String getKondisi_AC() {
	return kondisi_AC;
	}
	public String getPosisi_AC() {
	return posisi_AC;
	}
	public String getBandwitdth() {
	return bandwitdth;
	}
	public int getJml_CCTV() {
	return jml_CCTV;
	}
	public String getKondisi_CCTV() {
	return kondisi_CCTV;
	}
	public String getPosisi_CCTV() {
	return posisi_CCTV;
	}
	public String getKondisi_lantai() {
	return kondisi_lantai;
	}
	public String getKondisi_dinding() {
	return kondisi_dinding;
	}
	public String getKondisi_atap() {
	return kondisi_atap;
	}
	public String getKondisi_pintu() {
	return kondisi_pintu;
	}
	public String getKondisi_jendela() {
	return kondisi_jendela;
	}
	public String getSirkulasi_udara() {
	return sirkulasi_udara;
	}
	public float getNilai_pencahayaan() {
	return nilai_pencahayaan;
	}
	public float getKelembapan() {
	return kelembapan;
	}
	public float getSuhu() {
	return suhu;
	}
	public String getKebisingan() {
	return kebisingan;
	}
	public String getBau() {
	return bau;
	}
	public String getKebocoran() {
	return kebocoran;
	}
	public String getKerusakan() {
	return kerusakan;
	}
	public String getKeausan() {
	return keausan;
	}
	public String getKekokohan() {
	return kekokohan;
	}
	public String getBahaya() {
	return bahaya;
	}
	public void setNama_ruang(String nama_ruang) {
	this.nama_ruang = nama_ruang;
	}
	public void setLokasi_ruang(String lokasi_ruang) {
	this.lokasi_ruang = lokasi_ruang;
	}
	public void setFakultas(String fakultas) {
	this.fakultas = fakultas;
	}
	public void setPanjang_ruang(double panjang_ruang) {
	this.panjang_ruang = panjang_ruang;
	}
	public void setLebar_ruang(double lebar_ruang) {
	this.lebar_ruang = lebar_ruang;
	}
	public void setJml_kursi(int jml_kursi) {
	this.jml_kursi = jml_kursi;
	}
	public void setJml_pintu(int jml_pintu) {
	this.jml_pintu = jml_pintu;
	}
	public void setJml_jendela(int jml_jendela) {
	this.jml_jendela = jml_jendela;
	}
	public void setJml_steker(int jml_steker) {
	this.jml_steker = jml_steker;
	}
	public void setKondisi_steker(String kondisi_steker) {
	this.kondisi_steker = kondisi_steker;
	}
	public void setPosisi_steker(String posisi_steker) {
	this.posisi_steker = posisi_steker;
	}
	public void setJml_kabelLCD(int jml_kabelLCD) {
	this.jml_kabelLCD = jml_kabelLCD;
	}
	public void setKondisi_kabelLCD(String kondisi_kabelLCD) {
	this.kondisi_kabelLCD = kondisi_kabelLCD;
	}
	public void setPosisi_kabelLCD(String posisi_kabelLCD) {
	this.posisi_kabelLCD = posisi_kabelLCD;
	}
	public void setJml_lampu(int jml_lampu) {
	Jml_lampu = jml_lampu;
	}
	public void setKondisi_lampu(String kondisi_lampu) {
	this.kondisi_lampu = kondisi_lampu;
	}
	public void setPosisi_lampu(String posisi_lampu) {
	this.posisi_lampu = posisi_lampu;
	}
	public void setJml_kipas(int jml_kipas) {
	Jml_kipas = jml_kipas;
	}
	public void setKondisi_kipas(String kondisi_kipas) {
	this.kondisi_kipas = kondisi_kipas;
	}
	public void setPosisi_kipas(String posisi_kipas) {
	this.posisi_kipas = posisi_kipas;
	}
	public void setJml_AC(int jml_AC) {
	Jml_AC = jml_AC;
	}
	public void setKondisi_AC(String kondisi_AC) {
	this.kondisi_AC = kondisi_AC;
	}
	public void setPosisi_AC(String posisi_AC) {
	this.posisi_AC = posisi_AC;
	}
	public void setBandwitdth(String bandwitdth) {
	this.bandwitdth = bandwitdth;
	}
	public void setJml_CCTV(int jml_CCTV) {
	this.jml_CCTV = jml_CCTV;
	}
	public void setKondisi_CCTV(String kondisi_CCTV) {
	this.kondisi_CCTV = kondisi_CCTV;
	}
	public void setPosisi_CCTV(String posisi_CCTV) {
	this.posisi_CCTV = posisi_CCTV;
	}
	public void setKondisi_lantai(String kondisi_lantai) {
	this.kondisi_lantai = kondisi_lantai;
	}
	public void setKondisi_dinding(String kondisi_dinding) {
	this.kondisi_dinding = kondisi_dinding;
	}
	public void setKondisi_atap(String kondisi_atap) {
	this.kondisi_atap = kondisi_atap;
	}
	public void setKondisi_pintu(String kondisi_pintu) {
	this.kondisi_pintu = kondisi_pintu;
	}
	public void setKondisi_jendela(String kondisi_jendela) {
	this.kondisi_jendela = kondisi_jendela;
	}
	public void setSirkulasi_udara(String sirkulasi_udara) {
	this.sirkulasi_udara = sirkulasi_udara;
	}
	public void setNilai_pencahayaan(float nilai_pencahayaan) {
	this.nilai_pencahayaan = nilai_pencahayaan;
	}
	public void setKelembapan(float kelembapan) {
	this.kelembapan = kelembapan;
	}
	public void setSuhu(float suhu) {
	this.suhu = suhu;
	}
	public void setKebisingan(String kebisingan) {
	this.kebisingan = kebisingan;
	}
	public void setBau(String bau) {
	this.bau = bau;
	}
	public void setKebocoran(String kebocoran) {
	this.kebocoran = kebocoran;
	}
	public void setKerusakan(String kerusakan) {
	this.kerusakan = kerusakan;
	}
	public void setKeausan(String keausan) {
	this.keausan = keausan;
	}
	public void setKekokohan(String kekokohan) {
	this.kekokohan = kekokohan;
	}
	public void setBahaya(String bahaya) {
	this.bahaya = bahaya;
	}
	public String getLogin() {
	return login;
	}
	public void setLogin(String login) {
	this.login = login;
	}
	public int getKunci_pintujendela() {
		return kunci_pintujendela;
	}
	public void setKunci_pintujendela(int kunci_pintujendela) {
		this.kunci_pintujendela = kunci_pintujendela;
	}
	double hitung_luas(double panjang_ruang,double lebar_ruang) {
		return panjang_ruang*lebar_ruang;
	}
	double hitung_rasio(double panjang_ruang,double lebar_ruang,int jml_kursi){
		return hitung_luas(panjang_ruang, lebar_ruang)/jml_kursi;
	}
	//abstract void identitas();
	String hitung_bentuk(double panjang_ruang,double lebar_ruang){
		if(panjang_ruang==lebar_ruang){
			hasil="Ruangan Tidak Sesuai";
		}else
			hasil="Ruangan Sesuai";
		return hasil;
		
	}

	String analisis_pintu_dan_jendela(int jml_pintu,int jml_jendela) {
		if (jml_pintu >= 2 && jml_jendela >=2) {
			hasil ="Sesuai";
		} else
			hasil = "Tidak sesuai";
		
		return hasil;
	}
	
	String analisis_kelistrikan(String posisi_steker,int jml_steker){
		if(posisi_steker.equalsIgnoreCase("a") && jml_steker>= 4 && steker == 4 ){
			hasil = "Sesuai";
		}else
			hasil = "Tidak sesuai";
		
		return hasil;
	}
	String analisis_LCD(int jml_kabelLCD, String kondisi_kabelLCD,String posisi_kabelLCD){
		if(jml_kabelLCD>= 1 && kondisi_kabelLCD.equalsIgnoreCase("berfungsi") && posisi_kabelLCD.equalsIgnoreCase("a")){
			hasil = "Sesuai";
		}else
			hasil = "Tidak sesuai";
		
		return hasil;
	}
	String analisis_lampu(int jml_lampu,String posisi_lampu){
		if(jml_lampu >= 18 && lampu == 18 && posisi_lampu.equalsIgnoreCase("a")){
			hasil = "Sesuai";
		}else
			hasil = "Tidak sesuai";
		
		return hasil;
	}
	String analisis_kipas_angin(int jml_kipas,String posisi_kipas){
		if(jml_kipas >= 2 && kipas ==2 && posisi_kipas.equalsIgnoreCase("a") ){
			hasil = "Sesuai";
		}else
			hasil = "Tidak sesuai";
		
		return hasil;
	}
	String analisis_AC(int jml_AC,String posisi_AC){
		if(jml_AC >= 1 && AC>=1 && posisi_AC.equalsIgnoreCase("a") && posisi_AC.equalsIgnoreCase("b")){
			hasil = "Sesuai";
		}else
			hasil = "Tidak sesuai";
		
		return hasil;
	}
	String analisis_internet(String bandwidth,String login){
		if(bandwidth.equalsIgnoreCase("a") && login.equalsIgnoreCase("baik")){
			hasil = "Sesuai";
		}else
			hasil = "Tidak sesuai";
		
		return hasil;
	}
	String analisis_CCTV(int jml_CCTV,String posisi_CCTV){
		if(jml_CCTV == 2 && CCTV==2 && posisi_CCTV.equalsIgnoreCase("a")){
			hasil = "Sesuai";
		}else
			hasil = "Tidak sesuai";
		
		return hasil;
	}
	String analisis_kebersihan(String kondisi_lantai,String kondisi_dinding,String kondisi_atap,String kondisi_pintu,String kondisi_jendela) {
		if (kondisi_lantai.equalsIgnoreCase("bersih")&& kondisi_dinding.equalsIgnoreCase("bersih")&& kondisi_atap.equalsIgnoreCase("bersih")
		&& kondisi_pintu.equalsIgnoreCase("bersih")&& kondisi_jendela.equalsIgnoreCase("bersih")) {
			hasil = "Sesuai";
		} else 
			hasil = "Tidak sesuai";
		
		return hasil;
	}
	String analisis_sirkulasi_udara(String sirkulasi_udara){
		if(sirkulasi_udara.equalsIgnoreCase("a")){
			hasil = "Sesuai";
		}else
			hasil = "Tidak sesuai";
		
		return hasil;
	}
	String analisis_pencahayaan(float nilai_pencahayaan){
		if(250>=nilai_pencahayaan && nilai_pencahayaan>=350){
			hasil = "Sesuai";
		}else	
			hasil = "Tidak sesuai";
		
		return hasil;
	}
	String analisis_kelembapan(float kelembapan){
		if(70>=kelembapan && kelembapan<=80){
			hasil = "Sesuai";
		}else
			hasil = "Tidak sesuai";
		
		return hasil;
	}
	String analisis_suhu(float kelembapan){
		if(25>=kelembapan && kelembapan<=35){
			hasil = "Sesuai";
		}else
			hasil = "Tidak sesuai";
		
		return hasil;
	}
	
	public String analisis_kebisingan(String kebisingan) {
		if ("tidak bising".equals(kebisingan)) {
			hasil="Sesuai";
		} else 
			hasil="tidak sesuai";
		return hasil;
	}
	String analisis_bau(String bau){
		if(bau.equalsIgnoreCase("tidak")){
			hasil = "Sesuai";
		}else
			hasil = "Tidak sesuai";
		
		return hasil;
	}
	String analisis_kebocoran(String kebocoran){
		if(kebocoran.equalsIgnoreCase("tidak")){
			hasil = "Sesuai";
		}else
			hasil = "Tidak sesuai";
		
		return hasil;
	}
	String analisis_kerusakan(String kerusakan){
		if(kerusakan.equalsIgnoreCase("tidak")){
			hasil = "Sesuai";
		}else
			hasil = "Tidak sesuai";
		
		return hasil;
	}
	String analisis_keausan(String keausan){
		if(keausan.equalsIgnoreCase("tidak")){
			hasil = "Sesuai";
		}else
			hasil = "Tidak sesuai";
		
		return hasil;
	}
	String analisis_kekokohan(String kekokohan) {
		if (kekokohan.equalsIgnoreCase("kokoh")) {
			hasil = "Sesuai";
		} else 
			hasil = "Tidak sesuai";
		
		return hasil;
	}
	String analisis_kuncipintu_dan_jendela(int kunci_pintujendela,int jml_jendela) {
		if (kunci_pintujendela != 0 && jml_jendela != 0) {
			hasil = "Sesuai";
		} else 
			hasil = "Tidak sesuai";
		
		return hasil;
	}
	String analisis_keamanan_ruang(String bahaya) {
		if (bahaya.equalsIgnoreCase("aman")) {
			hasil = "Sesuai";
		} else 
			hasil = "Tidak sesuai";
		
		return hasil;
	}

}
