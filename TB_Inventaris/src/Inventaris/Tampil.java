package Inventaris;


public class Tampil {
	public static void main(String[] args){
		IO call1 = new IO();
		
		System.out.println("==============================================================");
		System.out.println("                      INVENTARIS KAMPUS");
		System.out.println("==============================================================");
		call1.identitas_ruang_kelas();
		call1.kondisi_ruang();
		call1.jumlah_kondisi_dan_posisi_sarana();
		call1.lingkungan_ruang_kelas();
		call1.kebersihan_ruang_kelas();
		call1.kenyamanan_ruang_kelas();
		call1.keamanan_ruang_kelas();
		
		System.out.println("\n========================HASIL ANALISIS========================");
		call1.tampil();
		System.out.println("==============================================================");
	}
}
