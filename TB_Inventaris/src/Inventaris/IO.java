package Inventaris;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IO extends Super {
	    Scanner in = new Scanner(System.in);
	    Model call1;
	    Control call2;
	    int a,b, steker=0, LCD=0, lampu=0, kipas= 0, AC=0, CCTV=0;
	    
	    @Override
	    void identitas(){
			System.out.println('\n'+"------------------- IDENTITAS RUANG KELAS --------------------"+'\n');
			System.out.print("Masukkan nama ruang            : ");
			setNama_ruang(in.next());
			System.out.print("Masukkan lokasi ruang          : ");
			setLokasi_ruang(in.next());
			System.out.print("Masukkan fakultas              : ");
			setFakultas(in.next());
		}
	    
	    public void input_kondisi_ruang_kelas(double panjang_ruang, double lebar_ruang, int jumlah_kursi,int pintu, int jendela){
	    System.out.println('\n'+"-------------------- KONDISI RUANG KELAS ---------------------"+'\n');
		System.out.print("Masukkan panjang ruang         : ");
		setPanjang_ruang(in.nextDouble());
		System.out.print("Masukkan lebar ruang           : ");
		setLebar_ruang(in.nextDouble());
		System.out.print("Masukkan jumlah kursi          : ");
		setJml_kursi(in.nextInt());
		System.out.print("Masukkan jumlah pintu          : ");
		setJml_pintu(in.nextInt());
		System.out.print("Masukkan jumlah jendela        : ");
		setJml_jendela(in.nextInt());
	    }
	    
	    
	    public void kondisi_dan_posisi_sarana(int jumlah_steker, String kondisi_steker, String posisi_steker, int jumlah_kabel_LCD, 
	            String kondisi_kabel_LCD, String posisi_kabel_LCD, int jumlah_lampu,String kondisi_lampu ,
	            String posisi_lampu, int jumlah_kipas_angin, String kondisi_kipas_angin, String posisi_kipas_angin,
	            int jumlah_AC, String kondisi_AC,String posisi_AC,String bandwidth, String login, int jumlah_CCTV, String kondisi_CCTV, String posisi_CCTV) {
	    	System.out.println("\n----------- JUMLAH, KONDISI DAN POSISI RUANG KELAS -----------\n");
			System.out.print("Masukkan jumlah steker                   : ");
			jumlah_steker = in.nextInt();
			for(a=0; a <call1.getJml_steker(); a++){
				b=a+1;                                                    
				System.out.print("  "+b+". Kondisi steker         [Rusak/Baik] : ");
				kondisi_steker = in.next();
				if(call1.getKondisi_steker().equalsIgnoreCase("baik")){
					steker++;
				}
			}
			JOptionPane.showMessageDialog(null, "PILIHAN POSISI STEKER \na. Dipojok Ruang & Dekat Dosen \nb. Dipojok Ruang \nc. Dipojok Dekat Pintu \nd. Disamping \ne. Didepan \nf. Dibelakang");
			System.out.print("Pilih posisi steker        [ketik huruf] : ");
			posisi_steker = in.next();                       
			
			
			System.out.print("\nJumlah kabel LCD                         : ");
			jumlah_kabel_LCD = in.nextInt();
			for(a=0; a <call1.getJml_kabel_LCD(); a++){
				b=a+1;
				System.out.print("  "+b+". Kondisi kabel LCD [Berfungsi/Rusak] : ");
				kondisi_kabel_LCD= in.next();
				if(call1.getKondisi_kabel_LCD().equalsIgnoreCase("berfungsi")){
					LCD++;
				}
			}
			JOptionPane.showMessageDialog(null,"PILIHAN POSISI KABEL LCD \na. Dekat Dosen \nb. Dekat Pintu");
			System.out.print("Pilih posisi kabel LCD     [ketik huruf] : ");
			posisi_kabel_LCD = in.next();
			
			
			System.out.print("\nMasukkan jumlah lampu                    : ");
			call1.setJml_lampu(in.nextInt());
			for(a=0; a <call1.getJml_lampu(); a++){
				b=a+1;
				System.out.print("  "+b+". Masukkan kondisi lampu [Rusak/Baik] : ");
				kondisi_lampu = in.next();
				if(call1.getKondisi_lampu().equalsIgnoreCase("baik")){
					lampu++;
				}
			}
			JOptionPane.showMessageDialog(null,"PILIHAN POSISI LAMPU \na. Diatap \nb. Dipojok \nc. Disamping \nd. Didepan \ne. Dibelakang");
			System.out.print("Pilih posisi lampu         [ketik huruf] : ");
			posisi_lampu = in.next();
			
			
			System.out.print("\nMasukkan jumlah kipas                    : ");
			jumlah_kipas_angin = in.nextInt();
			for(a=0; a <call1.getJml_kipas_angin(); a++){
				b=a+1;
				System.out.print("  "+b+". Masukkan kondisi kipas [Rusak/baik] : ");
				kondisi_kipas_angin = in.next();
				if(call1.getKondisi_kipas().equalsIgnoreCase("baik")){
					kipas++;
				}
			}
			JOptionPane.showMessageDialog(null,"PILIHAN POSISI KIPAS \na. Diatap \nb. Dipojok \nc. Disamping \nd. Didepan \ne. Dibelakang");
			System.out.print("Pilih posisi kipas         [ketik huruf] : ");
			posisi_kipas_angin = in.next();
			
			
			System.out.print("\nMasukkan jumlah AC                       : ");
			jumlah_AC = in.nextInt();
			for(a=0; a <call1.getJml_AC(); a++){
				b=a+1;                                                    
				System.out.print("  "+b+". Masukkan kondisi AC    [Rusak/baik] : ");
				kondisi_AC = in.next();
				if(call1.getKondisi_AC().equalsIgnoreCase("baik")){
					AC++;
				}
			}
			JOptionPane.showMessageDialog(null,"PILIHAN POSISI AC \na. Dibelakang \nb. Disamping \nc. Didepan");
			System.out.print("Pilih posisi AC            [ketik huruf] : ");
			posisi_AC = in.next();
			
			JOptionPane.showMessageDialog(null,"PILIHAN SSID \na. UMMHotspot \nb. Lab.Informatika");
			System.out.print("Pilih bandwidth(SSID)      [ketik huruf] : ");
			bandwidth = in.next();
			System.out.print("Login                       [Bisa/Tidak] : ");
			login = in.next();
			
			
			System.out.print("\nMasukkan jumlah CCTV                     : ");
			jumlah_CCTV = in.nextInt();
			for(a=0; a <call1.getJml_CCTV(); a++){
				b=a+1;
				System.out.print("  "+b+". Masukkan kondisi CCTV  [Rusak/baik] : ");
				kondisi_CCTV = in.next();
				if(call1.getKondisi_CCTV().equalsIgnoreCase("baik")){
					CCTV++;
				}
			}
			JOptionPane.showMessageDialog(null,"PILIHAN POSISI CCTV \na. Depan & Belakang \nb. Belakang saja \nc. Depan saja");
			System.out.print("Pilih posisi CCTV          [ketik huruf] : ");
			posisi_CCTV = in.next(); 
	    }
	   /* void setfile(int jumlah_steker, String kondisi_steker, String posisi_steker, int jumlah_kabel_LCD, 
	            String kondisi_kabel_LCD, String posisi_kabel_LCD, int jumlah_lampu,String kondisi_lampu ,
	            String posisi_lampu, int jumlah_kipas_angin, String kondisi_kipas_angin, String posisi_kipas_angin,
	            int jumlah_AC, String kondisi_AC,String posisi_AC,String SSID, String bandwidth, int jumlah_CCTV, String kondisi_CCTV, String posisi_CCTV){
	        setfile(jumlah_steker, kondisi_steker, posisi_steker, jumlah_kabel_LCD, kondisi_kabel_LCD, posisi_kabel_LCD, jumlah_lampu, kondisi_lampu, posisi_lampu, jumlah_kipas_angin, kondisi_kipas_angin, posisi_kipas_angin, jumlah_AC, kondisi_AC, posisi_AC, SSID, bandwidth, jumlah_CCTV, kondisi_CCTV, posisi_CCTV);
	    }*/
	    
	    
	    public void input_lingkungan_ruang_kelas(String kondisi_lantai, String kondisi_dinding, String kondisi_atap, String kondisi_pintu, String kondisi_jendela) {
	    	System.out.println('\n'+"------------------- LINGKUNGAN RUANG KELAS -------------------"+'\n');
			JOptionPane.showMessageDialog(null, "Masukkan Bersih atau kotor");
			System.out.print("Masukkan kondisi lantai        : ");
			kondisi_lantai = in.next();
			System.out.print("Masukkan kondisi dinding       : ");
			kondisi_dinding = in.next();
			System.out.print("Masukkan kondisi atap          : ");
			kondisi_atap = in.next();
			System.out.print("Masukkan kondisi pintu         : ");
			kondisi_pintu = in.next();
			System.out.print("Masukkan kondisi jendela       : ");
		}
	    
	    
	    public void kebersihan_ruang_kelas(String sirkulasi_udara, int pencahayaan, int kelembapan, int suhu) {
	    	System.out.println('\n'+"------------------- KEBERSIHAN RUANG KELAS -------------------"+'\n');
			JOptionPane.showMessageDialog(null,"PILIHAN SIRKULASI UDARA"+'\n'+"a. Lancar"+'\n'+"b. Tidak Lancar");
			System.out.print("Masukkan sirkulasi udara       : ");
			sirkulasi_udara = in.nextLine();
			System.out.print("Masukkan nilai pencahayaan     : ");
			pencahayaan = in.nextInt();
			System.out.print("Masukkan kelembapan            : ");
			kelembapan = in.nextInt();
			System.out.print("Masukkan suhu [celcius]        : ");
			suhu = in.nextInt();
		}
	    
	    
	    public void kenyamanan_ruang_kelas(int kebisingan, String bau, String kebocoran, String kerusakan, String keausan) {
	    	System.out.println('\n'+"------------------- KENYAMANAN RUANG KELAS -------------------"+'\n');
			System.out.print("Masukkan kebisingan [Bising/Tidak] : ");
			kebisingan = in.nextInt();
			System.out.print("Masukkan bau           [Bau/Tidak] : ");
			bau = in.nextLine();
			System.out.print("Masukkan kebocoran   [Bocor/Tidak] : ");
			kebocoran = in.nextLine();
			System.out.print("Masukkan kerusakan   [Rusak/tidak] : ");
			kerusakan = in.nextLine();
			System.out.print("Masukkan keausan       [Aus/tidak] : ");
			keausan = in.nextLine();
		}
	    
	    
	    public void keamanan_ruang(String kekokohan, int jumlah_kunci, int jumlah_jendela, String bahaya) {
	    	System.out.println('\n'+"-------------------- KEAMANAN RUANG KELAS --------------------"+'\n');
			JOptionPane.showMessageDialog(null, "Masukkan kokoh atau tidak");
			System.out.print("Masukkan kekokohan ruang       : ");
			kekokohan=in.next();
			System.out.print("jumlah kunci pintu             : ");
			jumlah_kunci=in.nextInt();
			System.out.print("jumlah jendela                 : ");
			jumlah_jendela= in.nextInt();
			JOptionPane.showMessageDialog(null, "Masukkan aman atau bahaya");
			System.out.print("Masukkan bahaya                : ");
			bahaya = in.next();
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
}
