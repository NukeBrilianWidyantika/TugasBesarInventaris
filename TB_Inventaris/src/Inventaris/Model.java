package Inventaris;

public class Model {
	//Identitas Ruang Kelas
	private String nama_ruang;
	private String lokasi_ruang;
	private String fakultas;
	
	//Kondisi Ruang Kelas
	private double panjang_ruang;
	private double lebar_ruang;
	private int jml_kursi;
	private int jml_pintu;
	private int jml_jendela;
	
	//Jumlah, Kondisi, dan Posisi Sarana
	private int jml_steker;
	protected String kondisi_steker;
	private String posisi_steker;
	private int jml_kabel_LCD;
	protected String kondisi_kabel_LCD;
	private String posisi_kabel_LCD;
	private int jml_lampu;
	protected String kondisi_lampu;
	private String posisi_lampu;
	private int jml_kipas;
	protected String kondisi_kipas; 
	private String posisi_kipas;
	private int jml_AC;
	protected String kondisi_AC;
	private String posisi_AC;
	private String login;
	private String bandwidth;
	private int jml_CCTV;
	protected String kondisi_CCTV;
	private String posisi_CCTV;
	
	//Lingkungan Ruang Kelas
	private String kondisi_lantai;
	private String kondisi_dinding;
	private String kondisi_atap;
	private String kondisi_pintu;
	private String kondisi_jendela;
	private String kondisi_kaca_jendela;
	
	//Kebersihan Ruang Kelas
	private String sirkulasi_udara;
	private double nilai_pencahayaan;
	private double kelembapan;
	private double suhu;
	
	//Kenyamanan Ruang Kelas
	private String kebisingan;
	private String bau;
	private String kebocoran;
	private String kerusakan;
	private String keausan;
	
	//Keamanan Ruang Kelas
	private String kekokohan;
	private int jml_kunci_pintu;
	private int jml_kunci_jendela;
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

	public double getpanjang_ruang() {
		return panjang_ruang;
	}

	public double getlebar_ruang() {
		return lebar_ruang;
	}

	public int getjml_kursi() {
		return jml_kursi;
	}

	public int getjml_pintu() {
		return jml_pintu;
	}

	public int getjml_jendela() {
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

	public int getJml_kabel_LCD() {
		return jml_kabel_LCD;
	}

	public String getKondisi_kabel_LCD() {
		return kondisi_kabel_LCD;
	}

	public String getPosisi_kabel_LCD() {
		return posisi_kabel_LCD;
	}

	public int getJml_lampu() {
		return jml_lampu;
	}

	public String getKondisi_lampu() {
		return kondisi_lampu;
	}

	public String getPosisi_lampu() {
		return posisi_lampu;
	}

	public int getJml_kipas() {
		return jml_kipas;
	}

	public String getKondisi_kipas() {
		return kondisi_kipas;
	}

	public String getPosisi_kipas() {
		return posisi_kipas;
	}

	public int getJml_AC() {
		return jml_AC;
	}

	public String getKondisi_AC() {
		return kondisi_AC;
	}

	public String getPosisi_AC() {
		return posisi_AC;
	}

	public String getLogin() {
		return login;
	}

	public String getBandwidth() {
		return bandwidth;
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

	public String getKondisi_kaca_jendela() {
		return kondisi_kaca_jendela;
	}
	
	public String getSirkulasi_udara() {
		return sirkulasi_udara;
	}

	public double getNilai_pencahayaan() {
		return nilai_pencahayaan;
	}

	public double getKelembapan() {
		return kelembapan;
	}

	public double getSuhu() {
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

	public int getJml_kunci_pintu() {
		return jml_kunci_pintu;
	}

	public int getJml_kunci_jendela() {
		return jml_kunci_jendela;
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

	public void setJml_kabel_LCD(int jml_kabel_LCD) {
		this.jml_kabel_LCD = jml_kabel_LCD;
	}

	public void setKondisi_kabel_LCD(String kondisi_kabel_LCD) {
		this.kondisi_kabel_LCD = kondisi_kabel_LCD;
	}

	public void setPosisi_kabel_LCD(String posisi_kabel_LCD) {
		this.posisi_kabel_LCD = posisi_kabel_LCD;
	}

	public void setJml_lampu(int jml_lampu) {
		this.jml_lampu = jml_lampu;
	}

	public void setKondisi_lampu(String kondisi_lampu) {
		this.kondisi_lampu = kondisi_lampu;
	}

	public void setPosisi_lampu(String posisi_lampu) {
		this.posisi_lampu = posisi_lampu;
	}

	public void setJml_kipas(int jml_kipas) {
		this.jml_kipas = jml_kipas;
	}

	public void setKondisi_kipas(String kondisi_kipas) {
		this.kondisi_kipas = kondisi_kipas;
	}

	public void setPosisi_kipas(String posisi_kipas) {
		this.posisi_kipas = posisi_kipas;
	}

	public void setJml_AC(int jml_AC) {
		this.jml_AC = jml_AC;
	}

	public void setKondisi_AC(String kondisi_AC) {
		this.kondisi_AC = kondisi_AC;
	}

	public void setPosisi_AC(String posisi_AC) {
		this.posisi_AC = posisi_AC;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setBandwidth(String bandwidth) {
		this.bandwidth = bandwidth;
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

	public void setKondisi_kaca_jendela(String kondisi_kaca_jendela) {
		this.kondisi_kaca_jendela = kondisi_kaca_jendela;
	}

	public void setSirkulasi_udara(String sirkulasi_udara) {
		this.sirkulasi_udara = sirkulasi_udara;
	}

	public void setNilai_pencahayaan(double nilai_pencahayaan) {
		this.nilai_pencahayaan = nilai_pencahayaan;
	}

	public void setKelembapan(double kelembapan) {
		this.kelembapan = kelembapan;
	}

	public void setSuhu(double suhu) {
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

	public void setJml_kunci_pintu(int jml_kunci_pintu) {
		this.jml_kunci_pintu = jml_kunci_pintu;
	}

	public void setJml_kunci_jendela(int jml_kunci_jendela) {
		this.jml_kunci_jendela = jml_kunci_jendela;
	}

	public void setBahaya(String bahaya) {
		this.bahaya = bahaya;
	}
	
	public Model(String nama_ruang, String lokasi_ruang, String fakultas){
		setNama_ruang (nama_ruang);
		setLokasi_ruang (lokasi_ruang);
		setFakultas (fakultas);
	}
	
	public Model(double panjang_ruang, double lebar_ruang, int jml_kursi, int jml_pintu, int jml_jendela) {
		setPanjang_ruang (panjang_ruang);
		setLebar_ruang (lebar_ruang);
		setJml_kursi (jml_kursi);
		setJml_pintu (jml_pintu);
		setJml_jendela (jml_jendela);
	}
	
	public Model(int jml_steker, String kondisi_steker,
			String posisi_steker, int jml_kabel_LCD,
			String kondisi_kabel_LCD, String posisi_kabel_LCD,
			int jml_lampu, String kondisi_lampu, String posisi_lampu,
			int jml_kipas, String kondisi_kipas,
			String posisi_kipas, int jml_AC, String kondisi_AC,
			String posisi_AC, String login, String bandwidth, int jml_CCTV,
			String kondisi_CCTV, String posisi_CCTV) {
		setJml_steker (jml_steker);
		setKondisi_steker (kondisi_steker);
		setPosisi_steker (posisi_steker);
		setJml_kabel_LCD (jml_kabel_LCD);
		setKondisi_kabel_LCD (kondisi_kabel_LCD);
		setPosisi_kabel_LCD (posisi_kabel_LCD);
		setJml_lampu (jml_lampu);
		setKondisi_lampu (kondisi_lampu);
		setPosisi_lampu (posisi_lampu);
		setJml_kipas (jml_kipas);
		setKondisi_kipas (kondisi_kipas);
		setPosisi_kipas (posisi_kipas);
		setJml_AC (jml_AC);
		setKondisi_AC (kondisi_AC);
		setPosisi_AC (posisi_AC);
		setLogin (login);
		setBandwidth (bandwidth);
		setJml_CCTV (jml_CCTV);
		setKondisi_CCTV (kondisi_CCTV);
		setPosisi_CCTV (posisi_CCTV);
	}

	public Model(String kondisi_lantai, String kondisi_dinding, 
			String kondisi_atap, String kondisi_pintu, String kondisi_jendela, String kondisi_kaca_jendela) {
		setKondisi_lantai  (kondisi_lantai);
		setKondisi_dinding (kondisi_dinding);
		setKondisi_atap (kondisi_atap);
		setKondisi_pintu (kondisi_pintu);
		setKondisi_jendela (kondisi_jendela);
		setKondisi_kaca_jendela (kondisi_kaca_jendela);
	}

	public Model(String sirkulasi_udara, double nilai_pencahayaan, double kelembapan, double suhu) {
		setSirkulasi_udara (sirkulasi_udara);
		setNilai_pencahayaan (nilai_pencahayaan);
		setKelembapan (kelembapan);
		setSuhu (suhu);
	}

	public Model(String kebisingan, String bau, String kebocoran, String kerusakan, String keausan) {
		setKebisingan (kebisingan);
		setBau (bau);
		setKebocoran (kebocoran);
		setKerusakan (kerusakan);
		setKeausan (keausan);
	}

	public Model(String kekokohan, int jml_kunci_pintu, int jml_kunci_jendela, String bahaya) {
		setKekokohan (kekokohan);
		setJml_kunci_pintu (jml_kunci_pintu);
		setJml_kunci_jendela (jml_kunci_jendela);
		setBahaya (bahaya);
	}

	public Model() {
		
	}
	
	/*void kondisi_ruang(){}
	void jumlah_kondisi_dan_posisi_sarana(){}
	void lingkungan_ruang_kelas(){}
	void kebersihan_ruang_kelas(){}
	void kenyamanan_ruang_kelas(){}
	void keamanan_ruang_kelas(){}*/
}
