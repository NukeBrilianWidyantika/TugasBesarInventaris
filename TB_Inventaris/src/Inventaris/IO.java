package Inventaris;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IO extends Super implements Interface {
	    Scanner in = new Scanner(System.in);
	    Model call1;
	    Control call2 = new Control();
	    int a,b, steker=0, LCD=0, lampu=0, kipas= 0, AC=0, CCTV=0;
	    
	    @Override
	   public void identitas_ruang_kelas() {
	    	System.out.println('\n'+"------------------- IDENTITAS RUANG KELAS --------------------"+'\n');
			System.out.print("Masukkan nama ruang            : ");
			call1.setNama_ruang (in.next());
			System.out.print("Masukkan lokasi ruang          : ");
			call1.setLokasi_ruang (in.next());
			System.out.print("Masukkan fakultas              : ");
			call1.setFakultas (in.next());
			
			call1 = new Model(call1.getNama_ruang(), call1.getLokasi_ruang(), call1.getFakultas());
	    }
	    
	    
	    
	    @Override
	    public void kondisi_ruang(){
	    	System.out.println('\n'+"-------------------- KONDISI RUANG KELAS ---------------------"+'\n');
	    	System.out.print("Masukkan panjang ruang         : ");
	    	call1.setPanjang_ruang (in.nextDouble());
	    	System.out.print("Masukkan lebar ruang           : ");
	    	call1.setLebar_ruang (in.nextDouble());
	    	System.out.print("Masukkan jumlah kursi          : ");
	    	call1.setJml_kursi (in.nextInt());
	    	System.out.print("Masukkan jumlah pintu          : ");
	    	call1.setJml_pintu (in.nextInt());
	    	System.out.print("Masukkan jumlah jendela        : ");
	    	call1.setJml_jendela (in.nextInt());
	    	
	    	call1 = new Model(call1.getpanjang_ruang(), call1.getlebar_ruang(), call1.getjml_kursi(), call1.getjml_pintu(), call1.getjml_jendela());
	    }
	    
	    
	    @Override
	    public void jumlah_kondisi_dan_posisi_sarana(){
	    	System.out.println("\n----------- JUMLAH, KONDISI DAN POSISI RUANG KELAS -----------\n");
	    //STEKER.....................................................................................
			System.out.print("Masukkan jumlah steker                   : ");
			call1.setJml_steker (in.nextInt());
			for(a=0; a <call1.getJml_steker(); a++){
				b=a+1;                                                    
				System.out.print("  "+b+". Kondisi steker         [Rusak/Baik] : ");
				call1.setKondisi_steker (in.next());
				if(call1.getKondisi_steker().equalsIgnoreCase("baik")){
					steker++;
				}
			}
			JOptionPane.showMessageDialog(null, "PILIHAN POSISI STEKER \na. Dipojok Ruang & Dekat Dosen \nb. Dipojok Ruang \nc. Dipojok Dekat Pintu \nd. Disamping \ne. Didepan \nf. Dibelakang");
			System.out.print("Pilih posisi steker        [ketik huruf] : ");
			call1.setPosisi_steker (in.next());                       
			
			
		//LCD.......................................................................................
			System.out.print("\nJumlah kabel LCD                         : ");
			call1.setJml_kabel_LCD (in.nextInt());
			for(a=0; a <call1.getJml_kabel_LCD(); a++){
				b=a+1;
				System.out.print("  "+b+". Kondisi kabel LCD [Berfungsi/Rusak] : ");
				call1.setKondisi_kabel_LCD (in.next());
				if(call1.getKondisi_kabel_LCD().equalsIgnoreCase("berfungsi")){
					LCD++;
				}
			}
			JOptionPane.showMessageDialog(null,"PILIHAN POSISI KABEL LCD \na. Dekat Dosen \nb. Dekat Pintu");
			System.out.print("Pilih posisi kabel LCD     [ketik huruf] : ");
			call1.setPosisi_kabel_LCD (in.next());
			
			
		//LAMPU.....................................................................................
			System.out.print("\nMasukkan jumlah lampu                    : ");
			call1.setJml_lampu (in.nextInt());
			for(a=0; a <call1.getJml_lampu(); a++){
				b=a+1;
				System.out.print("  "+b+". Masukkan kondisi lampu [Rusak/Baik] : ");
				call1.setKondisi_lampu (in.next());
				if(call1.getKondisi_lampu().equalsIgnoreCase("baik")){
					lampu++;
				}
			}
			JOptionPane.showMessageDialog(null,"PILIHAN POSISI LAMPU \na. Diatap \nb. Dipojok \nc. Disamping \nd. Didepan \ne. Dibelakang");
			System.out.print("Pilih posisi lampu         [ketik huruf] : ");
			call1.setPosisi_lampu (in.next());
			
			
		//KIPAS.....................................................................................
			System.out.print("\nMasukkan jumlah kipas                    : ");
			call1.setJml_kipas (in.nextInt());
			for(a=0; a <call1.getJml_kipas(); a++){
				b=a+1;
				System.out.print("  "+b+". Masukkan kondisi kipas [Rusak/baik] : ");
				call1.setKondisi_kipas (in.next());
				if(call1.getKondisi_kipas().equalsIgnoreCase("baik")){
					kipas++;
				}
			}
			JOptionPane.showMessageDialog(null,"PILIHAN POSISI KIPAS \na. Diatap \nb. Dipojok \nc. Disamping \nd. Didepan \ne. Dibelakang");
			System.out.print("Pilih posisi kipas         [ketik huruf] : ");
			call1.setPosisi_kipas (in.next());
			
			
		//AC........................................................................................
			System.out.print("\nMasukkan jumlah AC                       : ");
			call1.setJml_AC (in.nextInt());
			for(a=0; a <call1.getJml_AC(); a++){
				b=a+1;                                                    
				System.out.print("  "+b+". Masukkan kondisi AC    [Rusak/baik] : ");
				call1.setKondisi_AC (in.next());
				if(call1.getKondisi_AC().equalsIgnoreCase("baik")){
					AC++;
				}
			}
			JOptionPane.showMessageDialog(null,"PILIHAN POSISI AC \na. Dibelakang \nb. Disamping \nc. Didepan");
			System.out.print("Pilih posisi AC            [ketik huruf] : ");
			call1.setPosisi_AC (in.next());
			
			
		//SSDID.....................................................................................
			JOptionPane.showMessageDialog(null,"PILIHAN SSID \na. UMMHotspot \nb. Lab.Informatika");
			System.out.print("Pilih bandwidth(SSID)      [ketik huruf] : ");
			call1.setBandwidth (in.next());
			System.out.print("Login                       [Bisa/Tidak] : ");
			call1.setLogin (in.next());
			
		
		//CCTV......................................................................................
			System.out.print("\nMasukkan jumlah CCTV                     : ");
			call1.setJml_CCTV (in.nextInt());
			for(a=0; a <call1.getJml_CCTV(); a++){
				b=a+1;
				System.out.print("  "+b+". Masukkan kondisi CCTV  [Rusak/baik] : ");
				call1.setKondisi_CCTV (in.next());
				if(call1.getKondisi_CCTV().equalsIgnoreCase("baik")){
					CCTV++;
				}
			}
			JOptionPane.showMessageDialog(null,"PILIHAN POSISI CCTV \na. Depan & Belakang \nb. Belakang saja \nc. Depan saja");
			System.out.print("Pilih posisi CCTV          [ketik huruf] : ");
			call1.setPosisi_CCTV (in.next()); 
	    
			call1 = new Model(call1.getJml_steker(),call1.getKondisi_steker(),call1.getPosisi_steker(),call1.getJml_kabel_LCD(),
					call1.getKondisi_kabel_LCD(),call1.getPosisi_kabel_LCD(),call1.getJml_lampu(),call1.getKondisi_lampu(),call1.getPosisi_lampu(),
					call1.getJml_kipas(),call1.getKondisi_kipas(),call1.getPosisi_kipas(),call1.getJml_AC(),call1.getKondisi_AC(),
					call1.getPosisi_AC(),call1.getLogin(),call1.getBandwidth(), call1.getJml_CCTV(),call1.getKondisi_CCTV(),call1.getPosisi_CCTV());
	    }
	    
	    
	    @Override
	    public void lingkungan_ruang_kelas(){
	    	System.out.println('\n'+"------------------- LINGKUNGAN RUANG KELAS -------------------"+'\n');
			JOptionPane.showMessageDialog(null, "Masukkan Bersih atau kotor");
			System.out.print("Masukkan kondisi lantai        : ");
			call1.setKondisi_lantai (in.next());
			System.out.print("Masukkan kondisi dinding       : ");
			call1.setKondisi_dinding (in.next());
			System.out.print("Masukkan kondisi atap          : ");
			call1.setKondisi_atap (in.next());
			System.out.print("Masukkan kondisi pintu         : ");
			call1.setKondisi_pintu (in.next());
			System.out.print("Masukkan kondisi jendela       : ");
			call1.setKondisi_jendela (in.next());
			System.out.print("Masukkan kondisi jendela       : ");
			call1.setKondisi_kaca_jendela (in.next());
			
			call1 = new Model(call1.getKondisi_lantai(), call1.getKondisi_dinding(), 
					call1.getKondisi_atap(), call1.getKondisi_pintu(), call1.getKondisi_jendela(), call1.getKondisi_kaca_jendela());
	    }	    
	    
	    @Override
	    public void kebersihan_ruang_kelas(){
	    	System.out.println('\n'+"------------------- KEBERSIHAN RUANG KELAS -------------------"+'\n');
			JOptionPane.showMessageDialog(null,"PILIHAN SIRKULASI UDARA"+'\n'+"a. Lancar"+'\n'+"b. Tidak Lancar");
			System.out.print("Masukkan sirkulasi udara       : ");
			call1.setSirkulasi_udara (in.next());
			System.out.print("Masukkan nilai pencahayaan     : ");
			call1.setNilai_pencahayaan (in.nextInt());
			System.out.print("Masukkan kelembapan            : ");
			call1.setKelembapan (in.nextInt());
			System.out.print("Masukkan suhu [celcius]        : ");
			call1.setSuhu (in.nextInt());
			
			call1 = new Model(call1.getSirkulasi_udara(), call1.getNilai_pencahayaan(), call1.getKelembapan(), call1.getSuhu());
	    }
	    
	    @Override
	    public void kenyamanan_ruang_kelas(){
	    	System.out.println('\n'+"------------------- KENYAMANAN RUANG KELAS -------------------"+'\n');
			System.out.print("Masukkan kebisingan [Bising/Tidak] : ");
			call1.setKebisingan (in.next());
			System.out.print("Masukkan bau           [Bau/Tidak] : ");
			call1.setBau (in.next());
			System.out.print("Masukkan kebocoran   [Bocor/Tidak] : ");
			call1.setKebocoran (in.next());
			System.out.print("Masukkan kerusakan   [Rusak/tidak] : ");
			call1.setKerusakan (in.next());
			System.out.print("Masukkan keausan       [Aus/tidak] : ");
			call1.setKeausan (in.next());
			
			call1 = new Model(call1.getKebisingan(), call1.getBau(), call1.getKebocoran(), call1.getKerusakan(), call1.getKeausan());
	    }
	    
	   @Override
	   public void keamanan_ruang_kelas(){
		   System.out.println('\n'+"-------------------- KEAMANAN RUANG KELAS --------------------"+'\n');
		   JOptionPane.showMessageDialog(null, "Masukkan kokoh atau tidak");
		   System.out.print("Masukkan kekokohan ruang       : ");
		   call1.setKekokohan (in.next());
		   System.out.print("Masukkan jumlah kunci pintu    : ");
		   call1.setJml_kunci_pintu (in.nextInt());
		   System.out.print("Masukkan jumlah kunci jendela  : ");
		   call1.setJml_kunci_jendela (in.nextInt());
		   JOptionPane.showMessageDialog(null, "Masukkan aman atau bahaya");
		   System.out.print("Masukkan bahaya                : ");
		   call1.setBahaya (in.next());
		   
		   call1 = new Model(call1.getKekokohan(), call1.getJml_kunci_pintu(), call1.getJml_kunci_jendela(), call1.getBahaya());
	   }
	
	   
	   public void tampil (){
			System.out.println("Luas ruangan                    : "+call2.hitung_luas());
			System.out.println("Bentuk Ruang                    : "+call2.hitung_bentuk());
			if (call2.hitung_rasio() >= 0.5) {
				System.out.println("Rasio Luas                      : "+ call2.hitung_rasio() + " [Sesuai]");
			} else {
				System.out.println("Rasio Luas                      : "+call2.hitung_rasio() + " [Tidak sesuai]");
			}
			System.out.println("Pintu dan Jendela               : "+call2.analisis_pintu_dan_jendela());
			System.out.println("Kelistrikan                     : "+call2.analisis_kelistrikan());
			System.out.println("LCD                             : "+call2.analisis_LCD());
			System.out.println("Lampu                           : "+call2.analisis_lampu());
			System.out.println("Kipas Angin                     : "+call2.analisis_kipas_angin());
			System.out.println("AC                              : "+call2.analisis_AC());
			System.out.println("Internet                        : "+call2.analisis_internet());
			System.out.println("CCTV                            : "+call2.analisis_CCTV());
			System.out.println("Kebersihan                      : "+call2.analisis_kebersihan());
			System.out.println("Sirkulasi Udara                 : "+call2.analisis_sirkulasi_udara());
			System.out.println("Pencahayaan                     : "+call2.analisis_pencahayaan());
			System.out.println("Kelembapan                      : "+call2.analisis_kelembapan());
			System.out.println("Suhu                            : "+call2.analisis_suhu());
			System.out.println("Kebisingan                      : "+call2.analisis_kebisingan());
			System.out.println("Bau                             : "+call2.analisis_bau());
			System.out.println("Kebocoran                       : "+call2.analisis_kebocoran());
			System.out.println("Kerusakan                       : "+call2.analisis_kerusakan());
			System.out.println("Keausan                         : "+call2.analisis_keausan());
			System.out.println("Kekokohan                       : "+call2.analisis_kekokohan());
			System.out.println("Kunci Pintu dan Jendela         : "+call2.analisis_kuncipintu_dan_jendela());
			System.out.println("keamanan Ruang                  : "+call2.analisis_keamanan_ruang());
			}
	    
	    public Model getModel(){
	        return call1;
	    }



		/*@Override
		public void output(double panjang_ruang, double lebar_ruang,
				int jml_kursi, int jml_pintu, int jml_jendela) {
			// TODO Auto-generated method stub
			
		}



		@Override
		public void output(int jml_steker, String kondisi_steker,
				String posisi_steker, int jml_kabel_LCD,
				String kondisi_kabel_LCD, String posisi_kabel_LCD,
				int jml_lampu, String kondisi_lampu, String posisi_lampu,
				int jml_kipas, String kondisi_kipas, String posisi_kipas,
				int jml_AC, String kondisi_AC, String posisi_AC, String login,
				String bandwidth, int jml_CCTV, String kondisi_CCTV,
				String posisi_CCTV) {
			// TODO Auto-generated method stub
			
		}



		@Override
		public void output(String kondisi_lantai, String kondisi_dinding,
				String kondisi_atap, String kondisi_pintu,
				String kondisi_jendela, String kondisi_kaca_jendela) {
			// TODO Auto-generated method stub
			
		}



		@Override
		public void output(String sirkulasi_udara, double nilai_pencahayaan,
				double kelembapan, double suhu) {
			// TODO Auto-generated method stub
			
		}



		@Override
		public void output(String kebisingan, String bau, String kebocoran,
				String kerusakan, String keausan) {
			// TODO Auto-generated method stub
			
		}



		@Override
		public void output(String kekokohan, int jml_kunci_pintu,
				int jml_kunci_jendela, String bahaya) {
			// TODO Auto-generated method stub
			
		}*/
}
